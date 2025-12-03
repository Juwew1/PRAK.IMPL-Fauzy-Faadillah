USE UniversityDB;
DROP TABLE IF EXISTS Student;

CREATE TABLE Student (
    Student_ID INT NOT NULL PRIMARY KEY,
    Name VARCHAR(100),
    Phone_Number VARCHAR(15),
    Gender CHAR(1),
    Date_Of_Birth DATE,
    House_Number VARCHAR(10),
    Street_Number VARCHAR(10),
    Town VARCHAR(50),
    City VARCHAR(50),
    Department_ID INT,

    CONSTRAINT fk_student_dept FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID) ON DELETE RESTRICT
);