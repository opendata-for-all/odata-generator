
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
CREATE TABLE address(
	id INT not null,
	country VARCHAR(255) ,
	street VARCHAR(255) ,
	city VARCHAR(255) ,
	state VARCHAR(255) ,
	zipcode VARCHAR(255) ,
	PRIMARY KEY (id)
);
# Add references
ALTER TABLE product
ADD FOREIGN KEY (supplier_id) REFERENCES supplier(id);

ALTER TABLE supplier
ADD FOREIGN KEY (address_id) REFERENCES address(id);

