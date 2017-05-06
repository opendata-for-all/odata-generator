# OData-generator
OData-generator is an Eclipse plugin to generate  OData services from ER models.
From an initial ER model, the tool gnenerates an OData service for a MySQL database conforming to the model definition, including the transformation of OData requests to SQL queries.
The tool relies on an OData pivot metamodel, which is used to represent and generate OData services.
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

## Installation
1. Open Eclipse IDE
2. Click on *Help / Install New Software...*
3. Click on *Add...* and fill in the form as indicated (the update site is https://som-research.github.io/odata-generator/update/) then click on *OK*.

![Add repository](https://som-research.github.io/odata-generator/screenshots/add-repo.png)

4. Select *OData generator* then click on *Next*

![Add repository](https://som-research.github.io/odata-generator/screenshots/avail-software.png)

5. Follow the the rest of the steps (license, etc...) and reboot Eclipse.

## Who is behind this project?

* [Hamza Ed-douibi](http://github.com/hamzaed/ "Hamza Ed-douibi")
* [Javier Canovas](http://github.com/jlcanovas/ "Javier Canovas")
* [Jordi Cabot](http://github.com/jcabot/ "Jordi Cabot")

Hamza, Javier and Jordi are currently members of SOM, a research team of IN3-UOC.


