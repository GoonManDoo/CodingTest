-- 코드를 입력하세요
SELECT count(USER_ID) AS USERS
FROM USER_INFO
WHERE Year(JOINED) = 2021 AND AGE BETWEEN 20 AND 29;