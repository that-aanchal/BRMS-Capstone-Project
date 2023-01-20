USE BRMS;
DROP Procedure IF EXISTS USER_INPUT;
DELIMITER //

CREATE PROCEDURE USER_INPUT
(IN  login_id varchar(10) ,IN  Fname varchar(25), IN Lname VARCHAR(25),IN  email varchar(25), IN phone bigint  , IN password varchar(20),
 IN identity_proof bigint ,  IN physical_disability char(3),  IN address  varchar(255), IN date_of_birth date ,IN age smallint  )
BEGIN
INSERT INTO USER VALUES(login_id, fname,lname,email,phone,password,identity_proof,physical_disability,address,date_of_birth,age);
END//
DELIMITER ;
CALL USER_INPUT('AANCHAL123' , 'aanchal','joshi','aanchal123@gmail.com',8544125485, 'Joshi@123',254158743256,'No','Kopargaon , Maharashtra','2007-05-23',23);
CALL USER_INPUT('VIKAS123' , 'vikas','kapoor ','vikas123@gmail.com',8574125485, 'Kapoor@123',254115943256,'No','Kolhapur , Maharashtra','1974-01-10',14);
CALL USER_INPUT('SURAJ123' , 'Suraj','Desai','pooja123@gmail.com',9914125485, 'Desai@123',114158743256,'No','Surat , Gujrat','2001-11-14',56);
CALL USER_INPUT('PRANIT123' , 'Pranit','Kale','shiv123@gmail.com',8524125485, 'Kale@123',214758743256,'No','Sangli , Maharashtra','1965-04-17',45);
CALL USER_INPUT('PREETI123' , 'preeti','Shaikh','maruti123@gmail.com',8414125485, 'Shaikh@123',478158743256,'No','Mumbai , Maharashtra','1981-10-12',23);

SELECT * FROM USER;
DELIMITER //
CREATE PROCEDURE USER_UPDATE
(IN fn  varchar(25) ,  IN ln varchar(25) , IN eml varchar(25),IN ph int , IN pwd varchar(25) , IN id_proof int , IN addr varchar(255) ,
 IN dob date , IN old_login_Id varchar(10) , IN old_pwd varchar(20)  )
 BEGIN 
 UPDATE USER SET 
 Fname = fn,
 Lname = ln,
 email=eml,
 phone=ph,
 password=pwd,
 identity_proof =id_proof,
 address=addr,
 date_of_birth = dob
 
WHERE login_id=old_login_id  AND password= old_pwd;
END//

CREATE PROCEDURE USER_DATA_DELETE
(IN LOG_ID vARCHAR(10) ,IN PWD VARCHAR (25) )
BEGIN
DELETE FROM USER WHERE LOGIN_ID= LOG_ID AND PASSWORD=PWD;
END//

CALL USER_DATA_DELETE('PRANIT123','Kale@123')//

/*CREATE TRIGGER AGE
AFTER INSERT ON USER FOR EACH ROW
BEGIN
SELECT  TIMESTAMPDIFF(YEAR, dATE_OF_BIRTH, CURDATE()) AS age FROM USER;
UPDATE USER
SET AGE=AGE;*/





 






