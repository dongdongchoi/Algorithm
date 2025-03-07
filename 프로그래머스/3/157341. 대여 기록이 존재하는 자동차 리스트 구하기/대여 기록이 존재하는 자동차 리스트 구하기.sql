-- 코드를 입력하세요
SELECT B.CAR_ID
FROM 
(SELECT CAR_ID, CAR_TYPE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = '세단') A
JOIN
(SELECT CAR_ID, START_DATE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE START_DATE BETWEEN '2022-10-01' AND '2022-10-31'
GROUP BY CAR_ID) B
ON A.CAR_ID = B.CAR_ID
ORDER BY B.CAR_ID DESC