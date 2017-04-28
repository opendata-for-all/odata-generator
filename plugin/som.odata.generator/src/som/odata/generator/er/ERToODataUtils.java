package som.odata.generator.er;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import org.atteo.evo.inflector.English;
import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate.Factory;

import edm.EdmFactory;
import edm.ODComplexType;
import edm.ODEntityContainer;
import edm.ODEntitySet;
import edm.ODEntityType;
import edm.ODNamedElement;
import edm.ODNavigationProperty;
import edm.ODNavigationPropertyBinding;
import edm.ODPrimitiveType;
import edm.ODProperty;
import edm.ODPropertyKeyRef;
import edm.ODSchema;
import edm.ODService;
import edm.ODType;
import eer.Attribute;
import eer.AttributeLink;
import eer.AttributeType;
import eer.CardinalityType;
import eer.DataType;
import eer.Entity;
import eer.Node;
import eer.Relationship;
import eer.RelationshipLink;
import eer.Schema;

public class ERToODataUtils {

	public static void generateODataFromER(ODService service, Schema schema, EdmFactory factory) {
		Map<Entity,ODEntityType> entityTypeMappings = new HashMap<>();
		Map<Entity,ODEntitySet> entitySetMappings = new HashMap<>();
		
		ODSchema odSchema = factory.createODSchema();
		odSchema.setNamespace("com.example.ODataDemo");
		odSchema.setAlias("ODataDemo");
		ODEntityContainer entityContainer = factory.createODEntityContainer();
		entityContainer.setName("DemoService");
		odSchema.setEntityContainer(entityContainer);
		service.getSchemas().add(odSchema);
	
		for (Node node : schema.getNodes()) {
			if (node instanceof Entity) {
				Entity entity = (Entity) node;
				ODEntityType entityType = factory.createODEntityType();
				entityType.setName(entity.getName());
				entityTypeMappings.put(entity, entityType);
				odSchema.getEntityTypes().add(entityType);
				
				List<AttributeLink> attributeLinkSourceList = entity.getAttributeLinkSource();
				for (AttributeLink attributeLink : attributeLinkSourceList) {
					
					Attribute attribute = attributeLink.getTarget();
					ODProperty property = factory.createODProperty();
					entityType.getProperties().add(property);
					property.setName(attribute.getName());
					if (attribute.getType().equals(AttributeType.MULTIVALUED))
						property.setMultivalued(true);
					if (attribute.getType().equals(AttributeType.IDENTIFIER)) {
						property.setNullable(false);
						ODPropertyKeyRef keyRef = factory.createODPropertyKeyRef();
						keyRef.setProperty(property);
						entityType.getKey().add(keyRef);
					}
					if (attribute.getAttributeLinkSource().isEmpty()) {
						ODPrimitiveType primitiveType = getODataType(attribute.getDataType(), factory);
						odSchema.getPrimitiveTypes().add(primitiveType);
						property.setType(primitiveType);
					}

					else {
						ODComplexType complexType = factory.createODComplexType();
						odSchema.getComplexTypes().add(complexType);
						complexType.setName(attribute.getName());
						property.setType(complexType);
						for (AttributeLink subAttributeLink : attribute.getAttributeLinkSource()) {
							Attribute subAttribute = subAttributeLink.getTarget();
							ODProperty subProperty = factory.createODProperty();
							subProperty.setName(subAttribute.getName());
							complexType.getProperties().add(subProperty);
							ODPrimitiveType primitiveType = getODataType(subAttribute.getDataType(), factory);
							odSchema.getPrimitiveTypes().add(primitiveType);
							subProperty.setType(primitiveType);
							if (subAttribute.getType().equals(AttributeType.MULTIVALUED))
								subProperty.setMultivalued(true);
						}
					}
				}

				ODEntitySet entitySet = factory.createODEntitySet();
				entitySet.setEntityType(entityType);
				entityContainer.getEntitySets().add(entitySet);
				entitySet.setName(English.plural(entity.getName()));
				entitySetMappings.put(entity, entitySet);
			}
		}
		for(Node node: schema.getNodes()){
			if(node instanceof Relationship){
				Relationship relationship = (Relationship) node;
				List<RelationshipLink> relationshipLinks = relationship.getRelationshipLink();
				if(relationshipLinks.size() == 2){
					RelationshipLink relationshipLinkA = relationshipLinks.get(0);
					Entity entityA = (Entity) relationshipLinkA.getSource();
					ODEntityType entityTypeA = entityTypeMappings.get(entityA);
					ODEntitySet entitySetA = entitySetMappings.get(entityA);
						
					RelationshipLink relationshipLinkB = relationshipLinks.get(1);
					Entity entityB = (Entity) relationshipLinkB.getSource();
					ODEntityType entityTypeB = entityTypeMappings.get(entityB);
					ODEntitySet entitySetB = entitySetMappings.get(entityB);
					
					
					ODNavigationProperty navigationA2B = factory.createODNavigationProperty();
					entityTypeA.getNavigationProperties().add(navigationA2B);
					navigationA2B.setType(entityTypeB);
					if(relationshipLinkB.getCardinality().equals(CardinalityType.MANY)){
						navigationA2B.setMultivalued(true);
						navigationA2B.setName(English.plural(entityB.getName()));
					}
					else
						navigationA2B.setName(entityB.getName());
					
					ODNavigationProperty navigationB2A = factory.createODNavigationProperty();
					entityTypeB.getNavigationProperties().add(navigationB2A);
					navigationB2A.setType(entityTypeA);
					if(relationshipLinkA.getCardinality().equals(CardinalityType.MANY)){
						navigationB2A.setMultivalued(true);
						navigationB2A.setName(English.plural(entityA.getName()));
					}
					else
						navigationB2A.setName(entityA.getName());
					
					
					navigationA2B.setPartner(navigationB2A);
					navigationB2A.setPartner(navigationA2B);
					
					
					ODNavigationPropertyBinding navigationPropertyBindingA2B = factory.createODNavigationPropertyBinding();
					entitySetA.getNavigationPropertyBindings().add(navigationPropertyBindingA2B);
					navigationPropertyBindingA2B.setPath(navigationA2B.getName());
					navigationPropertyBindingA2B.setTarget(entitySetB.getName());
					
					
					ODNavigationPropertyBinding navigationPropertyBindingB2A = factory.createODNavigationPropertyBinding();
					entitySetB.getNavigationPropertyBindings().add(navigationPropertyBindingB2A);
					navigationPropertyBindingB2A.setPath(navigationB2A.getName());
					navigationPropertyBindingB2A.setTarget(entitySetA.getName());
					

					
				}
			}
		}
	}

	private static ODPrimitiveType getODataType(DataType dataType, EdmFactory factory) {
		ODPrimitiveType primitiveType = factory.createODPrimitiveType();
		if (dataType.equals(DataType.INTEGER))
			primitiveType.setName("Edm.Int32");
		else if (dataType.equals(DataType.STRING))
			primitiveType.setName("Edm.String");
		else if (dataType.equals(DataType.FLOAT))
			primitiveType.setName("Edm.Decimal");
		else if (dataType.equals(DataType.BOOLEAN))
			primitiveType.setName("Edm.Boolean");
		else if (dataType.equals(DataType.TIMESTAMP))
			primitiveType.setName("Edm.Date");
		else 
			primitiveType.setName("Edm.String");
		return primitiveType;
	}

}
