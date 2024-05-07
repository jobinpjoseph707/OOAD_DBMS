CREATE DATABASE  IF NOT EXISTS `workspacesafety_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `workspacesafety_db`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: workspacesafety_db
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'John','Doe','IT','Manager','john.doe@example.com'),(2,'Jane','Smith','HR','Analyst','jane.smith@example.com'),(3,'Michael','Johnson','Finance','Clerk','michael@example.com'),(4,'Emily','Brown','Marketing','Manager','emily@example.com'),(5,'David','Wilson','Operations','Supervisor','david@example.com'),(6,'Sarah','Lee','IT','Technician','sarah@example.com'),(7,'Christopher','Taylor','HR','Manager','chris@example.com'),(8,'Amanda','Martinez','Operations','Analyst','amanda@example.com'),(9,'James','Anderson','Finance','Manager','james@example.com'),(10,'Jessica','Rodriguez','Marketing','Analyst','jessica@example.com');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `equipmentinventory`
--

LOCK TABLES `equipmentinventory` WRITE;
/*!40000 ALTER TABLE `equipmentinventory` DISABLE KEYS */;
INSERT INTO `equipmentinventory` VALUES (1,'Laptop','Standard company laptop',2,'2024-04-15'),(2,'Printer','Office printer',8,'2024-03-20'),(3,'Projector','Meeting room projector',1,'2024-05-01'),(4,'Desk','Office desk',5,'2024-02-10'),(5,'Chair','Office chair',10,'2024-01-05');
/*!40000 ALTER TABLE `equipmentinventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `incidents`
--

LOCK TABLES `incidents` WRITE;
/*!40000 ALTER TABLE `incidents` DISABLE KEYS */;
INSERT INTO `incidents` VALUES (1,3,'2024-05-02','Accident','Slip and fall',3),(2,6,'2024-05-05','Injury','Back strain',2),(3,2,'2024-05-07','Accident','Electrical shock',1),(4,8,'2024-05-10','Incident','Equipment malfunction',5),(5,10,'2024-05-12','Incident','Data breach',1),(6,5,'2024-05-15','Accident','Slip and fall',3),(7,1,'2024-05-20','Accident','Tripped over wire',2),(8,7,'2024-05-25','Injury','Fall from ladder',4),(9,4,'2024-06-01','Incident','Spilled chemicals',5),(10,9,'2024-06-05','Accident','Slippery floor',3);
/*!40000 ALTER TABLE `incidents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `training`
--

LOCK TABLES `training` WRITE;
/*!40000 ALTER TABLE `training` DISABLE KEYS */;
INSERT INTO `training` VALUES (1,'IT Security','Security protocols','2024-05-10','2024-05-15',1,2),(2,'HR Management','Policies & Practices','2024-06-01','2024-06-05',7,2),(3,'Financial Analysis','Data analysis','2024-06-10','2024-06-15',9,4),(4,'Marketing Strategies','Market research','2024-07-01','2024-07-05',10,4),(5,'Operations Management','Process optimization','2024-07-10','2024-07-15',5,8);
/*!40000 ALTER TABLE `training` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `training_employee`
--

LOCK TABLES `training_employee` WRITE;
/*!40000 ALTER TABLE `training_employee` DISABLE KEYS */;
INSERT INTO `training_employee` VALUES (1,1,1,'Completed'),(2,2,2,'In Progress'),(3,3,3,'Not Started'),(4,4,4,'Not Started'),(5,5,5,'Not Started'),(6,6,1,'Completed'),(7,7,2,'In Progress'),(8,8,3,'Not Started'),(9,9,4,'Not Started'),(10,10,5,'Not Started');
/*!40000 ALTER TABLE `training_employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 15:19:42
