CREATE database jacky;
 
USE jacky;
 
CREATE TABLE jacky.`licence` (
  `idLicence` int(11) NOT NULL AUTO_INCREMENT,
  `isCommercial` boolean DEFAULT NULL,
  `isModifiable` boolean DEFAULT NULL,
  `isAttribution` boolean DEFAULT NULL,
  `nom` varchar(40) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idLicence`)
); 

