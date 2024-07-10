-- 코드를 입력하세요
SELECT U.USER_ID, U.NICKNAME, b.TOTAL_SALES
FROM 
(select writer_id, sum(price) as total_Sales from used_goods_board where status ='done' group by writer_id) as b
JOIN USED_GOODS_USER U ON B.WRITER_ID = U.USER_ID
where b.total_sales >=700000
order by total_Sales asc