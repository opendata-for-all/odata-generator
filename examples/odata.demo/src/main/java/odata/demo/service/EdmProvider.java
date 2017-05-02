package odata.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.olingo.commons.api.edm.EdmPrimitiveTypeKind;
import org.apache.olingo.commons.api.edm.FullQualifiedName;
import org.apache.olingo.commons.api.edm.provider.CsdlAbstractEdmProvider;
import org.apache.olingo.commons.api.edm.provider.CsdlEntityContainer;
import org.apache.olingo.commons.api.edm.provider.CsdlEntityContainerInfo;
import org.apache.olingo.commons.api.edm.provider.CsdlEntitySet;
import org.apache.olingo.commons.api.edm.provider.CsdlEntityType;
import org.apache.olingo.commons.api.edm.provider.CsdlComplexType;
import org.apache.olingo.commons.api.edm.provider.CsdlNavigationPropertyBinding;
import org.apache.olingo.commons.api.edm.provider.CsdlNavigationProperty;
import org.apache.olingo.commons.api.edm.provider.CsdlComplexType;
import org.apache.olingo.commons.api.edm.provider.CsdlProperty;
import org.apache.olingo.commons.api.edm.provider.CsdlPropertyRef;
import org.apache.olingo.commons.api.edm.provider.CsdlSchema;

public class EdmProvider extends CsdlAbstractEdmProvider {

  // Service Namespace
  public static final String NAMESPACE = "com.example.ODataDemo";

  public static final String CONTAINER_NAME = "DemoService";
  public static final FullQualifiedName CONTAINER = new FullQualifiedName(NAMESPACE,CONTAINER_NAME);

  public static final String ET_PRODUCT_NAME = "Product";
  public static final FullQualifiedName ET_PRODUCT_FQN = new FullQualifiedName(NAMESPACE, ET_PRODUCT_NAME);
  public static final String ET_SUPPLIER_NAME = "Supplier";
  public static final FullQualifiedName ET_SUPPLIER_FQN = new FullQualifiedName(NAMESPACE, ET_SUPPLIER_NAME);
  public static final String CT_ADDRESS_NAME = "Address";
  public static final FullQualifiedName CT_ADDRESS_FQN = new FullQualifiedName(NAMESPACE, CT_ADDRESS_NAME);
  public static final String ES_PRODUCTS_NAME = "Products";
  public static final String ES_SUPPLIERS_NAME = "Suppliers";

  @Override
  public List<CsdlSchema> getSchemas() {


    CsdlSchema schema = new CsdlSchema();
    schema.setNamespace(NAMESPACE);

    List<CsdlEntityType> entityTypes = new ArrayList<CsdlEntityType>();
    entityTypes.add(getEntityType(ET_PRODUCT_FQN));
    entityTypes.add(getEntityType(ET_SUPPLIER_FQN));
	List<CsdlComplexType> complexTypes = new ArrayList<CsdlComplexType>();
    complexTypes.add(getComplexType(CT_ADDRESS_FQN));
 	schema.setComplexTypes(complexTypes);

    schema.setEntityTypes(entityTypes);

    schema.setEntityContainer(getEntityContainer());

    List<CsdlSchema> schemas = new ArrayList<CsdlSchema>();
    schemas.add(schema);

    return schemas;
  }

@Override
  public CsdlComplexType getComplexType(FullQualifiedName complexTypeName) {

    if(complexTypeName.equals(CT_ADDRESS_FQN)){

	CsdlProperty country = new CsdlProperty().setName("Country").setType(EdmPrimitiveTypeKind.String.getFullQualifiedName());
	CsdlProperty street = new CsdlProperty().setName("Street").setType(EdmPrimitiveTypeKind.String.getFullQualifiedName());
	CsdlProperty city = new CsdlProperty().setName("City").setType(EdmPrimitiveTypeKind.String.getFullQualifiedName());
	CsdlProperty state = new CsdlProperty().setName("State").setType(EdmPrimitiveTypeKind.String.getFullQualifiedName());
	CsdlProperty zipcode = new CsdlProperty().setName("ZipCode").setType(EdmPrimitiveTypeKind.String.getFullQualifiedName());
    
      CsdlComplexType complexType = new CsdlComplexType();
      complexType.setName(CT_ADDRESS_NAME);
      complexType.setProperties(Arrays.asList(country,street,city,state,zipcode));

      return complexType;
    }

    return null;
  }
  @Override
  public CsdlEntityType getEntityType(FullQualifiedName entityTypeName) {

    if(entityTypeName.equals(ET_PRODUCT_FQN)){

	CsdlProperty id = new CsdlProperty().setName("ID").setType(EdmPrimitiveTypeKind.Int32.getFullQualifiedName());
	CsdlProperty name = new CsdlProperty().setName("Name").setType(EdmPrimitiveTypeKind.String.getFullQualifiedName());
	CsdlProperty description = new CsdlProperty().setName("Description").setType(EdmPrimitiveTypeKind.String.getFullQualifiedName());
	CsdlProperty releaseddate = new CsdlProperty().setName("ReleasedDate").setType(EdmPrimitiveTypeKind.Date.getFullQualifiedName());
	CsdlProperty discountinueddate = new CsdlProperty().setName("DiscountinuedDate").setType(EdmPrimitiveTypeKind.Date.getFullQualifiedName());
	CsdlProperty rating = new CsdlProperty().setName("Rating").setType(EdmPrimitiveTypeKind.Int32.getFullQualifiedName());
	CsdlProperty price = new CsdlProperty().setName("Price").setType(EdmPrimitiveTypeKind.Decimal.getFullQualifiedName());
      CsdlNavigationProperty supplier = new CsdlNavigationProperty().setName("Supplier")
          .setType(ET_SUPPLIER_FQN).setPartner("Products");

    
	 CsdlPropertyRef propertyRef = new CsdlPropertyRef();
      propertyRef.setName("ID");
     

      CsdlEntityType entityType = new CsdlEntityType();
      entityType.setName(ET_PRODUCT_NAME);
      entityType.setProperties(Arrays.asList(id,name,description,releaseddate,discountinueddate,rating,price));
      entityType.setNavigationProperties(Arrays.asList(supplier));
	  entityType.setKey(Collections.singletonList(propertyRef));

      return entityType;
    }
    if(entityTypeName.equals(ET_SUPPLIER_FQN)){

	CsdlProperty id = new CsdlProperty().setName("ID").setType(EdmPrimitiveTypeKind.Int32.getFullQualifiedName());
	CsdlProperty name = new CsdlProperty().setName("Name").setType(EdmPrimitiveTypeKind.String.getFullQualifiedName());
	CsdlProperty address = new CsdlProperty().setName("Address").setType(CT_ADDRESS_FQN);
      CsdlNavigationProperty products = new CsdlNavigationProperty().setName("Products")
          .setType(ET_PRODUCT_FQN).setCollection(true).setPartner("Supplier");

    
	 CsdlPropertyRef propertyRef = new CsdlPropertyRef();
      propertyRef.setName("ID");
     

      CsdlEntityType entityType = new CsdlEntityType();
      entityType.setName(ET_SUPPLIER_NAME);
      entityType.setProperties(Arrays.asList(id,name,address));
      entityType.setNavigationProperties(Arrays.asList(products));
	  entityType.setKey(Collections.singletonList(propertyRef));

      return entityType;
    }

    return null;
  }

  @Override
  public CsdlEntitySet getEntitySet(FullQualifiedName entityContainer, String entitySetName) {

    if(entityContainer.equals(CONTAINER)){
	 if(entitySetName.equals(ES_PRODUCTS_NAME)){
        CsdlEntitySet entitySet = new CsdlEntitySet();
        entitySet.setName(ES_PRODUCTS_NAME);
        entitySet.setType(ET_PRODUCT_FQN);
		
		
		CsdlNavigationPropertyBinding supplier = new CsdlNavigationPropertyBinding();
        supplier.setTarget("Suppliers"); 
        supplier.setPath("Supplier"); 
       
         entitySet.setNavigationPropertyBindings(Arrays.asList(supplier));
        return entitySet;
      }
	 if(entitySetName.equals(ES_SUPPLIERS_NAME)){
        CsdlEntitySet entitySet = new CsdlEntitySet();
        entitySet.setName(ES_SUPPLIERS_NAME);
        entitySet.setType(ET_SUPPLIER_FQN);
		
		
		CsdlNavigationPropertyBinding products = new CsdlNavigationPropertyBinding();
        products.setTarget("Products"); 
        products.setPath("Products"); 
       
         entitySet.setNavigationPropertyBindings(Arrays.asList(products));
        return entitySet;
      }
     
    }

    return null;
  }

  @Override
  public CsdlEntityContainer getEntityContainer() {

    List<CsdlEntitySet> entitySets = new ArrayList<CsdlEntitySet>();
	 entitySets.add(getEntitySet(CONTAINER, ES_PRODUCTS_NAME));
	 entitySets.add(getEntitySet(CONTAINER, ES_SUPPLIERS_NAME));
   
    CsdlEntityContainer entityContainer = new CsdlEntityContainer();
    entityContainer.setName(CONTAINER_NAME);
    entityContainer.setEntitySets(entitySets);

    return entityContainer;
  }

  @Override
  public CsdlEntityContainerInfo getEntityContainerInfo(FullQualifiedName entityContainerName) {

    // This method is invoked when displaying the service document at e.g. http://localhost:8080/DemoService/DemoService.svc
    if(entityContainerName == null || entityContainerName.equals(CONTAINER)){
      CsdlEntityContainerInfo entityContainerInfo = new CsdlEntityContainerInfo();
      entityContainerInfo.setContainerName(CONTAINER);
      return entityContainerInfo;
    }

    return null;
  }
}

