# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary  
 from employee e

left join department d on 
e.departmentID=d.id 
where (e.departmentId,e.salary) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);

