# OData-generator
OData-generator is an Eclipse plugin to generate  OData services from ER models.
From an initial ER model, the tool gnenerates an OData service for a MySQL database conforming to the model definition, including the transformation of OData requests to SQL queries.
The tool relies on an OData pivot metamodel, which is used to represent and generate OData services.
## Features
The plugin provides a contextual menu to obtain:
- a OData model from an ER model.

Given the obtained OData model instance, the plugin includes a menu to generate: 
- the metadata document conforming to OData specification.
- the DDL of the database.
- A Maven-based project containing the implementation of the  OData service based on [Apache Olingo](https://olingo.apache.org/) and [JOOQ](https://www.jooq.org/).


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

4. Select *OData generator* then click on *Next*.

![Add repository](https://som-research.github.io/odata-generator/screenshots/avail-software.png)

5. Follow the the rest of the steps (license, etc...) and reboot Eclipse.

## Using the plugin

1. Create a Java Project or use an existing project in your workspace (you can import our project called *som.odata.generator.example* located under the folder *examples*.
2. Import your ER model (a sample model called [products.eer](https://raw.githubusercontent.com/SOM-Research/odata-generator/master/examples/samples/products.eer) in located under the folder *examples/sample/*). 
3. Right-click on your ER model and select *OData/Generate OData model from ER*. This will generate an OData model under the folder *src-gen* of your project (Check [products.edm](https://raw.githubusercontent.com/SOM-Research/odata-generator/master/examples/som.odata.generator.example/src-gen/products.edm), the generated model from products.eer).
4. Right-click on the generated OData model and select:
* *OData/Generate Metadata* to generate the corresponding metadata document (check [metadata.xml](https://raw.githubusercontent.com/SOM-Research/odata-generator/master/examples/som.odata.generator.example/src-gen/metadata.xml), the generated metadata document from products.edm).
* *OData/Generate database schema* to generate the DDL of the database (check [schema.sql](https://raw.githubusercontent.com/SOM-Research/odata-generator/master/examples/som.odata.generator.example/src-gen/schema.sql), the generated DDL* from products.edm).
* *OData/Generate OData service* to generate a Maven project called *odata.demo* in your workspace containing the implementation of your OData service. Note that you have te refresh your workspace in order to see all the generated files (check the generated [odata.demo](https://github.com/SOM-Research/odata-generator/tree/master/examples/odata.demo) from products.edm).

## Deploy the generated service
1. In your database, create a schema called *odata* and run the genered DDL.
2. Add some data to you datatabse (you can use our sample script [insert.sql](https://raw.githubusercontent.com/SOM-Research/odata-generator/master/examples/samples/insert.sql) for products.eer).
3. In the generated project, update the configuration file called config.properties located under the folder src/main/resources following your database configuration (i.e., host, username, password).
4. Build and run the project in [Tomcat server](http://tomcat.apache.org/) using: 
  * Right-click on the project and  select *Run as/Maven install" which will generate a WAR archive for the project
  * Right-click on the project and select *Run on Server* then follow the instructions to run the Web app in your Tomcat server.

## URL examples
Some URL examples for the generated service using the default configuration:
* Service document: `http://localhost:8080/ODataDemo/DemoService.svc/`
* Metadata document: `http://localhost:8080/ODataDemo/DemoService.svc/$metadata`
* List of prodcuts: `http://localhost:8080/ODataDemo/DemoService.svc/Products`
* List of suppliers: `http://localhost:8080/ODataDemo/DemoService.svc/Suppliers`
* List of the products of supplier 1: `http://localhost:8080/ODataDemo/DemoService.svc/Suppliers(1)/Products`
* List of the products of products ordered by name: `http://localhost:8080/ODataDemo/DemoService.svc/Products?$orderby=Name`
* List of the products witht the price less or equals to 4: `http://localhost:8080/ODataDemo/DemoService.svc/Products?$filter=Price le 4.00`
## Who is behind this project?

* [Hamza Ed-douibi](http://github.com/hamzaed/ "Hamza Ed-douibi")
* [Javier Canovas](http://github.com/jlcanovas/ "Javier Canovas")
* [Jordi Cabot](http://github.com/jcabot/ "Jordi Cabot")

Hamza, Javier and Jordi are currently members of SOM, a research team of IN3-UOC in Barcelona, Spain.


