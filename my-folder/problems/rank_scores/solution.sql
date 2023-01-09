# Write your MySQL query statement below

select s.score, DENSE_RANK() OVER (
    order by s.score Desc
) AS 'rank'
from Scores s
