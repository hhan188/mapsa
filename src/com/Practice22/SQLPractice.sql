use practice22;
create table person (
id int,
name varchar(50),
email varchar(50),
phone_number varchar(11),
age int,
gender varchar(20),
date_of_birth date,
occupation varchar(30),
education_level varchar(40),
marital_status varchar(40),
income int
);

select * from person;

INSERT INTO person (name, age, email, phone_number, gender, date_of_birth, occupation, education_level, marital_status, income)
VALUES
('John Smith', 35, 'john.smith@example.com', '555-1234', 'male', '1988-05-12', 'engineer', 'bachelor', 'married', 75000),
('Alice Johnson', 27, 'alice.johnson@example.com', '555-5678', 'female', '1996-10-21', 'teacher', 'master', 'single', 50000),
('Mark Williams', 42, 'mark.williams@example.com', '555-9012', 'male', '1979-02-28', 'doctor', 'doctorate', 'married', 120000),
('Emily Davis', 29, 'emily.davis@example.com', '555-3456', 'female', '1992-07-17', 'programmer', 'bachelor', 'single', 60000),
('James Lee', 31, 'james.lee@example.com', '555-7890', 'male', '1990-12-01', 'lawyer', 'master', 'single', 80000),
('Sarah Brown', 38, 'sarah.brown@example.com', '555-2345', 'female', '1985-09-07', 'manager', 'bachelor', 'married', 90000),
('David Wilson', 25, 'david.wilson@example.com', '555-6789', 'male', '1996-01-15', 'salesman', 'bachelor', 'single', 40000),
('Jennifer Garcia', 33, 'jennifer.garcia@example.com', '555-0123', 'female', '1988-12-24', 'nurse', 'bachelor', 'married', 55000),
('Michael Rodriguez', 46, 'michael.rodriguez@example.com', '555-4567', 'male', '1977-06-08', 'entrepreneur', 'bachelor', 'divorced', 150000),
('Jessica Martinez', 22, 'jessica.martinez@example.com', '555-8901', 'female', '2001-03-05', 'student', 'high school', 'single', 0),
('William Smith', 40, 'william.smith@example.com', '555-2345', 'male', '1981-11-18', 'software engineer', 'master', 'married', 100000),
('Elizabeth Davis', 28, 'elizabeth.davis@example.com', '555-6789', 'female', '1993-08-12', 'chef', 'bachelor', 'single', 45000),
('Christopher Johnson', 39, 'christopher.johnson@example.com', '555-0123', 'male', '1982-12-03', 'consultant', 'master', 'married', 110000),
('Amanda Martinez', 24, 'amanda.martinez@example.com', '555-4567', 'female', '1999-05-07', 'artist', 'bachelor', 'single', 35000),
('Matthew Garcia', 36, 'matthew.garcia@example.com', '555-8901', 'male', '1985-02-14', 'teacher', 'bachelor', 'married', 65000),
('Laura Hernandez', 30, 'laura.hernandez@example.com', '555-2345', 'female', '1991-11-27', 'accountant', 'master', 'single', 70000),
('Daniel Lopez', 43, 'daniel.lopez@example.com', '555-6789', 'male', '1978-04-22', 'manager', 'bachelor', 'married', 130000),
('Ashley Gonzalez', 26, 'ashley.gonzalez@example.com', '555-0123', 'female', '1995-01-09', 'journalist', 'master', 'single', 55000),
('Joseph Perez', 34, 'joseph.perez@example.com', '555-4567', 'male', '1987-08-31', 'engineer', 'bachelor', 'married', 90000),
('Samantha Torres', 31, 'samantha.torres@example.com', '555-8901', 'female', '1990-04-18', 'project manager', 'bachelor', 'single', 75000);

-- 2
select * from person order by age asc;

-- 3
select age, count(*) from person group by age;

-- 4
select avg(age) from person;

-- 5
select * from person where age between 30 and 40;

-- 6
select * from person where name like "j%";

-- 7
update person set age = 35 where email = "john.doe@example.com";

-- 8
delete from person where age < 18;

-- 9
select Person.id, name, count(P.id) from Person
		inner join Post P on Person.id = P.person_id
		group by P.person_id;

-- 10
select name, count(P.person_id) from Person
		join Post P on Person.id = P.person_id
		group by name having count(*) > 2;
        
-- 11
select * from person order by income desc;

-- 12
select * from person 
where income > (select avg(income) from person);

-- 13
select * from person where email like "%gmail.com";

-- 14
alter table person add nationality varchar(200) after phone_number;

-- 15
select * from person where name like "%smith%" and age > 40;

-- 16
select * from person where length(name) > 5 and name like "%a";

-- 17
select name, age as "Year" from person;

-- 18
select name, age from person where round(age);

-- 19
update Person set email='oldest@example.com'
		where age = (select age from 
		(select max(age) as age from Person) as f);

-- 20
delete from Person
where id in (select id 
from (select p.id
from Person p join Person p1 On
p1.id < p.id and p1.name = p.name) as pp1i);

-- 21
select person.name, p.title from person join post p on person.id = p.person_id;

-- 22
select P1.name , count(*)
		from Person P1
		inner join Post P on P1.id = P.Person_id
		group by P1.name;
        
-- 23
select * from person left join post p on person.id = p.person_id where p.person_id is null;

-- 24
select avg(p.age), post_count
		from(select person_id, count(*) as post_count
		from post group by person_id having count(*) >= 3) as post_counts
		join person p on post_counts.person_id = p.id
		group by post_count;

-- 25
select distinct person.*
		from person join post on person.id = post.person_id
		where post.content like '%SQL%';

-- 26
select person.*, max(length(post.content)) as max_length
		from person join post on person.id = post.person_id
		group by person.id 
		having max(length(post.content)) = (SELECT max(length(content)) FROM post);

-- 27
select p.id, p.title, p.content, count(l.id) as total_likes
from post p
left join posts_likes l on p.id = l.post_id
group by p.id;

-- 28
select post.*, person.name
from post
join person on post.person_id = person.id
order by person.age desc;

-- 29
select person.marital_status, count(DISTINCT person.id) as person_count
from person
join post on person.id = post.person_id
group by person.marital_status;

-- 30
select post.*
from post
join person on post.person_id = person.id
where person.age between 25 and 40;

-- 31
select distinct person.*
from person
join post on person.id = post.person_id
order by person.education_level asc, person.income desc;

-- 32
select post.*, avg(person.age) as avg_age
from post
join posts_likes on post.id = posts_likes.post_id
join person on posts_likes.post_id = person.id
group by post.id;

-- 33
select person.*, count(post.id) as post_count
from person
join post on person.id = post.person_id
group by person.id
having cont(post.id) > (select avg(post_count) from (select count(id) as post_count from post
group by person_id) as post_counts);

-- 34
select post.*
from post
join person on post.person_id = person.id
where person.email like '%@gmail.com';

-- 35
select person.*
from person
join post on person.id = post.person_id
order by post.publish_date desc
limit 1;

-- 36
select person.id, person.name, min(post.publish_date) as earliest_post_date
from person
join post on person.id = post.person_id
group by person.id;

-- 37
select *
from post
join (
  select post_id, count(*) as like_count
  from posts_likes
  group by post_id
  having like_count > 10
) as popular_posts on post.id = popular_posts.post_id;

-- 38
select person.id, person.name, count(posts_likes.id) as total_likes
from person
join post on person.id = post.person_id
join posts_likes on post.id = posts_likes.post_id
group by person.id;

-- 39
select post.*, person.name
from post
join person on post.person_id = person.id
order by length(post.content) desc;

-- 40
select person.*
from person
join (
  select person_id, count(*) as post_count
  from post
  group by person_id
  having count(*) >= all (
    select count(*)
    from post
    group by person_id
  )
) as popular_persons on person.id = popular_persons.person_id;