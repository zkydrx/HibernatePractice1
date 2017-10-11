-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.18 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5174
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for hibernate
CREATE DATABASE IF NOT EXISTS `hibernate` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hibernate`;

-- Dumping structure for table hibernate.school
CREATE TABLE IF NOT EXISTS `school` (
  `id` int(38) NOT NULL AUTO_INCREMENT COMMENT 'schoolid',
  `name` varchar(80) DEFAULT NULL COMMENT 'schoolname',
  `address` varchar(80) DEFAULT NULL COMMENT 'schooladdress',
  `age` varchar(80) DEFAULT NULL COMMENT 'fouding story',
  `area` int(100) DEFAULT NULL COMMENT 'school area',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=532 DEFAULT CHARSET=utf8 COMMENT='学校';

-- Dumping data for table hibernate.school: ~32 rows (approximately)
DELETE FROM `school`;
/*!40000 ALTER TABLE `school` DISABLE KEYS */;
INSERT INTO `school` (`id`, `name`, `address`, `age`, `area`) VALUES
	(496, 'beijingdaxue0', 'beijing', '1000', 10000),
	(497, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(498, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(499, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(504, 'beijingdaxue0', 'beijing', '1000', 10000),
	(505, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(506, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(507, 'zhejiangdaxue1', 'hangzhou', '120', 10000),
	(508, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(509, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(510, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(511, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(512, 'beijingdaxue', 'beijing', '1000', 10000),
	(513, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(514, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(515, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(516, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(517, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(518, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(519, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(520, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(521, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(522, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(523, 'zhejiangdaxue', 'hangzhou', '120', 10000),
	(524, 'shanghaijiaotongdaxue', '0shanghai0', '100', 12000),
	(525, 'shanghaijiaotongdaxue', '1shanghai1', '100', 12000),
	(526, 'shanghaijiaotongdaxue', '2shanghai8', '100', 12000),
	(527, 'shanghaijiaotongdaxue', '3shanghai27', '100', 12000),
	(528, 'shanghaijiaotongdaxue', '4shanghai64', '100', 12000),
	(529, 'shanghaijiaotongdaxue', '5shanghai125', '100', 12000),
	(530, 'shanghaijiaotongdaxue', '6shanghai216', '100', 12000),
	(531, 'shanghaijiaotongdaxue', '7shanghai343', '100', 12000);
/*!40000 ALTER TABLE `school` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
