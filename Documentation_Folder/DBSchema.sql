-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: emrverify
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `access_tbl`
--

DROP TABLE IF EXISTS `access_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `access_tbl` (
  `access_id` int NOT NULL AUTO_INCREMENT,
  `access_status` int DEFAULT NULL,
  `doctor_id` int DEFAULT NULL,
  `patient_id` int DEFAULT NULL,
  PRIMARY KEY (`access_id`),
  KEY `FK90ww2dyii0j28sr83gi0si2sg` (`doctor_id`),
  KEY `FKqupoqlvbj2d37evfoem3y0sq9` (`patient_id`),
  CONSTRAINT `FK90ww2dyii0j28sr83gi0si2sg` FOREIGN KEY (`doctor_id`) REFERENCES `doctor_info_tbl` (`doctor_id`),
  CONSTRAINT `FKqupoqlvbj2d37evfoem3y0sq9` FOREIGN KEY (`patient_id`) REFERENCES `patient_info_tbl` (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `access_tbl`
--

LOCK TABLES `access_tbl` WRITE;
/*!40000 ALTER TABLE `access_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `access_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_info_tbl`
--

DROP TABLE IF EXISTS `doctor_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor_info_tbl` (
  `doctor_id` int NOT NULL AUTO_INCREMENT,
  `contact_no` varchar(15) NOT NULL,
  `education` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `experience` float(11,1) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `login_id` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `profile_photo` mediumblob,
  `specialization` varchar(100) NOT NULL,
  PRIMARY KEY (`doctor_id`),
  UNIQUE KEY `UK_e33q2lyg526hmtaok9id6ghyw` (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_info_tbl`
--

LOCK TABLES `doctor_info_tbl` WRITE;
/*!40000 ALTER TABLE `doctor_info_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctor_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document_tbl`
--

DROP TABLE IF EXISTS `document_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `document_tbl` (
  `document_id` int NOT NULL AUTO_INCREMENT,
  `document` mediumblob NOT NULL,
  `document_date` date DEFAULT NULL,
  `document_description` varchar(255) NOT NULL,
  `document_type` varchar(50) NOT NULL,
  `patient_id` int DEFAULT NULL,
  PRIMARY KEY (`document_id`),
  KEY `FKd359xut43w8u9b5xo2lw9awyk` (`patient_id`),
  CONSTRAINT `FKd359xut43w8u9b5xo2lw9awyk` FOREIGN KEY (`patient_id`) REFERENCES `patient_info_tbl` (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document_tbl`
--

LOCK TABLES `document_tbl` WRITE;
/*!40000 ALTER TABLE `document_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `document_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_tbl`
--

DROP TABLE IF EXISTS `event_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `event_tbl` (
  `event_id` int NOT NULL AUTO_INCREMENT,
  `event_date` date NOT NULL,
  `event_description` varchar(255) NOT NULL,
  `event_type` varchar(50) NOT NULL,
  `patient_id` int DEFAULT NULL,
  PRIMARY KEY (`event_id`),
  KEY `FKncmtcraloriw867c12liitmlx` (`patient_id`),
  CONSTRAINT `FKncmtcraloriw867c12liitmlx` FOREIGN KEY (`patient_id`) REFERENCES `patient_info_tbl` (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_tbl`
--

LOCK TABLES `event_tbl` WRITE;
/*!40000 ALTER TABLE `event_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `event_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_info_tbl`
--

DROP TABLE IF EXISTS `patient_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_info_tbl` (
  `patient_id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(250) NOT NULL,
  `blood_group` varchar(5) NOT NULL,
  `dob` date NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `login_id` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `contact_no` varchar(20) NOT NULL,
  `profile_photo` mediumblob,
  PRIMARY KEY (`patient_id`),
  UNIQUE KEY `UK_ookvlkvtfwi2ure4cypboa0v4` (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_info_tbl`
--

LOCK TABLES `patient_info_tbl` WRITE;
/*!40000 ALTER TABLE `patient_info_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-27 14:48:27
