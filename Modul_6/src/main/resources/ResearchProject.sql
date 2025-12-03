USE UniversityDB;
DROP TABLE IF EXISTS Research_Project;

CREATE TABLE Research_Project (
    Project_ID INT NOT NULL PRIMARY KEY,
    Name VARCHAR(100),
    Area VARCHAR(100),
    Duration VARCHAR(50),
    NewAttribute VARCHAR(50),
    Faculty_ID INT,

    CONSTRAINT fk_project_faculty FOREIGN KEY (Faculty_ID) REFERENCES Faculty(Faculty_ID) ON DELETE RESTRICT
);