-- select *,avg(price) OVER () as averageprice from products where (price) > (select avg(price) from products);
--  12
-- SELECT state, COUNT(*) AS count_of_authors FROM authors GROUP BY state ORDER BY state;
-- 13
-- SELECT state FROM authors WHERE first_name LIKE 'S%' GROUP BY state HAVING COUNT(*) > 2;
-- 14
-- SELECT REPLACE(REPLACE(title, ' ', '.'), '-', '*') AS required_string FROM books;
-- 15
-- SELECT REPLACE(title, ' ', '') AS required_string FROM books;
-- 16
-- SELECT SUBSTRING_INDEX(title, ' ', 1) AS first_word FROM books;
-- 17
-- SELECT month, COUNT(*) AS no_of_books FROM books GROUP BY month ORDER BY month;
-- 18
-- SELECT title, p_name FROM books WHERE p_country = 'USA';
-- 19
-- SELECT p_name, AVG(price) AS avg_price FROM books GROUP BY p_name;
-- 20
-- SELECT author_name, title FROM books WHERE title IS NULL OR title = '';
-- 21
-- SELECT title, p_name, author_name FROM books WHERE is_primary_author = 1;
-- 22
-- SELECT p_city, MAX(price) AS max_price FROM books GROUP BY p_city;
-- 23
-- SELECT title FROM books WHERE author_city = 'Menlo Park';
-- 24
-- SELECT DISTINCT p_name FROM books WHERE publish_year = 1991;
-- 25
-- SELECT title FROM books WHERE p_country <> 'USA';
-- 26
-- SELECT title FROM books WHERE p_country = 'USA' OR price < 5;
-- 27
-- CREATE VIEW book_details_view AS SELECT title,publisher,p_year, COALESCE(price, 0) AS price, COALESCE(type, 'Unknown') AS type FROM books;
-- 28
-- SELECT DISTINCT p_name FROM books WHERE author_name IN ( SELECT author_name FROM books GROUP BY author_name HAVING COUNT(title) > 2);
-- 29
-- DELETE FROM title_author WHERE first_name = 'Dean';
-- 30
-- UPDATE books SET price = ( SELECT price  FROM books  WHERE book_id = 'MC2222' ) WHERE book_id = 'BU1111';
-- 31
-- SELECT title FROM books WHERE year >= YEAR(CURDATE()) - 25;
-- 32
-- SELECT title FROM books WHERE p_name IN ( SELECT p_name FROM books WHERE year = 2021);
-- 33
-- CREATE VIEW publisher_book_count AS SELECT p_name,p_city, COUNT(title) AS count_books FROM books GROUP BY p_name, p_city;
-- 1
-- ALTER TABLE products ADD COLUMN tax_rate DECIMAL(5,2)
-- UPDATE products SET tax_rate = price * 0.12;
-- 2
-- SELECT * FROM titles WHERE title LIKE '%s'  OR title LIKE '%t';
-- 3
-- SELECT * FROM titles WHERE type = 'business' OR type = 'psychology' OR type = 'undecided';
-- 4
-- SELECT * FROM titles WHERE sales > 5000 AND royalty < 20;
-- 5
-- SELECT * FROM titles WHERE p_id = '0736' ORDER BY sales ASC;
-- 6
-- SELECT  MAX(royalty) - MIN(royalty) AS difference FROM titles WHERE p_id = '0877';
-- 7
-- SELECT author_id, COUNT(*) AS books_count FROM title_author GROUP BY author_id;
-- 8
-- SELECT title_id, COUNT(author_id) AS total_authors FROM title_author GROUP BY title_id;
-- 9
-- SELECT AVG(royalty) AS avg_royalty FROM title_author WHERE ord = 1;
-- 10
-- SELECT * FROM titles WHERE sales BETWEEN 10000 AND 20000 ORDER BY price;

























