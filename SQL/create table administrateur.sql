USE jacky;
 
CREATE TABLE jacky.`administrateur` (
  `idAdministrateur` int(11) NOT NULL AUTO_INCREMENT,
  `identifiant` varchar(40) DEFAULT NULL,
  `motDePasse` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`idAdministrateur`)
); 