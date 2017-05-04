package odata.demo.service;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import org.apache.olingo.commons.api.data.ContextURL;
import org.apache.olingo.commons.api.data.Entity;
import org.apache.olingo.commons.api.data.ContextURL.Suffix;
import org.apache.olingo.commons.api.edm.EdmEntitySet;
import org.apache.olingo.commons.api.edm.EdmEntityType;
import org.apache.olingo.commons.api.edm.EdmNavigationProperty;
import org.apache.olingo.commons.api.format.ContentType;
import org.apache.olingo.commons.api.http.HttpHeader;
import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.ODataLibraryException;
import org.apache.olingo.server.api.ODataRequest;
import org.apache.olingo.server.api.ODataResponse;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.server.api.processor.EntityProcessor;
import org.apache.olingo.server.api.serializer.EntitySerializerOptions;
import org.apache.olingo.server.api.serializer.ODataSerializer;
import org.apache.olingo.server.api.serializer.SerializerException;
import org.apache.olingo.server.api.serializer.SerializerResult;
import org.apache.olingo.server.api.uri.UriInfo;
import org.apache.olingo.server.api.uri.UriResource;
import org.apache.olingo.server.api.uri.UriResourceEntitySet;
import org.apache.olingo.server.api.uri.UriResourceNavigation;
import org.apache.olingo.server.api.uri.queryoption.expression.ExpressionVisitException;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectFinalStep;
import org.jooq.SelectQuery;
import org.jooq.impl.DSL;

import odata.demo.util.Util;

public class SQLEntityProcessor implements EntityProcessor {

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

	public void readEntity(ODataRequest request, ODataResponse response, UriInfo uriInfo,
			ContentType responseFormat) throws ODataApplicationException, SerializerException {

		List<UriResource> resourcePaths = uriInfo.getUriResourceParts();
		UriResourceEntitySet uriResourceEntitySet = null;
		EdmEntityType edmEntityType = null;
		EdmEntitySet edmEntitySet = null;
		if (resourcePaths.get(resourcePaths.size() - 1) instanceof UriResourceEntitySet) {
			uriResourceEntitySet = (UriResourceEntitySet) resourcePaths.get(resourcePaths.size() - 1);
			edmEntitySet = uriResourceEntitySet.getEntitySet();
			edmEntityType = edmEntitySet.getEntityType();

		}

		if (resourcePaths.get(resourcePaths.size() - 1) instanceof UriResourceNavigation) {
			edmEntityType = ((UriResourceNavigation) resourcePaths.get(resourcePaths.size() - 1)).getProperty()
					.getType();
			edmEntitySet = Util.getEnitySetFromEntityType(edmEntityType, serviceMetadata);
		}
		Entity entity = null;
		try {
			entity = getData(uriInfo, edmEntitySet);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExpressionVisitException e) {
			e.printStackTrace();
		}
		
	    ContextURL contextUrl = ContextURL.with().entitySet(edmEntitySet).suffix(Suffix.ENTITY).build();
	    EntitySerializerOptions opts = EntitySerializerOptions.with().contextURL(contextUrl).build();

	    ODataSerializer serializer = this.odata.createSerializer(responseFormat);
	    SerializerResult serializerResult = serializer.entity(this.serviceMetadata,
	    		edmEntityType, entity, opts);

	    response.setContent(serializerResult.getContent());
	    response.setStatusCode(HttpStatusCode.OK.getStatusCode());
	    response.setHeader(HttpHeader.CONTENT_TYPE, responseFormat.toContentTypeString());
	}

	private Entity getData(UriInfo uriInfo, EdmEntitySet edmEntitySet) throws IOException, ODataApplicationException, ExpressionVisitException {
	
		List<UriResource> resourcePaths = uriInfo.getUriResourceParts();
		SelectFinalStep<Record> select = storage.getCreate().select();
		SelectQuery<Record> query = select.getQuery();
		if (resourcePaths.size() != 1) {
			for (int i = resourcePaths.size() - 1; i > 0; i--) {
				if (i == (resourcePaths.size() - 1)) {
					UriResource uriResource = resourcePaths.get(i);
					if (uriResource instanceof UriResourceNavigation) {
						UriResourceNavigation uriResourceNavigation = (UriResourceNavigation) uriResource;
						EdmNavigationProperty edmNavigationProperty = uriResourceNavigation.getProperty();
						EdmEntityType targetEntityType = edmNavigationProperty.getType();
						query.addFrom(DSL.table(targetEntityType.getName().toLowerCase()));
						if(uriResourceNavigation.getKeyPredicates() != null && !uriResourceNavigation.getKeyPredicates().isEmpty()){
							if(EdmProvider.ET_PRODUCT_NAME.equals(targetEntityType.getName())){
							query.addConditions(DSL.field("product.id").eq(uriResourceNavigation.getKeyPredicates().get(0).getText()));
							}
							if(EdmProvider.ET_SUPPLIER_NAME.equals(targetEntityType.getName())){
							query.addConditions(DSL.field("supplier.id").eq(uriResourceNavigation.getKeyPredicates().get(0).getText()));
							}

						}
					}
				}

				query = Util.buildQueryStep(query, resourcePaths.get(i - 1), resourcePaths.get(i), serviceMetadata);

			}
		}
		if (resourcePaths.size() == 1) {
			if (EdmProvider.ES_PRODUCTS_NAME.equals(edmEntitySet.getName())) {
				query.addFrom(DSL.table("product"));
			}
			if (EdmProvider.ES_SUPPLIERS_NAME.equals(edmEntitySet.getName())) {
				query.addFrom(DSL.table("supplier"));
			}
		}

		Result<Record> result = query.fetch();
		if (result.isEmpty())
			  throw new ODataApplicationException("Nothing found.", HttpStatusCode.NOT_FOUND.getStatusCode(), Locale.ROOT);
		return Util.getEntity(edmEntitySet, result.get(0), storage);
	}
	public void createEntity(ODataRequest request, ODataResponse response, UriInfo uriInfo, ContentType requestFormat,
			ContentType responseFormat) throws ODataApplicationException, ODataLibraryException {
		   throw new ODataApplicationException("Not supported.", HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ROOT);
		
	}

	public void updateEntity(ODataRequest request, ODataResponse response, UriInfo uriInfo, ContentType requestFormat,
			ContentType responseFormat) throws ODataApplicationException, ODataLibraryException {
		   throw new ODataApplicationException("Not supported.", HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ROOT);
		
	}

	public void deleteEntity(ODataRequest request, ODataResponse response, UriInfo uriInfo)
			throws ODataApplicationException, ODataLibraryException {
		   throw new ODataApplicationException("Not supported.", HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ROOT);
		
	}

	
}

