USE UniversityDB;
DROP TABLE IF EXISTS Course;

CREATE TABLE Course (
    Course_ID INT NOT NULL ,
    Code VARCHAR(20),
    Name VARCHAR(100),
    Department_ID INT,
    Faculty_ID INT,

    PRIMARY KEY (Course_ID),

    CONSTRAINT fk_course_dept FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID) ON DELETE RESTRICT,
    CONSTRAINT fk_course_faculty FOREIGN KEY (Faculty_ID) REFERENCES Faculty(Faculty_ID) ON DELETE RESTRICT
);