# Write your MySQL query statement below

select distinct l.num as ConsecutiveNums
from Logs l, Logs l2, Logs l3
where l.id = l2.id+1 and l2.id =l3.id+1 and l.num= l2.num and l2.num=l3.num

