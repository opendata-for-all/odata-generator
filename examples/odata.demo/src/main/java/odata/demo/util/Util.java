package odata.demo.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;

import org.apache.olingo.commons.api.data.ComplexValue;
import org.apache.olingo.commons.api.data.Entity;
import org.apache.olingo.commons.api.data.EntityCollection;
import org.apache.olingo.commons.api.data.Property;
import org.apache.olingo.commons.api.data.ValueType;
import org.apache.olingo.commons.api.edm.EdmBindingTarget;
import org.apache.olingo.commons.api.edm.EdmEntitySet;
import org.apache.olingo.commons.api.edm.EdmEntityType;
import org.apache.olingo.commons.api.edm.EdmNavigationProperty;
import org.apache.olingo.commons.api.ex.ODataRuntimeException;
import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.server.api.uri.UriParameter;
import org.apache.olingo.server.api.uri.UriResource;
import org.apache.olingo.server.api.uri.UriResourceEntitySet;
import org.apache.olingo.server.api.uri.UriResourceNavigation;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectQuery;
import org.jooq.impl.DSL;

import odata.demo.service.EdmProvider;
import odata.demo.service.Storage;

public class Util {

	public static SelectQuery<Record> buildQueryStep(SelectQuery<Record> query, UriResource segment1, UriResource segment2, ServiceMetadata metadata)
			throws ODataApplicationException {
		List<UriParameter> keyPredicates = null;
		EdmNavigationProperty navigationProperty = null;
		EdmEntitySet navigationTargetEntitySet = null;
		EdmEntitySet startEntitySet = null;
		if (segment1 instanceof UriResourceNavigation) {
			startEntitySet = getEnitySetFromEntityType(((UriResourceNavigation) segment1).getProperty().getType(), metadata);
		}
		if (segment1 instanceof UriResourceEntitySet) {
			startEntitySet = ((UriResourceEntitySet) segment1).getEntitySet();
			keyPredicates = ((UriResourceEntitySet) segment1).getKeyPredicates();
		}
		if (segment2 instanceof UriResourceNavigation) {
			navigationProperty = ((UriResourceNavigation) segment2).getProperty();
		}
		if (segment2 instanceof UriResourceEntitySet) {

		}

		String navPropName = navigationProperty.getName();
		EdmBindingTarget edmBindingTarget = startEntitySet.getRelatedBindingTarget(navPropName);
		if (edmBindingTarget == null) {
			throw new ODataApplicationException("Not supported.", HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(),
					Locale.ROOT);
		}

		if (edmBindingTarget instanceof EdmEntitySet) {
			navigationTargetEntitySet = (EdmEntitySet) edmBindingTarget;
		} else {
			throw new ODataApplicationException("Not supported.", HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(),
					Locale.ROOT);
		}

		if (EdmProvider.ES_PRODUCTS_NAME.equals(startEntitySet.getName())
				&& EdmProvider.ES_SUPPLIERS_NAME.equals(navigationTargetEntitySet.getName())
				&& navigationProperty.getName().equals("Supplier")) {
			query.addJoin(DSL.table("product"), DSL.field("supplier.id").eq(DSL.field("product.supplier_id")));
			
		}
		if (EdmProvider.ES_SUPPLIERS_NAME.equals(startEntitySet.getName())
				&& EdmProvider.ES_PRODUCTS_NAME.equals(navigationTargetEntitySet.getName())
				&& navigationProperty.getName().equals("Products")) {
			query.addJoin(DSL.table("supplier"), DSL.field("supplier.id").eq(DSL.field("product.supplier_id")));
			
		}
		if (keyPredicates != null && !keyPredicates.isEmpty()) {
			if(EdmProvider.ES_PRODUCTS_NAME.equals(startEntitySet.getName())){
						query.addConditions(DSL.field("product.id").eq(keyPredicates.get(0).getText()));
						}
			if(EdmProvider.ES_SUPPLIERS_NAME.equals(startEntitySet.getName())){
						query.addConditions(DSL.field("supplier.id").eq(keyPredicates.get(0).getText()));
						}
		}
		return query;
	}

	public static EdmEntitySet getEnitySetFromEntityType(EdmEntityType edmEntityType, ServiceMetadata metadata) {
		if (edmEntityType.getFullQualifiedName().equals(EdmProvider.ET_PRODUCT_FQN))
			return metadata.getEdm().getEntityContainer().getEntitySet(EdmProvider.ES_PRODUCTS_NAME);
		if (edmEntityType.getFullQualifiedName().equals(EdmProvider.ET_SUPPLIER_FQN))
			return metadata.getEdm().getEntityContainer().getEntitySet(EdmProvider.ES_SUPPLIERS_NAME);
		return null;

	}
	public static EntityCollection getEntityCollection(EdmEntitySet edmEntitySet, Result<Record> result, Storage storage) {
		EntityCollection collection = new EntityCollection();
		List<Entity> list = collection.getEntities();
		
		if (EdmProvider.ES_PRODUCTS_NAME.equals(edmEntitySet.getName())) {

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

			for (Record record : result) {
				Entity e = new Entity();
				e.addProperty(new Property(null, "ID", ValueType.PRIMITIVE, record.get("id")));
				e.addProperty(new Property(null, "Name", ValueType.PRIMITIVE, record.get("name")));
				ComplexValue addressType = new ComplexValue();
				Record addressResult = storage.getCreate().select().from("address").where(DSL.field("id").eq( record.get("address_id"))).fetch().get(0);
				addressType.getValue().add(new Property(null, "Street", ValueType.PRIMITIVE, addressResult.get("street")));
				addressType.getValue().add(new Property(null, "City", ValueType.PRIMITIVE, addressResult.get("city")));
				addressType.getValue().add(new Property(null, "State", ValueType.PRIMITIVE, addressResult.get("state")));
				addressType.getValue().add(new Property(null, "ZipCode", ValueType.PRIMITIVE, addressResult.get("zipcode")));
				addressType.getValue().add(new Property(null, "Country", ValueType.PRIMITIVE, addressResult.get("country")));
				e.addProperty(new Property(null, "Address", ValueType.COMPLEX, addressType));				
				e.setId(createId("Suppliers", record.get("id")));
				list.add(e);
			}

		}
			return collection;
	}
	public static Entity getEntity(EdmEntityType edmEntityType, Record record, Storage storage) {
		
		Entity entity = new Entity();
		if (EdmProvider.ET_PRODUCT_NAME.equals(edmEntityType.getName())) {
				entity.addProperty(new Property(null, "ID", ValueType.PRIMITIVE, record.get("id")));
				entity.addProperty(new Property(null, "Name", ValueType.PRIMITIVE, record.get("name")));
				entity.addProperty(new Property(null, "Description", ValueType.PRIMITIVE, record.get("description")));
				entity.addProperty(new Property(null, "ReleasedDate", ValueType.PRIMITIVE, record.get("releaseddate")));
				entity.addProperty(new Property(null, "DiscountinuedDate", ValueType.PRIMITIVE, record.get("discountinueddate")));
				entity.addProperty(new Property(null, "Rating", ValueType.PRIMITIVE, record.get("rating")));
				entity.addProperty(new Property(null, "Price", ValueType.PRIMITIVE, record.get("price")));
				entity.setId(createId("Products", record.get("id")));
			}
		if (EdmProvider.ET_SUPPLIER_NAME.equals(edmEntityType.getName())) {
				entity.addProperty(new Property(null, "ID", ValueType.PRIMITIVE, record.get("id")));
				entity.addProperty(new Property(null, "Name", ValueType.PRIMITIVE, record.get("name")));
				ComplexValue addressType = new ComplexValue();
				Record addressResult = storage.getCreate().select().from("address").where(DSL.field("id").eq( record.get("address_id"))).fetch().get(0);
				addressType.getValue().add(new Property(null, "Street", ValueType.PRIMITIVE, addressResult.get("street")));
				addressType.getValue().add(new Property(null, "City", ValueType.PRIMITIVE, addressResult.get("city")));
				addressType.getValue().add(new Property(null, "State", ValueType.PRIMITIVE, addressResult.get("state")));
				addressType.getValue().add(new Property(null, "ZipCode", ValueType.PRIMITIVE, addressResult.get("zipcode")));
				addressType.getValue().add(new Property(null, "Country", ValueType.PRIMITIVE, addressResult.get("country")));
				entity.addProperty(new Property(null, "Address", ValueType.COMPLEX, addressType));				
				entity.setId(createId("Suppliers", record.get("id")));
			}

			return entity;
	}
	public static URI createId(String entitySetName, Object id) {
		try {
			return new URI(entitySetName + "(" + String.valueOf(id) + ")");
		} catch (URISyntaxException e) {
			throw new ODataRuntimeException("Unable to create id for entity: " + entitySetName, e);
		}
	}


}

