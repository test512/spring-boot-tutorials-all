CREATE TABLE booking(
	id BIGINT NOT NULL AUTO_INCREMENT, 
	bookingAmount VARCHAR(255), 
	createdBy BIGINT, 
	dropAddress VARCHAR(255), 
	pickupAddress VARCHAR(255), 
	PRIMARY KEY (id)) ENGINE=InnoDB;

create table UserDetails (
	id integer not null auto_increment, 
	email varchar(255), 
	firstName varchar(255), 
	lastName varchar(255), 
	password varchar(255), 
	primary key (id)) ENGINE=InnoDB;


use booking;
INSERT INTO booking(bookingAmount,createdBy,dropAddress,pickupAddress) VALUES('1250',1,'Chennai','Bangalore');
INSERT INTO booking(bookingAmount,createdBy,dropAddress,pickupAddress) VALUES('2050',1,'Bangalore','Chennai');
INSERT INTO UserDetails(email,firstName,lastName,password) VALUES ('abc@test.com','Abc','Test','password');


use User;
INSERT INTO booking(bookingAmount,createdBy,dropAddress,pickupAddress) VALUES('1250',1,'Chennai','Bangalore');
INSERT INTO booking(bookingAmount,createdBy,dropAddress,pickupAddress) VALUES('2050',1,'Bangalore','Chennai');
INSERT INTO UserDetails(email,firstName,lastName,password) VALUES ('abc@test.com','Abc','Test','password');