USE UniversityDB;
DROP TABLE IF EXISTS Research_Project;

CREATE TABLE Research_Project (
    Project_ID INT NOT NULL,
    Name VARCHAR(100),
    Area VARCHAR(100),
    Duration VARCHAR(50),
    NewAttribute VARCHAR(100),

    PRIMARY KEY (Project_ID)
);