# Write your MySQL query statement below
select e.name as Employee from Employee e join Employee m on
e.managerId = m.id
where e.salary>m.salary ;
-- //WHERE EMOLYEE MANAGER ID IS EQUAL TO MANAGERS EMPLOYEE ID