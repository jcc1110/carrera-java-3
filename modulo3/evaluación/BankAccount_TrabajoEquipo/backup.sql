-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: banco
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Afiliacion`
--

DROP TABLE IF EXISTS `Afiliacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Afiliacion` (
  `cuenta` int(11) NOT NULL,
  `destino` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Afiliacion`
--

LOCK TABLES `Afiliacion` WRITE;
/*!40000 ALTER TABLE `Afiliacion` DISABLE KEYS */;
INSERT INTO `Afiliacion` VALUES (0,1,0),(0,2,1),(1,2,2);
/*!40000 ALTER TABLE `Afiliacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuenta`
--

DROP TABLE IF EXISTS `cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuenta` (
  `tipo` varchar(20) NOT NULL,
  `saldo` float NOT NULL,
  `id` int(11) NOT NULL,
  `personId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuenta`
--

LOCK TABLES `cuenta` WRITE;
/*!40000 ALTER TABLE `cuenta` DISABLE KEYS */;
INSERT INTO `cuenta` VALUES ('Corriente',600,0,0),('Ahorro',600,1,1),('Corriente',800,2,4466);
/*!40000 ALTER TABLE `cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimiento`
--

DROP TABLE IF EXISTS `movimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimiento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(20) NOT NULL,
  `descripcion` varchar(40) NOT NULL,
  `cuenta` int(11) NOT NULL,
  `destino` int(11) NOT NULL,
  `valor` float NOT NULL,
  `fecha` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimiento`
--

LOCK TABLES `movimiento` WRITE;
/*!40000 ALTER TABLE `movimiento` DISABLE KEYS */;
INSERT INTO `movimiento` VALUES (1,'Transferencia','Transferencia',0,1,10,'0208420'),(2,'Entrante','Transferencia',1,0,10,'28 6 2018'),(3,'Saliente','Transferencia',0,1,10,'28 6 2018'),(4,'Entrante','Transferencia',1,0,10,'28 6 2018'),(5,'Saliente','Transferencia',0,1,10,'28 6 2018'),(6,'Entrante','Transferencia',1,0,10,'28 6 2018'),(7,'Saliente','Transferencia',0,1,10,'28 6 2018'),(8,'Entrante','Transferencia',1,0,10,'28 6 2018'),(9,'Saliente','Transferencia',0,1,10,'28 6 2018'),(10,'Entrante','Transferencia',1,0,10,'28 6 2018'),(11,'Saliente','Transferencia',0,1,10,'28 6 2018'),(12,'Entrante','Transferencia',1,0,20,'28 6 2018'),(13,'Saliente','Transferencia',0,1,20,'28 6 2018'),(14,'Entrante','Transferencia',1,0,0,'28 6 2018'),(15,'Saliente','Transferencia',0,1,0,'28 6 2018'),(16,'Entrante','Transferencia',1,0,20,'28 6 2018'),(17,'Saliente','Transferencia',0,1,20,'28 6 2018'),(18,'Entrante','Transferencia',1,0,10,'28 6 2018'),(19,'Saliente','Transferencia',0,1,10,'28 6 2018'),(20,'Entrante','Transferencia',1,0,20,'28 6 2018'),(21,'Saliente','Transferencia',0,1,20,'28 6 2018'),(22,'Entrante','Transferencia',2,0,20,'28 6 2018'),(23,'Saliente','Transferencia',0,2,20,'28 6 2018'),(24,'Entrante','Transferencia',2,0,10,'28 6 2018'),(25,'Saliente','Transferencia',0,2,10,'28 6 2018'),(26,'Entrante','Transferencia',2,0,10,'28 6 2018'),(27,'Saliente','Transferencia',0,2,10,'28 6 2018'),(28,'Entrante','Transferencia',1,0,20,'28 6 2018'),(29,'Saliente','Transferencia',0,1,20,'28 6 2018'),(30,'Entrante','Transferencia',1,0,10,'28 6 2018'),(31,'Saliente','Transferencia',0,1,10,'28 6 2018'),(32,'Entrante','Transferencia',1,0,10,'28 6 2018'),(33,'Saliente','Transferencia',0,1,10,'28 6 2018'),(34,'Entrante','Transferencia',1,0,10,'28 6 2018'),(35,'Saliente','Transferencia',0,1,10,'28 6 2018'),(36,'Entrante','Transferencia',1,0,10,'28 6 2018'),(37,'Saliente','Transferencia',0,1,10,'28 6 2018'),(38,'Entrante','Transferencia',1,0,10,'28 6 2018'),(39,'Saliente','Transferencia',0,1,10,'28 6 2018');
/*!40000 ALTER TABLE `movimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `cedula` int(11) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `cuenta` int(11) NOT NULL,
  `saldo` float NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cedula` (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (0,'Nelly','Irahola','aaaa',19606805,'nelly@hotmail.com',0,40),(1,'Constantino','alves','aaa',23504257,'const@gmail.com',1,70),(2,'Gabriel','Costanza','2000',23500458,'gabriel@hotmail.com',2,800);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-28 18:21:58
