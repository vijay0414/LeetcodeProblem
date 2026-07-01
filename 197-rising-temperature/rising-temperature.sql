# Write your MySQL query statement below
select w.id as Id from Weather w join Weather w1
where Datediff(w.recordDate,w1.recordDate) = 1 
and w.temperature > w1.temperature;