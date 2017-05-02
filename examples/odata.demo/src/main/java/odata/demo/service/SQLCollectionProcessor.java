package odata.demo.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.olingo.commons.api.data.ContextURL;
import org.apache.olingo.commons.api.data.Entity;
import org.apache.olingo.commons.api.data.EntityCollection;
import org.apache.olingo.commons.api.data.Property;
import org.apache.olingo.commons.api.data.ValueType;
import org.apache.olingo.commons.api.edm.EdmEntitySet;
import org.apache.olingo.commons.api.edm.EdmEntityType;
import org.apache.olingo.commons.api.ex.ODataRuntimeException;
import org.apache.olingo.commons.api.format.ContentType;
import org.apache.olingo.commons.api.http.HttpHeader;
import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.ODataRequest;
import org.apache.olingo.server.api.ODataResponse;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.server.api.processor.EntityCollectionProcessor;
import org.apache.olingo.server.api.serializer.EntityCollectionSerializerOptions;
import org.apache.olingo.server.api.serializer.ODataSerializer;
import org.apache.olingo.server.api.serializer.SerializerException;
import org.apache.olingo.server.api.serializer.SerializerResult;
import org.apache.olingo.server.api.uri.UriInfo;
import org.apache.olingo.server.api.uri.UriResource;
import org.apache.olingo.server.api.uri.UriResourceEntitySet;
import org.jooq.Record;
import org.jooq.Result;

public class SQLCollectionProcessor implements EntityCollectionProcessor {

	private OData odata;
	private ServiceMetadata serviceMetadata;
	private Storage storage;

	public void init(OData odata, ServiceMetadata serviceMetadata) {
		this.odata = odata;
		this.serviceMetadata = serviceMetadata;
		try {
			storage = new Storage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readEntityCollection(ODataRequest request, ODataResponse response, UriInfo uriInfo,
			ContentType responseFormat) throws ODataApplicationException, SerializerException {

		List<UriResource> resourcePaths = uriInfo.getUriResourceParts();
		UriResourceEntitySet uriResourceEntitySet = (UriResourceEntitySet) resourcePaths.get(resourcePaths.size() -1); 
		EdmEntitySet edmEntitySet = uriResourceEntitySet.getEntitySet();

		EntityCollection entitySet = null;
		try {
			entitySet = getData(uriInfo);
		} catch (IOException e) {
			e.printStackTrace();
		}

		ODataSerializer serializer = odata.createSerializer(responseFormat);

		EdmEntityType edmEntityType = edmEntitySet.getEntityType();
		ContextURL contextUrl = ContextURL.with().entitySet(edmEntitySet).build();

		final String id = request.getRawBaseUri() + "/" + edmEntitySet.getName();
		EntityCollectionSerializerOptions opts = EntityCollectionSerializerOptions.with().id(id).contextURL(contextUrl)
				.build();
		SerializerResult serializedContent = serializer.entityCollection(serviceMetadata, edmEntityType, entitySet,
				opts);

		response.setContent(serializedContent.getContent());
		response.setStatusCode(HttpStatusCode.OK.getStatusCode());
		response.setHeader(HttpHeader.CONTENT_TYPE, responseFormat.toContentTypeString());
	}

	private EntityCollection getData(UriInfo uriInfo) throws IOException {
		List<UriResource> resourcePaths = uriInfo.getUriResourceParts();
		
		if(resourcePaths.size() == 1){
		UriResourceEntitySet uriResourceEntitySet = (UriResourceEntitySet) resourcePaths.get(0); 
		EdmEntitySet edmEntitySet = uriResourceEntitySet.getEntitySet();
		EntityCollection collection = new EntityCollection();
		if (EdmProvider.ES_PRODUCTS_NAME.equals(edmEntitySet.getName())) {
			List<Entity> list = collection.getEntities();
			Result<Record> result = storage.getCreate().select().from("product").fetch();

			for (Record record : result) {
				Entity e = new Entity();
				e.addProperty(new Property(null, "ID", ValueType.PRIMITIVE, record.get("id")));
				e.addProperty(new Property(null, "Name", ValueType.PRIMITIVE, record.get("name")));
				e.addProperty(new Property(null, "Description", ValueType.PRIMITIVE, record.get("description")));
				e.addProperty(new Property(null, "ReleasedDate", ValueType.PRIMITIVE, record.get("releaseddate")));
				e.addProperty(new Property(null, "DiscountinuedDate", ValueType.PRIMITIVE, record.get("discountinueddate")));
				e.addProperty(new Property(null, "Rating", ValueType.PRIMITIVE, record.get("rating")));
				e.addProperty(new Property(null, "Price", ValueType.PRIMITIVE, record.get("price")));
				e.setId(createId("Products", record.get("id")));
				list.add(e);
			}

		}
		if (EdmProvider.ES_SUPPLIERS_NAME.equals(edmEntitySet.getName())) {
			List<Entity> list = collection.getEntities();
			Result<Record> result = storage.getCreate().select().from("supplier").fetch();

			for (Record record : result) {
				Entity e = new Entity();
				e.addProperty(new Property(null, "ID", ValueType.PRIMITIVE, record.get("id")));
				e.addProperty(new Property(null, "Name", ValueType.PRIMITIVE, record.get("name")));
				//e.addProperty(new Property(null, "Address", ValueType.PRIMITIVE, record.get("address")));
				e.setId(createId("Suppliers", record.get("id")));
				list.add(e);
			}

		}

		return collection;
		}
		return null;
	}

	private URI createId(String entitySetName, Object id) {
		try {
			return new URI(entitySetName + "(" + String.valueOf(id) + ")");
		} catch (URISyntaxException e) {
			throw new ODataRuntimeException("Unable to create id for entity: " + entitySetName, e);
		}
	}
}

