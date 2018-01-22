/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50554
Source Host           : localhost:3306
Source Database       : lottery

Target Server Type    : MYSQL
Target Server Version : 50554
File Encoding         : 65001

Date: 2018-01-22 09:52:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cj_log
-- ----------------------------
DROP TABLE IF EXISTS `cj_log`;
CREATE TABLE `cj_log` (
  `Id` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cj_log
-- ----------------------------

-- ----------------------------
-- Table structure for cj_team
-- ----------------------------
DROP TABLE IF EXISTS `cj_team`;
CREATE TABLE `cj_team` (
  `Teamid` int(20) NOT NULL,
  `Teamname` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`Teamid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cj_team
-- ----------------------------
INSERT INTO `cj_team` VALUES ('1', '从零开始');
INSERT INTO `cj_team` VALUES ('2', 'Hello Shanghai');
INSERT INTO `cj_team` VALUES ('3', '1024');
INSERT INTO `cj_team` VALUES ('4', '无限火力');
INSERT INTO `cj_team` VALUES ('5', 'Mayday');
INSERT INTO `cj_team` VALUES ('6', '青春花少');
INSERT INTO `cj_team` VALUES ('7', '飞梦');
INSERT INTO `cj_team` VALUES ('8', '卓尔不群');

-- ----------------------------
-- Table structure for cj_user
-- ----------------------------
DROP TABLE IF EXISTS `cj_user`;
CREATE TABLE `cj_user` (
  `Id` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Picture` varchar(255) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `State` int(1) DEFAULT NULL,
  `Teamid` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cj_user
-- ----------------------------
INSERT INTO `cj_user` VALUES ('1', '方飞', 'D:\\Picture', '1996-01-01', '0', '1');
INSERT INTO `cj_user` VALUES ('2', '高鹏', 'D:\\Picture', '1996-01-02', '0', '1');
INSERT INTO `cj_user` VALUES ('3', '李恒', 'D:\\Picture', '1996-01-03', '0', '1');
INSERT INTO `cj_user` VALUES ('4', '刘青', 'D:\\Picture', '1996-01-04', '0', '1');
INSERT INTO `cj_user` VALUES ('5', '杨彦娇', 'D:\\Picture', '1996-01-05', '0', '1');
INSERT INTO `cj_user` VALUES ('6', '赵泽宇', 'D:\\Picture', '1996-01-06', '0', '1');
INSERT INTO `cj_user` VALUES ('7', '王俊将', 'D:\\Picture', '1996-02-01', '0', '2');
INSERT INTO `cj_user` VALUES ('8', '于锐信', 'D:\\Picture', '1996-02-02', '0', '2');
INSERT INTO `cj_user` VALUES ('9', '沈明辉', 'D:\\Picture', '1996-02-03', '0', '2');
INSERT INTO `cj_user` VALUES ('10', '胡蝶', 'D:\\Picture', '1996-02-04', '0', '2');
INSERT INTO `cj_user` VALUES ('11', '宋子安', 'D:\\Picture', '1996-02-05', '0', '2');
INSERT INTO `cj_user` VALUES ('12', '胡一凡', 'D:\\Picture', '1996-03-01', '0', '3');
INSERT INTO `cj_user` VALUES ('13', '温韶晖', 'D:\\Picture', '1996-03-02', '0', '3');
INSERT INTO `cj_user` VALUES ('14', '陈伯利', 'D:\\Picture', '1996-03-03', '0', '3');
INSERT INTO `cj_user` VALUES ('15', ' 任强', 'D:\\Picture', '1996-03-04', '0', '3');
INSERT INTO `cj_user` VALUES ('16', '赵荣坤', 'D:\\Picture', '1996-03-05', '0', '3');
INSERT INTO `cj_user` VALUES ('17', '吴秦忠', 'D:\\Picture', '1996-04-01', '0', '4');
INSERT INTO `cj_user` VALUES ('18', '陆育静', 'D:\\Picture', '1996-04-02', '0', '4');
INSERT INTO `cj_user` VALUES ('19', '张沛', 'D:\\Picture', '1996-04-03', '0', '4');
INSERT INTO `cj_user` VALUES ('20', '韩磊磊', 'D:\\Picture', '1996-04-04', '0', '4');
INSERT INTO `cj_user` VALUES ('21', '虎鹏瑞', 'D:\\Picture', '1996-04-05', '0', '4');
INSERT INTO `cj_user` VALUES ('22', '白展恺', 'D:\\Picture', '1996-04-06', '0', '4');
INSERT INTO `cj_user` VALUES ('23', '史建亮', 'D:\\Picture', '1996-04-06', '0', '5');
INSERT INTO `cj_user` VALUES ('24', '杨鹏宇', 'D:\\Picture', '1997-04-28', '0', '5');
INSERT INTO `cj_user` VALUES ('25', '焦普春', 'D:\\Picture', '1996-11-07', '0', '5');
INSERT INTO `cj_user` VALUES ('26', '路鹏', 'D:\\Picture', '1994-08-16', '0', '5');
INSERT INTO `cj_user` VALUES ('27', '马院红', 'D:\\Picture', '1994-04-12', '0', '5');
INSERT INTO `cj_user` VALUES ('28', '江泓', 'D:\\Picture', '1996-02-12', '0', '5');
INSERT INTO `cj_user` VALUES ('29', '王俊将', 'D:\\Picture', '1996-05-06', '0', '6');
INSERT INTO `cj_user` VALUES ('30', '白洁', 'D:\\Picture', '1996-06-01', '0', '6');
INSERT INTO `cj_user` VALUES ('31', '申泽军', 'D:\\Picture', '1996-06-02', '0', '6');
INSERT INTO `cj_user` VALUES ('32', '白昊天', 'D:\\Picture', '1996-06-03', '0', '6');
INSERT INTO `cj_user` VALUES ('33', '褚乾江', 'D:\\Picture', '1996-06-04', '0', '6');
INSERT INTO `cj_user` VALUES ('34', '王福强', 'D:\\Picture', '1996-06-05', '0', '6');
INSERT INTO `cj_user` VALUES ('35', '付辰辰', 'D:\\Picture', '1996-06-06', '0', '6');
INSERT INTO `cj_user` VALUES ('36', '贾增强', 'D:\\Picture', '1996-07-01', '0', '7');
INSERT INTO `cj_user` VALUES ('37', '秦慧超', 'D:\\Picture', '1996-07-02', '0', '7');
INSERT INTO `cj_user` VALUES ('38', '韩永', 'D:\\Picture', '1996-07-03', '0', '7');
INSERT INTO `cj_user` VALUES ('39', '李忠富', 'D:\\Picture', '1996-07-04', '0', '7');
INSERT INTO `cj_user` VALUES ('40', '张辉耀', 'D:\\Picture', '1996-07-05', '0', '7');
INSERT INTO `cj_user` VALUES ('41', '胡金华', 'D:\\Picture', '1996-07-06', '0', '7');
INSERT INTO `cj_user` VALUES ('42', '郭宇浩', 'D:\\Picture', '1996-08-01', '0', '8');
INSERT INTO `cj_user` VALUES ('43', '左士杰', 'D:\\Picture', '1996-08-02', '0', '8');
INSERT INTO `cj_user` VALUES ('44', '王肃国', 'D:\\Picture', '1996-08-03', '0', '8');
INSERT INTO `cj_user` VALUES ('45', '林新福', 'D:\\Picture', '1996-08-04', '0', '8');
