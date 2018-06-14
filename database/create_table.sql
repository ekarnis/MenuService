CREATE TABLE Food (
		foodID INT NOT NULL PRIMARY KEY,
		name VARCHAR(25) NOT NULL,
		foodGroup VARCHAR(25) NOT NULL,
		price DECIMAL(10,3) NOT NULL,
		description VARCHAR(50),
		stock INT NOT NULL,
		image VARCHAR(300) NOT NULL,
		CONSTRAINT UC_Food UNIQUE (name, foodGroup, price)
);

