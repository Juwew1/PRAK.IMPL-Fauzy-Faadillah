CREATE DATABASE IF NOT EXISTS TokoSaya;
USE TokoSaya;

CREATE TABLE Customer (
    IDCustomer INT(5) NOT NULL,
    Name VARCHAR(30) CHARACTER SET utf8 COLLATE utf8_general_ci,
    Email VARCHAR(30) CHARACTER SET utf8 COLLATE utf8_general_ci,
    Address TEXT CHARACTER SET utf8 COLLATE utf8_general_ci,
    PRIMARY KEY (IDCustomer)
);