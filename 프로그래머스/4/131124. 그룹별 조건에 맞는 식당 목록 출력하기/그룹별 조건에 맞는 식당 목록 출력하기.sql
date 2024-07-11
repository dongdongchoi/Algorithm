SELECT A.MEMBER_NAME, B.REVIEW_TEXT, DATE_FORMAT(B.REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE
FROM MEMBER_PROFILE A JOIN REST_REVIEW B ON A.MEMBER_ID = B.MEMBER_ID
WHERE A.MEMBER_ID = (SELECT MEMBER_ID FROM 
                      (SELECT MEMBER_ID, COUNT(*) AS review_count 
                       FROM REST_REVIEW 
                       GROUP BY MEMBER_ID 
                       ORDER BY review_count DESC 
                       LIMIT 1) AS AB) 
                       ORDER BY B.REVIEW_DATE ASC, B.REVIEW_TEXT ASC;