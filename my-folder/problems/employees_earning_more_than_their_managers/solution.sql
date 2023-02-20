# Write your MySQL query statement below

SELECT  e1.name as Employee 
FROM Employee e1, Employee e2
Where e1.managerID = e2.id and e1.salary > e2.salary 