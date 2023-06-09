/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : scott

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 02/06/2021 15:35:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bonus
-- ----------------------------
DROP TABLE IF EXISTS `bonus`;
CREATE TABLE `bonus`  (
  `ename` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `job` varchar(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sal` decimal(7, 2) NULL DEFAULT NULL,
  `comm` decimal(7, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dname` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `loc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO `dept` VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO `dept` VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO `dept` VALUES (40, 'OPERATIONS', 'BOSTON');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `empno` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ename` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `job` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `hiredate` date NULL DEFAULT NULL,
  `sal` decimal(7, 2) NULL DEFAULT NULL,
  `deptno` int(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`empno`) USING BTREE,
  INDEX `deptno`(`deptno`) USING BTREE,
  CONSTRAINT `emp_ibfk_1` FOREIGN KEY (`deptno`) REFERENCES `dept` (`deptno`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7937 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (7369, 'SMITH', 'CLERK', '1980-12-17', 800.00, 20);
INSERT INTO `emp` VALUES (7499, 'ALLEN', 'SALESMAN', '1981-02-20', 1600.00, 30);
INSERT INTO `emp` VALUES (7521, 'WARD', 'SALESMAN', '1981-02-22', 1250.00, 30);
INSERT INTO `emp` VALUES (7566, 'JONES', 'MANAGER', '1981-04-02', 2975.00, 20);
INSERT INTO `emp` VALUES (7654, 'MARTIN', 'SALESMAN', '1981-09-28', 1250.00, 30);
INSERT INTO `emp` VALUES (7698, 'BLAKE', 'MANAGER', '1981-05-01', 2850.00, 30);
INSERT INTO `emp` VALUES (7782, 'CLARK', 'MANAGER', '1981-06-09', 2450.00, 10);
INSERT INTO `emp` VALUES (7788, 'SCOTT', 'ANALYST', '1987-07-13', 3000.00, 20);
INSERT INTO `emp` VALUES (7839, 'KING', 'PRESIDENT', '1981-11-17', 5000.00, 10);
INSERT INTO `emp` VALUES (7844, 'TURNER', 'SALESMAN', '1981-09-08', 1500.00, 30);
INSERT INTO `emp` VALUES (7876, 'ADAMS', 'CLERK', '1987-07-13', 1100.00, 20);
INSERT INTO `emp` VALUES (7900, 'JAMES', 'CLERK', '1981-12-03', 950.00, 30);
INSERT INTO `emp` VALUES (7902, 'FORD', 'ANALYST', '1981-12-03', 3000.00, 20);
INSERT INTO `emp` VALUES (7934, 'MILLER', 'CLERK', '1982-01-23', 1300.00, 10);
INSERT INTO `emp` VALUES (7935, 'lao qi', 'Teacher', '2021-05-22', 1000.00, 30);
INSERT INTO `emp` VALUES (7936, 'lao qi', 'Teacher', '2021-05-22', 1000.00, 30);

-- ----------------------------
-- Table structure for salgrade
-- ----------------------------
DROP TABLE IF EXISTS `salgrade`;
CREATE TABLE `salgrade`  (
  `grade` int(10) UNSIGNED NULL DEFAULT NULL,
  `losal` int(10) UNSIGNED NULL DEFAULT NULL,
  `hisal` int(10) UNSIGNED NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of salgrade
-- ----------------------------
INSERT INTO `salgrade` VALUES (1, 700, 1200);
INSERT INTO `salgrade` VALUES (2, 1201, 1400);
INSERT INTO `salgrade` VALUES (3, 1401, 2000);
INSERT INTO `salgrade` VALUES (4, 2001, 3000);
INSERT INTO `salgrade` VALUES (5, 3001, 9999);

SET FOREIGN_KEY_CHECKS = 1;
