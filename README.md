# OData-generator
OData-generator is an Eclipse plugin to generate  OData services from ER models.
From an initial ER model, the tool gnenerates an OData service for a MySQL database conforming to the model definition, including the transformation of OData requests to SQL queries.
The approach relies on an OData pivot metamodel, which is used to represent and generate OData services.
## Features
The plugin provides a contextual menu to obtain:
- a OData model from an ER model

Given the obtained OData model instance, the plugin includes a menu to generate: 
- the metadata document conforming to OData specification; 
- the DDL of the database 
- A Maven-based project containing the implementation of the  OData service based on Apache Olingo  and JOOQ.


## Requirements
OData-generator requires:
- Java EE distributation of Eclipse IDE (it can be found [here](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/neon3)).
- A MySQL database.
- [EERCASE](https://sites.google.com/a/cin.ufpe.br/eercase/) to create an ER model (you can use our [sample ER model](https://raw.githubusercontent.com/SOM-Research/odata-generator/master/examples/samples/products.eer)). 


