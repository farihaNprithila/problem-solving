-- Write your PostgreSQL query statement below

--select u.product_id,
--round(sum(cast(p.price as numeric) * u.units)/sum(u.units),2)as average_price 
--from Prices p
--left join UnitsSold u 
--on u.product_id = p.product_id 
--and u.purchase_date between p.start_date and p.end_date
--group by u.product_id

SELECT 
    p.product_id,
    ROUND(
        COALESCE(
            CASE 
                WHEN SUM(u.units) = 0 THEN 0  -- If no units sold, return 0
                ELSE SUM(CAST(p.price AS NUMERIC) * u.units) / NULLIF(SUM(u.units), 0)  -- Else calculate average price
            END,
            0  -- In case the CASE results in NULL, explicitly return 0
        ),
        2
    ) AS average_price 
FROM 
    Prices p
LEFT JOIN 
    UnitsSold u 
    ON u.product_id = p.product_id 
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY 
    p.product_id;
