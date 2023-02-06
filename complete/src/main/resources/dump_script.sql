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
VALUES 
(63050159, "AI", 3, 60 ),
(63050160, "SE", 3, 30 ),
(63050161, "TND", 3, 120 );

insert into students
VALUES 
(63050100, "Admin Kung","admin@gmail.com",1,null),
(63050101, "Arai Wha","admin@gmail.com",1,null),
(63050102, "No no","admin@gmail.com",1,null);

SELECT * from courses;
SELECT * from students;