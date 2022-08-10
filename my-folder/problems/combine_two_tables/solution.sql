# Write your MySQL query statement below
select firstName, LastName, City, State from Person left join Address on Person.PersonId =
Address.PersonId;