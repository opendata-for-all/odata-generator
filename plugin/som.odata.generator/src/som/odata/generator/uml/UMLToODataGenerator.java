package som.odata.generator.uml;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.atteo.evo.inflector.English;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;

import edm.EdmFactory;
import edm.EdmPackage;
import edm.ODComplexType;
import edm.ODEntityContainer;
import edm.ODEntitySet;
import edm.ODEntityType;
import edm.ODNavigationProperty;
import edm.ODNavigationPropertyBinding;
import edm.ODPrimitiveType;
import edm.ODProperty;
import edm.ODPropertyKeyRef;
import edm.ODSchema;
import edm.ODService;
import edm.ODStructuralType;

public class UMLToODataGenerator {

	private Map<Class, ODEntityType> entityTypeMappings;
	private Map<Class, ODEntitySet> entitySetMappings;
	private Map<Property, ODNavigationProperty> navigationPropertyMappings;
	private Map<DataType, ODComplexType> complexDataTypeMappings;
	private Model model;
	private EdmFactory factory;
	private ODService service;

	public UMLToODataGenerator( Model model) {
	
		this.model = model;
		entityTypeMappings = new HashMap<>();
		entitySetMappings = new HashMap<>();
		navigationPropertyMappings = new HashMap<Property, ODNavigationProperty>();
		complexDataTypeMappings = new HashMap<DataType, ODComplexType>();
		EdmPackage.eINSTANCE.eClass();
		factory = EdmFactory.eINSTANCE;
		service = factory.createODService();

	}

	public ODService generate() {

		ODSchema odSchema = factory.createODSchema();
		odSchema.setNamespace("com.example.ODataDemo");
		odSchema.setAlias("ODataDemo");
		ODEntityContainer entityContainer = factory.createODEntityContainer();
		entityContainer.setName("DemoService");
		odSchema.setEntityContainer(entityContainer);
		service.getSchemas().add(odSchema);
		// complex types first
		for (Iterator<EObject> it = model.eAllContents(); it.hasNext();) {
			EObject child = it.next();
			if (child instanceof DataType && !(child instanceof PrimitiveType)) {
				DataType dataType = (DataType) child;
				ODComplexType complexDataType = factory.createODComplexType();
				complexDataType.setName(dataType.getName());
				complexDataTypeMappings.put(dataType, complexDataType);
				odSchema.getComplexTypes().add(complexDataType);

				for (Property attribute : dataType.getOwnedAttributes()) {
						generateProperty(odSchema, complexDataType, attribute);
				}

			}
		}
		
		// genrate entities
		for (Iterator<EObject> it = model.eAllContents(); it.hasNext();) {
			EObject child = it.next();
			if (child instanceof Class) {
				Class clazz = (Class) child;
				ODEntityType entityType = factory.createODEntityType();
				entityType.setName(clazz.getName());
				entityTypeMappings.put(clazz, entityType);
				odSchema.getEntityTypes().add(entityType);

				for (Property attribute : clazz.getOwnedAttributes()) {
					if (attribute.getAssociation() == null)
						generateProperty(odSchema, entityType, attribute);
				}

				ODEntitySet entitySet = factory.createODEntitySet();
				entitySet.setEntityType(entityType);
				entityContainer.getEntitySets().add(entitySet);
				entitySet.setName(English.plural(clazz.getName()));
				entitySetMappings.put(clazz, entitySet);
			}
		}
		//resolve navigations
		for (Iterator<EObject> it = model.eAllContents(); it.hasNext();) {
			EObject child = it.next();
			if (child instanceof Class) {
				Class clazz = (Class) child;
				ODEntityType entityType = entityTypeMappings.get(clazz);
				for (Property attribute : clazz.getOwnedAttributes()) {
					if (attribute.getAssociation() != null) {
						
						generateNavigationProperty(entityType,entitySetMappings.get(clazz), attribute);
					}
				}

			}
		}
		//resolve partners
		for (Iterator<EObject> it = model.eAllContents(); it.hasNext();) {
			EObject child = it.next();
			if (child instanceof Class) {
				Class clazz = (Class) child;
				for (Property attribute : clazz.getOwnedAttributes()) {
					if (attribute.getAssociation() != null) {
						ODNavigationProperty navigationProperty = navigationPropertyMappings.get(attribute);
						List<Property> memberEnds = attribute.getAssociation().getMemberEnds();
						if(memberEnds.size() == 2) {
							if(memberEnds.get(0).equals(attribute))
								navigationProperty.setPartner(navigationPropertyMappings.get(memberEnds.get(1)));
							if(memberEnds.get(1).equals(attribute))
								navigationProperty.setPartner(navigationPropertyMappings.get(memberEnds.get(0)));
						}
						
					}
						
				}

			}
		}
		return service;
	}

	private ODNavigationProperty generateNavigationProperty(ODEntityType entityType, ODEntitySet odEntitySet, Property property) {

		ODNavigationProperty navigationProperty = factory.createODNavigationProperty();
		navigationProperty.setName(property.getName());
		Class targetClass = (Class) property.getType();
		ODEntityType targetEntityType = entityTypeMappings.get(targetClass);
		navigationProperty.setType(targetEntityType);
		if (property.isMultivalued())
			navigationProperty.setMultivalued(true);
		if (property.getAggregation().equals(AggregationKind.COMPOSITE_LITERAL))
			navigationProperty.setContainsTarget(true);
		entityType.getNavigationProperties().add(navigationProperty);
		
		navigationPropertyMappings.put(property, navigationProperty);
		ODNavigationPropertyBinding navigationPropertyBinding = factory.createODNavigationPropertyBinding();
		navigationPropertyBinding.setPath(navigationProperty.getName());
		navigationPropertyBinding.setTarget(entitySetMappings.get(targetClass).getName());
		odEntitySet.getNavigationPropertyBindings().add(navigationPropertyBinding);
		return navigationProperty;

	}

	private ODProperty generateProperty(ODSchema odSchema, ODStructuralType structuredType, Property attribute) {
		ODProperty property = factory.createODProperty();
		structuredType.getProperties().add(property);
		property.setName(attribute.getName());
		if (attribute.isMultivalued())
			property.setMultivalued(true);
		if (structuredType instanceof ODEntityType && attribute.isID()) {
			property.setNullable(false);
			ODPropertyKeyRef keyRef = factory.createODPropertyKeyRef();
			keyRef.setProperty(property);
			((ODEntityType) structuredType).getKey().add(keyRef);
		}
		if (attribute.getType() instanceof PrimitiveType) {
			ODPrimitiveType primitiveType = getODataType((PrimitiveType) attribute.getType(), factory);
			odSchema.getPrimitiveTypes().add(primitiveType);
			property.setType(primitiveType);
		} else {
			property.setType(complexDataTypeMappings.get(attribute.getType()));
		}
		return property;
	}

	private ODPrimitiveType getODataType(PrimitiveType dataType, EdmFactory factory) {
		ODPrimitiveType primitiveType = factory.createODPrimitiveType();
		if (dataType.getName().equals("Integer"))
			primitiveType.setName("Edm.Int32");
		else if (dataType.getName().equals("String"))
			primitiveType.setName("Edm.String");
		else if (dataType.getName().equals("Real"))
			primitiveType.setName("Edm.Decimal");
		else if (dataType.getName().equals("Date"))
			primitiveType.setName("Edm.Date");
		else
			primitiveType.setName("Edm.String");
		return primitiveType;
	}

}
