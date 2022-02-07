-- Create Database  Queries 
CREATE DATABASE employee;

USE employee;

-- Create Table Queries
CREATE TABLE hobby(
hobby_id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
NAME VARCHAR(250)
);

CREATE TABLE employee(
employee_id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
first_name  VARCHAR(250),
last_name   VARCHAR(250),
age	     TINYINT(3),
mobile_number VARCHAR(17),
address    VARCHAR(250)
);

CREATE TABLE employee_salary(
employee_salary_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
salary DECIMAL(2),
salary_date DATE,
fk_employee_id INT,
FOREIGN KEY (fk_employee_id) REFERENCES hobby(hobby_id)
);

CREATE TABLE employee_hobby(
employee_hobby_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fk_employee_id INT,
fk_hobby_id INT,
FOREIGN KEY (fk_employee_id) REFERENCES employee(employee_id),
FOREIGN KEY (fk_hobby_id) REFERENCES hobby(hobby_id)
);

-- Insert Data Queries
INSERT INTO hobby (NAME) VALUES('Riding');
INSERT INTO hobby (NAME) VALUES('Singing');
INSERT INTO hobby (NAME) VALUES('Reading');
INSERT INTO hobby (NAME) VALUES('Walking');
INSERT INTO hobby (NAME) VALUES('Travelling');

INSERT INTO employee (first_name,last_name,age,mobile_number,address) VALUES('Tom','Tom',18,999999994,'Naroda');
INSERT INTO employee (first_name,last_name,age,mobile_number,address) VALUES('Jerry','Ederson',18,949956999,'Nigam');
INSERT INTO employee (first_name,last_name,age,mobile_number,address) VALUES('Sam','Cruis',18,994995999,'Maninagar');
INSERT INTO employee (first_name,last_name,age,mobile_number,address) VALUES('Tom','Sam',18,999994959,'Bapunagar');
INSERT INTO employee (first_name,last_name,age,mobile_number,address) VALUES('David','Gutta',18,999995399,'Vasna');

INSERT INTO employee_salary (salary,salary_date,fk_employee_id) VALUES(10000,'2008-11-11',(SELECT employee_id FROM employee WHERE employee_id='1'));
INSERT INTO employee_salary (salary,salary_date,fk_employee_id) VALUES(15000,'2008-11-12',(SELECT employee_id FROM employee WHERE employee_id='2'));
INSERT INTO employee_salary (salary,salary_date,fk_employee_id) VALUES(14500,'2008-11-13',(SELECT employee_id FROM employee WHERE employee_id='3'));
INSERT INTO employee_salary (salary,salary_date,fk_employee_id) VALUES(16000,'2008-11-14',(SELECT employee_id FROM employee WHERE employee_id='4'));
INSERT INTO employee_salary (salary,salary_date,fk_employee_id) VALUES(16000,'2008-11-14',(SELECT employee_id FROM employee WHERE employee_id='5'));


INSERT INTO employee_hobby (fk_employee_id,fk_hobby_id) VALUES((SELECT employee_id FROM employee WHERE employee_id='1'),(SELECT hobby_id FROM hobby WHERE hobby_id='4'));
INSERT INTO employee_hobby (fk_employee_id,fk_hobby_id) VALUES((SELECT employee_id FROM employee WHERE employee_id='2'),(SELECT hobby_id FROM hobby WHERE hobby_id='2'));
INSERT INTO employee_hobby (fk_employee_id,fk_hobby_id) VALUES((SELECT employee_id FROM employee WHERE employee_id='3'),(SELECT hobby_id FROM hobby WHERE hobby_id='2'));
INSERT INTO employee_hobby (fk_employee_id,fk_hobby_id) VALUES((SELECT employee_id FROM employee WHERE employee_id='4'),(SELECT hobby_id FROM hobby WHERE hobby_id='1'));
INSERT INTO employee_hobby (fk_employee_id,fk_hobby_id) VALUES((SELECT employee_id FROM employee WHERE employee_id='5'),(SELECT hobby_id FROM hobby WHERE hobby_id='3'));

-- Update Data Queries
UPDATE hobby SET NAME='Coding' WHERE NAME='riding';

UPDATE employee SET last_name='Addy' WHERE address='Bapunagar';

UPDATE employee_salary SET salary=15000,salary_date='2008-12-11' WHERE employee_id=2;

UPDATE employee_hobby SET hobby_id=(SELECT hobby_id FROM hobby WHERE NAME='Coding') WHERE employee_id=1;

-- Delete Data Queries
DELETE FROM employee LIMIT 2;
DELETE FROM employee_salary LIMIT 2;
DELETE FROM employee_hobby LIMIT 2;
DELETE FROM hobby LIMIT 2;

-- Truncate Table Queries
TRUNCATE TABLE hobby;
TRUNCATE TABLE employee_salary;
TRUNCATE TABLE employee_hobby;
TRUNCATE TABLE employee;

-- Select All Data Queries
SELECT * FROM hobby;
SELECT * FROM employee;
SELECT * FROM employee_hobby;
SELECT * FROM employee_salary;


-- Create a select query to get  employee name, his/her employee_salary 
SELECT  DISTINCT employee.first_name AS NAME,employee_salary.salary AS Salary FROM employee,employee_salary WHERE employee.employee_id = employee_salary.fk_employee_id;

-- select single query to get all employee name, all hobby_name in single column 
SELECT  first_name AS NAME FROM employee 
UNION ALL
SELECT NAME AS Hobby FROM hobby;

 -- Get employee name, total salary of employee, hobby name(comma-separated - you need to use subquery for hobby name)

SELECT eout.employee_id, eout.first_name AS Emp_Name,
SUM(es.salary) AS Salary, 
(SELECT GROUP_CONCAT( NAME SEPARATOR ', ' ) FROM employee_hobby eh 
LEFT JOIN hobby h ON h.hobby_id = eh.fk_hobby_id WHERE eout.employee_id = eh.fk_employee_id ) AS Hobby 
FROM employee eout
LEFT JOIN employee_salary es ON eout.employee_id = es.fk_employee_id   
GROUP BY employee_id;

