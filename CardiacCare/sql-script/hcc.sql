CREATE DATABASE  IF NOT EXISTS `hcc` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hcc`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: hcc
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `ADMIN_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ADMIN_NAME` varchar(30) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  PRIMARY KEY (`ADMIN_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Admin','admin@gmail.com','admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daily_record`
--

DROP TABLE IF EXISTS `daily_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `daily_record` (
  `DAILY_RECORD_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ATTEMPT_DATE` date NOT NULL,
  `BLOOD_PRESSURE` varchar(45) NOT NULL,
  `BODY_TEMPERATURE` varchar(10) NOT NULL,
  `SPO2_LEVEL` varchar(45) NOT NULL,
  `BLOOD_TEST` varchar(500) DEFAULT NULL,
  `ECHOCARDIOGRAPHY` varchar(500) DEFAULT NULL,
  `ELECTROCARDIGRAPHY` varchar(500) DEFAULT NULL,
  `DIABETES` varchar(10) NOT NULL,
  `PULSE_RATE` varchar(45) NOT NULL,
  `PATIENT_ID` int(11) NOT NULL,
  PRIMARY KEY (`DAILY_RECORD_ID`),
  KEY `DAILY_RECORD_IBFK_1` (`PATIENT_ID`),
  CONSTRAINT `DAILY_RECORD_IBFK_1` FOREIGN KEY (`PATIENT_ID`) REFERENCES `patient` (`PATIENT_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daily_record`
--

LOCK TABLES `daily_record` WRITE;
/*!40000 ALTER TABLE `daily_record` DISABLE KEYS */;
INSERT INTO `daily_record` VALUES (10,'2020-04-27','80-110','98','< 99','D:\\icttiJavaWorkSpace\\CardiacCare\\image\\blood_test\\blood_test1.jpg','D:\\icttiJavaWorkSpace\\CardiacCare\\image\\echocardiography\\echocardiodiagram1.jpg',NULL,'98','93',15),(11,'2020-04-28','86-120','95','< 97',NULL,'D:\\icttiJavaWorkSpace\\CardiacCare\\image\\echocardiography\\F2.large.jpg',NULL,'91','97',15),(12,'2020-04-29','84-111','99','< 92',NULL,NULL,'D:\\icttiJavaWorkSpace\\CardiacCare\\image\\electrocardiography\\electrocardiodiagram3.jpg','95','99',15),(13,'2020-04-30','86-110','101','< 92',NULL,NULL,NULL,'94','93',15),(14,'2020-05-01','83-110','95','< 97',NULL,NULL,NULL,'91','97',15),(15,'2020-04-30','80-112','94','< 99',NULL,NULL,NULL,'94','93',16),(16,'2020-05-01','80-110','92','< 99','D:\\icttiJavaWorkSpace\\CardiacCare\\image\\blood_test\\blood_test.png',NULL,NULL,'97','99',16),(17,'2020-05-02','88-100','97','90',NULL,NULL,NULL,'94','99',16),(18,'2020-05-03','92-98','95','94','D:\\icttiJavaWorkSpace\\CardiacCare\\image\\blood_test\\blood_test1.jpg',NULL,NULL,'98','110',16),(19,'2020-05-04','90-99','96','92',NULL,NULL,NULL,'98','97',16),(20,'2020-05-05','92-98','96','93','D:\\icttiJavaWorkSpace\\CardiacCare\\image\\blood_test\\blood_test.png','D:\\icttiJavaWorkSpace\\CardiacCare\\image\\echocardiography\\echocardiodiagram1.jpg',NULL,'99','98',16);
/*!40000 ALTER TABLE `daily_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `DOCTOR_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DOCTOR_NAME` varchar(30) NOT NULL,
  `DATE_OF_BIRTH` date NOT NULL,
  `SPECIALIZATION` varchar(100) NOT NULL,
  `PHONE` varchar(15) NOT NULL,
  `EXPERIENCE` varchar(20) NOT NULL,
  `ADDRESS` varchar(200) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `DEGREE` varchar(100) NOT NULL,
  `DOCTOR_IMAGE` varchar(500) NOT NULL,
  `BIOGRAPHY` text NOT NULL,
  `PROFILE_FILL` enum('0','1') NOT NULL,
  PRIMARY KEY (`DOCTOR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (6,'Dr. Ye Yint Aung','1989-04-12','Cardiologist','09-426003681','8 years','Dawei','helloboy@gmail.com','helloboy','MBBS','doctor9.jpg','I\'m  a former cardiologist from Myanmar, who made news due to his association with musical genius U Tun Thura. He was charged with involuntary manslaughter after the pop sensation?s death. U Tun Thura died due to a massive overdose of anaesthetics and other powerful sedatives, prescribed to him by Murray, who was his personal physician at the time. He was found guilty by the ?Other County Superior Court? and sentenced to 4 years in prison. However, he was released from the ?Los Angeles County Jail? half-way through his sentence, due to good behavior. Two other factors that contributed to his early release were overcrowded Yangon prisons and a change in the Reginal law. This was not the first time the cardiologist had had a run-in with the law. He had pending cases against him, for non-payment of child maintenance, bills for medical equipment, and student loans. According to the information available, Murray?s licenses remain suspended in the three states he used to practice in, rendering him handicapped in terms of medical practice. Overall, the contrasts in Conrad Murray?s life are intriguing and confusing.','1'),(7,'Dr. Mg Mg Myint','1979-04-12','Non-Invasive cardiologist','09-2222222222','12 years','Dawei','mgmg@gmail.com','mgmgmyint','MBBS[Yangon]','doctor2.jpg','I\'m  a former cardiologist from Myanmar, who made news due to his association with musical genius U Tun Thura. He was charged with involuntary manslaughter after the pop sensations death. U Tun Thura died due to a massive overdose of anaesthetics and other powerful sedatives, prescribed to him by Murray, who was his personal physician at the time. He was found guilty by the Other County Superior Court and sentenced to 4 years in prison. However, he was released from the Los Angeles County Jail half-way through his sentence, due to good behavior. Two other factors that contributed to his early release were overcrowded Yangon prisons and a change in the Reginal law. This was not the first time the cardiologist had had a run-in with the law. He had pending cases against him, for non-payment of child maintenance, bills for medical equipment, and student loans. According to the information available, Murrays licenses remain suspended in the three states he used to practice in, rendering him handicapped in terms of medical practice. Overall, the contrasts in Conrad Murrays life are intriguing and confusing.','1');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `FEEDBACK_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FEEDBACK` varchar(1000) NOT NULL,
  `FEEDBACK_DATE` date NOT NULL,
  `FEEDBACK_TIMESTAMP` time NOT NULL,
  `PATIENT_ID` int(11) NOT NULL,
  PRIMARY KEY (`FEEDBACK_ID`),
  KEY `FEEDBACK_IBFK_1` (`PATIENT_ID`),
  CONSTRAINT `FEEDBACK_IBFK_1` FOREIGN KEY (`PATIENT_ID`) REFERENCES `patient` (`PATIENT_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `injection_dose`
--

DROP TABLE IF EXISTS `injection_dose`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `injection_dose` (
  `INJECTION_DOSE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `INJECTION_DOSE_NAME` varchar(45) NOT NULL,
  `INJECTION_LEVEL` varchar(45) NOT NULL,
  `INJECTION_START_TIME` time NOT NULL,
  `COMPLETE` enum('0','1') NOT NULL,
  `TREATMENT_ID` int(11) NOT NULL,
  PRIMARY KEY (`INJECTION_DOSE_ID`),
  KEY `INJECTION_DOSE_IBFK_1` (`TREATMENT_ID`),
  CONSTRAINT `INJECTION_DOSE_IBFK_1` FOREIGN KEY (`TREATMENT_ID`) REFERENCES `treatment` (`TREATMENT_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `injection_dose`
--

LOCK TABLES `injection_dose` WRITE;
/*!40000 ALTER TABLE `injection_dose` DISABLE KEYS */;
INSERT INTO `injection_dose` VALUES (11,'Papaverine','level 2','18:30:00','0',10),(12,'Anistreplase','level 3','20:00:00','0',10),(13,'Papaverine','120','21:30:00','1',11),(14,'Anistreplase','112','22:45:00','0',11),(15,'Papaverine','30','09:00:00','1',12),(16,'Anistreplase','33','12:00:00','0',12),(17,'Dapamine','25','18:00:00','0',12);
/*!40000 ALTER TABLE `injection_dose` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicine`
--

DROP TABLE IF EXISTS `medicine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicine` (
  `MEDICINE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MEDICINE_NAME` varchar(45) NOT NULL,
  `MEDICATION_TIMES` enum('100','010','001','110','101','011','111') NOT NULL,
  `TREATMENT_ID` int(11) NOT NULL,
  PRIMARY KEY (`MEDICINE_ID`),
  KEY `MEDICINE_IBFK_1` (`TREATMENT_ID`),
  CONSTRAINT `MEDICINE_IBFK_1` FOREIGN KEY (`TREATMENT_ID`) REFERENCES `treatment` (`TREATMENT_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine`
--

LOCK TABLES `medicine` WRITE;
/*!40000 ALTER TABLE `medicine` DISABLE KEYS */;
INSERT INTO `medicine` VALUES (6,'Diuretics','001',11),(7,'Aspirin','111',12),(8,'Warfarin','011',12);
/*!40000 ALTER TABLE `medicine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nurse`
--

DROP TABLE IF EXISTS `nurse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nurse` (
  `NURSE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PHONE` varchar(15) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  PRIMARY KEY (`NURSE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nurse`
--

LOCK TABLES `nurse` WRITE;
/*!40000 ALTER TABLE `nurse` DISABLE KEYS */;
INSERT INTO `nurse` VALUES (1,'09-5454454545','nurse@hbc.site','nurse');
/*!40000 ALTER TABLE `nurse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `PATIENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `REGISTER_ID` varchar(50) NOT NULL,
  `PATIENT_NAME` varchar(30) NOT NULL,
  `DATE_OF_BIRTH` date NOT NULL,
  `ADDRESS` varchar(400) NOT NULL,
  `PHONE` varchar(15) NOT NULL,
  `DISEASE_NAME` varchar(100) NOT NULL,
  `BLOOD_GROUP` varchar(4) NOT NULL,
  `GENDER` varchar(12) NOT NULL,
  `WEIGHT` int(11) NOT NULL,
  `ADMITTED_DATE` date NOT NULL,
  `DISCHARGED_DATE` date DEFAULT NULL,
  `UPDATE_LAB_RESULT` varchar(500) DEFAULT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  PRIMARY KEY (`PATIENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (14,'pcc01-Khin Khin','Khin Khin','1989-01-13','Yangon','09-23232322323','Heart Attack','B','Female',144,'2020-04-29','2020-05-01','D:\\icttiJavaWorkSpace\\CardiacCare\\image\\update_lab_result\\update_lab_result.png','khin@gmail.com','Jq98231'),(15,'pcc02-Daw Aye Aye','Daw Aye Aye','1975-05-03','Mayangone Township, Yangon.','09-6978652344','Coronary artery disease','B','Female',155,'2020-05-01',NULL,'D:\\icttiJavaWorkSpace\\CardiacCare\\image\\update_lab_result\\','ayeaye@gmail.com','vqvJu2m'),(16,'pcc03-U Mg Mg','U Mg Mg','1977-12-23','Dawei','09-6973344323','Dilated cardiomyopathy','AB','Male',143,'2020-05-01',NULL,'D:\\icttiJavaWorkSpace\\CardiacCare\\image\\update_lab_result\\update_lab_result.png','mgmg@gmail.com','qtI36Hs'),(17,'pcc04-Zaw Zaw','Zaw Zaw','1991-02-15','Mandalay','09-6456647372','Cyanotic heart disease','B','Male',133,'2020-05-01',NULL,'D:\\icttiJavaWorkSpace\\CardiacCare\\image\\update_lab_result\\','zawzaw@gmail.com','48omBk5'),(18,'pcc05-U Min Thu','U Min Thu','1976-05-28','Myitkyina','09-69783334223','Heart failure','A','Male',166,'2020-05-01',NULL,'D:\\icttiJavaWorkSpace\\CardiacCare\\image\\update_lab_result\\update_lab_result.png','minthu@gmail.com','I1A9IHk'),(19,'pcc06-Daw Thuzar','Daw Thuzar','1975-05-03','Dawei','09-6978652322','Dilated cardiomyopathy','B','Female',143,'2020-05-01',NULL,'','thuzar@gmail.com','xDI4qnD'),(20,'pcc07-U Ba Pu','U Ba Pu','1979-05-11','Yangon','09-2323232323','Cyanotic heart disease','A','Male',166,'2020-05-01',NULL,'D:\\icttiJavaWorkSpace\\CardiacCare\\image\\update_lab_result\\update_lab_result.png','bapu@gmail.com','F5q9Hk4');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `patient_report`
--

DROP TABLE IF EXISTS `patient_report`;
/*!50001 DROP VIEW IF EXISTS `patient_report`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `patient_report` AS SELECT 
 1 AS `count`,
 1 AS `month`,
 1 AS `year`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `patient_view`
--

DROP TABLE IF EXISTS `patient_view`;
/*!50001 DROP VIEW IF EXISTS `patient_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `patient_view` AS SELECT 
 1 AS `patient_id`,
 1 AS `patient_name`,
 1 AS `admitted_date`,
 1 AS `month`,
 1 AS `year`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `receptionist`
--

DROP TABLE IF EXISTS `receptionist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receptionist` (
  `RECEPTIONIST_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RECEPTIONIST_NAME` varchar(30) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `PHONE` varchar(15) NOT NULL,
  PRIMARY KEY (`RECEPTIONIST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receptionist`
--

LOCK TABLES `receptionist` WRITE;
/*!40000 ALTER TABLE `receptionist` DISABLE KEYS */;
INSERT INTO `receptionist` VALUES (1,'Ma Pyone','pyone@gmail.com','pyone','09-233311121');
/*!40000 ALTER TABLE `receptionist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `treatment`
--

DROP TABLE IF EXISTS `treatment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `treatment` (
  `TREATMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `TREATMENT_DATE` date NOT NULL,
  `SUGGESTION` varchar(200) DEFAULT NULL,
  `DAILY_RECORD_ID` int(11) NOT NULL,
  `DOCTOR_ID` int(11) NOT NULL,
  PRIMARY KEY (`TREATMENT_ID`),
  KEY `TREATMENT_IBFK_1` (`DAILY_RECORD_ID`),
  KEY `TREATMENT_IBFK_2` (`DOCTOR_ID`),
  CONSTRAINT `TREATMENT_IBFK_1` FOREIGN KEY (`DAILY_RECORD_ID`) REFERENCES `daily_record` (`DAILY_RECORD_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `TREATMENT_IBFK_2` FOREIGN KEY (`DOCTOR_ID`) REFERENCES `doctor` (`DOCTOR_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `treatment`
--

LOCK TABLES `treatment` WRITE;
/*!40000 ALTER TABLE `treatment` DISABLE KEYS */;
INSERT INTO `treatment` VALUES (10,'2020-05-01','Don\'t drink',14,6),(11,'2020-05-01','Don\'t smoke anymore!',16,7),(12,'2020-05-05','Take medicines ',20,7);
/*!40000 ALTER TABLE `treatment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `patient_report`
--

/*!50001 DROP VIEW IF EXISTS `patient_report`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `patient_report` AS select count(0) AS `count`,`patient_view`.`month` AS `month`,`patient_view`.`year` AS `year` from `patient_view` group by `patient_view`.`month` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `patient_view`
--

/*!50001 DROP VIEW IF EXISTS `patient_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `patient_view` AS select `patient`.`PATIENT_ID` AS `patient_id`,`patient`.`PATIENT_NAME` AS `patient_name`,`patient`.`ADMITTED_DATE` AS `admitted_date`,month(`patient`.`ADMITTED_DATE`) AS `month`,year(`patient`.`ADMITTED_DATE`) AS `year` from `patient` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-22 11:36:16
