USE jacky;
 
CREATE TABLE jacky.`cahierDesCharges` (
  `idCahierDesCharges` int(11) NOT NULL AUTO_INCREMENT,
  `typeSite` varchar(40) DEFAULT NULL,
  `tailleEntreprise` varchar(40) DEFAULT NULL,
  `fonctionnalités` set('blog', 'intégration des réseaux sociaux', 'inscription newsletter') DEFAULT NULL,
  `typeLicence` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idCahierDesCharges`)
); 