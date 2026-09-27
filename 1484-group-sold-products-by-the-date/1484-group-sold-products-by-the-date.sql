# Write your MySQL query statement below
SELECT SELL_DATE as sell_date,COUNT(distinct PRODUCT) AS num_sold ,
GROUP_concat(DISTINCT product ORDER BY PRODUCT) as products
 from activities
 group by sell_date;