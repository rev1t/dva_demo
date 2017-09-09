drop table if exists customer;
CREATE TABLE customer
(
	customer_id BIGINT NOT NULL PRIMARY KEY,
	firstname VARCHAR(50) NOT NULL,
	lastname VARCHAR(50) NOT NULL,
	address VARCHAR(50) NOT NULL,
	postal VARCHAR(4) NOT NULL,
	phone VARCHAR(10) NOT NULL,
	email VARCHAR(20)
);

drop table if exists claim;
CREATE TABLE claim
(
	claim_id BIGINT NOT NULL PRIMARY KEY,
	category VARCHAR(10) NOT NULL,
	description VARCHAR(50) NOT NULL,
	fk_customer_id BIGINT
);


