-- Create Database  Queries 
CREATE DATABASE employee;
USE employee;

-- Create Table Queries
CREATE TABLE hobby(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  NAME VARCHAR(250)
) AUTO_INCREMENT = 101;

CREATE TABLE employee(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  first_name VARCHAR(250), 
  last_name VARCHAR(250), 
  age TINYINT(3), 
  mobile_number VARCHAR(17), 
  address VARCHAR(250)
);

CREATE TABLE employee_salary(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  salary DECIMAL(7, 2), 
  salary_date DATE, 
  fk_employee_id INT, 
  FOREIGN KEY (fk_employee_id) REFERENCES employee(id)
);

CREATE TABLE employee_hobby(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  fk_employee_id INT, 
  fk_hobby_id INT, 
  FOREIGN KEY (fk_employee_id) REFERENCES employee(id), 
  FOREIGN KEY (fk_hobby_id) REFERENCES hobby(id)
);

-- Insert Data in hobby Queries
INSERT INTO hobby (NAME) 
VALUES 
  ('Bike Riding');

INSERT INTO hobby (NAME) 
VALUES 
  ('Singing');

INSERT INTO hobby (NAME) 
VALUES 
  ('Reading');

INSERT INTO hobby (NAME) 
VALUES 
  ('Walking');

INSERT INTO hobby (NAME) 
VALUES 
  ('Travelling');

-- Insert Data in employee table Queries
INSERT INTO employee (
  first_name, last_name, age, mobile_number, 
  address
) 
VALUES 
  (
    'Tom', 'Tom', 18, 999999994, 'Naroda'
  );

INSERT INTO employee (
  first_name, last_name, age, mobile_number, 
  address
) 
VALUES 
  (
    'Jerry', 'Ederson', 18, 949956999, 
    'Nigam'
  );

INSERT INTO employee (
  first_name, last_name, age, mobile_number, 
  address
) 
VALUES 
  (
    'Sam', 'Cruis', 18, 994995999, 'Maninagar'
  );

INSERT INTO employee (
  first_name, last_name, age, mobile_number, 
  address
) 
VALUES 
  (
    'Harry', 'Sam', 18, 999994959, 'Bapunagar'
  );

INSERT INTO employee (
  first_name, last_name, age, mobile_number, 
  address
) 
VALUES 
  (
    'David', 'Gutta', 18, 999995399, 'Vasna'
  );

-- Insert Data in employee_salary table Queries
INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (10000, '2008-11-11', 1);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (15000, '2008-11-11', 2);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (15000, '2008-11-11', 3);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (10000, '2008-11-11', 1);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (15000, '2008-11-11', 5);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (15000, '2008-11-11', 5);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (10000, '2008-11-11', 4);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (15000, '2008-11-11', 2);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (15000, '2008-11-11', 3);

INSERT INTO employee_salary (
  salary, salary_date, fk_employee_id
) 
VALUES 
  (10000, '2008-11-11', 4);

-- Insert Data in employee_hobby table Queries
INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (1, 105);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (2, 104);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (3, 103);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (2, 101);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (5, 102);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (2, 101);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (3, 105);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (2, 103);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (4, 101);

INSERT INTO employee_hobby (fk_employee_id, fk_hobby_id) 
VALUES 
  (1, 102);

-- Update Data Queries
UPDATE 
  hobby 
SET 
  NAME = 'Coding' 
WHERE 
  NAME = 'riding';

UPDATE 
  employee 
SET 
  last_name = 'Addy' 
WHERE 
  address = 'Bapunagar';

UPDATE 
  employee_salary 
SET 
  salary = 15000, 
  salary_date = '2008-12-11' 
WHERE 
  id = 2;

UPDATE 
  employee_hobby 
SET 
  id =(
    SELECT 
      id 
    FROM 
      hobby 
    WHERE 
      NAME = 'Coding'
  ) 
WHERE 
  id = 1;

-- Delete Data Queries
DELETE FROM 
  employee 
LIMIT 
  2;

DELETE FROM 
  employee_salary 
LIMIT 
  2;

DELETE FROM 
  employee_hobby 
LIMIT 
  2;

DELETE FROM 
  hobby 
LIMIT 
  2;

-- Truncate Table Queries
TRUNCATE TABLE hobby;
TRUNCATE TABLE employee_salary;
TRUNCATE TABLE employee_hobby;
TRUNCATE TABLE employee;

-- Select All Data Queries
SELECT 
  * 
FROM 
  hobby;

SELECT 
  * 
FROM 
  employee;

SELECT 
  * 
FROM 
  employee_hobby;

SELECT 
  * 
FROM 
  employee_salary;

-- Create a select query to get  employee name, his/her employee_salary 
SELECT 
  DISTINCT emp.first_name AS NAME, 
  es.salary AS salary 
FROM 
  employee AS emp, 
  employee_salary AS es 
WHERE 
  emp.id = es.fk_employee_id;

-- select single query to get all employee name, all hobby_name in single column 
SELECT 
  CONCAT(
    first_name, ' ',last_name) AS NAME 
FROM 
  employee 
UNION ALL 
SELECT 
  NAME AS hobby 
FROM 
  hobby;

-- Get employee name, total salary of employee, hobby name(comma-separated - you need to use subquery for hobby name)
SELECT 
  CONCAT(
    emp.first_name, ' ', emp.last_name
  ) AS emp_Name, 
  SUM(es.salary) AS salary, 
  (
    SELECT 
      GROUP_CONCAT(h.NAME SEPARATOR ', ') 
    FROM 
      employee_hobby eh 
      LEFT JOIN hobby h ON h.id = eh.fk_hobby_id 
    WHERE 
      emp.id = eh.fk_employee_id
  ) AS hobby 
FROM 
  employee emp 
  LEFT JOIN employee_salary es ON emp.id = es.fk_employee_id 
GROUP BY 
  emp.id;
