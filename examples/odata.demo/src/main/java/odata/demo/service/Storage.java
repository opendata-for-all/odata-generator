package odata.demo.service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.apache.olingo.commons.api.data.ComplexValue;
import org.apache.olingo.commons.api.data.Entity;
import org.apache.olingo.commons.api.data.Property;
import org.apache.olingo.commons.api.data.ValueType;
import org.apache.olingo.commons.api.edm.EdmEntitySet;
import org.apache.olingo.commons.api.edm.EdmEntityType;
import org.apache.olingo.commons.api.edm.EdmNavigationProperty;
import org.apache.olingo.commons.api.edm.EdmPrimitiveTypeKind;
import org.apache.olingo.commons.api.http.HttpMethod;
import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.server.api.uri.UriInfo;
import org.apache.olingo.server.api.uri.UriParameter;
import org.apache.olingo.server.api.uri.UriResource;
import org.apache.olingo.server.api.uri.UriResourceEntitySet;
import org.apache.olingo.server.api.uri.UriResourceNavigation;
import org.apache.olingo.server.api.uri.queryoption.expression.ExpressionVisitException;
import org.jooq.DSLContext;
import org.jooq.InsertQuery;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.SelectFinalStep;
import org.jooq.SelectQuery;
import org.jooq.UpdateQuery;
import org.jooq.impl.DSL;

import odata.demo.util.Util;



public class Storage {
	private DSLContext create; 

	public Storage () throws IOException{
		InputStream s = getClass().getResourceAsStream("/config.properties");

		Properties props = new Properties();
		props.load(s);
		try {
			Class.forName(props.getProperty("db.driver"));
			Connection conn = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.user"), props.getProperty("db.password"));
			setCreate(DSL.using(conn, SQLDialect.MYSQL));
	    } 

	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public DSLContext getCreate() {
		return create;
	}

	public void setCreate(DSLContext create) {
		this.create = create;
	}
		public Entity readEntityData(UriInfo uriInfo, EdmEntityType edmEntityType, ServiceMetadata metadata) throws IOException, ODataApplicationException, ExpressionVisitException {
		
		List<UriResource> resourcePaths = uriInfo.getUriResourceParts();
		SelectFinalStep<Record> select = create.select();
		SelectQuery<Record> query = select.getQuery();
			for (int i = resourcePaths.size() - 1; i >= 0; i--) {
					UriResource uriResource = resourcePaths.get(i);
					if (uriResource instanceof UriResourceNavigation) {
						
						UriResourceNavigation uriResourceNavigation = (UriResourceNavigation) uriResource;
						EdmNavigationProperty edmNavigationProperty = uriResourceNavigation.getProperty();
						EdmEntityType targetEntityType = edmNavigationProperty.getType();
						if( i == resourcePaths.size() - 1)
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
					
					if (uriResource instanceof UriResourceEntitySet) {
						 UriResourceEntitySet  uriResourceEntitySet = (UriResourceEntitySet) uriResource;
							EdmEntityType targetEntityType = uriResourceEntitySet.getEntityType();
							if( i == resourcePaths.size() - 1)
							query.addFrom(DSL.table(targetEntityType.getName().toLowerCase()));
							if(uriResourceEntitySet.getKeyPredicates() != null && !uriResourceEntitySet.getKeyPredicates().isEmpty()){
								if(EdmProvider.ET_PRODUCT_NAME.equals(targetEntityType.getName())){
								query.addConditions(DSL.field("product.id").eq(uriResourceEntitySet.getKeyPredicates().get(0).getText()));
								}
								if(EdmProvider.ET_SUPPLIER_NAME.equals(targetEntityType.getName())){
								query.addConditions(DSL.field("supplier.id").eq(uriResourceEntitySet.getKeyPredicates().get(0).getText()));
								}
					}
				
					}
				if(i != 0)
				query = Util.buildQueryStep(query, resourcePaths.get(i - 1), resourcePaths.get(i), metadata);

			}


		Result<Record> result = query.fetch();
		if (result.isEmpty())
			  throw new ODataApplicationException("Nothing found.", HttpStatusCode.NOT_FOUND.getStatusCode(), Locale.ROOT);
		return Util.getEntity(edmEntityType, result.get(0), this);
	}
	public Entity createEntityData(EdmEntitySet edmEntitySet, Entity requestEntity) throws IOException, ODataApplicationException, ExpressionVisitException {
		Entity result = null;	
		if (EdmProvider.ES_PRODUCTS_NAME.equals(edmEntitySet.getName())) {
			result = createProduct(edmEntitySet.getEntityType(), requestEntity);
			}
		if (EdmProvider.ES_SUPPLIERS_NAME.equals(edmEntitySet.getName())) {
			result = createSupplier(edmEntitySet.getEntityType(), requestEntity);
			}
		return result;
		
		}
	  public void updateEntityData(EdmEntitySet edmEntitySet, List<UriParameter> keyParams, Entity updateEntity,
		      HttpMethod httpMethod) throws ODataApplicationException {

		 if(! httpMethod.equals(HttpMethod.PATCH)) {
				throw new ODataApplicationException("Not supported.", HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ROOT);
		 }
		    EdmEntityType edmEntityType = edmEntitySet.getEntityType();

		    if (edmEntityType.getName().equals(EdmProvider.ET_PRODUCT_NAME)) {
		      updateProduct(edmEntityType, keyParams, updateEntity, httpMethod);
		    }
		    if (edmEntityType.getName().equals(EdmProvider.ET_SUPPLIER_NAME)) {
		      updateSupplier(edmEntityType, keyParams, updateEntity, httpMethod);
		    }
		  }
	public void deleteEntityData(EdmEntitySet edmEntitySet, List<UriParameter> keyPredicates) throws ODataApplicationException {
		 EdmEntityType edmEntityType = edmEntitySet.getEntityType();
		    if (edmEntityType.getName().equals(EdmProvider.ET_PRODUCT_NAME)) {
		      deleteProduct(edmEntityType, keyPredicates);
		    }
		    if (edmEntityType.getName().equals(EdmProvider.ET_SUPPLIER_NAME)) {
		      deleteSupplier(edmEntityType, keyPredicates);
		    }
		
	}
	public void updateEntityReferenceData(EdmEntityType sourceEdmEntityType, Entity sourceEntity,
			EdmNavigationProperty targetEdmNavigationProperty, Entity targetEntity) {
		if (sourceEdmEntityType.getName().equals(EdmProvider.ET_PRODUCT_NAME)) {
			if (targetEdmNavigationProperty.getName().equals("Supplier"))
				updateProductSupplier(sourceEntity, targetEntity);
		}
		if (sourceEdmEntityType.getName().equals(EdmProvider.ET_SUPPLIER_NAME)) {
		}
	}
	private void deleteProduct(EdmEntityType edmEntityType, List<UriParameter> keyParams) throws ODataApplicationException {
		  Entity entity = getProduct(edmEntityType,keyParams);

		 getCreate().deleteFrom(DSL.table("product")).where(DSL.field("product.id").eq(keyParams.get(0).getText())).execute();
	}

	private Entity getProduct(EdmEntityType edmEntityType, List<UriParameter> keyParams) throws ODataApplicationException {
		
		SelectFinalStep<Record> select = getCreate().select();
		SelectQuery<Record> query = select.getQuery();
		query.addFrom(DSL.table("product"));
			query.addConditions(DSL.field("product.id").eq(keyParams.get(0).getText()));
			Result<Record> result = query.fetch();
			if (result.isEmpty())
				  throw new ODataApplicationException("Nothing found.", HttpStatusCode.NOT_FOUND.getStatusCode(), Locale.ROOT);
			return Util.getEntity(edmEntityType, result.get(0), this);
	}
	public Entity createProduct(EdmEntityType edmEntityType, Entity entity) {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		InsertQuery<Record> insertQuery = create.insertQuery(DSL.table("product"));
		if(entity.getProperty("ID")!= null)
			insertQuery.addValue(DSL.field("id"),entity.getProperty("ID").getValue());
		if(entity.getProperty("Name")!= null)
			insertQuery.addValue(DSL.field("name"),entity.getProperty("Name").getValue());
		if(entity.getProperty("Description")!= null)
			insertQuery.addValue(DSL.field("description"),entity.getProperty("Description").getValue());
		if(entity.getProperty("ReleasedDate")!= null)
			insertQuery.addValue(DSL.field("releaseddate"),sdf.format(((GregorianCalendar) entity.getProperty("ReleasedDate").getValue()).getTime()));
		if(entity.getProperty("DiscountinuedDate")!= null)
			insertQuery.addValue(DSL.field("discountinueddate"),sdf.format(((GregorianCalendar) entity.getProperty("DiscountinuedDate").getValue()).getTime()));
		if(entity.getProperty("Rating")!= null)
			insertQuery.addValue(DSL.field("rating"),entity.getProperty("Rating").getValue());
		if(entity.getProperty("Price")!= null)
			insertQuery.addValue(DSL.field("price"),entity.getProperty("Price").getValue());
		insertQuery.execute();

	 	if(entity.getProperty("ID")== null) {
			entity.addProperty(new Property(null, "ID", ValueType.PRIMITIVE, create.selectFrom(DSL.table("product")).orderBy(DSL.field("id").desc()).limit(0, 1).fetchOne().get("id")));
		}

	    return entity;

	  }
	public Entity updateProduct(EdmEntityType edmEntityType, List<UriParameter> keyParams, Entity entity, HttpMethod httpMethod) {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		
		UpdateQuery<Record> updateQuery = create.updateQuery(DSL.table("product"));

		if(entity.getProperty("Name")!= null)
			updateQuery.addValue(DSL.field("name"),entity.getProperty("Name").getValue());
		if(entity.getProperty("Description")!= null)
			updateQuery.addValue(DSL.field("description"),entity.getProperty("Description").getValue());
		if(entity.getProperty("ReleasedDate")!= null)
			updateQuery.addValue(DSL.field("releaseddate"),sdf.format(((GregorianCalendar) entity.getProperty("ReleasedDate").getValue()).getTime()));
		if(entity.getProperty("DiscountinuedDate")!= null)
			updateQuery.addValue(DSL.field("discountinueddate"),sdf.format(((GregorianCalendar) entity.getProperty("DiscountinuedDate").getValue()).getTime()));
		if(entity.getProperty("Rating")!= null)
			updateQuery.addValue(DSL.field("rating"),entity.getProperty("Rating").getValue());
		if(entity.getProperty("Price")!= null)
			updateQuery.addValue(DSL.field("price"),entity.getProperty("Price").getValue());
		
		updateQuery.addConditions(DSL.field(keyParams.get(0).getName().toLowerCase()).eq(keyParams.get(0).getText()));
		updateQuery.execute();

	
	    return entity;

	  }
	public void updateProductSupplier(Entity product, Entity supplier) {
		UpdateQuery<Record> updateQuery = create.updateQuery(DSL.table("product"));
		updateQuery.addValue(DSL.field("supplier_id"), supplier.getProperty("ID").getValue());
		updateQuery.addConditions(DSL.field("id").eq(product.getProperty("ID").getValue()));
		updateQuery.execute();
	}

	private void deleteSupplier(EdmEntityType edmEntityType, List<UriParameter> keyParams) throws ODataApplicationException {
		  Entity entity = getSupplier(edmEntityType,keyParams);

		 getCreate().deleteFrom(DSL.table("supplier")).where(DSL.field("supplier.id").eq(keyParams.get(0).getText())).execute();
	}

	private Entity getSupplier(EdmEntityType edmEntityType, List<UriParameter> keyParams) throws ODataApplicationException {
		
		SelectFinalStep<Record> select = getCreate().select();
		SelectQuery<Record> query = select.getQuery();
		query.addFrom(DSL.table("supplier"));
			query.addConditions(DSL.field("supplier.id").eq(keyParams.get(0).getText()));
			Result<Record> result = query.fetch();
			if (result.isEmpty())
				  throw new ODataApplicationException("Nothing found.", HttpStatusCode.NOT_FOUND.getStatusCode(), Locale.ROOT);
			return Util.getEntity(edmEntityType, result.get(0), this);
	}
	public Entity createSupplier(EdmEntityType edmEntityType, Entity entity) {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		InsertQuery<Record> insertQuery = create.insertQuery(DSL.table("supplier"));
		if(entity.getProperty("ID")!= null)
			insertQuery.addValue(DSL.field("id"),entity.getProperty("ID").getValue());
		if(entity.getProperty("Name")!= null)
			insertQuery.addValue(DSL.field("name"),entity.getProperty("Name").getValue());
		if(entity.getProperty("Address")!= null) {
			ComplexValue address = entity.getProperty("Address").asComplex();
			InsertQuery<Record> insertAddress = create.insertQuery(DSL.table("address"));
			for (Property addressProperty : address.getValue()) {
				if(addressProperty.getType().equals(EdmPrimitiveTypeKind.Date.getFullQualifiedName().toString()))
					insertAddress.addValue(DSL.field(addressProperty.getName().toLowerCase()), sdf.format(addressProperty.getValue()));
				else
					insertAddress.addValue(DSL.field(addressProperty.getName().toLowerCase()), addressProperty.getValue());
			}
			insertAddress.execute();
			insertQuery.addValue(DSL.field("address_id"), create.selectFrom(DSL.table("address"))
					.orderBy(DSL.field("id").desc()).limit(0, 1).fetchOne().get("id"));
		}
		insertQuery.execute();

	 	if(entity.getProperty("ID")== null) {
			entity.addProperty(new Property(null, "ID", ValueType.PRIMITIVE, create.selectFrom(DSL.table("supplier")).orderBy(DSL.field("id").desc()).limit(0, 1).fetchOne().get("id")));
		}

	    return entity;

	  }
	public Entity updateSupplier(EdmEntityType edmEntityType, List<UriParameter> keyParams, Entity entity, HttpMethod httpMethod) {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		
		UpdateQuery<Record> updateQuery = create.updateQuery(DSL.table("supplier"));

		if(entity.getProperty("Name")!= null)
			updateQuery.addValue(DSL.field("name"),entity.getProperty("Name").getValue());
		if(entity.getProperty("Address")!= null) {
			ComplexValue address = entity.getProperty("Address").asComplex();
			UpdateQuery<Record> updateAddress = create.updateQuery(DSL.table("address"));
			for (Property addressProperty : address.getValue()) {
				if(addressProperty.getType().equals(EdmPrimitiveTypeKind.Date.getFullQualifiedName().toString()))
					updateAddress.addValue(DSL.field(addressProperty.getName().toLowerCase()), sdf.format(addressProperty.getValue()));
				else
					updateAddress.addValue(DSL.field(addressProperty.getName().toLowerCase()), addressProperty.getValue());
			}
			
			updateAddress.addConditions(DSL.field("id").eq(create.selectFrom(DSL.table("supplier"))
					.where(DSL.field("id").eq(keyParams.get(0).getText())).fetchOne().get("address_id")));
		updateAddress.execute();
					
		}
		
		updateQuery.addConditions(DSL.field(keyParams.get(0).getName().toLowerCase()).eq(keyParams.get(0).getText()));
		updateQuery.execute();

	
	    return entity;

	  }

}
