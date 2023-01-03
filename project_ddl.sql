DROP DATABASE IF EXISTS BRMS;
CREATE DATABASE BRMS;
USE BRMS;

DROP TABLE IF EXISTS USER;
CREATE TABLE USER
( 
login_id   varchar(10) primary key,
name varchar(25) ,
email varchar(25) unique key,
phone int  unique key,
password varchar(20),
identity_proof int ,
physical_disability char(3),
address  varchar(255),
date_of_birth date ,
age smallint
);
SELECT * FROM USER;
DROP DATABASE IF EXISTS ROUTE;
CREATE TABLE ROUTE
(
source varchar(255),
destination varchar(255)
);
DROP DATABASE IF EXISTS BUS;
CREATE TABLE BUS
(
bus_registration_number varchar(14) primary key,
capcity int,
type char(9),
seat_type char(1)
);
DROP DATABASE IF EXISTS TRIP;
CREATE TABLE TRIP
(
bus_registration_no varchar(14),
source varchar(255),
destination varchar(255),
ticket_charges smallint,
boarding_time time,
arrival_time time,
FOREIGN KEY (bus_registration_no) REFERENCES BUS(bus_registration_number)

);

DROP DATABASE IF EXISTS REGISTRATION;
CREATE TABLE REGISTRATION
(
ticket_number int primary key,
bus_no  varchar(14),
name varchar(25),
age smallint,
boarding_time time,
arrival_time time
);



#SELECT UUID();