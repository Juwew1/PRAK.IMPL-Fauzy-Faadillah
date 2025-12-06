USE UniversityDB;
DROP TABLE IF EXISTS Faculty;

CREATE TABLE Faculty (
    Faculty_ID INT NOT NULL,
    Name VARCHAR(100),
    Gender VARCHAR(10),
    Salary DECIMAL(15, 2),
    Date_Of_Birth DATE,
    Designation VARCHAR(50),
    Grade VARCHAR(10),
    Department_ID INT,

    PRIMARY KEY (Faculty_ID),

    CONSTRAINT fk_faculty_dept FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID) ON DELETE RESTRICT
);
