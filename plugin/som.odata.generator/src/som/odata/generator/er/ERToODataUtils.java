package som.odata.generator.er;

import java.util.List;

import javax.xml.crypto.Data;

import org.atteo.evo.inflector.English;
import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate.Factory;

import edm.EdmFactory;
import edm.ODComplexType;
import edm.ODEntityContainer;
import edm.ODEntitySet;
import edm.ODEntityType;
import edm.ODPrimitiveType;
import edm.ODProperty;
import edm.ODPropertyKeyRef;
import edm.ODSchema;
import edm.ODService;
import edm.ODType;
import eer.Attribute;
import eer.AttributeLink;
import eer.AttributeType;
import eer.DataType;
import eer.Entity;
import eer.Node;
import eer.Schema;

public class ERToODataUtils {

	public static void generateODataFromER(ODService service, Schema schema, EdmFactory factory) {
		ODSchema odSchema = factory.createODSchema();
		ODEntityContainer entityContainer = factory.createODEntityContainer();
		odSchema.setEntityContainer(entityContainer);
		service.getSchemas().add(odSchema);
		for (Node node : schema.getNodes()) {
			if (node instanceof Entity) {
				Entity entity = (Entity) node;
				ODEntityType entityType = factory.createODEntityType();
				entityType.setName(entity.getName());
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
							if (subAttribute.getType().equals(AttributeType.MULTIVALUED))
								subProperty.setMultivalued(true);

						}
					}
				}

				ODEntitySet entitySet = factory.createODEntitySet();
				entitySet.setEntityType(entityType);
				entityContainer.getEntitySets().add(entitySet);
				entitySet.setName(English.plural(entity.getName()));
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
		return primitiveType;
	}

}
