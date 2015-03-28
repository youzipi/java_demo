/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50535
Source Host           : 127.0.0.1:3306
Source Database       : lib

Target Server Type    : MYSQL
Target Server Version : 50535
File Encoding         : 65001

Date: 2015-03-14 18:02:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for access
-- ----------------------------
DROP TABLE IF EXISTS `access`;
CREATE TABLE `access` (
  `modify` varchar(255) NOT NULL,
  `time` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of access
-- ----------------------------
INSERT INTO `access` VALUES ('1', '0000-00-00');
INSERT INTO `access` VALUES ('1', '0000-00-00');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `amount` int(10) NOT NULL,
  `type` varchar(30) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `pub_time` varchar(20) DEFAULT NULL,
  `pub_id` int(10) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `pub_id` (`pub_id`),
  CONSTRAINT `pub_id` FOREIGN KEY (`pub_id`) REFERENCES `publisher` (`pub_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '纳尔齐斯和歌尔德蒙', '3', '小说', '(德)赫尔曼·黑塞', '2007-7', '1', '五楼西');
INSERT INTO `book` VALUES ('2', '30天自制操作系统', '3', '操作系统', '(日)川合秀实', '2012', '2', '二楼西');
INSERT INTO `book` VALUES ('3', '人有病 天知否', '3', '历史', '陈徒手', ' 2013.5', '3', '五楼西');
INSERT INTO `book` VALUES ('4', '白雪公主必须死', '3', ' 小说', '（德）诺伊豪斯', '2013-10-01', '4', '五楼西');
INSERT INTO `book` VALUES ('5', '专业主义', '2', '管理', '大前研一', null, '7', '五楼西');
INSERT INTO `book` VALUES ('6', '乌合之众:大众心理研究', '3', '社会学', '(法)古斯塔夫·勒庞', null, '6', '五楼东');
INSERT INTO `book` VALUES ('7', '纯真及其所编造的', '3', '小说', '飞氘', null, '8', '三楼西');
INSERT INTO `book` VALUES ('8', 'HTTP权威指南', '5', '计算机网络', '(美)David Gourley', '2012', '2', '二楼西');
INSERT INTO `book` VALUES ('9', '动画大师宫崎骏', '3', '动画片', '杨晓林', '2009', '9', '五楼东');
INSERT INTO `book` VALUES ('10', '此时此地', '3', '艺术评论', '艾未未', '2010', '5', '五楼南');

-- ----------------------------
-- Table structure for detail
-- ----------------------------
DROP TABLE IF EXISTS `detail`;
CREATE TABLE `detail` (
  `user_id` int(20) NOT NULL,
  `book_id` int(20) NOT NULL,
  `borrow_date` date DEFAULT NULL,
  `render_date` date DEFAULT NULL,
  PRIMARY KEY (`user_id`,`book_id`),
  KEY `book_id` (`book_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `book_id` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of detail
-- ----------------------------
INSERT INTO `detail` VALUES ('18', '1', '2014-12-27', '2014-01-02');

-- ----------------------------
-- Table structure for publisher
-- ----------------------------
DROP TABLE IF EXISTS `publisher`;
CREATE TABLE `publisher` (
  `pub_id` int(20) NOT NULL AUTO_INCREMENT,
  `pub_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`pub_id`),
  KEY `pub_id` (`pub_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of publisher
-- ----------------------------
INSERT INTO `publisher` VALUES ('1', '上海译文出版社');
INSERT INTO `publisher` VALUES ('2', '人民邮电出版社');
INSERT INTO `publisher` VALUES ('3', '三联书店');
INSERT INTO `publisher` VALUES ('4', '上海文艺出版社');
INSERT INTO `publisher` VALUES ('5', '广西师范大学出版社');
INSERT INTO `publisher` VALUES ('6', '中央编译出版社');
INSERT INTO `publisher` VALUES ('7', '中信出版社');
INSERT INTO `publisher` VALUES ('8', '上海人民出版社');
INSERT INTO `publisher` VALUES ('9', '复旦大学出版社');

-- ----------------------------
-- Table structure for rule
-- ----------------------------
DROP TABLE IF EXISTS `rule`;
CREATE TABLE `rule` (
  `group` varchar(10) NOT NULL,
  `max_time` varchar(10) NOT NULL,
  `max_amount` varchar(10) NOT NULL,
  KEY `group` (`group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rule
-- ----------------------------
INSERT INTO `rule` VALUES ('student', '30', '8');
INSERT INTO `rule` VALUES ('master', '60', '12');
INSERT INTO `rule` VALUES ('teacher', '60', '15');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `group` varchar(10) DEFAULT NULL,
  `department` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `group` (`group`),
  CONSTRAINT `group` FOREIGN KEY (`group`) REFERENCES `rule` (`group`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'test', 'student', 'jssssj');
INSERT INTO `user` VALUES ('18', '柚子皮', 'student', '计算机与软件学院');
INSERT INTO `user` VALUES ('44', '11', null, null);
INSERT INTO `user` VALUES ('45', '某研究生', 'master', '计软院');
