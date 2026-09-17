# Write your MySQL query statement below
select e.employee_id from employees e LEFT JOIN SALARIES s  ON e.employee_id=s.employee_id where  s.salary IS NULL 
UNION 
select s.employee_id from employees e right JOIN SALARIES s ON s.employee_id=e.employee_id where e.name IS NULL 
ORDER BY employee_id;;
