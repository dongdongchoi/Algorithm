-- 코드를 입력하세요
select b.category, sum(s.sales) as total_sales
from book b join 
(SELECT book_id, sales
from book_sales
where sales_date Like '2022-01%') s on b.book_id = s.book_id
group by b.category
order by b.category asc