# Write your MySQL query statement below
select teacher_id ,count(DISTINCT subject_id) AS cnt from teacher GROUP BY(teacher_id);