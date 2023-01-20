DROP DATABASE IF EXISTS BRMS;
CREATE DATABASE BRMS;
USE BRMS;

DROP TABLE IF EXISTS USER;
CREATE TABLE USER
( 
login_id   varchar(50) primary key,
Fname varchar(50) ,
Lname VARCHAR(50) ,
email varchar(50) unique key,
phone varchar(10)  unique key,
password varchar(50),
identity_proof varchar(13) ,
physical_disability char(4),
address  varchar(255),
date_of_birth date ,
 age smallint
);
SELECT * FROM USER;
truncate table user;


DROP TABLE IF EXISTS BUS;
CREATE TABLE BUS
(
bus_id  varchar(5) primary key,
bus_registration_number varchar(14) unique key,
capcity int,
 type char(9)

);
DROP TABLE  IF EXISTS BUS_MANAGEMENT;
CREATE TABLE BUS_MANAGEMENT(
BUS_ID VARCHAR(10),
SEAT_NO VARCHAR(10),
STATUS  VARCHAR(10),
SEAT_TYPE char(1),
FOREIGN KEY (BUS_ID) REFERENCES BUS(BUS_ID) 
);
DROP TABLE IF EXISTS ROUTE;
CREATE TABLE ROUTE
(
route_id varchar(20) primary key,
bus_id varchar(10),
source varchar(255),
destination varchar(255),
FOREIGN KEY (bus_id) REFERENCES BUS(bus_id)
);
DROP TABLE IF EXISTS TRIP;
CREATE TABLE TRIP
(
trip_id varchar(10) primary key,
route_id varchar(10),
source varchar(255),
destination varchar(255),
ticket_charges smallint,
boarding_time time,
arrival_time time,
 FOREIGN KEY (route_id) REFERENCES route(route_id)
);

DROP TABLE IF EXISTS REGISTRATION;
CREATE TABLE REGISTRATION
(
ticket_number int not null auto_increment primary key,
login_id varchar(10),
trip_id varchar(10),
ticket_book_date  date,
seat_number tinyint,
berth_type char(1),
status varchar(20),
FOREIGN KEY(login_id) REFERENCES USER(login_id),
 FOREIGN KEY(trip_id) REFERENCES Trip(trip_id)


);







