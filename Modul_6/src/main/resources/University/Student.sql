USE UniversityDB;
DROP TABLE IF EXISTS Student;

CREATE TABLE Student (
    Student_ID INT NOT NULL,
    Name VARCHAR(100),
    Phone_Number VARCHAR(20),
    Date_Of_Birth DATE,
    Gender VARCHAR(10),
    House_Number VARCHAR(20),
    Street_Number VARCHAR(50),
    City VARCHAR(50),
    Town VARCHAR(50),
    Department_ID INT,

    PRIMARY KEY (Student_ID),

    CONSTRAINT fk_student_dept FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID) ON DELETE RESTRICT
);