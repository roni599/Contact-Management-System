-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: contactmanagement
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'Roni','01760109383','ekroni100@gmail.com'),(4,'asha','01713463986','ekroni99@gmail.com'),(5,'BITHE','01982357780','aiumwioeu@gmail.com'),(6,'MARIA','01873786646','isumiowui@gmail.com'),(7,'A','12345678911','ekroni99@gmail.com'),(8,'B','12345678911','ekroni99@gmail.com'),(9,'C','12345678911','ekroni99@gmail.com'),(10,'D','12345678911','ekroni99@gmail.com'),(11,'E','12345678911','ekroni99@gmail.com'),(12,'F','12345678911','ekroni99@gmail.com'),(13,'G','12345678911','ekroni99@gmail.com'),(14,'H','12345678911','ekroni99@gmail.com'),(15,'I','12345678911','ekroni99@gmail.com'),(16,'A','12345678911','ekroni99@gmail.com'),(17,'A','12345678911','ekroni99@gmail.com'),(18,'A','12345678911','ekroni99@gmail.com'),(19,'A','12345678911','ekroni99@gmail.com'),(20,'A','12345678911','ekroni99@gmail.com'),(21,'A','12345678911','ekroni99@gmail.com'),(22,'A','12345678911','ekroni99@gmail.com'),(23,'A','12345678911','ekroni99@gmail.com'),(24,'A','12345678911','ekroni99@gmail.com'),(25,'A','12345678911','ekroni99@gmail.com'),(26,'A','12345678911','ekroni99@gmail.com'),(27,'A','12345678911','ekroni99@gmail.com'),(28,'A','12345678911','ekroni99@gmail.com'),(29,'A','12345678911','ekroni99@gmail.com'),(30,'A','12345678911','ekroni99@gmail.com'),(31,'A','12345678911','ekroni99@gmail.com'),(32,'A','12345678911','ekroni99@gmail.com'),(33,'A','12345678911','ekroni99@gmail.com'),(34,'A','12345678911','ekroni99@gmail.com'),(35,'A','12345678911','ekroni99@gmail.com'),(36,'A','12345678911','ekroni99@gmail.com'),(37,'A','12345678911','ekroni99@gmail.com'),(38,'A','12345678911','ekroni99@gmail.com'),(39,'A','12345678911','ekroni99@gmail.com'),(40,'A','12345678911','ekroni99@gmail.com'),(41,'A','12345678911','ekroni99@gmail.com'),(42,'A','12345678911','ekroni99@gmail.com'),(43,'A','12345678911','ekroni99@gmail.com'),(44,'A','12345678911','ekroni99@gmail.com'),(45,'A','12345678911','ekroni99@gmail.com'),(46,'A','12345678911','ekroni99@gmail.com'),(47,'A','12345678911','ekroni99@gmail.com'),(48,'A','12345678911','ekroni99@gmail.com'),(49,'A','12345678911','ekroni99@gmail.com'),(50,'A','12345678911','ekroni99@gmail.com'),(51,'A','12345678911','ekroni99@gmail.com'),(52,'A','12345678911','ekroni99@gmail.com');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-03 12:16:04
