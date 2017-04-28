
# Create tables
CREATE TABLE product(
	id INT not null,
	name VARCHAR(255) ,
	description VARCHAR(255) ,
	releaseddate DATE ,
	discountinueddate DATE ,
	rating INT ,
	price DECIMAL ,
	supplier_id INT,
	PRIMARY KEY (id)
);
CREATE TABLE supplier(
	id INT not null,
	name VARCHAR(255) ,
	
	
	PRIMARY KEY (id)
);
# Add references
ALTER TABLE product
ADD FOREIGN KEY (supplier_id) REFERENCES supplier(id);

