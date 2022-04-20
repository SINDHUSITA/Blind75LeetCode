# Write your MySQL query statement below


select e.name as Employee from Employee as e Inner Join Employee as e1 where e.managerID = e1.id and e.salary > e1.salary
