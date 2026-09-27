# Write your MySQL query statement below
select date_id,make_name ,count(Distinct lead_id) as unique_leads,count(Distinct partner_id) as unique_partners  FROM DailySales GROUP BY MAKE_NAME , DATE_ID;