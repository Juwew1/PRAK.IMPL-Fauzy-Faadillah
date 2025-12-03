USE UniversityDB;
DROP TABLE IF EXISTS Faculty;

CREATE TABLE Faculty (
    Faculty_ID INT NOT NULL PRIMARY KEY,
    Name VARCHAR(100),
    Gender CHAR(1),
    Salary DECIMAL(10, 2),
    Date_Of_Birth DATE,
    Designation VARCHAR(50),
    Grade VARCHAR(10),
    Department_ID INT,

    CONSTRAINT fk_faculty_dept FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID) ON DELETE RESTRICT
);