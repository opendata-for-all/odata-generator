package som.odata.generator.er;

import java.util.List;

import javax.xml.crypto.Data;

import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate.Factory;

import edm.EdmFactory;
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
		service.getSchemas().add(odSchema);
		for(Node node: schema.getNodes()){
			if( node instanceof Entity){
				Entity entity = (Entity) node;
				ODEntityType entityType = factory.createODEntityType();
				entityType.setName(entity.getName());
			List<AttributeLink>	attributeLinkSourceList = entity.getAttributeLinkSource();
			for(AttributeLink attributeLink: attributeLinkSourceList){
				Attribute attribute = attributeLink.getTarget();
				if(!attribute.getType().equals(AttributeType.COMMON)){
					ODProperty property = factory.createODProperty();
					entityType.getProperties().add(property);
					property.setName(attribute.getName());
					ODPrimitiveType primitiveType = getODataType(attribute.getDataType(),factory);
					odSchema.getPrimitiveTypes().add(primitiveType);
					property.setType(primitiveType);
					if(attribute.getType().equals(AttributeType.MULTIVALUED))
						property.setMultivalued(true);
					if(attribute.getType().equals(AttributeType.IDENTIFIER)){
						ODPropertyKeyRef keyRef = factory.createODPropertyKeyRef();
						keyRef.setProperty(property);
						entityType.getKey().add(keyRef);
					}
					
				}
			}
				
			}
		}
	}

	private static ODPrimitiveType getODataType(DataType dataType,EdmFactory factory) {
		ODPrimitiveType primitiveType = factory.createODPrimitiveType();
		if(dataType.equals(DataType.INTEGER))
		primitiveType.setName("Edm.Int32");
		else
			if(dataType.equals(DataType.STRING))
				primitiveType.setName("Edm.String");
			else 
				if(dataType.equals(DataType.FLOAT))
					primitiveType.setName("Edm.Decimal");
				else
					if(dataType.equals(DataType.BOOLEAN))
						primitiveType.setName("Edm.Boolean");
					else 
						if(dataType.equals(DataType.TIMESTAMP))
							primitiveType.setName("Edm.Date");
		return primitiveType;
	}

}
