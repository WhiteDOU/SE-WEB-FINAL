-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db_book
-- ------------------------------------------------------
-- Server version	5.7.21-log

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
-- Table structure for table `tb_info`
--

DROP TABLE IF EXISTS `tb_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_info` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `info_type` smallint(2) DEFAULT NULL,
  `info_title` varchar(80) DEFAULT NULL,
  `info_content` varchar(1000) DEFAULT NULL,
  `info_linkman` varchar(45) DEFAULT NULL,
  `info_phone` varchar(45) DEFAULT NULL,
  `info_email` varchar(100) DEFAULT NULL,
  `info_date1` date DEFAULT NULL,
  `info_date2` varchar(40) DEFAULT NULL,
  `info_state` varchar(1) DEFAULT NULL,
  `info_peoplenum` int(11) DEFAULT NULL,
  `info_peoplefreenum` int(11) DEFAULT NULL,
  `info_payfor` int(11) DEFAULT NULL,
  `info_place` varchar(45) DEFAULT NULL,
  `output_person` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=686 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_info`
--

LOCK TABLES `tb_info` WRITE;
/*!40000 ALTER TABLE `tb_info` DISABLE KEYS */;
INSERT INTO `tb_info` VALUES (1,1,'abc','abccc','abcc','15804049092','123123123','2016-01-12','2016-02-03','1',14,12,1,'1'),(66,1,'?','124124',NULL,'121412',NULL,'2018-05-18','123','1',1324,1324,NULL,'123'),(123,123,'123','123',NULL,'123',NULL,'2018-05-18','123','1',123,123,NULL,'123'),(673,1,'奔跑吧','奔跑吧',NULL,'**',NULL,'2018-05-19','2018.06.08','0',100,100,NULL,'浑南校区'),(685,123,'123','123','123','123',NULL,'2018-05-29','123','1',123,123,NULL,'123');
/*!40000 ALTER TABLE `tb_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-29 11:34:04
