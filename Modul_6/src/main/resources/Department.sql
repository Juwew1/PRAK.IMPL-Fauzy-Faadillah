USE UniversityDB;

DROP TABLE IF EXISTS Department;

CREATE TABLE Department (
    Department_ID INT NOT NULL,
    Name VARCHAR(100),

    PRIMARY KEY (Department_ID)
);