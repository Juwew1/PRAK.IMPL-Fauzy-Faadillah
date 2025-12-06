USE dbImpal;

CREATE TABLE `Pesan` (
    `idPesan` INT(5) NOT NULL AUTO_INCREMENT,
    `idPengirim` INT(5) NOT NULL,
    `idPenerima` INT(5) NOT NULL,
    `Judul` VARCHAR(255) NOT NULL,
    `TextPesan` TEXT NOT NULL,
    `WktPesan` DATETIME NOT NULL,

    PRIMARY KEY (`idPesan`)
);