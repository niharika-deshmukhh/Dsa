# Write your MySQL query statement below
SELECT e.name FROM Employee e JOIN Employee m  ON  m.MANAGERID=e.ID GROUP BY m.MANAGERID HAVING COUNT(m.ID)>=5;