CREATE DATABASE IF NOT EXISTS TokoSaya;
USE TokoSaya;

CREATE TABLE Customer (
    IDCustomer INT(5) NOT NULL,
    Name VARCHAR(30) NOT NULL ,
    Email VARCHAR(30) NOT NULL ,
    Address TEXT,

    PRIMARY KEY (IDCustomer)
);