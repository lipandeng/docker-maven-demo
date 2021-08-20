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

 Date: 20/08/2021 11:14:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cms_oss_resource
-- ----------------------------
DROP TABLE IF EXISTS `cms_oss_resource`;
CREATE TABLE `cms_oss_resource`  (
                                     `id` bigint NOT NULL AUTO_INCREMENT,
                                     `path` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '路径',
                                     `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '资源名称',
                                     `size` double NULL DEFAULT NULL COMMENT '大小',
                                     `width` int NULL DEFAULT NULL COMMENT '宽度',
                                     `height` int NULL DEFAULT NULL COMMENT '高度',
                                     `type` smallint NULL DEFAULT NULL COMMENT '类型1图片，2视频',
                                     `sort_num` int NULL DEFAULT NULL COMMENT '排序',
                                     `parent_id` bigint NULL DEFAULT NULL COMMENT '父id',
                                     `parent_type` smallint NULL DEFAULT NULL COMMENT '父表类型',
                                     `status` smallint NULL DEFAULT NULL COMMENT '状态1，启用 -1删除, 0 停用',
                                     `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
                                     `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                                     PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '云存储资源' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cms_oss_resource
-- ----------------------------
INSERT INTO `cms_oss_resource` VALUES (1, NULL, '1.jpg', 114, 124, 134, 1, 1, -1, 1, 1, '2021-08-20 10:11:27', '2021-08-20 02:11:30');
INSERT INTO `cms_oss_resource` VALUES (2, NULL, '2.jpg', 123, 34, 12, 1, 1, 2, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:12:25');
INSERT INTO `cms_oss_resource` VALUES (3, NULL, '3.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:16');
INSERT INTO `cms_oss_resource` VALUES (4, NULL, '4.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:18');
INSERT INTO `cms_oss_resource` VALUES (5, NULL, '5.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:21');
INSERT INTO `cms_oss_resource` VALUES (6, NULL, '6.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:22');
INSERT INTO `cms_oss_resource` VALUES (7, NULL, '7.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:24');
INSERT INTO `cms_oss_resource` VALUES (8, NULL, '8.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:25');
INSERT INTO `cms_oss_resource` VALUES (9, NULL, '9.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:27');
INSERT INTO `cms_oss_resource` VALUES (10, NULL, '10.jpg', 123, 34, 12, 1, 3, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 03:09:54');
INSERT INTO `cms_oss_resource` VALUES (11, NULL, '11.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:33');
INSERT INTO `cms_oss_resource` VALUES (12, NULL, '12.jpg', 123, 34, 12, 1, 1, 6, 1, 1, '2021-08-20 02:12:25', '2021-08-20 02:26:36');

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
                              `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
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
