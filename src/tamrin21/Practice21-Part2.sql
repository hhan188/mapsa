use practice21;
SELECT * FROM person;
SELECT * FROM post;

-- 2 Retrieve all persons sorted by their age in ascending order.
SELECT * FROM person order by age asc;

-- 3 Retrieve the count of persons for each age group.
SELECT age, count(*) as CountOfAge FROM person 
group by age order by age asc;

-- 4 Retrieve the average age of persons.
SELECT avg(age) as AverageOfAge FROM person;

-- 5 Retrieve the persons whose age is between 30 and 40.
SELECT id, name, age, gender FROM person 
where age between 30 and 40;

-- 6 Retrieve the persons whose names start with the letter 'J'.
SELECT id, name FROM person where name LIKE 'J%';

-- 7 Update the age of the person with email = "john.doe@example.com" to 35.
update person 
set age = 35 where email ='john.doe@example.com';

-- 8 Delete all persons who are younger than 18.
delete from person 
where age < 18;

-- 9 Retrieve the persons and their respective count of posts.
Select person.id, name , count(person_id) as CountOfPosts
From person inner join post
where person.id = person_id
group by person_id;

-- 10 Retrieve the persons who have more than 2 posts.
SELECT person.id, name, COUNT(person_id) AS CountOfPosts
FROM person INNER JOIN post
WHERE person.id = person_id
GROUP BY person_id
HAVING CountOfPosts > 2;

-- 11 Retrieve the persons and their total income, sorted in descending order of income.
select * from person 
order by income desc;

-- 12 Retrieve the persons who have a salary greater than the average income.
select * from person
where income > (select avg(income) from person);

-- 13 Retrieve the persons whose email addresses contain "gmail.com".
select * from person
where email like '%gmail.com%';

-- 14 Retrieve the persons grouped by nationality and display the count of persons in each group.

alter table person
add nationality varchar(30) after phone_number;

UPDATE person SET nationality = 
    CASE 
        WHEN nationality IS NULL AND id = 1 THEN 'American'
        WHEN nationality IS NULL AND id = 2 THEN 'German'
        WHEN nationality IS NULL AND id = 3 THEN 'French'
        WHEN nationality IS NULL AND id = 4 THEN 'Spanish'
        WHEN nationality IS NULL AND id = 5 THEN 'Danish'
        WHEN nationality IS NULL AND id = 6 THEN 'Iranian'
        WHEN nationality IS NULL AND id = 7 THEN 'French'
        WHEN nationality IS NULL AND id = 8 THEN 'German'
        WHEN nationality IS NULL AND id = 9 THEN 'Danish'
        WHEN nationality IS NULL AND id = 10 THEN 'Indian'
        WHEN nationality IS NULL AND id = 11 THEN 'Japanese'
        WHEN nationality IS NULL AND id = 12 THEN 'Iranian'
        WHEN nationality IS NULL AND id = 13 THEN 'Danish'
        WHEN nationality IS NULL AND id = 14 THEN 'Mexican'
        WHEN nationality IS NULL AND id = 15 THEN 'Japanese'
        WHEN nationality IS NULL AND id = 16 THEN 'Iranian'
        WHEN nationality IS NULL AND id = 17 THEN 'Polish'
        WHEN nationality IS NULL AND id = 18 THEN 'Spanish'
        WHEN nationality IS NULL AND id = 19 THEN 'Spanish'
        WHEN nationality IS NULL AND id = 20 THEN 'Spanish'
        WHEN nationality IS NULL AND id = 21 THEN 'Iranian'
        WHEN nationality IS NULL AND id = 22 THEN 'Ukrainian'
        WHEN nationality IS NULL AND id = 23 THEN 'Vietnamese'
        WHEN nationality IS NULL AND id = 24 THEN 'Iranian'
        WHEN nationality IS NULL AND id = 25 THEN 'Iranian'
        WHEN nationality IS NULL AND id = 26 THEN 'Yemeni'
        ELSE nationality
    END;
    
select nationality, count(id) as NumberOfPersons from person group by nationality;

-- 15 Retrieve the persons whose names contain the word "Smith" and are older than 40.
Select * from person where name like '%Smith%' and age > 40;

-- 16 Retrieve the persons whose names have at least 5 characters and end with the letter 'a'.
Select * from person where length(name) >= 5 and name like '%a';

-- 17 Retrieve the persons and their ages, giving the age column an alias of "Years".
select name , age as Years from person;

-- 18 Retrieve the persons and their ages, rounding the age values to the nearest whole number.
select name , round(age) from person;

-- 19 Update the email of the person with the highest age to "oldest@example.com".
--  This error occurs when you try to update a table that is also being used in a sub-query within the same statement.
--  MySQL does not allow this because it can cause unexpected results and potential data inconsistency.
--  To work around this issue, you can rewrite the query using a sub-query in the WHERE clause instead of
--  using the IN operator with a sub-query.

update person
set email = 'oldest@example.com'
where age = (select age from (select max(age) as age from person) as m);

-- 20 Delete all persons whose names are duplicated in the table, keeping only one instance of each name.
DELETE FROM person
WHERE id NOT IN (select id from (SELECT MIN(id) as id FROM person GROUP BY name) as t);

-- 21 Retrieve all posts along with the names of the persons who wrote them.
select name, title, content 
from person as p inner join post as o 
on p.id = o.person_id;

-- 22 Retrieve the count of posts for each person.
select person_id, count(*) as NumberOfPosts
from post
group by person_id;

-- 23 Retrieve the persons who have not written any posts.
select * from person
where id not in (select distinct(person_id) from post);

-- 24 Retrieve the average age of persons who have written at least 3 posts.
select avg(age) from person 
where id in (select person_id as id from post group by person_id having count(*) >= 3);

-- 25 Retrieve the persons who have written posts containing the word "SQL" in the content.
select * from person 
where id in (SELECT DISTINCT(person_id) AS id FROM post WHERE content LIKE '%SQL%' GROUP BY person_id);

-- 26 Retrieve the persons who have written the longest post.
select * from person 
where id in (select person_id from post where length(content) = (select max(length(content)) from post));

-- 27 Retrieve the posts along with the total number of likes each post has received.

-- Reconfiguring Database tables!
-- Create new column
alter table post
add likeCount int after content;

-- Fill the new column
UPDATE post SET likeCount =
    CASE
        WHEN likeCount IS NULL THEN FLOOR(RAND() * 100)
        ELSE likeCount
    END;
    
-- Now the answer:
select title as 'Post Title', content as 'Post Content', likeCount as 'Like Count' from post;
   
-- 28 Retrieve the posts with their respective person names and sort them by the persons age in descending order.
select name as 'Writer name', title as 'Post Title', content as 'Post Content', likeCount as 'Like Count' 
from person as p inner join post as o 
on p.id = o.person_id
order by age desc;

-- 29 Retrieve the persons who have written posts, grouped by their marital status, and display the count of persons in each group.
select marital_status, count(*) as Count from person
where id in (select distinct(person_id) from post)
group by marital_status;

-- 30 Retrieve the posts written by persons aged between 25 and 40.
select name as 'Writer name', title as 'Post Title', content as 'Post Content', likeCount as 'Like Count' 
from person as p inner join post as o 
on p.id = o.person_id
where age between 25 and 40;

-- 31 Retrieve the persons who have written posts, ordered by their education level in ascending order
--    and then by their income in descending order.
SELECT DISTINCT (name) AS 'Writer name', education_level 'Education', income 'Income'
FROM person AS p INNER JOIN post AS o 
ON p.id = o.person_id
ORDER BY education_level ASC , income DESC;

-- 32 Retrieve the posts along with the average age of persons who have liked each post
-- Reconfiguring Database tables!
-- Create new table for storing witch person likes witch post
create table person_post_like(
  id INT NOT NULL AUTO_INCREMENT,
  post_id INT NOT NULL,
  person_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (post_id) REFERENCES post(id),
  FOREIGN KEY (person_id) REFERENCES person(id)
  );
  
-- Create random valid data for new table
INSERT INTO person_post_like (post_id, person_id)
SELECT post_id, person_id
FROM (
  SELECT DISTINCT post.id AS post_id, person.id AS person_id
  FROM post, person
  ORDER BY RAND()
  LIMIT 2000
) AS t
ORDER BY RAND();

-- Update count of likes for each post based on new table
--  A correlated sub-query is a sub-query that depends on the outer query for its values.
--  In other words, the sub-query references a column from the outer query, which is used to filter the results of the sub-query.
--  The sub-query is executed once for each row in the outer query, and the results are used to evaluate the outer query.

UPDATE post
SET post.likeCount = (
  SELECT COUNT(*) 
  FROM person_post_like ppl
  WHERE ppl.post_id = post.id
);
  
-- Now the answer of Question 32:
SELECT post.title 'Post Title', post.content 'Post Content', AverageAgeLiked FROM (
	SELECT post_id, AVG(age) AS 'AverageAgeLiked'
	FROM (
		SELECT post_id, person.age
		FROM person_post_like ppl INNER JOIN person
		WHERE person.id = ppl.person_id) AS t1
	GROUP BY post_id) AS t2, post
WHERE post.id = t2.post_id;

-- 33 Retrieve the persons who have written posts, where the number of posts they have written is greater than the average number of posts.

SELECT 
    name AS 'Writer name', age, gender, marital_status AS 'Marital Status', PostCount
FROM
    person,
    (SELECT person_id, COUNT(*) AS PostCount
    FROM post
    GROUP BY person_id
    HAVING PostCount >= 
		(SELECT AVG(PersonPostCount) FROM
			(SELECT 
				COUNT(*) AS PersonPostCount
			FROM
				post
			GROUP BY person_id
			ORDER BY PersonPostCount DESC
			) AS t1
		)
    ) AS t2
WHERE
    t2.person_id = person.id;
    

-- 34 Retrieve the posts written by persons whose email addresses contain "gmail.com".
select name as 'Writer name', title as 'Post Title', content as 'Post Content', likeCount as 'Like Count' 
from person as p inner join post as o 
on p.id = o.person_id
where email like '%gmail.com';

-- 35 Retrieve the persons who have written the most recent post.

-- 36 Retrieve the persons who have written posts, along with the earliest date of their post.

-- 37 Retrieve the posts that have received more than 10 likes
select name as 'Writer name', title as 'Post Title', content as 'Post Content', likeCount as 'Like Count' 
from person as p inner join post as o 
on p.id = o.person_id
where likeCount > 10;

-- 38 Retrieve the persons who have written posts, along with the count of likes for each person's posts.
select name as 'Writer name' , SumOfLikeCounts from (
select person_id, sum(likeCount) as 'SumOfLikeCounts' 
from post as o 
group by person_id
) as t1, person
where person.id = t1.person_id;

-- 39 Retrieve the posts along with the person names, sorted by the length of the post content in descending order.
select title as 'Post Title', content as 'Post Content', likeCount as 'Like Count' , name as 'Writer name'
from person as p inner join post as o 
on p.id = o.person_id
order by length(content) desc;

-- 40 Retrieve the persons who have written posts, where the number of their posts is greater than
--    the number of posts written by any other person.

SELECT name AS 'Writer name', age, gender, marital_status AS 'Marital Status', MaxPostCount
FROM person,
    (SELECT person_id, COUNT(*) AS MaxPostCount
    FROM post
    GROUP BY person_id
    HAVING MaxPostCount =
		(SELECT COUNT(*) AS PostCount
        FROM post
        GROUP BY person_id
        ORDER BY PostCount DESC
        LIMIT 1
        )
	) AS t
WHERE
    t.person_id = person.id;
