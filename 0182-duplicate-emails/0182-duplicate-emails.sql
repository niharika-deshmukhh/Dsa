# Write your MySQL query statement below
select Email from person group by Email Having count(Email)>1;