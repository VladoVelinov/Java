USE classicmodels;

-- 1. Select all records of the employee table.
SELECT * 
FROM employees;

-- 2. Select all records of the employee table, but view only the first name, last name, and job title.
SELECT lastName, firstName, jobTitle 
FROM employees;

-- 3. Make the previous selection, but order by last name.
SELECT lastName, firstName, jobTitle 
FROM employees 
ORDER BY lastName;

-- 4. Find out the different job titles in the employee table.
SELECT DISTINCT jobTitle 
FROM employees;

-- 5. Find all different last names in the employee table and display them alphabetically.
SELECT DISTINCT lastName 
FROM employees 
ORDER BY lastName ASC;

-- 6. Find all different first names in the employee table and display them alphabetically.
SELECT DISTINCT firstName 
FROM employees 
ORDER BY firstName ASC;

-- 7. Display the number of records in the employee table.
SELECT COUNT(*) 
FROM employees;

-- 8. Display the number of different last names in the employee table.
SELECT COUNT(DISTINCT lastName) 
FROM employees;

-- 9. Display the number of different first names in the employee table.
SELECT COUNT(DISTINCT firstName) 
FROM employees;

-- 10. Display all different state and city pairs from the customers table.
-- SELECT COUNT(*) AS countDistinct FROM (SELECT DISTINCT state, city FROM customers) AS Table;
SELECT DISTINCT state, city 
FROM customers;

-- 11. Display the previous query, but exclude records where the state is null.
SELECT state, city 
FROM customers 
WHERE state IS NOT NULL;

/* 12. Display the previous query, but exclude records where the city is null but order alphabetically 
first by state and then by city. */
SELECT state, city 
FROM customers 
WHERE city IS NOT NULL 
ORDER BY state, city ASC;

-- 13. Find all the different countries in the customers table.
SELECT DISTINCT country 
FROM customers;

-- 14. Find the names of employees, whose job title is 'Sales Rep'.
SELECT firstName, lastName 
FROM employees 
WHERE jobTitle='Sales Rep';

-- 15. Execute the previous query, but add the condition that the office code is 1.
SELECT firstName, lastName 
FROM employees 
WHERE jobTitle='Sales Rep' AND officeCode=1;

-- 16. Find the number of employees, whose job title is 'Sales Rep'.
SELECT COUNT(*) 
FROM employees 
WHERE jobTitle='Sales Rep';

-- 17. Execute the previous query, but add the condition that the office code is 1.
SELECT COUNT(*) 
FROM employees 
WHERE jobTitle='Sales Rep' AND officeCode=1;

-- 18. Find the names of employees, whose job title is NOT 'Sales Rep'.
SELECT firstName, lastName 
FROM employees 
WHERE jobTitle!='Sales Rep';

-- 19. Find the number of employees, whose job title is NOT 'Sales Rep'.
SELECT COUNT(*) 
FROM employees 
WHERE jobTitle!='Sales Rep';

-- 20. Find the different office codes in the employee table.
SELECT DISTINCT officeCode 
FROM employees;

-- 21. Find the names of employees, whose office code is greater than 5.
SELECT firstName, lastName 
FROM employees 
WHERE officeCode>5;

-- 22. Find the product names, codes and prices from the products table, whose price is between 90 and 100.
SELECT productCode, productName, buyPrice 
FROM products 
WHERE buyPrice BETWEEN 90 AND 100;

-- 23. Find the product names, codes and prices from the products table, whose price is NOT between 20 and 80.
SELECT productCode, productName, buyPrice 
FROM products 
WHERE buyPrice NOT BETWEEN 20 AND 80;

-- 24. Select all the names of employees, whose last name ends in 'on'.
SELECT firstName, lastName 
FROM employees 
WHERE lastName LIKE '%on';

-- 25. Select all the names of employees, whose last name contains 'on'.
SELECT firstName, lastName 
FROM employees 
WHERE lastName LIKE '%on%';

-- 26. Select all the names of employees, whose last name does not start with B.
SELECT firstName, lastName 
FROM employees 
WHERE NOT lastName LIKE 'B%';

-- 27. Select all customers from the customers table whose country is USA and state is CA.
SELECT customerName 
FROM customers 
WHERE country='USA' AND state='CA';

/* 28. For the group of customers in the previous query, find the names of the ones that have 
credit limit greater than 100 000. */
SELECT customerName 
FROM customers 
WHERE country='USA' AND state='CA' AND creditLimit>100000;

-- 29. Find the names of the customers from North America (USA, Canada, Mexico).
SELECT customerName 
FROM customers 
WHERE country='USA' OR country='Canada' OR country='Mexico';

-- 30. Find the number of customers from the previous query.
SELECT COUNT(customerName) 
FROM customers 
WHERE country='USA' OR country='Canada' OR country='Mexico';

-- 31. Find the customers from North America, who have credit limit, greater than 100 000.
SELECT customerName 
FROM customers 
WHERE country='USA' OR country='Canada' OR country='Mexico' AND creditLimit>100000;

-- 32. Create a query, that does the same thing as query 29, but uses the IN operator.
SELECT customerName 
FROM customers 
WHERE country IN ('USA', 'Canada', 'Mexico');

-- 33. Find the customer names from the customers table, who are not in North America.
SELECT customerName 
FROM customers 
WHERE country NOT IN ('USA', 'Canada', 'Mexico');

-- 34. Find the orders from the orders table, that have an order number of 10165, 10287, or 10310.
SELECT * 
FROM orders 
WHERE orderNumber=10165 OR orderNumber=10287 OR orderNumber=10310;

-- 35. From the orders table, for each status, find out the number of orders in that status.
SELECT status, COUNT(*) 
FROM orders 
GROUP BY status;

/* 36. From the orderdetails table, for each product code, find out the number of times this product code was ordered. 
 Order the results, starting with the largest number first. */
SELECT productCode, COUNT(*) 
FROM orderdetails 
GROUP BY productCode 
ORDER BY COUNT(*) DESC;

/* 37. From the productdetails table, for each product code, find the total quantity, ordered for that product. 
Order the results, starting with the largest number first. */
SELECT productCode, SUM(quantityOrdered) 
FROM orderdetails 
GROUP BY productCode 
ORDER BY SUM(quantityOrdered) DESC;

/* 38. From the productdetails table, for each product code, find the total amount of money, received from all orders. 
Order the results, starting with the largest amount first. */
SELECT productCode, (quantityOrdered*priceEach) as TotalMoney 
FROM orderdetails 
GROUP BY productCode 
ORDER BY TotalMoney DESC;

-- 39. Find all the different product lines from the productLines table.
SELECT productLine 
FROM productlines 
GROUP BY productLine;

-- 40. Find all the product codes and names that belong to the product line 'Classic Cars'.
SELECT productCode, productName 
FROM products 
WHERE productLine='Classic Cars';

-- 41. Find all the product lines with the corresponding products that belong to them, sorted by product line.
SELECT p.productCode, p.productName, pl.productLine, pl.textDescription
FROM products AS p
INNER JOIN productlines AS pl ON p.productLine=pl.productLine;

-- 42. Print all order number, date, and status from the orders table, together with the customer name.
SELECT orders.orderNumber, orders.orderDate, orders.status, customers.customerName
FROM orders
INNER JOIN customers
ON orders.customerNumber = customers.customerNumber;

/* 43. From the orderdetails and the products table, find out the product code, product Name, and the number 
of times this product was ordered. */
SELECT products.productCode, products.productName, COUNT(*)
FROM products
INNER JOIN orderdetails
ON products.productCode = orderdetails.productCode
GROUP BY products.productCode
ORDER BY COUNT(*) DESC;

/* 44. From the orderdetails and the products table, find out the product code, product Name, and the quantity 
ordered for this product. */
Select od.productCode, p.productName, SUM(od.quantityOrdered) as OurSum
from orderdetails as od
INNER JOIN products as p USING (productCode)
GROUP BY p.productName
ORDER BY OurSum DESC;

/* 45. From the orderdetails and the products table, find out the product code, product Name, and the total 
sales amount, received for this product from all orders. */
SELECT p.productCode,p.productName, SUM(od.quantityOrdered*od.priceEach) as oursum
FROM orderdetails as od
INNER JOIN products as p USING(productCode)
GROUP BY p.productCode
ORDER BY oursum desc;

/* 46. Joining the orders and orderdetails tables, for every order print the order number, date, and the total 
amount for that order. */
SELECT o.orderNumber, o.orderDate, SUM(od.quantityOrdered) as Total
FROM orders as o
INNER JOIN orderdetails as od USING (orderNumber)
GROUP BY o.orderNumber
ORDER BY Total;

/* 47. Create another product with a description '1962 Lada'. Choose an appropriate unique product code and make 
the product belong to the 'Vintage Cars' product line. To check the result, select all the vintage cars and make 
sure the new product is there. */
INSERT INTO products (productCode, 
					  productName, 
                      productLine, 
                      productScale, 
                      productVendor, 
                      productDescription, 
                      quantityInStock, 
                      buyPrice, 
                      MSRP) 
VALUES ('S80_1000',
		'1962 Lada',
		'Vintage Cars',
 		'1:80',
 		'Soviet Cars',
 		'Classic Soviet Era Model',
 		120,
 		35.50,
 		42.00);

-- 48. Create an order for 5 '1962 Lada' model cars and associate it with a customer of your choice.
INSERT INTO orders (orderNumber, 
					orderDate, 
                    requiredDate, 
                    status, 
                    customerNumber)
VALUES (10426, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 1 WEEK), 'In Process', 103);

INSERT INTO orderdetails (orderNumber, 
						  productCode, 
                          quantityOrdered, 
                          priceEach, 
                          orderLineNumber)
VALUES (10426, 'S80_1000', 5, 35.50, 1);

-- 49. Change the order that you created in 48 and make it for 6 instead of 5 cars.
UPDATE orderdetails
SET quantityOrdered = 6
WHERE orderNumber = 10426;

-- 50. Delete the record for the '1962 Lada' that you created and the associated order.
DELETE FROM orderdetails
WHERE orderNumber = 10426;

DELETE FROM orders 
WHERE orderNumber = 10426;

DELETE FROM products
WHERE productCode = 'S8usersusers0_1000';

-- 51
CREATE DATABASE bank;

USE bank;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `streetAddress` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `accounts` (
  `accountNumber` int(11) NOT NULL AUTO_INCREMENT,
  `accountType` enum('checking','saving') NOT NULL,
  `userId` int(11) NOT NULL,
  `balance` float(11,2) NOT NULL,
  PRIMARY KEY (`accountNumber`),
  KEY `fk_accounts_users` (`userId`),
  CONSTRAINT `fk_accounts_users` FOREIGN KEY (`userId`) REFERENCES `users` (`id`)
);

CREATE TABLE `deposits` (
  `depositNumber` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `amount` float(11,2) NOT NULL,
  `creationDate` date NOT NULL,
  `maturity` int(11) NOT NULL,
  PRIMARY KEY (`depositNumber`),
  KEY `_idx` (`userId`),
  CONSTRAINT `fk_deposit_users` FOREIGN KEY (`userId`) REFERENCES `users` (`id`)
);

-- Elegantnoto reshenie za problema EEST Time Zone na MySQL
SET GLOBAL time_zone = '+2:00';