# Write your MySQL query statement below
select c.name as Customers from Customers as c where not exists (select * from Orders as o where c.id = o.customerId)