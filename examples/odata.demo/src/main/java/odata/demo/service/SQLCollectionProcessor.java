package odata.demo.service;

import java.io.IOException;
import java.util.List;
import org.apache.olingo.commons.api.data.ContextURL;
import org.apache.olingo.commons.api.data.EntityCollection;
import org.apache.olingo.commons.api.edm.EdmEntitySet;
import org.apache.olingo.commons.api.edm.EdmEntityType;
import org.apache.olingo.commons.api.edm.EdmNavigationProperty;
import org.apache.olingo.commons.api.edm.EdmProperty;
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
import org.apache.olingo.server.api.serializer.EntityCollectionSerializerOptions.Builder;
import org.apache.olingo.server.api.serializer.ODataSerializer;
import org.apache.olingo.server.api.serializer.SerializerException;
import org.apache.olingo.server.api.serializer.SerializerResult;
import org.apache.olingo.server.api.uri.UriInfo;
import org.apache.olingo.server.api.uri.UriInfoResource;
import org.apache.olingo.server.api.uri.UriResource;
import org.apache.olingo.server.api.uri.UriResourceEntitySet;
import org.apache.olingo.server.api.uri.UriResourceNavigation;
import org.apache.olingo.server.api.uri.UriResourcePrimitiveProperty;
import org.apache.olingo.server.api.uri.queryoption.OrderByItem;
import org.apache.olingo.server.api.uri.queryoption.expression.Expression;
import org.apache.olingo.server.api.uri.queryoption.expression.ExpressionVisitException;
import org.apache.olingo.server.api.uri.queryoption.expression.Member;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectFinalStep;
import org.jooq.SelectQuery;
import org.jooq.impl.DSL;

import odata.demo.util.Util;

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
		EntityCollection entityCollection = null;
		try {
			entityCollection = getData(uriInfo, edmEntitySet);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExpressionVisitException e) {
			e.printStackTrace();
		}

		if(uriInfo.getCountOption() != null){
			 boolean isCount = uriInfo.getCountOption() .getValue();
			    if(isCount){
			    	entityCollection.setCount(entityCollection.getEntities().size());
			    }
		}
		ODataSerializer serializer = odata.createSerializer(responseFormat);

		ContextURL contextUrl = ContextURL.with().entitySet(edmEntitySet).build();

		final String id = request.getRawBaseUri() + "/" + edmEntitySet.getName();
		Builder builder = EntityCollectionSerializerOptions.with().id(id).contextURL(contextUrl);
		if(uriInfo.getCountOption() != null)
			builder.count(uriInfo.getCountOption());
		EntityCollectionSerializerOptions opts = builder.build();
		SerializerResult serializedContent = serializer.entityCollection(serviceMetadata, edmEntityType, entityCollection,
				opts);

		response.setContent(serializedContent.getContent());
		response.setStatusCode(HttpStatusCode.OK.getStatusCode());
		response.setHeader(HttpHeader.CONTENT_TYPE, responseFormat.toContentTypeString());
	}

private EntityCollection getData(UriInfo uriInfo, EdmEntitySet edmEntitySet) throws IOException, ODataApplicationException, ExpressionVisitException  {
	
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
		if(uriInfo.getSkipOption()!= null && uriInfo.getTopOption() != null){
			query.addLimit(uriInfo.getSkipOption().getValue(), uriInfo.getTopOption().getValue());
		}
		if(uriInfo.getOrderByOption() != null){
			List<OrderByItem> orderItemList = uriInfo.getOrderByOption().getOrders();
			final OrderByItem orderByItem = orderItemList.get(0);
			Expression expression = orderByItem.getExpression();
			if(expression instanceof Member){
			    UriInfoResource resourcePath = ((Member)expression).getResourcePath();
			    UriResource uriResource = resourcePath.getUriResourceParts().get(0);
			    if (uriResource instanceof UriResourcePrimitiveProperty) {
			       EdmProperty edmProperty = ((UriResourcePrimitiveProperty)uriResource).getProperty();
			       final String sortPropertyName = edmProperty.getName();
			       if(orderByItem.isDescending())
			       query.addOrderBy(DSL.field(sortPropertyName.toLowerCase()).desc());
			       else
			    	   query.addOrderBy(DSL.field(sortPropertyName.toLowerCase()));
			    }
		}
		}
		if(uriInfo.getFilterOption() != null){
			Expression filterExpression = uriInfo.getFilterOption().getExpression();
			 FilterExpressionVisitor expressionVisitor = new FilterExpressionVisitor(query,edmEntitySet.getEntityType().getName().toLowerCase());
			 filterExpression.accept(expressionVisitor);
			 System.out.println(query.getSQL());
			 
		}
		Result<Record> result = query.fetch();
		return Util.getEntityCollection(edmEntitySet, result, storage);
		
	}
}

