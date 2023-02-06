-- Active: 1675671992146@@18.140.195.8@3306@university4
drop table courses;
CREATE TABLE courses(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    create_time DATETIME,
    name VARCHAR(255),
    credit int,
    max_seat int,
    course_id int
);

insert into courses(course_id, name, credit, max_seat)
VALUES (63050159, "AI", 3, 60 );

insert into courses(course_id, name, credit, max_seat)
VALUES (63050160, "SE", 3, 30 );

insert into courses(course_id, name, credit, max_seat)
VALUES (63050161, "TND", 3, 120 );

SELECT * from courses;

SELECT * from students;

insert into students
VALUES 
