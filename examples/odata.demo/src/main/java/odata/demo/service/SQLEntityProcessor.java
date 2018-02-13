package odata.demo.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.olingo.commons.api.data.ContextURL;
import org.apache.olingo.commons.api.data.Entity;
import org.apache.olingo.commons.api.data.ContextURL.Suffix;
import org.apache.olingo.commons.api.edm.EdmEntitySet;
import org.apache.olingo.commons.api.edm.EdmEntityType;
import org.apache.olingo.commons.api.format.ContentType;
import org.apache.olingo.commons.api.http.HttpHeader;
import org.apache.olingo.commons.api.http.HttpMethod;
import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.ODataLibraryException;
import org.apache.olingo.server.api.ODataRequest;
import org.apache.olingo.server.api.ODataResponse;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.server.api.deserializer.DeserializerResult;
import org.apache.olingo.server.api.deserializer.ODataDeserializer;
import org.apache.olingo.server.api.processor.EntityProcessor;
import org.apache.olingo.server.api.serializer.EntitySerializerOptions;
import org.apache.olingo.server.api.serializer.ODataSerializer;
import org.apache.olingo.server.api.serializer.SerializerException;
import org.apache.olingo.server.api.serializer.SerializerResult;
import org.apache.olingo.server.api.uri.UriInfo;
import org.apache.olingo.server.api.uri.UriParameter;
import org.apache.olingo.server.api.uri.UriResource;
import org.apache.olingo.server.api.uri.UriResourceEntitySet;
import org.apache.olingo.server.api.uri.UriResourceNavigation;
import org.apache.olingo.server.api.uri.queryoption.expression.ExpressionVisitException;
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
			entity = storage.readEntityData(uriInfo, edmEntityType, serviceMetadata);
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


	public void createEntity(ODataRequest request, ODataResponse response, UriInfo uriInfo, ContentType requestFormat,
			ContentType responseFormat) throws ODataApplicationException, ODataLibraryException {
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
		
		InputStream requestInputStream = request.getBody();
		ODataDeserializer deserializer = this.odata.createDeserializer(requestFormat);
		DeserializerResult result = deserializer.entity(requestInputStream, edmEntityType);
		Entity requestEntity = result.getEntity();
		Entity createdEntity = null;
			try {
				createdEntity = storage.createEntityData(edmEntitySet, requestEntity);
			} catch (ExpressionVisitException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		ContextURL contextUrl = ContextURL.with().entitySet(edmEntitySet).build(); 
		EntitySerializerOptions options = EntitySerializerOptions.with().contextURL(contextUrl).build(); 
		
		ODataSerializer serializer = this.odata.createSerializer(responseFormat);
		SerializerResult serializedResponse = serializer.entity(serviceMetadata, edmEntityType, createdEntity, options);
		
		response.setContent(serializedResponse.getContent());
		response.setStatusCode(HttpStatusCode.CREATED.getStatusCode());
		response.setHeader(HttpHeader.CONTENT_TYPE, responseFormat.toContentTypeString());
		
	}

	public void updateEntity(ODataRequest request, ODataResponse response, UriInfo uriInfo, ContentType requestFormat,
			ContentType responseFormat) throws ODataApplicationException, ODataLibraryException {
		List<UriResource> resourcePaths = uriInfo.getUriResourceParts();
		UriResourceEntitySet uriResourceEntitySet = (UriResourceEntitySet) resourcePaths.get(0); 
		EdmEntitySet edmEntitySet = uriResourceEntitySet.getEntitySet();
		EdmEntityType edmEntityType = edmEntitySet.getEntityType();

		InputStream requestInputStream = request.getBody();
		ODataDeserializer deserializer = this.odata.createDeserializer(requestFormat);
		DeserializerResult result = deserializer.entity(requestInputStream, edmEntityType);
		Entity requestEntity = result.getEntity();
		List<UriParameter> keyPredicates = uriResourceEntitySet.getKeyPredicates();
		HttpMethod httpMethod = request.getMethod();
		storage.updateEntityData(edmEntitySet, keyPredicates, requestEntity, httpMethod);
		
		response.setStatusCode(HttpStatusCode.NO_CONTENT.getStatusCode());
		
	}

	public void deleteEntity(ODataRequest request, ODataResponse response, UriInfo uriInfo)
			throws ODataApplicationException, ODataLibraryException {
				List<UriResource> resourcePaths = uriInfo.getUriResourceParts();
				
				UriResourceEntitySet uriResourceEntitySet = (UriResourceEntitySet) resourcePaths.get(0); 
				EdmEntitySet edmEntitySet = uriResourceEntitySet.getEntitySet();
				List<UriParameter> keyPredicates = uriResourceEntitySet.getKeyPredicates();
				storage.deleteEntityData(edmEntitySet, keyPredicates);
				response.setStatusCode(HttpStatusCode.NO_CONTENT.getStatusCode());	
	}
	
}

