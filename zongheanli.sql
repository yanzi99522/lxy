/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : zongheanli

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 01/04/2019 20:14:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `a_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `a_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `a_sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `a_phone` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `a_date` date NULL DEFAULT NULL,
  `b_id` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`a_id`) USING BTREE,
  INDEX `b_id`(`b_id`) USING BTREE,
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`b_id`) REFERENCES `bank` (`b_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('BANK100001', '浩然', '男', '13816668888', '2012-05-02', 'B0002');
INSERT INTO `admin` VALUES ('BANK100002', '浩然', '男', '13611223333', '2012-05-02', 'B0006');
INSERT INTO `admin` VALUES ('BANK100003', '浩然', '男', '13816668888', '2012-05-02', 'B0008');
INSERT INTO `admin` VALUES ('BANK100004', '大山', '男', '13940229136', '2012-05-02', 'B0001');
INSERT INTO `admin` VALUES ('BANK100005', '浩然', '男', '13816668888', '2012-05-02', 'B0003');
INSERT INTO `admin` VALUES ('BANK100006', '香彤', '女', '13816668888', '2012-05-02', 'B0004');
INSERT INTO `admin` VALUES ('BANK100007', '浩然', '男', '13816668888', '2012-05-02', 'B0007');
INSERT INTO `admin` VALUES ('BANK100008', '浩然', '男', '13816668888', '2012-05-02', 'B0010');
INSERT INTO `admin` VALUES ('BANK100009', '梦瑞', '女', '13816668888', '2012-05-02', 'B0005');
INSERT INTO `admin` VALUES ('BANK10010', '梦瑞', '女', '13816668888', '2012-05-02', 'B0006');

-- ----------------------------
-- Table structure for bank
-- ----------------------------
DROP TABLE IF EXISTS `bank`;
CREATE TABLE `bank`  (
  `b_id` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `b_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`b_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bank
-- ----------------------------
INSERT INTO `bank` VALUES ('B0001', '中国工商银行');
INSERT INTO `bank` VALUES ('B0002', '中国农业银行');
INSERT INTO `bank` VALUES ('B0003', '中国银行');
INSERT INTO `bank` VALUES ('B0004', '中国建设银行');
INSERT INTO `bank` VALUES ('B0005', '中国交通银行');
INSERT INTO `bank` VALUES ('B0006', '招商银行');
INSERT INTO `bank` VALUES ('B0007', '浦发银行');
INSERT INTO `bank` VALUES ('B0008', '兴业银行');
INSERT INTO `bank` VALUES ('B0009', '中国农业发展银行');
INSERT INTO `bank` VALUES ('B0010', '中国民生银行');

-- ----------------------------
-- Table structure for cus_remarks
-- ----------------------------
DROP TABLE IF EXISTS `cus_remarks`;
CREATE TABLE `cus_remarks`  (
  `c_id` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `c_remarks` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`c_id`) USING BTREE,
  CONSTRAINT `cus_remarks_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `customer` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cus_remarks
-- ----------------------------
INSERT INTO `cus_remarks` VALUES ('C10001', '客户01的备注信息');
INSERT INTO `cus_remarks` VALUES ('C10002', '客户02的备注信息');
INSERT INTO `cus_remarks` VALUES ('C10003', '客户03的备注信息');
INSERT INTO `cus_remarks` VALUES ('C10004', '客户04的备注信息');
INSERT INTO `cus_remarks` VALUES ('C10005', '客户05的备注信息');
INSERT INTO `cus_remarks` VALUES ('C10006', '客户06的备注信息');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `c_id` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `c_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `c_sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_card` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_province` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_create` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('C10001', '颜哲', '男', '110220101029283029', '上海', '2019-04-01 19:35:29');
INSERT INTO `customer` VALUES ('C10002', '颜哲', '男', '110220101029283029', '上海', '2019-04-01 19:35:29');
INSERT INTO `customer` VALUES ('C10003', '王松', '男', '110220101029283029', '上海', '2019-04-01 19:35:29');
INSERT INTO `customer` VALUES ('C10004', '王红', '女', '110220101029283029', '上海', '2019-04-01 19:35:29');
INSERT INTO `customer` VALUES ('C10005', '颜哲', '男', '110220101029283029', '上海', '2019-04-01 19:36:09');
INSERT INTO `customer` VALUES ('C10006', '颜哲', '男', '110220101029283029', '上海', '2019-04-01 19:36:09');

-- ----------------------------
-- Table structure for deposite
-- ----------------------------
DROP TABLE IF EXISTS `deposite`;
CREATE TABLE `deposite`  (
  `d_id` int(10) NOT NULL AUTO_INCREMENT,
  `c_id` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_id` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_amount` decimal(8, 2) NULL DEFAULT NULL,
  `d_date` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`d_id`) USING BTREE,
  INDEX `c_id`(`c_id`) USING BTREE,
  CONSTRAINT `deposite_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `customer` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of deposite
-- ----------------------------
INSERT INTO `deposite` VALUES (1, 'C10003', 'B0001', 1000.00, '2019-04-01 20:00:34');
INSERT INTO `deposite` VALUES (2, 'C10002', 'B0002', 1000.00, '2019-04-01 20:00:34');
INSERT INTO `deposite` VALUES (3, 'C10001', 'B0003', 1000.00, '2019-04-01 20:00:34');
INSERT INTO `deposite` VALUES (4, 'C10004', 'B0004', 1000.00, '2019-04-01 20:00:34');
INSERT INTO `deposite` VALUES (5, 'C10005', 'B0005', 1000.00, '2019-04-01 20:00:34');
INSERT INTO `deposite` VALUES (6, 'C10006', 'B0006', 1000.00, '2019-04-01 20:00:34');
