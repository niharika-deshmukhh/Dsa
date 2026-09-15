# Write your MySQL query statement below
SELECT NAME AS Customers FROM CUSTOMERS LEFT JOIN orders ON CUSTOMERS.ID=ORDERS.customerId
WHERE customerId IS null;