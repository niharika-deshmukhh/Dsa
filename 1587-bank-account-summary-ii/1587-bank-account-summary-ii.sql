# Write your MySQL query statement below
SELECT u.name as NAME ,sum(amount) as BALANCE 
 from Transactions t join users u on
 u.account=t.account
 group by t.account having balance>10000;