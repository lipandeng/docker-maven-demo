/*
 Navicat Premium Data Transfer

 Source Server         : localhost_docker_3307
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3307
 Source Schema         : quick_coating

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 19/08/2021 17:47:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fms_chart
-- ----------------------------
DROP TABLE IF EXISTS `fms_chart`;
CREATE TABLE `fms_chart`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '标题/名称',
  `creator_id` int NULL DEFAULT NULL COMMENT '创建者id',
  `sort_num` int NULL DEFAULT NULL COMMENT '排序号',
  `folder_id` bigint NULL DEFAULT NULL COMMENT '目录id',
  `thumbnail_id` bigint NULL DEFAULT NULL COMMENT '缩略图资源id',
  `view_count` int NULL DEFAULT NULL COMMENT '浏览次数',
  `like_count` int NULL DEFAULT NULL COMMENT '点赞次数',
  `version` bigint NULL DEFAULT NULL COMMENT '版本',
  `status` smallint NULL DEFAULT NULL COMMENT '状态1，启用 -1删除, 0 停用',
  `created_at` timestamp NULL DEFAULT NULL COMMENT '添加时间',
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '图文件' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fms_chart
-- ----------------------------
INSERT INTO `fms_chart` VALUES (1, 'IOT数据交互', 1, 1, 3, NULL, 1, NULL, 1, 1, '2021-08-19 14:30:40', '2021-08-19 06:30:43');

-- ----------------------------
-- Table structure for fms_folder
-- ----------------------------
DROP TABLE IF EXISTS `fms_folder`;
CREATE TABLE `fms_folder`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '标题/名称',
  `creator_id` bigint NULL DEFAULT NULL COMMENT '创建者id',
  `sort_num` int NULL DEFAULT NULL COMMENT '排序号',
  `parent_id` bigint NULL DEFAULT NULL COMMENT '父id',
  `status` smallint NULL DEFAULT NULL COMMENT '状态1，启用 -1删除, 0 停用',
  `created_at` timestamp NULL DEFAULT NULL COMMENT '添加时间',
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '文件目录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fms_folder
-- ----------------------------
INSERT INTO `fms_folder` VALUES (1, '万维', 1, 1, -1, 1, '2021-08-19 14:28:37', '2021-08-19 14:28:40');
INSERT INTO `fms_folder` VALUES (2, '恩维', 1, 2, -1, 1, '2021-08-19 14:29:06', '2021-08-19 06:29:29');
INSERT INTO `fms_folder` VALUES (3, 'triooo', 1, 3, -1, 1, '2021-08-19 14:29:40', '2021-08-19 06:29:43');

SET FOREIGN_KEY_CHECKS = 1;
