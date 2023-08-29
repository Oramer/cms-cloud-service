/*
 Navicat Premium Data Transfer

 Source Server         : 新水站
 Source Server Type    : MySQL
 Source Server Version : 50610
 Source Host           : 124.221.155.9:3306
 Source Schema         : water_cms

 Target Server Type    : MySQL
 Target Server Version : 50610
 File Encoding         : 65001

 Date: 12/04/2023 13:26:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for buss_banner_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_banner_info`;
CREATE TABLE `buss_banner_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `banner_pic` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'banner图片',
  `banner_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'banner显文',
  `banner_link` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'banner内链',
  `link_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内链类型',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'Banner图信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_banner_info
-- ----------------------------
INSERT INTO `buss_banner_info` VALUES (3, '/profile/upload/20230330/1_1638736762822713344_1641345026093735936.png,/profile/upload/20230330/2_1638736797241171968_1641345029201715200.png,/profile/upload/20230330/5_1638736895689875456_1641345032968200192.png,/profile/upload/20230330/3_1638736830795603968_1641345036013264896.png,/profile/upload/20230330/4_1638736862953332736_1641345038307549184.png', NULL, NULL, NULL, NULL, '1128558726395985919', '2023-03-30 15:42:08', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for buss_bucket_arecord
-- ----------------------------
DROP TABLE IF EXISTS `buss_bucket_arecord`;
CREATE TABLE `buss_bucket_arecord`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `record_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '记录类型1欠桶 2压桶 3退桶 4回桶',
  `station_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '水站主键',
  `poster_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送主键',
  `user_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户主键',
  `order_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单主键',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1启用 2作废 3待支付',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  INDEX `record_type`(`record_type`, `station_pk`, `poster_pk`, `user_pk`, `order_pk`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '水桶操作主表信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_bucket_arecord
-- ----------------------------

-- ----------------------------
-- Table structure for buss_bucket_back_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_bucket_back_record`;
CREATE TABLE `buss_bucket_back_record`  (
  `pk` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `poster_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送员信息',
  `order_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单信息',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '归属用户',
  `station_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站信息',
  `product_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息',
  `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名称',
  `bucket_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '桶数量',
  `bucket_single_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '桶单价',
  `bucket_total_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '总价信息',
  `op_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '回桶记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_bucket_back_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_bucket_details
-- ----------------------------
DROP TABLE IF EXISTS `buss_bucket_details`;
CREATE TABLE `buss_bucket_details`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `arecord_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '压桶记录',
  `order_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息',
  `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `count` int(11) NULL DEFAULT NULL,
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 424 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '桶操作详情' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_bucket_details
-- ----------------------------

-- ----------------------------
-- Table structure for buss_bucket_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_bucket_info`;
CREATE TABLE `buss_bucket_info`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `record_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '记录类型1欠桶 2压桶 3退桶 4回桶',
  `station_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '水站主键',
  `poster_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送主键',
  `user_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户主键',
  `order_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单主键',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1启用 2作废 3待支付',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` int(255) NULL DEFAULT NULL COMMENT '数量统计',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  INDEX `record_type`(`record_type`, `station_pk`, `poster_pk`, `user_pk`, `order_pk`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '水桶操作主表信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_bucket_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_bucket_lack_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_bucket_lack_record`;
CREATE TABLE `buss_bucket_lack_record`  (
  `pk` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `poster_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送员信息',
  `order_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单信息',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '归属用户',
  `station_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站信息',
  `product_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息',
  `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名称',
  `bucket_count` int(10) NULL DEFAULT NULL COMMENT '桶数量',
  `bucket_single_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '桶单价',
  `bucket_total_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '总价信息',
  `op_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态(0正常 1 作废)',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '欠桶记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_bucket_lack_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_bucket_pledge_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_bucket_pledge_record`;
CREATE TABLE `buss_bucket_pledge_record`  (
  `pk` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `poster_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送员信息',
  `order_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单信息',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '归属用户',
  `station_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站信息',
  `product_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息',
  `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名称',
  `bucket_count` int(10) NULL DEFAULT NULL COMMENT '桶数量',
  `bucket_single_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '桶单价',
  `bucket_total_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '总价信息',
  `op_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态(0待支付 1 已支付 2已作废)',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '欠桶记录PK',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付外部订单号',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '是否支付',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '押桶记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_bucket_pledge_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_bucket_return_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_bucket_return_record`;
CREATE TABLE `buss_bucket_return_record`  (
  `pk` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `poster_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送员信息',
  `order_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单信息',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '归属用户',
  `station_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站信息',
  `product_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息',
  `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名称',
  `bucket_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '桶数量',
  `bucket_single_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '桶单价',
  `bucket_total_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '总价信息',
  `op_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '退桶记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_bucket_return_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_coupon
-- ----------------------------
DROP TABLE IF EXISTS `buss_coupon`;
CREATE TABLE `buss_coupon`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '租户号',
  `user_range` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户范围',
  `coupon_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型(1无门槛 2满减 3领水',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `money` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '金额',
  `threshold` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '满足门槛',
  `start_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开始有效期',
  `end_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '结束有效期',
  `valid_or_not` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Y' COMMENT '是否有效',
  `quantity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数量',
  `scope_of_uses` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '可使用商品',
  `revision` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no16` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no17` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no18` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no19` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no20` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '优惠卷' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_coupon
-- ----------------------------

-- ----------------------------
-- Table structure for buss_ht_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_ht_info`;
CREATE TABLE `buss_ht_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  `bucket_order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '欠压痛主键',
  `address_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址信息主键',
  `bucket_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预回桶数量',
  `bucket_brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌信息',
  `status` int(10) NULL DEFAULT NULL COMMENT '状态1 待回桶 2 已回桶',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户发起的回桶申请' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_ht_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_message_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_message_info`;
CREATE TABLE `buss_message_info`  (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `message_type` int(2) NULL DEFAULT NULL COMMENT '消息类型(1订单消息 2退款消息 )',
  `message_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消息头',
  `message_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '消息体',
  `reciver` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '接收人',
  `sender` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发送人',
  `is_read` int(11) NULL DEFAULT NULL COMMENT '是否已读',
  `bussiness_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务主键',
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 197 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '消息通知' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_message_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_monthly_user
-- ----------------------------
DROP TABLE IF EXISTS `buss_monthly_user`;
CREATE TABLE `buss_monthly_user`  (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `station_id` int(10) NULL DEFAULT NULL COMMENT '归属水站',
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司名称',
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '市',
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省',
  `county` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '县',
  `cdetails` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详细地址',
  `fp_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发票类型',
  `xq_brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '意向品牌',
  `yxq_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '月需求量',
  `dc_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单次送水量',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `status` int(255) NULL DEFAULT 0 COMMENT '状态0申请中 1 已通过 2 已作废',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` int(255) NULL DEFAULT NULL COMMENT '数量统计',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '月结用户信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_monthly_user
-- ----------------------------

-- ----------------------------
-- Table structure for buss_monthly_user_details
-- ----------------------------
DROP TABLE IF EXISTS `buss_monthly_user_details`;
CREATE TABLE `buss_monthly_user_details`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `mouth_user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '月结用户ID',
  `is_manger` int(10) NULL DEFAULT 0 COMMENT '是否超管',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_id`(`user_id`, `mouth_user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '月结用户明细信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_monthly_user_details
-- ----------------------------

-- ----------------------------
-- Table structure for buss_order_appraise
-- ----------------------------
DROP TABLE IF EXISTS `buss_order_appraise`;
CREATE TABLE `buss_order_appraise`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `order_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单信息',
  `product_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息',
  `appraise_pic` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价图片',
  `appraise_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价详情',
  `appraise_start` int(2) NULL DEFAULT NULL COMMENT '评价分数1-5*',
  `appraise_tags` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价标签',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单产品评价' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_order_appraise
-- ----------------------------

-- ----------------------------
-- Table structure for buss_order_evaluate
-- ----------------------------
DROP TABLE IF EXISTS `buss_order_evaluate`;
CREATE TABLE `buss_order_evaluate`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单主键',
  `evaluate_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价内容',
  `evaluate_rate` int(11) NULL DEFAULT NULL COMMENT '评价分数',
  `evaluate_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价图片',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单评价' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_order_evaluate
-- ----------------------------

-- ----------------------------
-- Table structure for buss_order_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_order_info`;
CREATE TABLE `buss_order_info`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  `batch_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号(交易流水号)',
  `order_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下单时间',
  `order_persion` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下单人',
  `station_id` int(10) NULL DEFAULT NULL COMMENT '归属水站',
  `order_address_id` int(10) NULL DEFAULT NULL COMMENT '收货人地址',
  `amount` int(11) NULL DEFAULT NULL COMMENT '产品数量',
  `real_money` decimal(24, 2) NULL DEFAULT NULL COMMENT '实付总价',
  `amountofMoney` decimal(24, 2) NULL DEFAULT NULL COMMENT '产品总价',
  `single_price` decimal(24, 2) NULL DEFAULT NULL COMMENT '产品单价',
  `express_fee` decimal(24, 2) NULL DEFAULT NULL COMMENT '快递费用',
  `is_overtime` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否超时',
  `overtime_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '超时时间',
  `order_remark` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '订单备注',
  `order_pay_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单支付时间',
  `complete_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单完成时间',
  `order_type` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '订单类型(1产品订单 2 压桶订单  3 水票订单 4其他订单)',
  `order_status` int(11) NULL DEFAULT 1 COMMENT '订单状态(1待支付2已支付3已发货4已超时 5 已完成)',
  `pay_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付类型',
  `need_mortgage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否抵押桶',
  `del_flag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除标识N未删除;Y/N',
  `cancel_reason` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '取消原因;',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '用户打赏爬楼费',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送人',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '快递员分组',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送时间',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no14` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '缓存参数',
  `no15` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '预支付信息',
  PRIMARY KEY (`pk`) USING BTREE,
  INDEX `pk`(`pk`, `order_persion`, `order_address_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_order_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_order_info_ticket
-- ----------------------------
DROP TABLE IF EXISTS `buss_order_info_ticket`;
CREATE TABLE `buss_order_info_ticket`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  `batch_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号(交易流水号)',
  `order_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下单时间',
  `order_persion` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下单人',
  `station_id` int(10) NULL DEFAULT NULL COMMENT '归属水站',
  `order_address_id` int(10) NULL DEFAULT NULL COMMENT '收货人地址',
  `amount` int(11) NULL DEFAULT NULL COMMENT '产品数量',
  `amountofMoney` decimal(24, 2) NULL DEFAULT NULL COMMENT '产品总价',
  `single_price` decimal(24, 2) NULL DEFAULT NULL COMMENT '产品单价',
  `express_fee` decimal(24, 2) NULL DEFAULT NULL COMMENT '快递费用',
  `is_overtime` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否超时',
  `overtime_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '超时时间',
  `order_remark` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '订单备注',
  `order_pay_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单支付时间',
  `complete_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单完成时间',
  `order_type` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '订单类型(1产品订单 2 压桶订单  3 水票订单 4其他订单)',
  `order_status` int(11) NULL DEFAULT 1 COMMENT '订单状态(1待支付2已支付3已发货4已超时 5 已完成)',
  `pay_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付类型',
  `need_mortgage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否抵押桶',
  `del_flag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除标识N未删除;Y/N',
  `cancel_reason` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '取消原因;',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '用户打赏爬楼费',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送人',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '快递员分组',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送时间',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no14` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '缓存参数',
  `no15` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '预支付信息',
  PRIMARY KEY (`pk`) USING BTREE,
  INDEX `pk`(`pk`, `order_persion`, `order_address_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '水票订单信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_order_info_ticket
-- ----------------------------

-- ----------------------------
-- Table structure for buss_order_product_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_order_product_info`;
CREATE TABLE `buss_order_product_info`  (
  `pk` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_info_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单主键',
  `product_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品主键',
  `product_amount` int(11) NOT NULL COMMENT '产品数量',
  `product_sign_price` decimal(24, 2) NOT NULL DEFAULT 0.00 COMMENT '产品单价',
  `product_favorable_price` decimal(24, 2) NOT NULL DEFAULT 0.00 COMMENT '产品优惠价',
  `amount_price` decimal(24, 2) NOT NULL DEFAULT 0.00 COMMENT '总价',
  `reduce_price` decimal(24, 2) NOT NULL DEFAULT 0.00 COMMENT '扣减价',
  `real_price` decimal(24, 2) NOT NULL DEFAULT 0.00 COMMENT '实际总价',
  `snapshot` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快照',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no15no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`pk`) USING BTREE,
  INDEX `pk`(`pk`, `order_info_pk`, `product_pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 618 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单产品信息(子表)' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_order_product_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_order_reminder
-- ----------------------------
DROP TABLE IF EXISTS `buss_order_reminder`;
CREATE TABLE `buss_order_reminder`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单信息',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单催单信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_order_reminder
-- ----------------------------

-- ----------------------------
-- Table structure for buss_order_ticket_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_order_ticket_info`;
CREATE TABLE `buss_order_ticket_info`  (
  `pk` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_info_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单主键',
  `ticket_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '卡券信息',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单卡券信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_order_ticket_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_order_transfer_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_order_transfer_record`;
CREATE TABLE `buss_order_transfer_record`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  `station_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原水站ID',
  `transfer_station_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '转单后ID',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no15` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '备用字段',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单转单记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_order_transfer_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_poster_dispatch_reward_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_poster_dispatch_reward_record`;
CREATE TABLE `buss_poster_dispatch_reward_record`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `poster_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送员ID',
  `products_num` int(10) NULL DEFAULT NULL COMMENT '产品件数',
  `deduct_num` decimal(10, 2) NULL DEFAULT NULL COMMENT '提成金额',
  `status` int(2) NULL DEFAULT 0 COMMENT '状态0预入账 1生效中 2已提现 ',
  `source_from` int(2) NULL DEFAULT NULL COMMENT '提成来源 1订单配送 2下级配送 3距离提成 4爬楼费奖励 5分享奖励',
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 210 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '派单员提成信息记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_poster_dispatch_reward_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_poster_distance_deduct
-- ----------------------------
DROP TABLE IF EXISTS `buss_poster_distance_deduct`;
CREATE TABLE `buss_poster_distance_deduct`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `station_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站信息',
  `poster_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '快递员信息',
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户信息',
  `post_amount` decimal(10, 2) NOT NULL COMMENT '距离提成',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否压桶',
  `no2` decimal(24, 2) NULL DEFAULT 0.00 COMMENT '压桶金额',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '产品状态0上架 1下架 ',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `station_id`(`station_id`, `poster_id`, `user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配送员距离提成' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_poster_distance_deduct
-- ----------------------------

-- ----------------------------
-- Table structure for buss_product_adjust_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_product_adjust_record`;
CREATE TABLE `buss_product_adjust_record`  (
  `pk` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品PK',
  `adjust_price` decimal(24, 2) NULL DEFAULT NULL COMMENT '调整后价格',
  `target_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调价目标人',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  UNIQUE INDEX `product_pk`(`product_pk`, `target_pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '产品调价记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_product_adjust_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_product_brand
-- ----------------------------
DROP TABLE IF EXISTS `buss_product_brand`;
CREATE TABLE `buss_product_brand`  (
  `pk` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `station_id` int(11) NULL DEFAULT NULL COMMENT '水站ID',
  `brand_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名称',
  `brand_desc` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌描述',
  `brand_link` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '超链',
  `brand_images` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌主图',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  INDEX `pk`(`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '产品品牌信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_product_brand
-- ----------------------------
INSERT INTO `buss_product_brand` VALUES (1, 1, '农夫山泉', NULL, NULL, NULL, NULL, '1128558726395985919', NULL, NULL, NULL, '1', NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (2, 1, '娃哈哈', NULL, NULL, NULL, NULL, '1128558726395985919', NULL, NULL, NULL, '1', NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (3, 1, '百岁山', NULL, NULL, NULL, NULL, '1128558726395985919', NULL, NULL, NULL, '1', NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (4, 2, '农夫山泉', NULL, NULL, NULL, NULL, '1632045246196736000', NULL, NULL, NULL, '1', NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (5, 2, '娃哈哈', NULL, NULL, NULL, NULL, '1632045246196736000', NULL, NULL, NULL, '1', NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (6, 2, '百岁山', NULL, NULL, NULL, NULL, '1632045246196736000', NULL, NULL, NULL, '1', NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (26, 2, '怡宝', NULL, NULL, NULL, NULL, '1632045246196736000', '2023-03-28 11:12:42', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (27, 2, '千岛湖', NULL, NULL, NULL, NULL, '1632045246196736000', '2023-03-28 11:13:37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (28, 2, '景田', NULL, NULL, NULL, NULL, '1632045246196736000', '2023-03-28 11:13:40', '1632045246196736000', '2023-03-28 11:13:50', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (29, 2, '屈臣氏', NULL, NULL, NULL, NULL, '1632045246196736000', '2023-03-28 11:14:13', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (30, 2, '雀巢优活', NULL, NULL, NULL, NULL, '1632045246196736000', '2023-03-28 11:14:31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (31, 2, '恒大冰泉', NULL, NULL, NULL, NULL, '1632045246196736000', '2023-03-28 11:14:48', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_brand` VALUES (32, 2, 'evian', NULL, NULL, NULL, NULL, '1632045246196736000', '2023-03-28 11:15:11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for buss_product_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_product_info`;
CREATE TABLE `buss_product_info`  (
  `pk` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `station_id` int(11) NULL DEFAULT NULL COMMENT '水站ID',
  `product_brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品品牌',
  `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品名称',
  `product_unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品单位',
  `product_specs` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品规格',
  `product_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品类型',
  `product_price` decimal(24, 2) NULL DEFAULT NULL COMMENT '产品单价',
  `product_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品标题',
  `product_desc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品描述',
  `product_main_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品主图',
  `product_image` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '产品图文',
  `product_tag` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品标签',
  `product_delivery_cost` decimal(24, 2) NULL DEFAULT NULL COMMENT '配送费用',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '是否压桶',
  `no2` decimal(24, 2) NULL DEFAULT 0.00 COMMENT '压桶金额',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '产品状态0上架 1下架 ',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4124 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '产品信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_product_info
-- ----------------------------
INSERT INTO `buss_product_info` VALUES (1, 1, '2', '娃哈哈(需压桶) 纯净水(桶装水)', '桶', NULL, '1', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230302/图片111_1631192707653951488.png', '/profile/upload/20230228/details_0.jpg', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:25:28', '1128558726395985919', '2023-03-17 16:43:20', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (2, 1, '2', '娃哈哈 饮用纯净水 (箱装水)', '桶', NULL, '2', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230228/zhutu_1.png', '/profile/upload/20230228/details_1.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:25:38', '1128558726395985919', '2023-03-17 16:46:39', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (3, 1, '1', '农夫山泉(需压桶) 饮用纯净水(桶装水)', '桶', NULL, '1', 0.01, NULL, '天然弱碱性饮用水', '/profile/upload/20230228/zhutu_2.png', '/profile/upload/20230228/details_2.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:27:02', '1128558726395985919', '2023-03-17 16:46:35', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (4, 1, '1', '农夫 18.9L冰露泉 (箱装水)', '桶', NULL, '2', 0.01, NULL, '冰露 点滴纯净', '/profile/upload/20230228/zhutu_3.png', '/profile/upload/20230228/details_3.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:27:27', '1128558726395985919', '2023-03-17 16:46:31', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (5, 1, '1', '农夫清露泉(免押包装)', '桶', NULL, '5', 0.01, NULL, '清纯，甘冽好味道', '/profile/upload/20230228/zhutu_4.png', '/profile/upload/20230228/details_4.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:27:53', '1128558726395985919', '2023-03-17 16:46:19', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (6, 1, '3', '百岁山(需压桶)矿水优活包装饮用水(桶装水)', '桶', NULL, '1', 0.01, NULL, '好水 好味道', '/profile/upload/20230228/zhutu_5.png', '/profile/upload/20230228/details_5.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:28:06', '1128558726395985919', '2023-03-17 16:43:10', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (7, 1, '3', '百岁山饮用纯净水 (箱装水)', '桶', NULL, '2', 0.01, NULL, '好水 好味道', '/profile/upload/20230228/zhutu_6.png', '/profile/upload/20230228/details_6.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:28:17', '1128558726395985919', '2023-03-17 16:45:54', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (8, 1, '3', '百岁山诺碱水 桶装水(免押包装)', '桶', NULL, '5', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230228/zhutu_7.png', '/profile/upload/20230228/details_7.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:28:35', '1128558726395985919', '2023-03-17 16:45:58', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (10, 1, '2', '娃哈哈 饮用纯净水(免押包装)', '桶', NULL, '5', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230228/zhutu_1.png', '/profile/upload/20230228/details_1.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:25:38', '1128558726395985919', '2023-03-17 16:46:39', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (11, 1, '5', '娃哈哈   精装饮用水 14.8L  一次性包装水', '桶', NULL, '25', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230302/图片111_1631192707653951488.png', '/profile/upload/20230228/details_0.jpg', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:25:28', '1632045246196736000', '2023-03-28 13:12:03', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (12, 1, '5', '娃哈哈 饮用纯净水 18.9L 桶装水', '桶', NULL, '22', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230228/zhutu_1.png', '/profile/upload/20230228/details_1.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:25:38', '1632045246196736000', '2023-03-28 12:58:20', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (13, 2, '4', '农夫山泉 山泉水19L 桶装水', '桶', NULL, '22', 0.01, NULL, '天然弱碱性饮用水', '/profile/upload/20230228/zhutu_2.png', '/profile/upload/20230228/details_2.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:27:02', '1632045246196736000', '2023-03-28 12:57:36', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (14, 2, '27', '千岛 冰露泉 17L 桶装水', '桶', NULL, '22', 0.01, NULL, '冰露 点滴纯净', '/profile/upload/20230228/zhutu_3.png', '/profile/upload/20230228/details_3.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:27:27', '1632045246196736000', '2023-03-28 12:56:41', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (15, 2, '27', '千岛清露泉 18.5L', '桶', NULL, '22', 0.01, NULL, '清纯，甘冽好味道', '/profile/upload/20230228/zhutu_4.png', '/profile/upload/20230228/details_4.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:27:53', '1632045246196736000', '2023-03-28 12:52:13', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (16, 2, '30', '雀巢  饮用水矿水 18.9L 桶装水', '桶', NULL, '22', 0.01, NULL, '好水 好味道', '/profile/upload/20230228/zhutu_5.png', '/profile/upload/20230228/details_5.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:28:06', '1632045246196736000', '2023-03-28 12:55:16', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (17, 2, '30', '雀巢 矿水优活包装饮用水18.9L桶装水', '桶', NULL, '22', 0.01, NULL, '好水 好味道', '/profile/upload/20230228/zhutu_6.png', '/profile/upload/20230228/details_6.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:28:17', '1632045246196736000', '2023-03-28 11:51:05', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (18, 2, '5', '娃哈哈  渃减水 16.8L 桶装水', '桶', NULL, '22', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230228/zhutu_7.png', '/profile/upload/20230228/details_7.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:28:35', '1632045246196736000', '2023-03-28 11:51:21', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (19, 2, '5', '娃哈哈 16.8L饮用矿物水  桶装水', '桶', NULL, '22', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230328/微信图片_20230328130555_1640581230014226432.png', '/profile/upload/20230228/details_1.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2021-03-06 10:25:38', '1632045246196736000', '2023-03-28 13:09:18', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (21, 2, '2', '娃哈哈(无需压桶) 纯净水(桶装水)', '桶', NULL, '1', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230302/图片111_1631192707653951488.png', '/profile/upload/20230228/details_0.jpg', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:25:28', '1128558726395985919', '2023-03-17 16:43:20', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (22, 2, '2', '娃哈哈 饮用纯净水 (箱装水)', '桶', NULL, '2', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230228/zhutu_1.png', '/profile/upload/20230228/details_1.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:25:38', '1128558726395985919', '2023-03-17 16:46:39', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (23, 2, '1', '农夫山泉(需压桶) 饮用纯净水(桶装水)', '桶', NULL, '1', 0.01, NULL, '天然弱碱性饮用水', '/profile/upload/20230228/zhutu_2.png', '/profile/upload/20230228/details_2.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:27:02', '1128558726395985919', '2023-03-17 16:46:35', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (25, 2, '1', '农夫清露泉(免押包装)', '桶', NULL, '5', 0.01, NULL, '清纯，甘冽好味道', '/profile/upload/20230228/zhutu_4.png', '/profile/upload/20230228/details_4.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:27:53', '1128558726395985919', '2023-03-17 16:46:19', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (26, 2, '3', '百岁山(需压桶)矿水优活包装饮用水(桶装水)', '桶', NULL, '1', 0.01, NULL, '好水 好味道', '/profile/upload/20230228/zhutu_5.png', '/profile/upload/20230228/details_5.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:28:06', '1128558726395985919', '2023-03-17 16:43:10', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (27, 2, '3', '百岁山饮用纯净水 (箱装水)', '桶', NULL, '2', 0.01, NULL, '好水 好味道', '/profile/upload/20230228/zhutu_6.png', '/profile/upload/20230228/details_6.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:28:17', '1128558726395985919', '2023-03-17 16:45:54', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (28, 2, '3', '百岁山诺碱水 桶装水(免押包装)', '桶', NULL, '5', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230228/zhutu_7.png', '/profile/upload/20230228/details_7.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:28:35', '1128558726395985919', '2023-03-17 16:45:58', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (29, 2, '2', '娃哈哈 饮用纯净水(免押包装)', '桶', NULL, '5', 0.01, NULL, '净初心 纯如伊', '/profile/upload/20230228/zhutu_1.png', '/profile/upload/20230228/details_1.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:25:38', '1128558726395985919', '2023-03-17 16:46:39', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (30, 2, '1', '农夫 18.9L冰露泉 (箱装水)', '桶', NULL, '2', 0.01, NULL, '冰露 点滴纯净', '/profile/upload/20230228/zhutu_3.png', '/profile/upload/20230228/details_3.png', '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1631170740586536960', '2021-03-06 10:27:27', '1128558726395985919', '2023-03-17 16:46:31', 'Y', 0.01, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_info` VALUES (4117, 2, '4', '农夫山泉 12L天然饮用水   一次性包装水', '桶', NULL, '25', 0.01, NULL, NULL, '/profile/upload/20230328/9_1640583246992105472.png', NULL, '新品上市,好评如潮,两件起免骑手费', NULL, NULL, '1632045246196736000', '2023-03-28 13:15:02', '1632045246196736000', '2023-03-28 13:31:24', 'Y', 0.00, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for buss_product_type
-- ----------------------------
DROP TABLE IF EXISTS `buss_product_type`;
CREATE TABLE `buss_product_type`  (
  `pk` int(10) NOT NULL AUTO_INCREMENT COMMENT '产品品类主键',
  `station_id` int(11) NULL DEFAULT NULL COMMENT '水站ID',
  `product_type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品类名称',
  `is_water` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否水类产品',
  `type_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品类图片',
  `type_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品类描述',
  `parent_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上级品类(非水站产品可用)',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '产品品类信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_product_type
-- ----------------------------
INSERT INTO `buss_product_type` VALUES (1, 1, '桶装水', 'Y', '/profile/upload/20230302/桶装水_1631181074894413824.png', NULL, NULL, '1', '1631170740586536960', '2022-10-29 00:00:00', '1128558726395985919', '2023-03-02 14:34:10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_type` VALUES (2, 1, '箱装水', 'Y', '/profile/upload/20230302/箱装水_1631181131966308352.png', NULL, NULL, '2', '1631170740586536960', '2022-10-29 00:00:00', '1128558726395985919', '2023-03-02 14:34:23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_product_type` VALUES (5, 1, '免押包装', 'N', '/profile/upload/20230302/微信图片_20230302143617_1631181945086664704.png', NULL, NULL, '4', '1631170740586536960', '2022-10-29 00:00:00', '1128558726395985919', '2023-03-02 14:37:37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for buss_receiver_message
-- ----------------------------
DROP TABLE IF EXISTS `buss_receiver_message`;
CREATE TABLE `buss_receiver_message`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `member_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户信息',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人姓名',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人电话',
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省',
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '市',
  `county` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '县',
  `detailes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收货人地址',
  `tags` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址标签',
  `is_default` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '是否默认地址(0/1)',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除(0/1)',
  `address_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址类型(0：个人；1：企业)',
  `buliding_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '建筑类型(0：楼梯房；1：电梯房)',
  `floor_num` int(11) NULL DEFAULT NULL COMMENT '楼层号',
  `company_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业名称',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id`(`id`, `member_pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 66 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收货地址信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_receiver_message
-- ----------------------------
INSERT INTO `buss_receiver_message` VALUES (63, '1645697862684368896', '李莫愁', '15801896440', '上海市', '上海市', '闵行区', '你是什么样子吧！我想去北京旅游部门负', NULL, 'Y', 0, NULL, '2', 2, NULL, NULL, '1645697862684368896', '2023-04-11 15:59:55', NULL, NULL, '1', NULL, '31.118842580087429', '121.38861193361008', NULL, NULL, NULL, NULL, NULL, '22345677889');
INSERT INTO `buss_receiver_message` VALUES (64, '1631170740586536960', 'zxx', '13818613675', '上海市', '上海市', '青浦区', '汇龙路695号', NULL, 'Y', 0, NULL, '2', 2, NULL, NULL, '1631170740586536960', '2023-04-11 16:01:31', NULL, NULL, '1', NULL, '31.20920290097799', '121.27223932937007', NULL, NULL, NULL, NULL, NULL, '02154863511');
INSERT INTO `buss_receiver_message` VALUES (65, '1643434695627366400', '刘海峰', '15825386622', '上海市', '上海市', '闵行区', '新天地', NULL, 'Y', 0, NULL, NULL, NULL, NULL, NULL, '1643434695627366400', '2023-04-12 08:56:43', NULL, NULL, '1', NULL, '31.011067845903189', '121.42506103899963', NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for buss_station_climb_fee
-- ----------------------------
DROP TABLE IF EXISTS `buss_station_climb_fee`;
CREATE TABLE `buss_station_climb_fee`  (
  `pk` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `station_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属水站',
  `f1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `f2` decimal(10, 2) NULL DEFAULT NULL COMMENT '2层费用',
  `f3` decimal(10, 2) NULL DEFAULT NULL COMMENT '3层费用',
  `f4` decimal(10, 2) NULL DEFAULT NULL COMMENT '4层费用',
  `f5` decimal(10, 2) NULL DEFAULT NULL COMMENT '5层费用',
  `f6` decimal(10, 2) NULL DEFAULT NULL COMMENT '6层费用',
  `f7` decimal(10, 2) NULL DEFAULT NULL COMMENT '7层及以上费用',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  UNIQUE INDEX `station_pk`(`station_pk`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '水站爬楼费用' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_station_climb_fee
-- ----------------------------
INSERT INTO `buss_station_climb_fee` VALUES (3, '1', NULL, 0.11, 0.12, 0.13, 0.14, 0.15, 0.16, NULL, '1631170740586536960', '2023-04-11 15:25:18', NULL, NULL, NULL, '0.2', '0.3', '0.4', '0.5', '0.6', '0.7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for buss_station_inount_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_station_inount_record`;
CREATE TABLE `buss_station_inount_record`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `station_id` int(20) NOT NULL COMMENT '水站ID',
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `poster_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送员ID',
  `products_num` int(10) NULL DEFAULT NULL COMMENT '产品件数',
  `money_num` decimal(10, 2) NOT NULL COMMENT '提成金额',
  `money_tax_num` decimal(10, 2) NULL DEFAULT NULL COMMENT '税后金额',
  `status` int(2) NOT NULL DEFAULT 0 COMMENT '记录状态 0预入账 1生效中 2已提现 ',
  `source_from` int(2) NOT NULL COMMENT '记录来源 1订单收入 2收入提现',
  `record_type` int(2) NOT NULL COMMENT '记录类型1 收入  2支出',
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 298 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '水站收支记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_station_inount_record
-- ----------------------------
INSERT INTO `buss_station_inount_record` VALUES (293, 888, 'PO1645698407998414848', NULL, NULL, NULL, 0.02, 0.02, 1, 1, 1, NULL, '2023-04-11', NULL, NULL, '0.0002000000000000000041633363423443370265886187553405761718750', '8.0000000000000003330669073875469655937634003242706292507602966528691733685829667876987514318898320198059082031250E-7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_station_inount_record` VALUES (294, 888, 'PO1645698899440820224', NULL, NULL, NULL, 1.05, 1.04, 1, 1, 1, NULL, '2023-04-11', NULL, NULL, '0.0105000000000000002185751579730776938959024846553802490234375', '0.00004200000000000000174860126378462156936725785170242080356649155742756316018506057563541844501742161810398101806640625', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_station_inount_record` VALUES (295, 888, 'PO1645722891027472384', NULL, NULL, NULL, 10.40, 10.30, 1, 1, 1, NULL, '2023-04-11', NULL, NULL, '0.1040000000000000021649348980190552538260817527770996093750000', '0.00041600000000000001731947918415244221087569681686207272103953542594919701516631427296033507445827126502990722656250000', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_station_inount_record` VALUES (296, 888, 'PO1645954082490015744', NULL, NULL, NULL, 0.02, 0.02, 1, 1, 1, NULL, '2023-04-12', NULL, NULL, '0.0002000000000000000041633363423443370265886187553405761718750', '8.0000000000000003330669073875469655937634003242706292507602966528691733685829667876987514318898320198059082031250E-7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_station_inount_record` VALUES (297, 888, 'PO1645962282094288896', NULL, NULL, NULL, 0.04, 0.04, 1, 1, 1, NULL, '2023-04-12', NULL, NULL, '0.0004000000000000000083266726846886740531772375106811523437500', '0.00000160000000000000006661338147750939311875268006485412585015205933057383467371659335753975028637796640396118164062500', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for buss_station_poster
-- ----------------------------
DROP TABLE IF EXISTS `buss_station_poster`;
CREATE TABLE `buss_station_poster`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `user_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户PK',
  `station_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '归属水站',
  `parent_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上级PK',
  `join_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '入驻时间',
  `nick_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递员名称',
  `phonenumber` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递员联系方式',
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图像',
  `concat_addr` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系地址',
  `postarea` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送区域',
  `lnt` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `card_pic_a` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证正面',
  `card_pic_b` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证反面',
  `poster_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '状态 1审核中 2正常 3 已离职',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  UNIQUE INDEX `phonenumber`(`phonenumber`, `station_pk`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配送员信息主表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_station_poster
-- ----------------------------

-- ----------------------------
-- Table structure for buss_ticket_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_ticket_info`;
CREATE TABLE `buss_ticket_info`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `station_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站信息',
  `product_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息',
  `product_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '产品单价',
  `p_basic` int(10) NULL DEFAULT NULL COMMENT '满赠起点',
  `p_bonus` int(10) NULL DEFAULT NULL COMMENT '加赠数量',
  `rule_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '规则名称',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '是否删除(Y/N)',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  UNIQUE INDEX `station_pk`(`station_pk`, `product_pk`, `p_basic`, `p_bonus`, `no1`) USING BTREE COMMENT '同1水站中一个产品一个满赠规则不能重复'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '水票信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_ticket_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_ticket_used_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_ticket_used_record`;
CREATE TABLE `buss_ticket_used_record`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单信息',
  `product_id` int(50) NULL DEFAULT NULL COMMENT '产品信息',
  `ticket_id` int(50) NULL DEFAULT NULL COMMENT '水票信息',
  `used_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '使用量',
  `status` int(2) NULL DEFAULT 0 COMMENT '状态',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户水票使用记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_ticket_used_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_address
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_address`;
CREATE TABLE `buss_user_address`  (
  `pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属用户',
  `accept_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件人',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `accept_tage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签',
  `provinces` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省',
  `cities` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '市',
  `areas` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '县区',
  `add_details_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址详细',
  `is_default` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否默认',
  `is_elevator_room` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否电梯房',
  `floor_num` int(11) NULL DEFAULT NULL COMMENT '楼层数',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户地址信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_address
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_card
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_card`;
CREATE TABLE `buss_user_card`  (
  `pk` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属用户',
  `product_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品信息',
  `product_count` int(255) NULL DEFAULT 1 COMMENT '产品数量',
  `product_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '产品价格',
  `product_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '产品类型(N普通产品 H天天乐产品)',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  UNIQUE INDEX `user_pk`(`user_pk`, `product_pk`) USING BTREE COMMENT '联合唯一'
) ENGINE = InnoDB AUTO_INCREMENT = 608 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_card
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_coupon
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_coupon`;
CREATE TABLE `buss_user_coupon`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员pk',
  `coupon_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '优惠卷pk',
  `order_pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单主键',
  `whether_to_use` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '是否使用',
  `revision` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会员优惠卷' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_coupon
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_coupon_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_coupon_record`;
CREATE TABLE `buss_user_coupon_record`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_coupon_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户卡券信息',
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单主键',
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户主键',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '用户打赏爬楼费',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送人',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '快递员分组',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '优惠券使用记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_coupon_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_invoice_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_invoice_info`;
CREATE TABLE `buss_user_invoice_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属用户',
  `group_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属组织',
  `txtype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发票类型',
  `hdtype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '抬头类型',
  `tname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `taxno` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纳税人识别号',
  `taxpad` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址电话',
  `taxaccount` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开户行及账号',
  `defaultd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否默认',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id`(`id`, `user_id`, `group_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户开票信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_invoice_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_invoice_record
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_invoice_record`;
CREATE TABLE `buss_user_invoice_record`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `invoice_info_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '开票信息ID',
  `invoice_amount` decimal(50, 2) NULL DEFAULT NULL COMMENT '开票金额',
  `invoice_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发票号',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站ID',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT 'N 待确认 Y 已开票 C 已送达',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '送达时间',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开票时间',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id`(`id`, `invoice_info_id`, `invoice_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户开票记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_invoice_record
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_invoice_record_details
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_invoice_record_details`;
CREATE TABLE `buss_user_invoice_record_details`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `invoice_record_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `order_pk`(`order_pk`) USING BTREE,
  INDEX `id`(`id`, `invoice_record_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单开票明细信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_invoice_record_details
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_offest
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_offest`;
CREATE TABLE `buss_user_offest`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户信息',
  `offest_amount` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '抵用金金额',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否压桶',
  `no2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0.00' COMMENT '压桶金额',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  UNIQUE INDEX `user_pk`(`user_pk`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户抵用金' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_offest
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_offest_details
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_offest_details`;
CREATE TABLE `buss_user_offest_details`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属用户',
  `amount` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '抵用金数量',
  `source_from` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '抵用金来源',
  `from_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '金获得时间',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否压桶',
  `no2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0.00' COMMENT '压桶金额',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '抵用金明细信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_offest_details
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_product_collection
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_product_collection`;
CREATE TABLE `buss_user_product_collection`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `user_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户主键',
  `product_pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品主键',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否压桶',
  `no2` decimal(24, 2) NULL DEFAULT 0.00 COMMENT '压桶金额',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '产品状态0上架 1下架 ',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收藏产品信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_product_collection
-- ----------------------------

-- ----------------------------
-- Table structure for buss_user_ticket_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_user_ticket_info`;
CREATE TABLE `buss_user_ticket_info`  (
  `pk` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源订单',
  `product_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息',
  `product_brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌',
  `ticket_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卡券ID',
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `ticket_account` int(255) NOT NULL COMMENT '卡券数量',
  `source_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源类型',
  `get_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获得时间',
  `expired_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '过期时间',
  `is_used` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否已使用',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '已使用数量',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  UNIQUE INDEX `order_id`(`order_id`, `user_id`) USING BTREE COMMENT '同一用户同一单号不允许重复'
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户卡券信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_user_ticket_info
-- ----------------------------

-- ----------------------------
-- Table structure for buss_water_station_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_water_station_info`;
CREATE TABLE `buss_water_station_info`  (
  `pk` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `station_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '水站名称',
  `station_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站地址',
  `station_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站描述',
  `station_pic` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站图文',
  `station_longitude` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `station_latitude` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `station_charge` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `station_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话',
  `station_license` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '营业执照(图片)',
  `station_license_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '三证合一执照号码',
  `station_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收款账号',
  `poster_free_single_unit` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '快递员每件提成数',
  `poster_child_buss_free` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '快递员下级提成量',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE,
  INDEX `pk`(`pk`, `station_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 889 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '水站信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_water_station_info
-- ----------------------------
INSERT INTO `buss_water_station_info` VALUES (1, '水站买水总站', '上海市奉贤区金汇镇北行路555号', NULL, '/profile/upload/20230314/EAfIrhFA78J9846c4635111ec491543780b711637304_1635586244319371264.jpeg', '121.38206', '31.11311', '1631170740586536960', '15221908586', '/profile/upload/20230314/20190723100555789166_1635586300384632832.png', NULL, NULL, 5.00, 0.60, NULL, '1128558726395888888', '2022-11-15 00:00:00', '1128558726395985919', '2023-03-30 15:42:38', '1', '8:00 - 21:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `buss_water_station_info` VALUES (2, '营泉水站', '上海市奉贤区金汇镇北行路555号', NULL, '[]', '121.38206', '31.11311', '1632045246196736000', '15221908586', '[]', NULL, NULL, 5.00, 0.60, NULL, '1128558726395888888', '2022-11-15 00:00:00', '1631547519121743872', '2023-03-18 15:32:11', '1', '8:00 - 21:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for buss_yj_order_info
-- ----------------------------
DROP TABLE IF EXISTS `buss_yj_order_info`;
CREATE TABLE `buss_yj_order_info`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  `batch_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号(交易流水号)',
  `order_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下单时间',
  `order_persion` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下单人',
  `station_id` int(10) NULL DEFAULT NULL COMMENT '归属水站',
  `oyear` int(10) NULL DEFAULT NULL COMMENT '月结账单归属年份',
  `amount` int(11) NULL DEFAULT NULL COMMENT '产品数量',
  `omouth` int(10) NULL DEFAULT NULL COMMENT '月结账单归属月份',
  `amountofMoney` decimal(24, 2) NULL DEFAULT NULL COMMENT '产品总价',
  `single_price` decimal(24, 2) NULL DEFAULT NULL COMMENT '产品单价',
  `express_fee` decimal(24, 2) NULL DEFAULT NULL COMMENT '快递费用',
  `is_overtime` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否超时',
  `overtime_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '超时时间',
  `order_remark` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '订单备注',
  `order_pay_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单支付时间',
  `complete_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单完成时间',
  `order_type` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '订单类型',
  `order_status` int(11) NULL DEFAULT 1 COMMENT '订单状态(1待支付2已支付)',
  `pay_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付类型',
  `need_mortgage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '废弃\r\n',
  `del_flag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除标识N未删除;Y/N',
  `cancel_reason` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '取消原因;',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '备用字段',
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '备用字段',
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送时间',
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段',
  `no14` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '缓存参数',
  `no15` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '预支付信息',
  PRIMARY KEY (`pk`) USING BTREE,
  INDEX `pk`(`pk`, `order_persion`, `oyear`, `omouth`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '月结订单信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of buss_yj_order_info
-- ----------------------------

-- ----------------------------
-- Table structure for gen_table
-- ----------------------------
DROP TABLE IF EXISTS `gen_table`;
CREATE TABLE `gen_table`  (
  `table_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `table_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '表名称',
  `table_comment` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '表描述',
  `sub_table_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联子表的表名',
  `sub_table_fk_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '子表关联的外键名',
  `class_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '实体类名称',
  `tpl_category` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'crud' COMMENT '使用的模板（crud单表操作 tree树表操作 sub主子表操作）',
  `package_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生成包路径',
  `module_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生成模块名',
  `business_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生成业务名',
  `function_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生成功能名',
  `function_author` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生成功能作者',
  `gen_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '生成代码方式（0zip压缩包 1自定义路径）',
  `vue_version` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gen_path` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '/' COMMENT '生成路径（不填默认项目路径）',
  `options` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其它生成选项',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`table_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '代码生成业务表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of gen_table
-- ----------------------------

-- ----------------------------
-- Table structure for gen_table_column
-- ----------------------------
DROP TABLE IF EXISTS `gen_table_column`;
CREATE TABLE `gen_table_column`  (
  `column_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `table_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '归属表编号',
  `column_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '列名称',
  `column_comment` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '列描述',
  `column_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '列类型',
  `java_type` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'JAVA类型',
  `java_field` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'JAVA字段名',
  `is_pk` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否主键（1是）',
  `is_increment` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否自增（1是）',
  `is_required` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否必填（1是）',
  `is_insert` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否为插入字段（1是）',
  `is_edit` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否编辑字段（1是）',
  `is_list` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否列表字段（1是）',
  `is_query` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否查询字段（1是）',
  `query_type` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'EQ' COMMENT '查询方式（等于、不等于、大于、小于、范围）',
  `html_type` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）',
  `dict_type` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典类型',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`column_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4535 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '代码生成业务表字段' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of gen_table_column
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_blob_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_blob_triggers`;
CREATE TABLE `qrtz_blob_triggers`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `trigger_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_name的外键',
  `trigger_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_group的外键',
  `blob_data` blob NULL COMMENT '存放持久化Trigger对象',
  PRIMARY KEY (`sched_name`, `trigger_name`, `trigger_group`) USING BTREE,
  CONSTRAINT `qrtz_blob_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `qrtz_triggers` (`sched_name`, `trigger_name`, `trigger_group`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'Blob类型的触发器表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_blob_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_calendars
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_calendars`;
CREATE TABLE `qrtz_calendars`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `calendar_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '日历名称',
  `calendar` blob NOT NULL COMMENT '存放持久化calendar对象',
  PRIMARY KEY (`sched_name`, `calendar_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '日历信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_calendars
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_cron_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_cron_triggers`;
CREATE TABLE `qrtz_cron_triggers`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `trigger_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_name的外键',
  `trigger_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_group的外键',
  `cron_expression` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'cron表达式',
  `time_zone_id` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '时区',
  PRIMARY KEY (`sched_name`, `trigger_name`, `trigger_group`) USING BTREE,
  CONSTRAINT `qrtz_cron_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `qrtz_triggers` (`sched_name`, `trigger_name`, `trigger_group`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'Cron类型的触发器表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_cron_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_fired_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_fired_triggers`;
CREATE TABLE `qrtz_fired_triggers`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `entry_id` varchar(95) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度器实例id',
  `trigger_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_name的外键',
  `trigger_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_group的外键',
  `instance_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度器实例名',
  `fired_time` bigint(13) NOT NULL COMMENT '触发的时间',
  `sched_time` bigint(13) NOT NULL COMMENT '定时器制定的时间',
  `priority` int(11) NOT NULL COMMENT '优先级',
  `state` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态',
  `job_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务名称',
  `job_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务组名',
  `is_nonconcurrent` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否并发',
  `requests_recovery` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否接受恢复执行',
  PRIMARY KEY (`sched_name`, `entry_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '已触发的触发器表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_fired_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_job_details
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_job_details`;
CREATE TABLE `qrtz_job_details`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `job_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务名称',
  `job_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务组名',
  `description` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '相关介绍',
  `job_class_name` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '执行任务类名称',
  `is_durable` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否持久化',
  `is_nonconcurrent` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否并发',
  `is_update_data` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否更新数据',
  `requests_recovery` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否接受恢复执行',
  `job_data` blob NULL COMMENT '存放持久化job对象',
  PRIMARY KEY (`sched_name`, `job_name`, `job_group`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务详细信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_job_details
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_locks
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_locks`;
CREATE TABLE `qrtz_locks`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `lock_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '悲观锁名称',
  PRIMARY KEY (`sched_name`, `lock_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '存储的悲观锁信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_locks
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_paused_trigger_grps
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_paused_trigger_grps`;
CREATE TABLE `qrtz_paused_trigger_grps`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `trigger_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_group的外键',
  PRIMARY KEY (`sched_name`, `trigger_group`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '暂停的触发器表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_paused_trigger_grps
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_scheduler_state
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_scheduler_state`;
CREATE TABLE `qrtz_scheduler_state`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `instance_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '实例名称',
  `last_checkin_time` bigint(13) NOT NULL COMMENT '上次检查时间',
  `checkin_interval` bigint(13) NOT NULL COMMENT '检查间隔时间',
  PRIMARY KEY (`sched_name`, `instance_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '调度器状态表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_scheduler_state
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_simple_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_simple_triggers`;
CREATE TABLE `qrtz_simple_triggers`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `trigger_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_name的外键',
  `trigger_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_group的外键',
  `repeat_count` bigint(7) NOT NULL COMMENT '重复的次数统计',
  `repeat_interval` bigint(12) NOT NULL COMMENT '重复的间隔时间',
  `times_triggered` bigint(10) NOT NULL COMMENT '已经触发的次数',
  PRIMARY KEY (`sched_name`, `trigger_name`, `trigger_group`) USING BTREE,
  CONSTRAINT `qrtz_simple_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `qrtz_triggers` (`sched_name`, `trigger_name`, `trigger_group`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '简单触发器的信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_simple_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_simprop_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_simprop_triggers`;
CREATE TABLE `qrtz_simprop_triggers`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `trigger_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_name的外键',
  `trigger_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_triggers表trigger_group的外键',
  `str_prop_1` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'String类型的trigger的第一个参数',
  `str_prop_2` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'String类型的trigger的第二个参数',
  `str_prop_3` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'String类型的trigger的第三个参数',
  `int_prop_1` int(11) NULL DEFAULT NULL COMMENT 'int类型的trigger的第一个参数',
  `int_prop_2` int(11) NULL DEFAULT NULL COMMENT 'int类型的trigger的第二个参数',
  `long_prop_1` bigint(20) NULL DEFAULT NULL COMMENT 'long类型的trigger的第一个参数',
  `long_prop_2` bigint(20) NULL DEFAULT NULL COMMENT 'long类型的trigger的第二个参数',
  `dec_prop_1` decimal(13, 4) NULL DEFAULT NULL COMMENT 'decimal类型的trigger的第一个参数',
  `dec_prop_2` decimal(13, 4) NULL DEFAULT NULL COMMENT 'decimal类型的trigger的第二个参数',
  `bool_prop_1` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'Boolean类型的trigger的第一个参数',
  `bool_prop_2` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'Boolean类型的trigger的第二个参数',
  PRIMARY KEY (`sched_name`, `trigger_name`, `trigger_group`) USING BTREE,
  CONSTRAINT `qrtz_simprop_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `qrtz_triggers` (`sched_name`, `trigger_name`, `trigger_group`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '同步机制的行锁表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_simprop_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_triggers`;
CREATE TABLE `qrtz_triggers`  (
  `sched_name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调度名称',
  `trigger_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '触发器的名字',
  `trigger_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '触发器所属组的名字',
  `job_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_job_details表job_name的外键',
  `job_group` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'qrtz_job_details表job_group的外键',
  `description` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '相关介绍',
  `next_fire_time` bigint(13) NULL DEFAULT NULL COMMENT '上一次触发时间（毫秒）',
  `prev_fire_time` bigint(13) NULL DEFAULT NULL COMMENT '下一次触发时间（默认为-1表示不触发）',
  `priority` int(11) NULL DEFAULT NULL COMMENT '优先级',
  `trigger_state` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '触发器状态',
  `trigger_type` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '触发器的类型',
  `start_time` bigint(13) NOT NULL COMMENT '开始时间',
  `end_time` bigint(13) NULL DEFAULT NULL COMMENT '结束时间',
  `calendar_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日程表名称',
  `misfire_instr` smallint(2) NULL DEFAULT NULL COMMENT '补偿执行的策略',
  `job_data` blob NULL COMMENT '存放持久化job对象',
  PRIMARY KEY (`sched_name`, `trigger_name`, `trigger_group`) USING BTREE,
  INDEX `sched_name`(`sched_name`, `job_name`, `job_group`) USING BTREE,
  CONSTRAINT `qrtz_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `job_name`, `job_group`) REFERENCES `qrtz_job_details` (`sched_name`, `job_name`, `job_group`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '触发器详细信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of qrtz_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for sys_bus_code_rules
-- ----------------------------
DROP TABLE IF EXISTS `sys_bus_code_rules`;
CREATE TABLE `sys_bus_code_rules`  (
  `pk` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `bus_bill_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单据编号(备用)',
  `bus_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务名称',
  `bus_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务编码',
  `no_prefix` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单据前缀',
  `no_date_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '时间戳格式',
  `no_count` int(10) NULL DEFAULT NULL COMMENT '流水号位数',
  `no_start` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流水号开始数',
  `order_num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '排序号',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标注',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '外部单据规则' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_bus_code_rules
-- ----------------------------

-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_config`;
CREATE TABLE `sys_config`  (
  `config_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '参数主键',
  `config_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '参数名称',
  `config_key` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '参数键名',
  `config_value` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '参数键值',
  `config_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '系统内置（Y是 N否）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`config_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '参数配置表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_config
-- ----------------------------
INSERT INTO `sys_config` VALUES (1, '主框架页-默认皮肤样式名称', 'sys.index.skinName', 'skin-yellow', 'Y', 'admin', '2022-07-01 17:54:26', 'admin', '2022-07-13 09:45:34', '蓝色 skin-blue、绿色 skin-green、紫色 skin-purple、红色 skin-red、黄色 skin-yellow');
INSERT INTO `sys_config` VALUES (2, '用户管理-账号初始密码', 'sys.user.initPassword', '123456', 'Y', 'admin', '2022-07-01 17:54:26', '', NULL, '初始化密码 123456');
INSERT INTO `sys_config` VALUES (3, '主框架页-侧边栏主题', 'sys.index.sideTheme', 'theme-dark', 'Y', 'admin', '2022-07-01 17:54:26', '', NULL, '深色主题theme-dark，浅色主题theme-light');
INSERT INTO `sys_config` VALUES (4, '账号自助-验证码开关', 'sys.account.captchaOnOff', 'false', 'N', 'admin', '2022-07-01 17:54:26', 'admin', '2022-08-29 13:58:54', '是否开启验证码功能（true开启，false关闭）');
INSERT INTO `sys_config` VALUES (5, '账号自助-是否开启用户注册功能', 'sys.account.registerUser', 'false', 'Y', 'admin', '2022-07-01 17:54:26', '', NULL, '是否开启注册用户功能（true开启，false关闭）');
INSERT INTO `sys_config` VALUES (6, '账号自助-验证码类型', 'sys.account.captchaType', 'math', 'Y', 'admin', '2022-07-01 17:54:26', 'admin', '2022-08-29 13:58:54', '是否开启验证码功能（math数字 char 字符串验证）');

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept`  (
  `dept_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门id',
  `dept_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织部门',
  `parent_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父部门id',
  `ancestors` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '祖级列表',
  `dept_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '部门名称',
  `crop_flag` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否公司',
  `order_num` int(4) NULL DEFAULT 0 COMMENT '显示顺序',
  `simple_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织简称',
  `mnemonic_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '助记码',
  `org_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织类型',
  `org_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织地址',
  `org_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织描述',
  `org_bus_license` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织执照',
  `org_countryzone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家地区',
  `org_logo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'LOGO',
  `leader` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '部门状态（0正常 1停用）',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `isretail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '适用零售;适用零售',
  `channel_city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道城市(如果公司类别为渠道该字段必填)',
  `chargeleader` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分管领导;分管领导',
  `taxno` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纳税人识别号',
  `createdate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '成立时间;部门成立时间',
  `deptcanceldate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '撤销日期;部门撤销日期',
  `hrcanceled` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'HR撤销标志;HR撤销标志',
  `deptduty` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门职责;部门职责',
  `resposition` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责岗位;负责岗位',
  `sdf01` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义1',
  `sdf02` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义2',
  `sdf03` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义3',
  `sdf04` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义4',
  `sdf05` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义5',
  `sdf06` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义6',
  `sdf07` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义7',
  `sdf08` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义8',
  `sdf09` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义9',
  `sdf10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义10',
  `sdf11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义11',
  `sdf12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义12',
  `sdf13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义13',
  `sdf14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义14',
  `sdf15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义15',
  `sdf16` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义16',
  `sdf17` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义17',
  `sdf18` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义18',
  `sdf19` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义19',
  `sdf20` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义20',
  PRIMARY KEY (`dept_id`) USING BTREE,
  INDEX `dept_id`(`dept_id`, `dept_code`, `parent_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES ('1', '', '888', '0,888', '李影的水站', 'Y', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', '', 'caoben@jiubo-sh.com', '0', '0', '1128558726395985920', '2018-03-16 11:32:00', '1128558726395985920', '2022-08-19 09:30:18', NULL, NULL, NULL, NULL, '2022-09-01', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_dept` VALUES ('2', '', '888', '0,888', '老张的水站', 'Y', 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '0', '1128558726395985920', '2018-03-16 11:33:00', '1128558726395985920', '2018-03-16 11:33:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_dept` VALUES ('3', '', '888', '0,888', '菜心虫的水站', 'Y', 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '操心', NULL, NULL, '0', '0', '1128558726395985920', '2018-03-16 11:33:00', '1128558726395985920', '2022-07-21 14:11:37', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_dept` VALUES ('4', '', '888', '0,888', '上海静安水站', 'Y', 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '张三', NULL, NULL, '0', '0', '1128558726395985920', '2018-03-16 11:33:00', '1128558726395985920', '2022-07-21 14:11:54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_dept` VALUES ('5', '', '888', '0,888', '上海奉贤水站', 'Y', 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '0', '1128558726395985920', '2018-03-16 11:33:00', '1128558726395985920', '2018-03-16 11:33:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_dept` VALUES ('888', '', '0', '0', '水站买总站', 'Y', 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '0', '1128558726395985920', '2018-03-16 11:33:00', '1128558726395985920', '2018-03-16 11:33:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sys_dict_data
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_data`;
CREATE TABLE `sys_dict_data`  (
  `dict_code` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '字典编码',
  `dict_sort` int(4) NULL DEFAULT 0 COMMENT '字典排序',
  `dict_label` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典标签',
  `dict_value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典键值',
  `dict_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典类型',
  `css_class` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '样式属性（其他样式扩展）',
  `list_class` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表格回显样式',
  `is_default` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '是否默认（Y是 N否）',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dict_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 490 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典数据表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_dict_data
-- ----------------------------
INSERT INTO `sys_dict_data` VALUES (1, 1, '男', '0', 'sys_user_sex', '', '', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '性别男');
INSERT INTO `sys_dict_data` VALUES (2, 2, '女', '1', 'sys_user_sex', '', '', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '性别女');
INSERT INTO `sys_dict_data` VALUES (3, 3, '未知', '2', 'sys_user_sex', '', '', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '性别未知');
INSERT INTO `sys_dict_data` VALUES (4, 1, '显示', '0', 'sys_show_hide', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '显示菜单');
INSERT INTO `sys_dict_data` VALUES (5, 2, '隐藏', '1', 'sys_show_hide', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '隐藏菜单');
INSERT INTO `sys_dict_data` VALUES (6, 1, '正常', '0', 'sys_normal_disable', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '正常状态');
INSERT INTO `sys_dict_data` VALUES (7, 2, '停用', '1', 'sys_normal_disable', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '停用状态');
INSERT INTO `sys_dict_data` VALUES (8, 1, '正常', '0', 'sys_job_status', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '正常状态');
INSERT INTO `sys_dict_data` VALUES (9, 2, '暂停', '1', 'sys_job_status', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '停用状态');
INSERT INTO `sys_dict_data` VALUES (10, 1, '默认', 'DEFAULT', 'sys_job_group', '', '', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '默认分组');
INSERT INTO `sys_dict_data` VALUES (11, 2, '系统', 'SYSTEM', 'sys_job_group', '', '', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统分组');
INSERT INTO `sys_dict_data` VALUES (12, 1, '是', 'Y', 'sys_yes_no', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统默认是');
INSERT INTO `sys_dict_data` VALUES (13, 2, '否', 'N', 'sys_yes_no', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统默认否');
INSERT INTO `sys_dict_data` VALUES (14, 1, '通知', '1', 'sys_notice_type', '', 'warning', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '通知');
INSERT INTO `sys_dict_data` VALUES (15, 2, '公告', '2', 'sys_notice_type', '', 'success', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '公告');
INSERT INTO `sys_dict_data` VALUES (16, 1, '正常', '0', 'sys_notice_status', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '正常状态');
INSERT INTO `sys_dict_data` VALUES (17, 2, '关闭', '1', 'sys_notice_status', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '关闭状态');
INSERT INTO `sys_dict_data` VALUES (18, 1, '新增', '1', 'sys_oper_type', '', 'info', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '新增操作');
INSERT INTO `sys_dict_data` VALUES (19, 2, '修改', '2', 'sys_oper_type', '', 'info', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '修改操作');
INSERT INTO `sys_dict_data` VALUES (20, 3, '删除', '3', 'sys_oper_type', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '删除操作');
INSERT INTO `sys_dict_data` VALUES (21, 4, '授权', '4', 'sys_oper_type', '', 'primary', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '授权操作');
INSERT INTO `sys_dict_data` VALUES (22, 5, '导出', '5', 'sys_oper_type', '', 'warning', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '导出操作');
INSERT INTO `sys_dict_data` VALUES (23, 6, '导入', '6', 'sys_oper_type', '', 'warning', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '导入操作');
INSERT INTO `sys_dict_data` VALUES (24, 7, '强退', '7', 'sys_oper_type', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '强退操作');
INSERT INTO `sys_dict_data` VALUES (25, 8, '生成代码', '8', 'sys_oper_type', '', 'warning', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '生成操作');
INSERT INTO `sys_dict_data` VALUES (26, 9, '清空数据', '9', 'sys_oper_type', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '清空操作');
INSERT INTO `sys_dict_data` VALUES (27, 1, '成功', '0', 'sys_common_status', '', 'primary', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '正常状态');
INSERT INTO `sys_dict_data` VALUES (28, 2, '失败', '1', 'sys_common_status', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '停用状态');
INSERT INTO `sys_dict_data` VALUES (193, 0, '技术文档', '3', 'file_document_type', NULL, NULL, 'N', '0', 'null', '2021-08-31 12:52:05', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (194, 0, '员工须知', '4', 'file_document_type', NULL, NULL, 'N', '0', 'null', '2021-08-31 12:52:14', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (195, 0, '财务文档', '6', 'file_document_type', NULL, NULL, 'N', '0', 'null', '2021-08-31 12:52:21', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (482, 0, '桶装水', '1', 'buss_product_type', NULL, 'default', 'N', '0', 'admin', '2022-10-24 15:40:06', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (483, 0, '箱装水', '2', 'buss_product_type', NULL, 'default', 'N', '0', 'admin', '2022-10-24 15:40:17', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (484, 0, '手压泵', '3', 'buss_product_type', NULL, 'default', 'N', '0', 'admin', '2022-10-24 15:40:31', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (485, 0, '套餐类', '4', 'buss_product_type', NULL, 'default', 'N', '0', 'admin', '2022-10-24 15:40:39', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (486, 0, '饮水机', '5', 'buss_product_type', NULL, 'default', 'N', '0', 'admin', '2022-10-24 15:40:54', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (487, 0, '茶吧机', '6', 'buss_product_type', NULL, 'default', 'N', '0', 'admin', '2022-10-24 15:41:05', 'admin', '2022-10-24 15:41:11', NULL);
INSERT INTO `sys_dict_data` VALUES (488, 0, '饮料', '7', 'buss_product_type', NULL, 'default', 'N', '0', 'admin', '2022-10-24 15:41:22', '', NULL, NULL);
INSERT INTO `sys_dict_data` VALUES (489, 0, '高端水', '8', 'buss_product_type', NULL, 'default', 'N', '0', 'admin', '2022-10-24 15:41:32', '', NULL, NULL);

-- ----------------------------
-- Table structure for sys_dict_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_type`;
CREATE TABLE `sys_dict_type`  (
  `dict_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '字典主键',
  `dict_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典名称',
  `dict_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典类型',
  `dict_group` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `flag` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dict_id`) USING BTREE,
  UNIQUE INDEX `dict_type`(`dict_type`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 86 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典类型表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_dict_type
-- ----------------------------
INSERT INTO `sys_dict_type` VALUES (1, 'SYS-用户性别', 'sys_user_sex', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2022-07-13 17:47:43', '用户性别列表');
INSERT INTO `sys_dict_type` VALUES (2, 'SYS-菜单状态', 'sys_show_hide', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2021-06-15 16:53:10', '菜单状态列表');
INSERT INTO `sys_dict_type` VALUES (3, 'SYS-系统开关', 'sys_normal_disable', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2018-03-16 11:33:00', '系统开关列表');
INSERT INTO `sys_dict_type` VALUES (4, 'SYS-任务状态', 'sys_job_status', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2018-03-16 11:33:00', '任务状态列表');
INSERT INTO `sys_dict_type` VALUES (5, 'SYS-任务分组', 'sys_job_group', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2018-03-16 11:33:00', '任务分组列表');
INSERT INTO `sys_dict_type` VALUES (6, 'SYS-系统是否', 'sys_yes_no', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2018-03-16 11:33:00', '系统是否列表');
INSERT INTO `sys_dict_type` VALUES (7, 'SYS-通知类型', 'sys_notice_type', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2018-03-16 11:33:00', '通知类型列表');
INSERT INTO `sys_dict_type` VALUES (8, 'SYS-通知状态', 'sys_notice_status', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2018-03-16 11:33:00', '通知状态列表');
INSERT INTO `sys_dict_type` VALUES (9, 'SYS-操作类型', 'sys_oper_type', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2018-03-16 11:33:00', '操作类型列表');
INSERT INTO `sys_dict_type` VALUES (10, 'SYS-系统状态', 'sys_common_status', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2018-03-16 11:33:00', '1128558726395985919', '2018-03-16 11:33:00', '登录状态列表');
INSERT INTO `sys_dict_type` VALUES (11, 'SYS-文档类型', 'file_document_type', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2021-08-29 15:36:41', '1128558726395985919', NULL, '文档中心 文档分类');
INSERT INTO `sys_dict_type` VALUES (12, 'SYS-消息类型', 'sys_message_type', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2021-10-25 13:15:01', '1128558726395985919', NULL, '消息类型');
INSERT INTO `sys_dict_type` VALUES (13, 'SYS-来源类型', 'sys_source_type', 'SYS', '1000', 'Y', '0', '1128558726395985919', '2021-10-25 13:26:42', '1128558726395985919', NULL, NULL);
INSERT INTO `sys_dict_type` VALUES (85, '产品分类', 'buss_product_type', NULL, NULL, NULL, '0', 'admin', '2022-10-24 15:39:53', 'admin', '2022-10-24 16:19:44', NULL);

-- ----------------------------
-- Table structure for sys_job
-- ----------------------------
DROP TABLE IF EXISTS `sys_job`;
CREATE TABLE `sys_job`  (
  `job_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务ID',
  `job_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '任务名称',
  `job_group` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'DEFAULT' COMMENT '任务组名',
  `invoke_target` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调用目标字符串',
  `cron_expression` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT 'cron执行表达式',
  `misfire_policy` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '3' COMMENT '计划执行错误策略（1立即执行 2执行一次 3放弃执行）',
  `concurrent` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '是否并发执行（0允许 1禁止）',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态（0正常 1暂停）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注信息',
  PRIMARY KEY (`job_id`, `job_name`, `job_group`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '定时任务调度表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_job
-- ----------------------------
INSERT INTO `sys_job` VALUES (1, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '0 0/10 * * * ?', '1', '0', '0', '1128558726395985919', '2023-02-24 14:19:06', '', '2023-02-24 14:22:54', '');
INSERT INTO `sys_job` VALUES (3, '每月1号2:00生成月结账单任务', 'DEFAULT', 'myTask.createYueJieOrder', '0 0 2 1 * ?', '3', '1', '1', '1128558726395985919', '2023-04-07 10:21:00', '', NULL, '');

-- ----------------------------
-- Table structure for sys_job_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_job_log`;
CREATE TABLE `sys_job_log`  (
  `job_log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务日志ID',
  `job_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务名称',
  `job_group` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务组名',
  `invoke_target` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调用目标字符串',
  `job_message` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日志信息',
  `status` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '执行状态（0正常 1失败）',
  `exception_info` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '异常信息',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`job_log_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6990 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '定时任务调度日志表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_job_log
-- ----------------------------
INSERT INTO `sys_job_log` VALUES (5711, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 16:10:00');
INSERT INTO `sys_job_log` VALUES (5712, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：6毫秒', '200', '', '2023-04-03 16:20:00');
INSERT INTO `sys_job_log` VALUES (5713, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 16:30:00');
INSERT INTO `sys_job_log` VALUES (5714, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 16:40:00');
INSERT INTO `sys_job_log` VALUES (5715, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 16:50:00');
INSERT INTO `sys_job_log` VALUES (5716, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 17:00:00');
INSERT INTO `sys_job_log` VALUES (5717, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 17:10:00');
INSERT INTO `sys_job_log` VALUES (5718, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 17:20:00');
INSERT INTO `sys_job_log` VALUES (5719, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-03 17:30:00');
INSERT INTO `sys_job_log` VALUES (5720, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：47毫秒', '200', '', '2023-04-03 17:40:00');
INSERT INTO `sys_job_log` VALUES (5721, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 17:50:00');
INSERT INTO `sys_job_log` VALUES (5722, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：29毫秒', '200', '', '2023-04-03 18:00:00');
INSERT INTO `sys_job_log` VALUES (5723, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：12毫秒', '200', '', '2023-04-03 18:10:00');
INSERT INTO `sys_job_log` VALUES (5724, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 18:20:00');
INSERT INTO `sys_job_log` VALUES (5725, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 18:30:00');
INSERT INTO `sys_job_log` VALUES (5726, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-03 18:40:00');
INSERT INTO `sys_job_log` VALUES (5727, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 18:50:00');
INSERT INTO `sys_job_log` VALUES (5728, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 19:00:00');
INSERT INTO `sys_job_log` VALUES (5729, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 19:10:00');
INSERT INTO `sys_job_log` VALUES (5730, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-03 19:20:00');
INSERT INTO `sys_job_log` VALUES (5731, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 19:30:00');
INSERT INTO `sys_job_log` VALUES (5732, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 19:40:00');
INSERT INTO `sys_job_log` VALUES (5733, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：11毫秒', '200', '', '2023-04-03 19:50:00');
INSERT INTO `sys_job_log` VALUES (5734, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 20:00:00');
INSERT INTO `sys_job_log` VALUES (5735, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 20:10:00');
INSERT INTO `sys_job_log` VALUES (5736, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：7毫秒', '200', '', '2023-04-03 20:20:00');
INSERT INTO `sys_job_log` VALUES (5737, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-03 20:30:00');
INSERT INTO `sys_job_log` VALUES (5738, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 20:40:00');
INSERT INTO `sys_job_log` VALUES (5739, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-03 20:50:00');
INSERT INTO `sys_job_log` VALUES (5740, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 21:00:00');
INSERT INTO `sys_job_log` VALUES (5741, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-03 21:10:00');
INSERT INTO `sys_job_log` VALUES (5742, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 21:20:00');
INSERT INTO `sys_job_log` VALUES (5743, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-03 21:30:00');
INSERT INTO `sys_job_log` VALUES (5744, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 21:40:00');
INSERT INTO `sys_job_log` VALUES (5745, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 21:50:00');
INSERT INTO `sys_job_log` VALUES (5746, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 22:00:00');
INSERT INTO `sys_job_log` VALUES (5747, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 22:10:00');
INSERT INTO `sys_job_log` VALUES (5748, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 22:20:00');
INSERT INTO `sys_job_log` VALUES (5749, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 22:30:00');
INSERT INTO `sys_job_log` VALUES (5750, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 22:40:00');
INSERT INTO `sys_job_log` VALUES (5751, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 22:50:00');
INSERT INTO `sys_job_log` VALUES (5752, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 23:00:00');
INSERT INTO `sys_job_log` VALUES (5753, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 23:10:00');
INSERT INTO `sys_job_log` VALUES (5754, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 23:20:00');
INSERT INTO `sys_job_log` VALUES (5755, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 23:30:00');
INSERT INTO `sys_job_log` VALUES (5756, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-03 23:40:00');
INSERT INTO `sys_job_log` VALUES (5757, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-03 23:50:00');
INSERT INTO `sys_job_log` VALUES (5758, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：47毫秒', '200', '', '2023-04-04 00:00:00');
INSERT INTO `sys_job_log` VALUES (5759, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 00:10:00');
INSERT INTO `sys_job_log` VALUES (5760, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 00:20:00');
INSERT INTO `sys_job_log` VALUES (5761, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 00:30:00');
INSERT INTO `sys_job_log` VALUES (5762, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 00:40:00');
INSERT INTO `sys_job_log` VALUES (5763, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 00:50:00');
INSERT INTO `sys_job_log` VALUES (5764, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 01:00:00');
INSERT INTO `sys_job_log` VALUES (5765, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 01:10:00');
INSERT INTO `sys_job_log` VALUES (5766, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-04 01:20:00');
INSERT INTO `sys_job_log` VALUES (5767, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 01:30:00');
INSERT INTO `sys_job_log` VALUES (5768, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 01:40:00');
INSERT INTO `sys_job_log` VALUES (5769, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 01:50:00');
INSERT INTO `sys_job_log` VALUES (5770, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 02:00:00');
INSERT INTO `sys_job_log` VALUES (5771, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-04 02:10:00');
INSERT INTO `sys_job_log` VALUES (5772, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 02:20:00');
INSERT INTO `sys_job_log` VALUES (5773, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-04 02:30:00');
INSERT INTO `sys_job_log` VALUES (5774, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 02:40:00');
INSERT INTO `sys_job_log` VALUES (5775, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：6毫秒', '200', '', '2023-04-04 02:50:00');
INSERT INTO `sys_job_log` VALUES (5776, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 03:00:00');
INSERT INTO `sys_job_log` VALUES (5777, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 03:10:00');
INSERT INTO `sys_job_log` VALUES (5778, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 03:20:00');
INSERT INTO `sys_job_log` VALUES (5779, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 03:30:00');
INSERT INTO `sys_job_log` VALUES (5780, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 03:40:00');
INSERT INTO `sys_job_log` VALUES (5781, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 03:50:00');
INSERT INTO `sys_job_log` VALUES (5782, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 04:00:00');
INSERT INTO `sys_job_log` VALUES (5783, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 04:10:00');
INSERT INTO `sys_job_log` VALUES (5784, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 04:20:00');
INSERT INTO `sys_job_log` VALUES (5785, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 04:30:00');
INSERT INTO `sys_job_log` VALUES (5786, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 04:40:00');
INSERT INTO `sys_job_log` VALUES (5787, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 04:50:00');
INSERT INTO `sys_job_log` VALUES (5788, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 05:00:00');
INSERT INTO `sys_job_log` VALUES (5789, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 05:10:00');
INSERT INTO `sys_job_log` VALUES (5790, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 05:20:00');
INSERT INTO `sys_job_log` VALUES (5791, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 05:30:00');
INSERT INTO `sys_job_log` VALUES (5792, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 05:40:00');
INSERT INTO `sys_job_log` VALUES (5793, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 05:50:00');
INSERT INTO `sys_job_log` VALUES (5794, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 06:00:00');
INSERT INTO `sys_job_log` VALUES (5795, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 06:10:00');
INSERT INTO `sys_job_log` VALUES (5796, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 06:20:00');
INSERT INTO `sys_job_log` VALUES (5797, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 06:30:00');
INSERT INTO `sys_job_log` VALUES (5798, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 06:40:00');
INSERT INTO `sys_job_log` VALUES (5799, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 06:50:00');
INSERT INTO `sys_job_log` VALUES (5800, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-04 07:00:00');
INSERT INTO `sys_job_log` VALUES (5801, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 07:10:00');
INSERT INTO `sys_job_log` VALUES (5802, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-04 07:20:00');
INSERT INTO `sys_job_log` VALUES (5803, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-04 07:30:00');
INSERT INTO `sys_job_log` VALUES (5804, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 07:40:00');
INSERT INTO `sys_job_log` VALUES (5805, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-04 07:50:00');
INSERT INTO `sys_job_log` VALUES (5806, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 08:00:00');
INSERT INTO `sys_job_log` VALUES (5807, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-04 08:10:00');
INSERT INTO `sys_job_log` VALUES (5808, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 08:20:00');
INSERT INTO `sys_job_log` VALUES (5809, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 08:30:00');
INSERT INTO `sys_job_log` VALUES (5810, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 08:40:00');
INSERT INTO `sys_job_log` VALUES (5811, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 08:50:00');
INSERT INTO `sys_job_log` VALUES (5812, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 09:00:00');
INSERT INTO `sys_job_log` VALUES (5813, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 09:10:00');
INSERT INTO `sys_job_log` VALUES (5814, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 09:20:00');
INSERT INTO `sys_job_log` VALUES (5815, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 09:30:00');
INSERT INTO `sys_job_log` VALUES (5816, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-04 09:40:00');
INSERT INTO `sys_job_log` VALUES (5817, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：30毫秒', '200', '', '2023-04-04 09:50:00');
INSERT INTO `sys_job_log` VALUES (5818, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 10:00:00');
INSERT INTO `sys_job_log` VALUES (5819, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 10:10:00');
INSERT INTO `sys_job_log` VALUES (5820, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 10:20:00');
INSERT INTO `sys_job_log` VALUES (5821, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 10:30:00');
INSERT INTO `sys_job_log` VALUES (5822, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 10:40:00');
INSERT INTO `sys_job_log` VALUES (5823, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-04 10:50:00');
INSERT INTO `sys_job_log` VALUES (5824, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 11:00:00');
INSERT INTO `sys_job_log` VALUES (5825, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-04 11:10:00');
INSERT INTO `sys_job_log` VALUES (5826, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 11:20:00');
INSERT INTO `sys_job_log` VALUES (5827, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 11:30:00');
INSERT INTO `sys_job_log` VALUES (5828, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 11:40:00');
INSERT INTO `sys_job_log` VALUES (5829, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 11:50:00');
INSERT INTO `sys_job_log` VALUES (5830, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 12:00:00');
INSERT INTO `sys_job_log` VALUES (5831, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 12:10:00');
INSERT INTO `sys_job_log` VALUES (5832, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 12:20:00');
INSERT INTO `sys_job_log` VALUES (5833, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 12:30:00');
INSERT INTO `sys_job_log` VALUES (5834, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 12:40:00');
INSERT INTO `sys_job_log` VALUES (5835, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 12:50:00');
INSERT INTO `sys_job_log` VALUES (5836, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-04 13:00:00');
INSERT INTO `sys_job_log` VALUES (5837, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 13:10:00');
INSERT INTO `sys_job_log` VALUES (5838, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 13:20:00');
INSERT INTO `sys_job_log` VALUES (5839, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 13:30:00');
INSERT INTO `sys_job_log` VALUES (5840, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-04 13:40:00');
INSERT INTO `sys_job_log` VALUES (5841, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-04 13:50:00');
INSERT INTO `sys_job_log` VALUES (5842, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 14:00:00');
INSERT INTO `sys_job_log` VALUES (5843, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 14:10:00');
INSERT INTO `sys_job_log` VALUES (5844, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 14:20:00');
INSERT INTO `sys_job_log` VALUES (5845, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 14:30:00');
INSERT INTO `sys_job_log` VALUES (5846, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 14:40:00');
INSERT INTO `sys_job_log` VALUES (5847, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 14:50:00');
INSERT INTO `sys_job_log` VALUES (5848, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 15:00:00');
INSERT INTO `sys_job_log` VALUES (5849, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 15:10:00');
INSERT INTO `sys_job_log` VALUES (5850, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 15:20:00');
INSERT INTO `sys_job_log` VALUES (5851, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 15:30:00');
INSERT INTO `sys_job_log` VALUES (5852, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 15:40:00');
INSERT INTO `sys_job_log` VALUES (5853, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 15:50:00');
INSERT INTO `sys_job_log` VALUES (5854, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 16:00:00');
INSERT INTO `sys_job_log` VALUES (5855, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 16:10:00');
INSERT INTO `sys_job_log` VALUES (5856, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-04 16:20:00');
INSERT INTO `sys_job_log` VALUES (5857, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 16:30:00');
INSERT INTO `sys_job_log` VALUES (5858, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 16:40:00');
INSERT INTO `sys_job_log` VALUES (5859, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 16:50:00');
INSERT INTO `sys_job_log` VALUES (5860, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 17:00:00');
INSERT INTO `sys_job_log` VALUES (5861, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 17:10:00');
INSERT INTO `sys_job_log` VALUES (5862, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 17:20:00');
INSERT INTO `sys_job_log` VALUES (5863, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 17:30:00');
INSERT INTO `sys_job_log` VALUES (5864, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 17:40:00');
INSERT INTO `sys_job_log` VALUES (5865, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 17:50:00');
INSERT INTO `sys_job_log` VALUES (5866, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 18:00:00');
INSERT INTO `sys_job_log` VALUES (5867, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 18:10:00');
INSERT INTO `sys_job_log` VALUES (5868, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-04 18:20:00');
INSERT INTO `sys_job_log` VALUES (5869, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 18:30:00');
INSERT INTO `sys_job_log` VALUES (5870, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 18:40:00');
INSERT INTO `sys_job_log` VALUES (5871, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 18:50:00');
INSERT INTO `sys_job_log` VALUES (5872, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 19:00:00');
INSERT INTO `sys_job_log` VALUES (5873, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 19:10:00');
INSERT INTO `sys_job_log` VALUES (5874, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 19:20:00');
INSERT INTO `sys_job_log` VALUES (5875, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 19:40:00');
INSERT INTO `sys_job_log` VALUES (5876, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 19:50:00');
INSERT INTO `sys_job_log` VALUES (5877, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 20:00:00');
INSERT INTO `sys_job_log` VALUES (5878, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 20:10:00');
INSERT INTO `sys_job_log` VALUES (5879, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 20:20:00');
INSERT INTO `sys_job_log` VALUES (5880, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 20:30:00');
INSERT INTO `sys_job_log` VALUES (5881, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 20:40:00');
INSERT INTO `sys_job_log` VALUES (5882, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 20:50:00');
INSERT INTO `sys_job_log` VALUES (5883, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 21:00:00');
INSERT INTO `sys_job_log` VALUES (5884, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 21:10:00');
INSERT INTO `sys_job_log` VALUES (5885, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 21:20:00');
INSERT INTO `sys_job_log` VALUES (5886, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 21:30:00');
INSERT INTO `sys_job_log` VALUES (5887, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 21:40:00');
INSERT INTO `sys_job_log` VALUES (5888, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 21:50:00');
INSERT INTO `sys_job_log` VALUES (5889, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 22:00:00');
INSERT INTO `sys_job_log` VALUES (5890, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 22:10:00');
INSERT INTO `sys_job_log` VALUES (5891, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 22:20:00');
INSERT INTO `sys_job_log` VALUES (5892, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 22:30:00');
INSERT INTO `sys_job_log` VALUES (5893, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 22:40:00');
INSERT INTO `sys_job_log` VALUES (5894, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 22:50:00');
INSERT INTO `sys_job_log` VALUES (5895, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 23:00:00');
INSERT INTO `sys_job_log` VALUES (5896, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 23:10:00');
INSERT INTO `sys_job_log` VALUES (5897, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 23:20:00');
INSERT INTO `sys_job_log` VALUES (5898, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 23:30:00');
INSERT INTO `sys_job_log` VALUES (5899, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 23:40:00');
INSERT INTO `sys_job_log` VALUES (5900, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-04 23:50:00');
INSERT INTO `sys_job_log` VALUES (5901, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 00:00:00');
INSERT INTO `sys_job_log` VALUES (5902, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 00:10:00');
INSERT INTO `sys_job_log` VALUES (5903, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-05 00:20:00');
INSERT INTO `sys_job_log` VALUES (5904, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 00:30:00');
INSERT INTO `sys_job_log` VALUES (5905, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 00:40:00');
INSERT INTO `sys_job_log` VALUES (5906, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 00:50:00');
INSERT INTO `sys_job_log` VALUES (5907, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 01:00:00');
INSERT INTO `sys_job_log` VALUES (5908, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-05 01:10:00');
INSERT INTO `sys_job_log` VALUES (5909, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 01:20:00');
INSERT INTO `sys_job_log` VALUES (5910, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 01:30:00');
INSERT INTO `sys_job_log` VALUES (5911, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 01:40:00');
INSERT INTO `sys_job_log` VALUES (5912, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 01:50:00');
INSERT INTO `sys_job_log` VALUES (5913, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 02:00:00');
INSERT INTO `sys_job_log` VALUES (5914, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 02:10:00');
INSERT INTO `sys_job_log` VALUES (5915, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-05 02:20:00');
INSERT INTO `sys_job_log` VALUES (5916, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 02:30:00');
INSERT INTO `sys_job_log` VALUES (5917, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 02:40:00');
INSERT INTO `sys_job_log` VALUES (5918, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 02:50:00');
INSERT INTO `sys_job_log` VALUES (5919, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-05 03:00:00');
INSERT INTO `sys_job_log` VALUES (5920, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-05 03:10:00');
INSERT INTO `sys_job_log` VALUES (5921, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 03:20:00');
INSERT INTO `sys_job_log` VALUES (5922, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 03:30:00');
INSERT INTO `sys_job_log` VALUES (5923, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 03:40:00');
INSERT INTO `sys_job_log` VALUES (5924, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 03:50:00');
INSERT INTO `sys_job_log` VALUES (5925, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 04:00:00');
INSERT INTO `sys_job_log` VALUES (5926, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-05 04:10:00');
INSERT INTO `sys_job_log` VALUES (5927, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 04:20:00');
INSERT INTO `sys_job_log` VALUES (5928, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 04:30:00');
INSERT INTO `sys_job_log` VALUES (5929, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 04:40:00');
INSERT INTO `sys_job_log` VALUES (5930, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 04:50:00');
INSERT INTO `sys_job_log` VALUES (5931, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 05:00:00');
INSERT INTO `sys_job_log` VALUES (5932, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-05 05:10:00');
INSERT INTO `sys_job_log` VALUES (5933, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-05 05:20:00');
INSERT INTO `sys_job_log` VALUES (5934, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 05:30:00');
INSERT INTO `sys_job_log` VALUES (5935, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-05 05:40:00');
INSERT INTO `sys_job_log` VALUES (5936, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 05:50:00');
INSERT INTO `sys_job_log` VALUES (5937, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 06:00:00');
INSERT INTO `sys_job_log` VALUES (5938, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 06:10:00');
INSERT INTO `sys_job_log` VALUES (5939, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 06:20:00');
INSERT INTO `sys_job_log` VALUES (5940, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 06:30:00');
INSERT INTO `sys_job_log` VALUES (5941, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 06:40:00');
INSERT INTO `sys_job_log` VALUES (5942, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：10毫秒', '200', '', '2023-04-05 06:50:00');
INSERT INTO `sys_job_log` VALUES (5943, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 07:00:00');
INSERT INTO `sys_job_log` VALUES (5944, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 07:10:00');
INSERT INTO `sys_job_log` VALUES (5945, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 07:20:00');
INSERT INTO `sys_job_log` VALUES (5946, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 07:30:00');
INSERT INTO `sys_job_log` VALUES (5947, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 07:40:00');
INSERT INTO `sys_job_log` VALUES (5948, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 07:50:00');
INSERT INTO `sys_job_log` VALUES (5949, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-05 08:00:00');
INSERT INTO `sys_job_log` VALUES (5950, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-05 08:10:00');
INSERT INTO `sys_job_log` VALUES (5951, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 08:20:00');
INSERT INTO `sys_job_log` VALUES (5952, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 08:30:00');
INSERT INTO `sys_job_log` VALUES (5953, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-05 08:40:00');
INSERT INTO `sys_job_log` VALUES (5954, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 08:50:00');
INSERT INTO `sys_job_log` VALUES (5955, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 09:00:00');
INSERT INTO `sys_job_log` VALUES (5956, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 09:10:00');
INSERT INTO `sys_job_log` VALUES (5957, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 09:20:00');
INSERT INTO `sys_job_log` VALUES (5958, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-05 09:30:00');
INSERT INTO `sys_job_log` VALUES (5959, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 09:40:00');
INSERT INTO `sys_job_log` VALUES (5960, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：32毫秒', '200', '', '2023-04-05 09:50:00');
INSERT INTO `sys_job_log` VALUES (5961, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 10:00:00');
INSERT INTO `sys_job_log` VALUES (5962, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 10:10:00');
INSERT INTO `sys_job_log` VALUES (5963, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 10:20:00');
INSERT INTO `sys_job_log` VALUES (5964, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 10:30:00');
INSERT INTO `sys_job_log` VALUES (5965, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 10:40:00');
INSERT INTO `sys_job_log` VALUES (5966, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 10:50:00');
INSERT INTO `sys_job_log` VALUES (5967, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 11:00:00');
INSERT INTO `sys_job_log` VALUES (5968, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 11:10:00');
INSERT INTO `sys_job_log` VALUES (5969, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-05 11:20:00');
INSERT INTO `sys_job_log` VALUES (5970, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 11:30:00');
INSERT INTO `sys_job_log` VALUES (5971, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 11:40:00');
INSERT INTO `sys_job_log` VALUES (5972, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 11:50:00');
INSERT INTO `sys_job_log` VALUES (5973, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 12:00:00');
INSERT INTO `sys_job_log` VALUES (5974, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 12:10:00');
INSERT INTO `sys_job_log` VALUES (5975, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 12:20:00');
INSERT INTO `sys_job_log` VALUES (5976, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 12:30:00');
INSERT INTO `sys_job_log` VALUES (5977, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 12:40:00');
INSERT INTO `sys_job_log` VALUES (5978, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：78毫秒', '200', '', '2023-04-05 12:50:00');
INSERT INTO `sys_job_log` VALUES (5979, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 13:00:00');
INSERT INTO `sys_job_log` VALUES (5980, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 13:10:00');
INSERT INTO `sys_job_log` VALUES (5981, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 13:20:00');
INSERT INTO `sys_job_log` VALUES (5982, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：17毫秒', '200', '', '2023-04-05 13:30:00');
INSERT INTO `sys_job_log` VALUES (5983, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-05 13:40:00');
INSERT INTO `sys_job_log` VALUES (5984, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 13:50:00');
INSERT INTO `sys_job_log` VALUES (5985, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-05 14:00:00');
INSERT INTO `sys_job_log` VALUES (5986, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 14:10:00');
INSERT INTO `sys_job_log` VALUES (5987, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 14:20:00');
INSERT INTO `sys_job_log` VALUES (5988, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 14:30:00');
INSERT INTO `sys_job_log` VALUES (5989, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 14:40:00');
INSERT INTO `sys_job_log` VALUES (5990, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 14:50:00');
INSERT INTO `sys_job_log` VALUES (5991, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 15:00:00');
INSERT INTO `sys_job_log` VALUES (5992, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 15:10:00');
INSERT INTO `sys_job_log` VALUES (5993, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 15:20:00');
INSERT INTO `sys_job_log` VALUES (5994, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 15:30:00');
INSERT INTO `sys_job_log` VALUES (5995, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：78毫秒', '200', '', '2023-04-05 15:50:00');
INSERT INTO `sys_job_log` VALUES (5996, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 16:00:00');
INSERT INTO `sys_job_log` VALUES (5997, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 16:10:00');
INSERT INTO `sys_job_log` VALUES (5998, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 16:20:00');
INSERT INTO `sys_job_log` VALUES (5999, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-05 16:30:00');
INSERT INTO `sys_job_log` VALUES (6000, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 16:40:00');
INSERT INTO `sys_job_log` VALUES (6001, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-05 16:50:00');
INSERT INTO `sys_job_log` VALUES (6002, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：22毫秒', '200', '', '2023-04-05 17:00:00');
INSERT INTO `sys_job_log` VALUES (6003, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 17:10:00');
INSERT INTO `sys_job_log` VALUES (6004, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 17:20:00');
INSERT INTO `sys_job_log` VALUES (6005, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：36毫秒', '200', '', '2023-04-05 17:30:00');
INSERT INTO `sys_job_log` VALUES (6006, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 17:40:00');
INSERT INTO `sys_job_log` VALUES (6007, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：14毫秒', '200', '', '2023-04-05 17:50:00');
INSERT INTO `sys_job_log` VALUES (6008, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 18:00:00');
INSERT INTO `sys_job_log` VALUES (6009, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 18:10:00');
INSERT INTO `sys_job_log` VALUES (6010, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 18:20:00');
INSERT INTO `sys_job_log` VALUES (6011, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 18:30:00');
INSERT INTO `sys_job_log` VALUES (6012, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 18:40:00');
INSERT INTO `sys_job_log` VALUES (6013, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 18:50:00');
INSERT INTO `sys_job_log` VALUES (6014, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 19:00:00');
INSERT INTO `sys_job_log` VALUES (6015, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 19:10:00');
INSERT INTO `sys_job_log` VALUES (6016, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 19:20:00');
INSERT INTO `sys_job_log` VALUES (6017, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 19:30:00');
INSERT INTO `sys_job_log` VALUES (6018, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 19:40:00');
INSERT INTO `sys_job_log` VALUES (6019, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 19:50:00');
INSERT INTO `sys_job_log` VALUES (6020, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 20:00:00');
INSERT INTO `sys_job_log` VALUES (6021, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 20:10:00');
INSERT INTO `sys_job_log` VALUES (6022, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 20:20:00');
INSERT INTO `sys_job_log` VALUES (6023, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 20:30:00');
INSERT INTO `sys_job_log` VALUES (6024, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 20:40:00');
INSERT INTO `sys_job_log` VALUES (6025, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：13毫秒', '200', '', '2023-04-05 20:50:00');
INSERT INTO `sys_job_log` VALUES (6026, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-05 21:00:00');
INSERT INTO `sys_job_log` VALUES (6027, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 21:10:00');
INSERT INTO `sys_job_log` VALUES (6028, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 21:20:00');
INSERT INTO `sys_job_log` VALUES (6029, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 21:30:00');
INSERT INTO `sys_job_log` VALUES (6030, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 21:40:00');
INSERT INTO `sys_job_log` VALUES (6031, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 21:50:00');
INSERT INTO `sys_job_log` VALUES (6032, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 22:00:00');
INSERT INTO `sys_job_log` VALUES (6033, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 22:10:00');
INSERT INTO `sys_job_log` VALUES (6034, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 22:20:00');
INSERT INTO `sys_job_log` VALUES (6035, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 22:30:00');
INSERT INTO `sys_job_log` VALUES (6036, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 22:40:00');
INSERT INTO `sys_job_log` VALUES (6037, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 22:50:00');
INSERT INTO `sys_job_log` VALUES (6038, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 23:00:00');
INSERT INTO `sys_job_log` VALUES (6039, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 23:10:00');
INSERT INTO `sys_job_log` VALUES (6040, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 23:20:00');
INSERT INTO `sys_job_log` VALUES (6041, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-05 23:30:00');
INSERT INTO `sys_job_log` VALUES (6042, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 23:40:00');
INSERT INTO `sys_job_log` VALUES (6043, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-05 23:50:00');
INSERT INTO `sys_job_log` VALUES (6044, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 00:00:00');
INSERT INTO `sys_job_log` VALUES (6045, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 00:10:00');
INSERT INTO `sys_job_log` VALUES (6046, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 00:20:00');
INSERT INTO `sys_job_log` VALUES (6047, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 00:30:00');
INSERT INTO `sys_job_log` VALUES (6048, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 00:40:00');
INSERT INTO `sys_job_log` VALUES (6049, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 00:50:00');
INSERT INTO `sys_job_log` VALUES (6050, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 01:00:00');
INSERT INTO `sys_job_log` VALUES (6051, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 01:10:00');
INSERT INTO `sys_job_log` VALUES (6052, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 01:20:00');
INSERT INTO `sys_job_log` VALUES (6053, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 01:30:00');
INSERT INTO `sys_job_log` VALUES (6054, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 01:40:00');
INSERT INTO `sys_job_log` VALUES (6055, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 01:50:00');
INSERT INTO `sys_job_log` VALUES (6056, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 02:00:00');
INSERT INTO `sys_job_log` VALUES (6057, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 02:10:00');
INSERT INTO `sys_job_log` VALUES (6058, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 02:20:00');
INSERT INTO `sys_job_log` VALUES (6059, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-06 02:30:00');
INSERT INTO `sys_job_log` VALUES (6060, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 02:40:00');
INSERT INTO `sys_job_log` VALUES (6061, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 02:50:00');
INSERT INTO `sys_job_log` VALUES (6062, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 03:00:00');
INSERT INTO `sys_job_log` VALUES (6063, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 03:10:00');
INSERT INTO `sys_job_log` VALUES (6064, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 03:20:00');
INSERT INTO `sys_job_log` VALUES (6065, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 03:30:00');
INSERT INTO `sys_job_log` VALUES (6066, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 03:40:00');
INSERT INTO `sys_job_log` VALUES (6067, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 03:50:00');
INSERT INTO `sys_job_log` VALUES (6068, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-06 04:00:00');
INSERT INTO `sys_job_log` VALUES (6069, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 04:10:00');
INSERT INTO `sys_job_log` VALUES (6070, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 04:20:00');
INSERT INTO `sys_job_log` VALUES (6071, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 04:30:00');
INSERT INTO `sys_job_log` VALUES (6072, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 04:40:00');
INSERT INTO `sys_job_log` VALUES (6073, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 04:50:00');
INSERT INTO `sys_job_log` VALUES (6074, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-06 05:00:00');
INSERT INTO `sys_job_log` VALUES (6075, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 05:10:00');
INSERT INTO `sys_job_log` VALUES (6076, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 05:20:00');
INSERT INTO `sys_job_log` VALUES (6077, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 05:30:00');
INSERT INTO `sys_job_log` VALUES (6078, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 05:40:00');
INSERT INTO `sys_job_log` VALUES (6079, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 05:50:00');
INSERT INTO `sys_job_log` VALUES (6080, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 06:00:00');
INSERT INTO `sys_job_log` VALUES (6081, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 06:10:00');
INSERT INTO `sys_job_log` VALUES (6082, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 06:20:00');
INSERT INTO `sys_job_log` VALUES (6083, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 06:30:00');
INSERT INTO `sys_job_log` VALUES (6084, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-06 06:40:00');
INSERT INTO `sys_job_log` VALUES (6085, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 06:50:00');
INSERT INTO `sys_job_log` VALUES (6086, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 07:00:00');
INSERT INTO `sys_job_log` VALUES (6087, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 07:10:00');
INSERT INTO `sys_job_log` VALUES (6088, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 07:20:00');
INSERT INTO `sys_job_log` VALUES (6089, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 07:30:00');
INSERT INTO `sys_job_log` VALUES (6090, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-06 07:40:00');
INSERT INTO `sys_job_log` VALUES (6091, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 07:50:00');
INSERT INTO `sys_job_log` VALUES (6092, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 08:00:00');
INSERT INTO `sys_job_log` VALUES (6093, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 08:10:00');
INSERT INTO `sys_job_log` VALUES (6094, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 08:20:00');
INSERT INTO `sys_job_log` VALUES (6095, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 08:30:00');
INSERT INTO `sys_job_log` VALUES (6096, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 08:40:00');
INSERT INTO `sys_job_log` VALUES (6097, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 08:50:00');
INSERT INTO `sys_job_log` VALUES (6098, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 09:00:00');
INSERT INTO `sys_job_log` VALUES (6099, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 09:10:00');
INSERT INTO `sys_job_log` VALUES (6100, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 09:20:00');
INSERT INTO `sys_job_log` VALUES (6101, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 09:30:00');
INSERT INTO `sys_job_log` VALUES (6102, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 09:40:00');
INSERT INTO `sys_job_log` VALUES (6103, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 09:50:00');
INSERT INTO `sys_job_log` VALUES (6104, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 10:00:00');
INSERT INTO `sys_job_log` VALUES (6105, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 10:10:00');
INSERT INTO `sys_job_log` VALUES (6106, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 10:20:00');
INSERT INTO `sys_job_log` VALUES (6107, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 10:30:00');
INSERT INTO `sys_job_log` VALUES (6108, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：34毫秒', '200', '', '2023-04-06 10:40:00');
INSERT INTO `sys_job_log` VALUES (6109, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 10:50:00');
INSERT INTO `sys_job_log` VALUES (6110, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 11:00:00');
INSERT INTO `sys_job_log` VALUES (6111, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-06 11:10:00');
INSERT INTO `sys_job_log` VALUES (6112, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 11:20:00');
INSERT INTO `sys_job_log` VALUES (6113, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 11:30:00');
INSERT INTO `sys_job_log` VALUES (6114, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：32毫秒', '200', '', '2023-04-06 11:40:00');
INSERT INTO `sys_job_log` VALUES (6115, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 11:50:00');
INSERT INTO `sys_job_log` VALUES (6116, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 12:00:00');
INSERT INTO `sys_job_log` VALUES (6117, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 12:10:00');
INSERT INTO `sys_job_log` VALUES (6118, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 12:20:00');
INSERT INTO `sys_job_log` VALUES (6119, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 12:30:00');
INSERT INTO `sys_job_log` VALUES (6120, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 12:40:00');
INSERT INTO `sys_job_log` VALUES (6121, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：8毫秒', '200', '', '2023-04-06 12:50:00');
INSERT INTO `sys_job_log` VALUES (6122, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 13:00:00');
INSERT INTO `sys_job_log` VALUES (6123, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 13:10:00');
INSERT INTO `sys_job_log` VALUES (6124, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 13:20:00');
INSERT INTO `sys_job_log` VALUES (6125, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 13:30:00');
INSERT INTO `sys_job_log` VALUES (6126, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 13:40:00');
INSERT INTO `sys_job_log` VALUES (6127, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 13:50:00');
INSERT INTO `sys_job_log` VALUES (6128, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 14:00:00');
INSERT INTO `sys_job_log` VALUES (6129, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 14:10:00');
INSERT INTO `sys_job_log` VALUES (6130, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 14:20:00');
INSERT INTO `sys_job_log` VALUES (6131, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 14:30:00');
INSERT INTO `sys_job_log` VALUES (6132, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 14:40:00');
INSERT INTO `sys_job_log` VALUES (6133, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 14:50:00');
INSERT INTO `sys_job_log` VALUES (6134, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-06 15:00:00');
INSERT INTO `sys_job_log` VALUES (6135, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 15:10:00');
INSERT INTO `sys_job_log` VALUES (6136, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-06 15:20:00');
INSERT INTO `sys_job_log` VALUES (6137, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 15:30:00');
INSERT INTO `sys_job_log` VALUES (6138, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 15:40:00');
INSERT INTO `sys_job_log` VALUES (6139, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 15:50:00');
INSERT INTO `sys_job_log` VALUES (6140, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 16:00:00');
INSERT INTO `sys_job_log` VALUES (6141, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 16:10:00');
INSERT INTO `sys_job_log` VALUES (6142, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 16:20:00');
INSERT INTO `sys_job_log` VALUES (6143, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 16:30:00');
INSERT INTO `sys_job_log` VALUES (6144, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 16:40:00');
INSERT INTO `sys_job_log` VALUES (6145, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：11毫秒', '200', '', '2023-04-06 16:50:00');
INSERT INTO `sys_job_log` VALUES (6146, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 17:00:00');
INSERT INTO `sys_job_log` VALUES (6147, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 17:10:00');
INSERT INTO `sys_job_log` VALUES (6148, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 17:20:00');
INSERT INTO `sys_job_log` VALUES (6149, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-06 17:30:00');
INSERT INTO `sys_job_log` VALUES (6150, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 17:40:00');
INSERT INTO `sys_job_log` VALUES (6151, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 17:50:00');
INSERT INTO `sys_job_log` VALUES (6152, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 18:00:00');
INSERT INTO `sys_job_log` VALUES (6153, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 18:10:00');
INSERT INTO `sys_job_log` VALUES (6154, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-06 18:20:00');
INSERT INTO `sys_job_log` VALUES (6155, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：23毫秒', '200', '', '2023-04-06 18:30:00');
INSERT INTO `sys_job_log` VALUES (6156, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 18:40:00');
INSERT INTO `sys_job_log` VALUES (6157, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 18:50:00');
INSERT INTO `sys_job_log` VALUES (6158, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 19:00:00');
INSERT INTO `sys_job_log` VALUES (6159, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-06 19:10:00');
INSERT INTO `sys_job_log` VALUES (6160, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 19:20:00');
INSERT INTO `sys_job_log` VALUES (6161, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 19:30:00');
INSERT INTO `sys_job_log` VALUES (6162, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 19:40:00');
INSERT INTO `sys_job_log` VALUES (6163, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 19:50:00');
INSERT INTO `sys_job_log` VALUES (6164, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-06 20:00:00');
INSERT INTO `sys_job_log` VALUES (6165, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 20:10:00');
INSERT INTO `sys_job_log` VALUES (6166, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 20:20:00');
INSERT INTO `sys_job_log` VALUES (6167, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 20:30:00');
INSERT INTO `sys_job_log` VALUES (6168, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 20:40:00');
INSERT INTO `sys_job_log` VALUES (6169, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 20:50:00');
INSERT INTO `sys_job_log` VALUES (6170, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 21:00:00');
INSERT INTO `sys_job_log` VALUES (6171, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 21:10:00');
INSERT INTO `sys_job_log` VALUES (6172, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 21:20:00');
INSERT INTO `sys_job_log` VALUES (6173, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 21:30:00');
INSERT INTO `sys_job_log` VALUES (6174, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 21:40:00');
INSERT INTO `sys_job_log` VALUES (6175, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：6毫秒', '200', '', '2023-04-06 21:50:00');
INSERT INTO `sys_job_log` VALUES (6176, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 22:00:00');
INSERT INTO `sys_job_log` VALUES (6177, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 22:10:00');
INSERT INTO `sys_job_log` VALUES (6178, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-06 22:20:00');
INSERT INTO `sys_job_log` VALUES (6179, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 22:30:00');
INSERT INTO `sys_job_log` VALUES (6180, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 22:40:00');
INSERT INTO `sys_job_log` VALUES (6181, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：20毫秒', '200', '', '2023-04-06 22:50:00');
INSERT INTO `sys_job_log` VALUES (6182, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：16毫秒', '200', '', '2023-04-06 23:00:00');
INSERT INTO `sys_job_log` VALUES (6183, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 23:10:00');
INSERT INTO `sys_job_log` VALUES (6184, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 23:20:00');
INSERT INTO `sys_job_log` VALUES (6185, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 23:30:00');
INSERT INTO `sys_job_log` VALUES (6186, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 23:40:00');
INSERT INTO `sys_job_log` VALUES (6187, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-06 23:50:00');
INSERT INTO `sys_job_log` VALUES (6188, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：9毫秒', '200', '', '2023-04-07 00:00:00');
INSERT INTO `sys_job_log` VALUES (6189, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 00:10:00');
INSERT INTO `sys_job_log` VALUES (6190, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 00:20:00');
INSERT INTO `sys_job_log` VALUES (6191, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 00:30:00');
INSERT INTO `sys_job_log` VALUES (6192, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 00:40:00');
INSERT INTO `sys_job_log` VALUES (6193, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 00:50:00');
INSERT INTO `sys_job_log` VALUES (6194, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 01:00:00');
INSERT INTO `sys_job_log` VALUES (6195, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 01:10:00');
INSERT INTO `sys_job_log` VALUES (6196, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-07 01:20:00');
INSERT INTO `sys_job_log` VALUES (6197, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 01:30:00');
INSERT INTO `sys_job_log` VALUES (6198, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 01:40:00');
INSERT INTO `sys_job_log` VALUES (6199, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 01:50:00');
INSERT INTO `sys_job_log` VALUES (6200, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 02:00:00');
INSERT INTO `sys_job_log` VALUES (6201, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 02:10:00');
INSERT INTO `sys_job_log` VALUES (6202, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 02:20:00');
INSERT INTO `sys_job_log` VALUES (6203, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 02:30:00');
INSERT INTO `sys_job_log` VALUES (6204, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 02:40:00');
INSERT INTO `sys_job_log` VALUES (6205, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 02:50:00');
INSERT INTO `sys_job_log` VALUES (6206, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-07 03:00:00');
INSERT INTO `sys_job_log` VALUES (6207, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 03:10:00');
INSERT INTO `sys_job_log` VALUES (6208, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 03:20:00');
INSERT INTO `sys_job_log` VALUES (6209, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：6毫秒', '200', '', '2023-04-07 03:30:00');
INSERT INTO `sys_job_log` VALUES (6210, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 03:40:00');
INSERT INTO `sys_job_log` VALUES (6211, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 03:50:00');
INSERT INTO `sys_job_log` VALUES (6212, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 04:00:00');
INSERT INTO `sys_job_log` VALUES (6213, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 04:10:00');
INSERT INTO `sys_job_log` VALUES (6214, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 04:20:00');
INSERT INTO `sys_job_log` VALUES (6215, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 04:30:00');
INSERT INTO `sys_job_log` VALUES (6216, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 04:40:00');
INSERT INTO `sys_job_log` VALUES (6217, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 04:50:00');
INSERT INTO `sys_job_log` VALUES (6218, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 05:00:00');
INSERT INTO `sys_job_log` VALUES (6219, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 05:10:00');
INSERT INTO `sys_job_log` VALUES (6220, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 05:20:00');
INSERT INTO `sys_job_log` VALUES (6221, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 05:30:00');
INSERT INTO `sys_job_log` VALUES (6222, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-07 05:40:00');
INSERT INTO `sys_job_log` VALUES (6223, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 05:50:00');
INSERT INTO `sys_job_log` VALUES (6224, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 06:00:00');
INSERT INTO `sys_job_log` VALUES (6225, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 06:10:00');
INSERT INTO `sys_job_log` VALUES (6226, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 06:20:00');
INSERT INTO `sys_job_log` VALUES (6227, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-07 06:30:00');
INSERT INTO `sys_job_log` VALUES (6228, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 06:40:00');
INSERT INTO `sys_job_log` VALUES (6229, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 06:50:00');
INSERT INTO `sys_job_log` VALUES (6230, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-07 07:00:00');
INSERT INTO `sys_job_log` VALUES (6231, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-07 07:10:00');
INSERT INTO `sys_job_log` VALUES (6232, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 07:20:00');
INSERT INTO `sys_job_log` VALUES (6233, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 07:30:00');
INSERT INTO `sys_job_log` VALUES (6234, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 07:40:00');
INSERT INTO `sys_job_log` VALUES (6235, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 07:50:00');
INSERT INTO `sys_job_log` VALUES (6236, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 08:00:00');
INSERT INTO `sys_job_log` VALUES (6237, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 08:10:00');
INSERT INTO `sys_job_log` VALUES (6238, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 08:20:00');
INSERT INTO `sys_job_log` VALUES (6239, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 08:30:00');
INSERT INTO `sys_job_log` VALUES (6240, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 08:40:00');
INSERT INTO `sys_job_log` VALUES (6241, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 08:50:00');
INSERT INTO `sys_job_log` VALUES (6242, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-07 09:00:00');
INSERT INTO `sys_job_log` VALUES (6243, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 09:10:00');
INSERT INTO `sys_job_log` VALUES (6244, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 09:20:00');
INSERT INTO `sys_job_log` VALUES (6245, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 09:30:00');
INSERT INTO `sys_job_log` VALUES (6246, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-07 09:40:00');
INSERT INTO `sys_job_log` VALUES (6247, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-07 09:50:00');
INSERT INTO `sys_job_log` VALUES (6248, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 10:00:00');
INSERT INTO `sys_job_log` VALUES (6249, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 10:10:00');
INSERT INTO `sys_job_log` VALUES (6250, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 10:20:00');
INSERT INTO `sys_job_log` VALUES (6251, '每月1号2:00生成月结账单任务', 'DEFAULT', 'myTask.createYueJieOrder', '每月1号2:00生成月结账单任务 总共耗时：19毫秒', '200', '', '2023-04-07 10:21:03');
INSERT INTO `sys_job_log` VALUES (6252, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 10:30:00');
INSERT INTO `sys_job_log` VALUES (6253, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 10:40:00');
INSERT INTO `sys_job_log` VALUES (6254, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 10:50:00');
INSERT INTO `sys_job_log` VALUES (6255, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 11:00:00');
INSERT INTO `sys_job_log` VALUES (6256, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 11:10:00');
INSERT INTO `sys_job_log` VALUES (6257, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 11:20:00');
INSERT INTO `sys_job_log` VALUES (6258, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 11:30:00');
INSERT INTO `sys_job_log` VALUES (6259, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 11:40:00');
INSERT INTO `sys_job_log` VALUES (6260, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 11:50:00');
INSERT INTO `sys_job_log` VALUES (6261, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 12:00:00');
INSERT INTO `sys_job_log` VALUES (6262, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-07 12:10:00');
INSERT INTO `sys_job_log` VALUES (6263, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 12:20:00');
INSERT INTO `sys_job_log` VALUES (6264, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 12:30:00');
INSERT INTO `sys_job_log` VALUES (6265, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-07 12:40:00');
INSERT INTO `sys_job_log` VALUES (6266, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-07 12:50:00');
INSERT INTO `sys_job_log` VALUES (6267, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 13:00:00');
INSERT INTO `sys_job_log` VALUES (6268, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 13:10:00');
INSERT INTO `sys_job_log` VALUES (6269, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 13:20:00');
INSERT INTO `sys_job_log` VALUES (6270, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 13:30:00');
INSERT INTO `sys_job_log` VALUES (6271, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 13:40:00');
INSERT INTO `sys_job_log` VALUES (6272, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 13:50:00');
INSERT INTO `sys_job_log` VALUES (6273, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 14:00:00');
INSERT INTO `sys_job_log` VALUES (6274, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 14:10:00');
INSERT INTO `sys_job_log` VALUES (6275, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-07 14:20:00');
INSERT INTO `sys_job_log` VALUES (6276, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 14:30:00');
INSERT INTO `sys_job_log` VALUES (6277, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 14:40:00');
INSERT INTO `sys_job_log` VALUES (6278, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 14:50:00');
INSERT INTO `sys_job_log` VALUES (6279, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 15:00:00');
INSERT INTO `sys_job_log` VALUES (6280, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 15:10:00');
INSERT INTO `sys_job_log` VALUES (6281, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 15:20:00');
INSERT INTO `sys_job_log` VALUES (6282, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 15:30:00');
INSERT INTO `sys_job_log` VALUES (6283, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 15:40:00');
INSERT INTO `sys_job_log` VALUES (6284, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-07 15:50:00');
INSERT INTO `sys_job_log` VALUES (6285, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 16:00:00');
INSERT INTO `sys_job_log` VALUES (6286, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 16:10:00');
INSERT INTO `sys_job_log` VALUES (6287, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 16:20:00');
INSERT INTO `sys_job_log` VALUES (6288, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 16:30:00');
INSERT INTO `sys_job_log` VALUES (6289, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 16:40:00');
INSERT INTO `sys_job_log` VALUES (6290, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 16:50:00');
INSERT INTO `sys_job_log` VALUES (6291, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 17:00:00');
INSERT INTO `sys_job_log` VALUES (6292, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 17:10:00');
INSERT INTO `sys_job_log` VALUES (6293, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 17:20:00');
INSERT INTO `sys_job_log` VALUES (6294, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 17:30:00');
INSERT INTO `sys_job_log` VALUES (6295, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 17:40:00');
INSERT INTO `sys_job_log` VALUES (6296, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 17:50:00');
INSERT INTO `sys_job_log` VALUES (6297, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-07 18:00:00');
INSERT INTO `sys_job_log` VALUES (6298, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 18:10:00');
INSERT INTO `sys_job_log` VALUES (6299, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 18:20:00');
INSERT INTO `sys_job_log` VALUES (6300, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 18:30:00');
INSERT INTO `sys_job_log` VALUES (6301, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 18:40:00');
INSERT INTO `sys_job_log` VALUES (6302, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 18:50:00');
INSERT INTO `sys_job_log` VALUES (6303, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 19:00:00');
INSERT INTO `sys_job_log` VALUES (6304, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-07 19:10:00');
INSERT INTO `sys_job_log` VALUES (6305, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 19:20:00');
INSERT INTO `sys_job_log` VALUES (6306, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 19:30:00');
INSERT INTO `sys_job_log` VALUES (6307, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 19:40:00');
INSERT INTO `sys_job_log` VALUES (6308, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 19:50:00');
INSERT INTO `sys_job_log` VALUES (6309, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-07 20:00:00');
INSERT INTO `sys_job_log` VALUES (6310, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-07 20:10:00');
INSERT INTO `sys_job_log` VALUES (6311, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 20:20:00');
INSERT INTO `sys_job_log` VALUES (6312, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-07 20:30:00');
INSERT INTO `sys_job_log` VALUES (6313, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 20:40:00');
INSERT INTO `sys_job_log` VALUES (6314, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 20:50:00');
INSERT INTO `sys_job_log` VALUES (6315, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 21:00:00');
INSERT INTO `sys_job_log` VALUES (6316, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 21:10:00');
INSERT INTO `sys_job_log` VALUES (6317, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 21:20:00');
INSERT INTO `sys_job_log` VALUES (6318, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 21:30:00');
INSERT INTO `sys_job_log` VALUES (6319, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 21:40:00');
INSERT INTO `sys_job_log` VALUES (6320, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 21:50:00');
INSERT INTO `sys_job_log` VALUES (6321, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 22:00:00');
INSERT INTO `sys_job_log` VALUES (6322, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 22:10:00');
INSERT INTO `sys_job_log` VALUES (6323, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 22:20:00');
INSERT INTO `sys_job_log` VALUES (6324, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 22:30:00');
INSERT INTO `sys_job_log` VALUES (6325, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 22:40:00');
INSERT INTO `sys_job_log` VALUES (6326, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-07 22:50:00');
INSERT INTO `sys_job_log` VALUES (6327, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 23:00:00');
INSERT INTO `sys_job_log` VALUES (6328, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-07 23:10:00');
INSERT INTO `sys_job_log` VALUES (6329, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 23:20:00');
INSERT INTO `sys_job_log` VALUES (6330, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 23:30:00');
INSERT INTO `sys_job_log` VALUES (6331, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：18毫秒', '200', '', '2023-04-07 23:40:00');
INSERT INTO `sys_job_log` VALUES (6332, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-07 23:50:00');
INSERT INTO `sys_job_log` VALUES (6333, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 00:00:00');
INSERT INTO `sys_job_log` VALUES (6334, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 00:10:00');
INSERT INTO `sys_job_log` VALUES (6335, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 00:20:00');
INSERT INTO `sys_job_log` VALUES (6336, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 00:30:00');
INSERT INTO `sys_job_log` VALUES (6337, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：7毫秒', '200', '', '2023-04-08 00:40:00');
INSERT INTO `sys_job_log` VALUES (6338, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 00:50:00');
INSERT INTO `sys_job_log` VALUES (6339, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 01:00:00');
INSERT INTO `sys_job_log` VALUES (6340, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 01:10:00');
INSERT INTO `sys_job_log` VALUES (6341, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 01:20:00');
INSERT INTO `sys_job_log` VALUES (6342, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-08 01:30:00');
INSERT INTO `sys_job_log` VALUES (6343, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 01:40:00');
INSERT INTO `sys_job_log` VALUES (6344, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 01:50:00');
INSERT INTO `sys_job_log` VALUES (6345, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 02:00:00');
INSERT INTO `sys_job_log` VALUES (6346, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-08 02:10:00');
INSERT INTO `sys_job_log` VALUES (6347, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 02:20:00');
INSERT INTO `sys_job_log` VALUES (6348, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 02:30:00');
INSERT INTO `sys_job_log` VALUES (6349, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 02:40:00');
INSERT INTO `sys_job_log` VALUES (6350, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 02:50:00');
INSERT INTO `sys_job_log` VALUES (6351, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 03:00:00');
INSERT INTO `sys_job_log` VALUES (6352, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 03:10:00');
INSERT INTO `sys_job_log` VALUES (6353, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 03:20:00');
INSERT INTO `sys_job_log` VALUES (6354, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 03:30:00');
INSERT INTO `sys_job_log` VALUES (6355, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 03:40:00');
INSERT INTO `sys_job_log` VALUES (6356, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 03:50:00');
INSERT INTO `sys_job_log` VALUES (6357, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-08 04:00:00');
INSERT INTO `sys_job_log` VALUES (6358, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 04:10:00');
INSERT INTO `sys_job_log` VALUES (6359, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 04:20:00');
INSERT INTO `sys_job_log` VALUES (6360, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 04:30:00');
INSERT INTO `sys_job_log` VALUES (6361, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 04:40:00');
INSERT INTO `sys_job_log` VALUES (6362, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 04:50:00');
INSERT INTO `sys_job_log` VALUES (6363, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 05:00:00');
INSERT INTO `sys_job_log` VALUES (6364, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 05:10:00');
INSERT INTO `sys_job_log` VALUES (6365, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 05:20:00');
INSERT INTO `sys_job_log` VALUES (6366, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 05:30:00');
INSERT INTO `sys_job_log` VALUES (6367, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 05:40:00');
INSERT INTO `sys_job_log` VALUES (6368, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 05:50:00');
INSERT INTO `sys_job_log` VALUES (6369, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 06:00:00');
INSERT INTO `sys_job_log` VALUES (6370, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 06:10:00');
INSERT INTO `sys_job_log` VALUES (6371, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 06:20:00');
INSERT INTO `sys_job_log` VALUES (6372, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 06:30:00');
INSERT INTO `sys_job_log` VALUES (6373, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 06:40:00');
INSERT INTO `sys_job_log` VALUES (6374, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 06:50:00');
INSERT INTO `sys_job_log` VALUES (6375, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-08 07:00:00');
INSERT INTO `sys_job_log` VALUES (6376, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-08 07:10:00');
INSERT INTO `sys_job_log` VALUES (6377, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 07:20:00');
INSERT INTO `sys_job_log` VALUES (6378, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 07:30:00');
INSERT INTO `sys_job_log` VALUES (6379, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 07:40:00');
INSERT INTO `sys_job_log` VALUES (6380, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 07:50:00');
INSERT INTO `sys_job_log` VALUES (6381, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 08:00:00');
INSERT INTO `sys_job_log` VALUES (6382, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 08:10:00');
INSERT INTO `sys_job_log` VALUES (6383, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 08:20:00');
INSERT INTO `sys_job_log` VALUES (6384, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 08:30:00');
INSERT INTO `sys_job_log` VALUES (6385, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 08:40:00');
INSERT INTO `sys_job_log` VALUES (6386, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-08 08:50:00');
INSERT INTO `sys_job_log` VALUES (6387, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 09:00:00');
INSERT INTO `sys_job_log` VALUES (6388, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 09:10:00');
INSERT INTO `sys_job_log` VALUES (6389, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 09:20:00');
INSERT INTO `sys_job_log` VALUES (6390, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 09:30:00');
INSERT INTO `sys_job_log` VALUES (6391, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 09:40:00');
INSERT INTO `sys_job_log` VALUES (6392, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 09:50:00');
INSERT INTO `sys_job_log` VALUES (6393, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-08 10:00:00');
INSERT INTO `sys_job_log` VALUES (6394, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-08 10:10:00');
INSERT INTO `sys_job_log` VALUES (6395, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 10:20:00');
INSERT INTO `sys_job_log` VALUES (6396, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 10:30:00');
INSERT INTO `sys_job_log` VALUES (6397, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 10:40:00');
INSERT INTO `sys_job_log` VALUES (6398, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 10:50:00');
INSERT INTO `sys_job_log` VALUES (6399, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 11:00:00');
INSERT INTO `sys_job_log` VALUES (6400, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 11:10:00');
INSERT INTO `sys_job_log` VALUES (6401, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 11:20:00');
INSERT INTO `sys_job_log` VALUES (6402, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 11:30:00');
INSERT INTO `sys_job_log` VALUES (6403, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 11:40:00');
INSERT INTO `sys_job_log` VALUES (6404, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 11:50:00');
INSERT INTO `sys_job_log` VALUES (6405, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 12:00:00');
INSERT INTO `sys_job_log` VALUES (6406, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-08 12:10:00');
INSERT INTO `sys_job_log` VALUES (6407, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 12:20:00');
INSERT INTO `sys_job_log` VALUES (6408, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 12:30:00');
INSERT INTO `sys_job_log` VALUES (6409, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 12:40:00');
INSERT INTO `sys_job_log` VALUES (6410, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 12:50:00');
INSERT INTO `sys_job_log` VALUES (6411, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 13:00:00');
INSERT INTO `sys_job_log` VALUES (6412, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 13:10:00');
INSERT INTO `sys_job_log` VALUES (6413, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 13:20:00');
INSERT INTO `sys_job_log` VALUES (6414, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 13:30:00');
INSERT INTO `sys_job_log` VALUES (6415, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：8毫秒', '200', '', '2023-04-08 13:40:00');
INSERT INTO `sys_job_log` VALUES (6416, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 13:50:00');
INSERT INTO `sys_job_log` VALUES (6417, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 14:00:00');
INSERT INTO `sys_job_log` VALUES (6418, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 14:10:00');
INSERT INTO `sys_job_log` VALUES (6419, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 14:20:00');
INSERT INTO `sys_job_log` VALUES (6420, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 14:30:00');
INSERT INTO `sys_job_log` VALUES (6421, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 14:40:00');
INSERT INTO `sys_job_log` VALUES (6422, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 14:50:00');
INSERT INTO `sys_job_log` VALUES (6423, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 15:00:00');
INSERT INTO `sys_job_log` VALUES (6424, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 15:10:00');
INSERT INTO `sys_job_log` VALUES (6425, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 15:20:00');
INSERT INTO `sys_job_log` VALUES (6426, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 15:30:00');
INSERT INTO `sys_job_log` VALUES (6427, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 15:40:00');
INSERT INTO `sys_job_log` VALUES (6428, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 15:50:00');
INSERT INTO `sys_job_log` VALUES (6429, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 16:00:00');
INSERT INTO `sys_job_log` VALUES (6430, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-08 16:10:00');
INSERT INTO `sys_job_log` VALUES (6431, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 16:20:00');
INSERT INTO `sys_job_log` VALUES (6432, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 16:30:00');
INSERT INTO `sys_job_log` VALUES (6433, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 16:40:00');
INSERT INTO `sys_job_log` VALUES (6434, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：31毫秒', '200', '', '2023-04-08 16:50:00');
INSERT INTO `sys_job_log` VALUES (6435, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 17:00:00');
INSERT INTO `sys_job_log` VALUES (6436, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 17:10:00');
INSERT INTO `sys_job_log` VALUES (6437, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-08 17:20:00');
INSERT INTO `sys_job_log` VALUES (6438, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 17:30:00');
INSERT INTO `sys_job_log` VALUES (6439, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 17:40:00');
INSERT INTO `sys_job_log` VALUES (6440, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 17:50:00');
INSERT INTO `sys_job_log` VALUES (6441, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 18:00:00');
INSERT INTO `sys_job_log` VALUES (6442, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 18:10:00');
INSERT INTO `sys_job_log` VALUES (6443, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-08 18:20:00');
INSERT INTO `sys_job_log` VALUES (6444, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 18:30:00');
INSERT INTO `sys_job_log` VALUES (6445, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 18:40:00');
INSERT INTO `sys_job_log` VALUES (6446, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 18:50:00');
INSERT INTO `sys_job_log` VALUES (6447, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 19:00:00');
INSERT INTO `sys_job_log` VALUES (6448, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-08 19:10:00');
INSERT INTO `sys_job_log` VALUES (6449, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 19:20:00');
INSERT INTO `sys_job_log` VALUES (6450, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 19:30:00');
INSERT INTO `sys_job_log` VALUES (6451, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 19:40:00');
INSERT INTO `sys_job_log` VALUES (6452, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 19:50:00');
INSERT INTO `sys_job_log` VALUES (6453, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 20:00:00');
INSERT INTO `sys_job_log` VALUES (6454, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 20:10:00');
INSERT INTO `sys_job_log` VALUES (6455, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 20:20:00');
INSERT INTO `sys_job_log` VALUES (6456, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 20:30:00');
INSERT INTO `sys_job_log` VALUES (6457, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 20:40:00');
INSERT INTO `sys_job_log` VALUES (6458, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 20:50:00');
INSERT INTO `sys_job_log` VALUES (6459, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 21:00:00');
INSERT INTO `sys_job_log` VALUES (6460, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 21:10:00');
INSERT INTO `sys_job_log` VALUES (6461, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-08 21:20:00');
INSERT INTO `sys_job_log` VALUES (6462, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 21:30:00');
INSERT INTO `sys_job_log` VALUES (6463, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 21:40:00');
INSERT INTO `sys_job_log` VALUES (6464, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：15毫秒', '200', '', '2023-04-08 21:50:00');
INSERT INTO `sys_job_log` VALUES (6465, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 22:00:00');
INSERT INTO `sys_job_log` VALUES (6466, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 22:10:00');
INSERT INTO `sys_job_log` VALUES (6467, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 22:20:00');
INSERT INTO `sys_job_log` VALUES (6468, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 22:30:00');
INSERT INTO `sys_job_log` VALUES (6469, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 22:40:00');
INSERT INTO `sys_job_log` VALUES (6470, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 22:50:00');
INSERT INTO `sys_job_log` VALUES (6471, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 23:00:00');
INSERT INTO `sys_job_log` VALUES (6472, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 23:10:00');
INSERT INTO `sys_job_log` VALUES (6473, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：16毫秒', '200', '', '2023-04-08 23:20:00');
INSERT INTO `sys_job_log` VALUES (6474, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 23:30:00');
INSERT INTO `sys_job_log` VALUES (6475, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 23:40:00');
INSERT INTO `sys_job_log` VALUES (6476, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-08 23:50:00');
INSERT INTO `sys_job_log` VALUES (6477, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 00:00:00');
INSERT INTO `sys_job_log` VALUES (6478, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 00:10:00');
INSERT INTO `sys_job_log` VALUES (6479, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-09 00:20:00');
INSERT INTO `sys_job_log` VALUES (6480, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 00:30:00');
INSERT INTO `sys_job_log` VALUES (6481, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 00:40:00');
INSERT INTO `sys_job_log` VALUES (6482, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 00:50:00');
INSERT INTO `sys_job_log` VALUES (6483, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 01:00:00');
INSERT INTO `sys_job_log` VALUES (6484, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 01:10:00');
INSERT INTO `sys_job_log` VALUES (6485, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 01:20:00');
INSERT INTO `sys_job_log` VALUES (6486, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 01:30:00');
INSERT INTO `sys_job_log` VALUES (6487, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 01:40:00');
INSERT INTO `sys_job_log` VALUES (6488, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 01:50:00');
INSERT INTO `sys_job_log` VALUES (6489, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 02:00:00');
INSERT INTO `sys_job_log` VALUES (6490, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 02:10:00');
INSERT INTO `sys_job_log` VALUES (6491, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 02:20:00');
INSERT INTO `sys_job_log` VALUES (6492, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 02:30:00');
INSERT INTO `sys_job_log` VALUES (6493, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 02:40:00');
INSERT INTO `sys_job_log` VALUES (6494, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 02:50:00');
INSERT INTO `sys_job_log` VALUES (6495, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 03:00:00');
INSERT INTO `sys_job_log` VALUES (6496, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 03:10:00');
INSERT INTO `sys_job_log` VALUES (6497, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 03:20:00');
INSERT INTO `sys_job_log` VALUES (6498, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 03:30:00');
INSERT INTO `sys_job_log` VALUES (6499, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：9毫秒', '200', '', '2023-04-09 03:40:00');
INSERT INTO `sys_job_log` VALUES (6500, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 03:50:00');
INSERT INTO `sys_job_log` VALUES (6501, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 04:00:00');
INSERT INTO `sys_job_log` VALUES (6502, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 04:10:00');
INSERT INTO `sys_job_log` VALUES (6503, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 04:20:00');
INSERT INTO `sys_job_log` VALUES (6504, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 04:30:00');
INSERT INTO `sys_job_log` VALUES (6505, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 04:40:00');
INSERT INTO `sys_job_log` VALUES (6506, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 04:50:00');
INSERT INTO `sys_job_log` VALUES (6507, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 05:00:00');
INSERT INTO `sys_job_log` VALUES (6508, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 05:10:00');
INSERT INTO `sys_job_log` VALUES (6509, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 05:20:00');
INSERT INTO `sys_job_log` VALUES (6510, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-09 05:30:00');
INSERT INTO `sys_job_log` VALUES (6511, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 05:40:00');
INSERT INTO `sys_job_log` VALUES (6512, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 05:50:00');
INSERT INTO `sys_job_log` VALUES (6513, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 06:00:00');
INSERT INTO `sys_job_log` VALUES (6514, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-09 06:10:00');
INSERT INTO `sys_job_log` VALUES (6515, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 06:20:00');
INSERT INTO `sys_job_log` VALUES (6516, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 06:30:00');
INSERT INTO `sys_job_log` VALUES (6517, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 06:40:00');
INSERT INTO `sys_job_log` VALUES (6518, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 06:50:00');
INSERT INTO `sys_job_log` VALUES (6519, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-09 07:00:00');
INSERT INTO `sys_job_log` VALUES (6520, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 07:10:00');
INSERT INTO `sys_job_log` VALUES (6521, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 07:20:00');
INSERT INTO `sys_job_log` VALUES (6522, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 07:30:00');
INSERT INTO `sys_job_log` VALUES (6523, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 07:40:00');
INSERT INTO `sys_job_log` VALUES (6524, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 07:50:00');
INSERT INTO `sys_job_log` VALUES (6525, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 08:00:00');
INSERT INTO `sys_job_log` VALUES (6526, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 08:10:00');
INSERT INTO `sys_job_log` VALUES (6527, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 08:20:00');
INSERT INTO `sys_job_log` VALUES (6528, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 08:30:00');
INSERT INTO `sys_job_log` VALUES (6529, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 08:40:00');
INSERT INTO `sys_job_log` VALUES (6530, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 08:50:00');
INSERT INTO `sys_job_log` VALUES (6531, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 09:00:00');
INSERT INTO `sys_job_log` VALUES (6532, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 09:10:00');
INSERT INTO `sys_job_log` VALUES (6533, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 09:20:00');
INSERT INTO `sys_job_log` VALUES (6534, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 09:30:00');
INSERT INTO `sys_job_log` VALUES (6535, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 09:40:00');
INSERT INTO `sys_job_log` VALUES (6536, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 09:50:00');
INSERT INTO `sys_job_log` VALUES (6537, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 10:00:00');
INSERT INTO `sys_job_log` VALUES (6538, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 10:10:00');
INSERT INTO `sys_job_log` VALUES (6539, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 10:20:00');
INSERT INTO `sys_job_log` VALUES (6540, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 10:30:00');
INSERT INTO `sys_job_log` VALUES (6541, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 10:40:00');
INSERT INTO `sys_job_log` VALUES (6542, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 10:50:00');
INSERT INTO `sys_job_log` VALUES (6543, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 11:00:00');
INSERT INTO `sys_job_log` VALUES (6544, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 11:10:00');
INSERT INTO `sys_job_log` VALUES (6545, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 11:20:00');
INSERT INTO `sys_job_log` VALUES (6546, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 11:30:00');
INSERT INTO `sys_job_log` VALUES (6547, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 11:40:00');
INSERT INTO `sys_job_log` VALUES (6548, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 11:50:00');
INSERT INTO `sys_job_log` VALUES (6549, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 12:00:00');
INSERT INTO `sys_job_log` VALUES (6550, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 12:10:00');
INSERT INTO `sys_job_log` VALUES (6551, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 12:20:00');
INSERT INTO `sys_job_log` VALUES (6552, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-09 12:30:00');
INSERT INTO `sys_job_log` VALUES (6553, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 12:40:00');
INSERT INTO `sys_job_log` VALUES (6554, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 12:50:00');
INSERT INTO `sys_job_log` VALUES (6555, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 13:00:00');
INSERT INTO `sys_job_log` VALUES (6556, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 13:10:00');
INSERT INTO `sys_job_log` VALUES (6557, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 13:20:00');
INSERT INTO `sys_job_log` VALUES (6558, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 13:30:00');
INSERT INTO `sys_job_log` VALUES (6559, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 13:40:00');
INSERT INTO `sys_job_log` VALUES (6560, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 13:50:00');
INSERT INTO `sys_job_log` VALUES (6561, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 14:00:00');
INSERT INTO `sys_job_log` VALUES (6562, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 14:10:00');
INSERT INTO `sys_job_log` VALUES (6563, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 14:20:00');
INSERT INTO `sys_job_log` VALUES (6564, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 14:30:00');
INSERT INTO `sys_job_log` VALUES (6565, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 14:40:00');
INSERT INTO `sys_job_log` VALUES (6566, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 14:50:00');
INSERT INTO `sys_job_log` VALUES (6567, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 15:00:00');
INSERT INTO `sys_job_log` VALUES (6568, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 15:10:00');
INSERT INTO `sys_job_log` VALUES (6569, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 15:20:00');
INSERT INTO `sys_job_log` VALUES (6570, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 15:30:00');
INSERT INTO `sys_job_log` VALUES (6571, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 15:40:00');
INSERT INTO `sys_job_log` VALUES (6572, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 15:50:00');
INSERT INTO `sys_job_log` VALUES (6573, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 16:00:00');
INSERT INTO `sys_job_log` VALUES (6574, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 16:10:00');
INSERT INTO `sys_job_log` VALUES (6575, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 16:20:00');
INSERT INTO `sys_job_log` VALUES (6576, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 16:30:00');
INSERT INTO `sys_job_log` VALUES (6577, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 16:40:00');
INSERT INTO `sys_job_log` VALUES (6578, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 16:50:00');
INSERT INTO `sys_job_log` VALUES (6579, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 17:00:00');
INSERT INTO `sys_job_log` VALUES (6580, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 17:10:00');
INSERT INTO `sys_job_log` VALUES (6581, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 17:20:00');
INSERT INTO `sys_job_log` VALUES (6582, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 17:30:00');
INSERT INTO `sys_job_log` VALUES (6583, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 17:40:00');
INSERT INTO `sys_job_log` VALUES (6584, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 17:50:00');
INSERT INTO `sys_job_log` VALUES (6585, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 18:00:00');
INSERT INTO `sys_job_log` VALUES (6586, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 18:10:00');
INSERT INTO `sys_job_log` VALUES (6587, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 18:20:00');
INSERT INTO `sys_job_log` VALUES (6588, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 18:30:00');
INSERT INTO `sys_job_log` VALUES (6589, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 18:40:00');
INSERT INTO `sys_job_log` VALUES (6590, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 18:50:00');
INSERT INTO `sys_job_log` VALUES (6591, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 19:00:00');
INSERT INTO `sys_job_log` VALUES (6592, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 19:10:00');
INSERT INTO `sys_job_log` VALUES (6593, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 19:20:00');
INSERT INTO `sys_job_log` VALUES (6594, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 19:30:00');
INSERT INTO `sys_job_log` VALUES (6595, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 19:40:00');
INSERT INTO `sys_job_log` VALUES (6596, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 19:50:00');
INSERT INTO `sys_job_log` VALUES (6597, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 20:00:00');
INSERT INTO `sys_job_log` VALUES (6598, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 20:10:00');
INSERT INTO `sys_job_log` VALUES (6599, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 20:20:00');
INSERT INTO `sys_job_log` VALUES (6600, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 20:30:00');
INSERT INTO `sys_job_log` VALUES (6601, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：8毫秒', '200', '', '2023-04-09 20:40:00');
INSERT INTO `sys_job_log` VALUES (6602, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 20:50:00');
INSERT INTO `sys_job_log` VALUES (6603, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 21:00:00');
INSERT INTO `sys_job_log` VALUES (6604, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 21:10:00');
INSERT INTO `sys_job_log` VALUES (6605, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 21:20:00');
INSERT INTO `sys_job_log` VALUES (6606, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 21:30:00');
INSERT INTO `sys_job_log` VALUES (6607, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 21:40:00');
INSERT INTO `sys_job_log` VALUES (6608, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 21:50:00');
INSERT INTO `sys_job_log` VALUES (6609, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 22:00:00');
INSERT INTO `sys_job_log` VALUES (6610, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 22:10:00');
INSERT INTO `sys_job_log` VALUES (6611, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-09 22:20:00');
INSERT INTO `sys_job_log` VALUES (6612, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-09 22:30:00');
INSERT INTO `sys_job_log` VALUES (6613, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 22:40:00');
INSERT INTO `sys_job_log` VALUES (6614, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-09 22:50:00');
INSERT INTO `sys_job_log` VALUES (6615, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 23:00:00');
INSERT INTO `sys_job_log` VALUES (6616, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 23:10:00');
INSERT INTO `sys_job_log` VALUES (6617, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 23:20:00');
INSERT INTO `sys_job_log` VALUES (6618, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 23:30:00');
INSERT INTO `sys_job_log` VALUES (6619, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 23:40:00');
INSERT INTO `sys_job_log` VALUES (6620, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-09 23:50:00');
INSERT INTO `sys_job_log` VALUES (6621, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：7毫秒', '200', '', '2023-04-10 00:00:00');
INSERT INTO `sys_job_log` VALUES (6622, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 00:10:00');
INSERT INTO `sys_job_log` VALUES (6623, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 00:20:00');
INSERT INTO `sys_job_log` VALUES (6624, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 00:30:00');
INSERT INTO `sys_job_log` VALUES (6625, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：9毫秒', '200', '', '2023-04-10 00:40:00');
INSERT INTO `sys_job_log` VALUES (6626, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-10 00:50:00');
INSERT INTO `sys_job_log` VALUES (6627, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 01:00:00');
INSERT INTO `sys_job_log` VALUES (6628, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 01:10:00');
INSERT INTO `sys_job_log` VALUES (6629, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 01:20:00');
INSERT INTO `sys_job_log` VALUES (6630, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 01:30:00');
INSERT INTO `sys_job_log` VALUES (6631, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 01:40:00');
INSERT INTO `sys_job_log` VALUES (6632, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 01:50:00');
INSERT INTO `sys_job_log` VALUES (6633, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 02:00:00');
INSERT INTO `sys_job_log` VALUES (6634, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 02:10:00');
INSERT INTO `sys_job_log` VALUES (6635, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 02:20:00');
INSERT INTO `sys_job_log` VALUES (6636, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 02:30:00');
INSERT INTO `sys_job_log` VALUES (6637, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 02:40:00');
INSERT INTO `sys_job_log` VALUES (6638, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 02:50:00');
INSERT INTO `sys_job_log` VALUES (6639, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 03:00:00');
INSERT INTO `sys_job_log` VALUES (6640, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 03:10:00');
INSERT INTO `sys_job_log` VALUES (6641, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 03:20:00');
INSERT INTO `sys_job_log` VALUES (6642, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-10 03:30:00');
INSERT INTO `sys_job_log` VALUES (6643, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-10 03:40:00');
INSERT INTO `sys_job_log` VALUES (6644, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-10 03:50:00');
INSERT INTO `sys_job_log` VALUES (6645, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 04:00:00');
INSERT INTO `sys_job_log` VALUES (6646, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 04:10:00');
INSERT INTO `sys_job_log` VALUES (6647, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 04:20:00');
INSERT INTO `sys_job_log` VALUES (6648, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 04:30:00');
INSERT INTO `sys_job_log` VALUES (6649, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 04:40:00');
INSERT INTO `sys_job_log` VALUES (6650, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 04:50:00');
INSERT INTO `sys_job_log` VALUES (6651, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 05:00:00');
INSERT INTO `sys_job_log` VALUES (6652, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 05:10:00');
INSERT INTO `sys_job_log` VALUES (6653, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 05:20:00');
INSERT INTO `sys_job_log` VALUES (6654, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 05:30:00');
INSERT INTO `sys_job_log` VALUES (6655, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 05:40:00');
INSERT INTO `sys_job_log` VALUES (6656, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 05:50:00');
INSERT INTO `sys_job_log` VALUES (6657, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 06:00:00');
INSERT INTO `sys_job_log` VALUES (6658, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 06:10:00');
INSERT INTO `sys_job_log` VALUES (6659, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 06:20:00');
INSERT INTO `sys_job_log` VALUES (6660, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 06:30:00');
INSERT INTO `sys_job_log` VALUES (6661, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 06:40:00');
INSERT INTO `sys_job_log` VALUES (6662, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 06:50:00');
INSERT INTO `sys_job_log` VALUES (6663, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 07:00:00');
INSERT INTO `sys_job_log` VALUES (6664, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-10 07:10:00');
INSERT INTO `sys_job_log` VALUES (6665, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 07:20:00');
INSERT INTO `sys_job_log` VALUES (6666, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 07:30:00');
INSERT INTO `sys_job_log` VALUES (6667, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 07:40:00');
INSERT INTO `sys_job_log` VALUES (6668, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-10 07:50:00');
INSERT INTO `sys_job_log` VALUES (6669, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 08:00:00');
INSERT INTO `sys_job_log` VALUES (6670, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 08:10:00');
INSERT INTO `sys_job_log` VALUES (6671, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 08:20:00');
INSERT INTO `sys_job_log` VALUES (6672, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 08:30:00');
INSERT INTO `sys_job_log` VALUES (6673, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 08:40:00');
INSERT INTO `sys_job_log` VALUES (6674, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 08:50:00');
INSERT INTO `sys_job_log` VALUES (6675, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 09:00:00');
INSERT INTO `sys_job_log` VALUES (6676, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-10 09:10:00');
INSERT INTO `sys_job_log` VALUES (6677, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 09:20:00');
INSERT INTO `sys_job_log` VALUES (6678, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 09:30:00');
INSERT INTO `sys_job_log` VALUES (6679, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 09:40:00');
INSERT INTO `sys_job_log` VALUES (6680, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 09:50:00');
INSERT INTO `sys_job_log` VALUES (6681, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 10:00:00');
INSERT INTO `sys_job_log` VALUES (6682, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 10:10:00');
INSERT INTO `sys_job_log` VALUES (6683, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 10:20:00');
INSERT INTO `sys_job_log` VALUES (6684, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 10:30:00');
INSERT INTO `sys_job_log` VALUES (6685, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 10:40:00');
INSERT INTO `sys_job_log` VALUES (6686, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 10:50:00');
INSERT INTO `sys_job_log` VALUES (6687, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 11:00:00');
INSERT INTO `sys_job_log` VALUES (6688, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：6毫秒', '200', '', '2023-04-10 11:10:00');
INSERT INTO `sys_job_log` VALUES (6689, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 11:20:00');
INSERT INTO `sys_job_log` VALUES (6690, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：15毫秒', '200', '', '2023-04-10 11:30:00');
INSERT INTO `sys_job_log` VALUES (6691, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 11:40:00');
INSERT INTO `sys_job_log` VALUES (6692, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 11:50:00');
INSERT INTO `sys_job_log` VALUES (6693, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 12:00:00');
INSERT INTO `sys_job_log` VALUES (6694, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-10 12:10:00');
INSERT INTO `sys_job_log` VALUES (6695, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 12:20:00');
INSERT INTO `sys_job_log` VALUES (6696, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 12:30:00');
INSERT INTO `sys_job_log` VALUES (6697, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 12:40:00');
INSERT INTO `sys_job_log` VALUES (6698, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 12:50:00');
INSERT INTO `sys_job_log` VALUES (6699, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 13:00:00');
INSERT INTO `sys_job_log` VALUES (6700, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 13:10:00');
INSERT INTO `sys_job_log` VALUES (6701, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 13:20:00');
INSERT INTO `sys_job_log` VALUES (6702, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 13:30:00');
INSERT INTO `sys_job_log` VALUES (6703, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 13:40:00');
INSERT INTO `sys_job_log` VALUES (6704, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 13:50:00');
INSERT INTO `sys_job_log` VALUES (6705, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 14:00:00');
INSERT INTO `sys_job_log` VALUES (6706, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 14:10:00');
INSERT INTO `sys_job_log` VALUES (6707, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 14:20:00');
INSERT INTO `sys_job_log` VALUES (6708, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 14:30:00');
INSERT INTO `sys_job_log` VALUES (6709, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 14:40:00');
INSERT INTO `sys_job_log` VALUES (6710, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 14:50:00');
INSERT INTO `sys_job_log` VALUES (6711, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：17毫秒', '200', '', '2023-04-10 15:00:00');
INSERT INTO `sys_job_log` VALUES (6712, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-10 15:10:00');
INSERT INTO `sys_job_log` VALUES (6713, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 15:20:00');
INSERT INTO `sys_job_log` VALUES (6714, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 15:30:00');
INSERT INTO `sys_job_log` VALUES (6715, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 15:40:00');
INSERT INTO `sys_job_log` VALUES (6716, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 15:50:00');
INSERT INTO `sys_job_log` VALUES (6717, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 16:00:00');
INSERT INTO `sys_job_log` VALUES (6718, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 16:10:00');
INSERT INTO `sys_job_log` VALUES (6719, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 16:20:00');
INSERT INTO `sys_job_log` VALUES (6720, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 16:30:00');
INSERT INTO `sys_job_log` VALUES (6721, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 16:40:00');
INSERT INTO `sys_job_log` VALUES (6722, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 16:50:00');
INSERT INTO `sys_job_log` VALUES (6723, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 17:00:00');
INSERT INTO `sys_job_log` VALUES (6724, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 17:10:00');
INSERT INTO `sys_job_log` VALUES (6725, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 17:20:00');
INSERT INTO `sys_job_log` VALUES (6726, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 17:30:00');
INSERT INTO `sys_job_log` VALUES (6727, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 17:40:00');
INSERT INTO `sys_job_log` VALUES (6728, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 17:50:00');
INSERT INTO `sys_job_log` VALUES (6729, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 18:00:00');
INSERT INTO `sys_job_log` VALUES (6730, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 18:10:00');
INSERT INTO `sys_job_log` VALUES (6731, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 18:20:00');
INSERT INTO `sys_job_log` VALUES (6732, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 18:30:00');
INSERT INTO `sys_job_log` VALUES (6733, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 18:40:00');
INSERT INTO `sys_job_log` VALUES (6734, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-10 18:50:00');
INSERT INTO `sys_job_log` VALUES (6735, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 19:00:00');
INSERT INTO `sys_job_log` VALUES (6736, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 19:10:00');
INSERT INTO `sys_job_log` VALUES (6737, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 19:20:00');
INSERT INTO `sys_job_log` VALUES (6738, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 19:30:00');
INSERT INTO `sys_job_log` VALUES (6739, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 19:40:00');
INSERT INTO `sys_job_log` VALUES (6740, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 19:50:00');
INSERT INTO `sys_job_log` VALUES (6741, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 20:00:00');
INSERT INTO `sys_job_log` VALUES (6742, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-10 20:10:00');
INSERT INTO `sys_job_log` VALUES (6743, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 20:20:00');
INSERT INTO `sys_job_log` VALUES (6744, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 20:30:00');
INSERT INTO `sys_job_log` VALUES (6745, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 20:40:00');
INSERT INTO `sys_job_log` VALUES (6746, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 20:50:00');
INSERT INTO `sys_job_log` VALUES (6747, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 21:00:00');
INSERT INTO `sys_job_log` VALUES (6748, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 21:10:00');
INSERT INTO `sys_job_log` VALUES (6749, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 21:20:00');
INSERT INTO `sys_job_log` VALUES (6750, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 21:30:00');
INSERT INTO `sys_job_log` VALUES (6751, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 21:40:00');
INSERT INTO `sys_job_log` VALUES (6752, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 21:50:00');
INSERT INTO `sys_job_log` VALUES (6753, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 22:00:00');
INSERT INTO `sys_job_log` VALUES (6754, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 22:10:00');
INSERT INTO `sys_job_log` VALUES (6755, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 22:20:00');
INSERT INTO `sys_job_log` VALUES (6756, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 22:30:00');
INSERT INTO `sys_job_log` VALUES (6757, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 22:40:00');
INSERT INTO `sys_job_log` VALUES (6758, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 22:50:00');
INSERT INTO `sys_job_log` VALUES (6759, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 23:00:00');
INSERT INTO `sys_job_log` VALUES (6760, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-10 23:10:00');
INSERT INTO `sys_job_log` VALUES (6761, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 23:20:00');
INSERT INTO `sys_job_log` VALUES (6762, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 23:30:00');
INSERT INTO `sys_job_log` VALUES (6763, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 23:40:00');
INSERT INTO `sys_job_log` VALUES (6764, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-10 23:50:00');
INSERT INTO `sys_job_log` VALUES (6765, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-11 00:00:00');
INSERT INTO `sys_job_log` VALUES (6766, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 00:10:00');
INSERT INTO `sys_job_log` VALUES (6767, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 00:20:00');
INSERT INTO `sys_job_log` VALUES (6768, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 00:30:00');
INSERT INTO `sys_job_log` VALUES (6769, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 00:40:00');
INSERT INTO `sys_job_log` VALUES (6770, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 00:50:00');
INSERT INTO `sys_job_log` VALUES (6771, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 01:00:00');
INSERT INTO `sys_job_log` VALUES (6772, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 01:10:00');
INSERT INTO `sys_job_log` VALUES (6773, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 01:20:00');
INSERT INTO `sys_job_log` VALUES (6774, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 01:30:00');
INSERT INTO `sys_job_log` VALUES (6775, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：15毫秒', '200', '', '2023-04-11 01:40:00');
INSERT INTO `sys_job_log` VALUES (6776, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 01:50:00');
INSERT INTO `sys_job_log` VALUES (6777, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 02:00:00');
INSERT INTO `sys_job_log` VALUES (6778, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 02:10:00');
INSERT INTO `sys_job_log` VALUES (6779, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-11 02:20:00');
INSERT INTO `sys_job_log` VALUES (6780, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 02:30:00');
INSERT INTO `sys_job_log` VALUES (6781, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 02:40:00');
INSERT INTO `sys_job_log` VALUES (6782, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 02:50:00');
INSERT INTO `sys_job_log` VALUES (6783, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 03:00:00');
INSERT INTO `sys_job_log` VALUES (6784, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 03:10:00');
INSERT INTO `sys_job_log` VALUES (6785, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-11 03:20:00');
INSERT INTO `sys_job_log` VALUES (6786, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 03:30:00');
INSERT INTO `sys_job_log` VALUES (6787, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：8毫秒', '200', '', '2023-04-11 03:40:00');
INSERT INTO `sys_job_log` VALUES (6788, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 03:50:00');
INSERT INTO `sys_job_log` VALUES (6789, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 04:00:00');
INSERT INTO `sys_job_log` VALUES (6790, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-11 04:10:00');
INSERT INTO `sys_job_log` VALUES (6791, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 04:20:00');
INSERT INTO `sys_job_log` VALUES (6792, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-11 04:30:00');
INSERT INTO `sys_job_log` VALUES (6793, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：28毫秒', '200', '', '2023-04-11 04:40:00');
INSERT INTO `sys_job_log` VALUES (6794, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 04:50:00');
INSERT INTO `sys_job_log` VALUES (6795, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-11 05:00:00');
INSERT INTO `sys_job_log` VALUES (6796, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-11 05:10:00');
INSERT INTO `sys_job_log` VALUES (6797, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 05:20:00');
INSERT INTO `sys_job_log` VALUES (6798, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 05:30:00');
INSERT INTO `sys_job_log` VALUES (6799, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 05:40:00');
INSERT INTO `sys_job_log` VALUES (6800, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 05:50:00');
INSERT INTO `sys_job_log` VALUES (6801, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 06:00:00');
INSERT INTO `sys_job_log` VALUES (6802, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 06:10:00');
INSERT INTO `sys_job_log` VALUES (6803, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 06:20:00');
INSERT INTO `sys_job_log` VALUES (6804, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 06:30:00');
INSERT INTO `sys_job_log` VALUES (6805, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：10毫秒', '200', '', '2023-04-11 06:40:00');
INSERT INTO `sys_job_log` VALUES (6806, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 06:50:00');
INSERT INTO `sys_job_log` VALUES (6807, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-11 07:00:00');
INSERT INTO `sys_job_log` VALUES (6808, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 07:10:00');
INSERT INTO `sys_job_log` VALUES (6809, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 07:20:00');
INSERT INTO `sys_job_log` VALUES (6810, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 07:30:00');
INSERT INTO `sys_job_log` VALUES (6811, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 07:40:00');
INSERT INTO `sys_job_log` VALUES (6812, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 07:50:00');
INSERT INTO `sys_job_log` VALUES (6813, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 08:00:00');
INSERT INTO `sys_job_log` VALUES (6814, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 08:10:00');
INSERT INTO `sys_job_log` VALUES (6815, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 08:20:00');
INSERT INTO `sys_job_log` VALUES (6816, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-11 08:30:00');
INSERT INTO `sys_job_log` VALUES (6817, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 08:40:00');
INSERT INTO `sys_job_log` VALUES (6818, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-11 08:50:00');
INSERT INTO `sys_job_log` VALUES (6819, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 09:00:00');
INSERT INTO `sys_job_log` VALUES (6820, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 09:10:00');
INSERT INTO `sys_job_log` VALUES (6821, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 09:20:00');
INSERT INTO `sys_job_log` VALUES (6822, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 09:30:00');
INSERT INTO `sys_job_log` VALUES (6823, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 09:40:00');
INSERT INTO `sys_job_log` VALUES (6824, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 09:50:00');
INSERT INTO `sys_job_log` VALUES (6825, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 10:00:00');
INSERT INTO `sys_job_log` VALUES (6826, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-11 10:10:00');
INSERT INTO `sys_job_log` VALUES (6827, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 10:20:00');
INSERT INTO `sys_job_log` VALUES (6828, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 10:30:00');
INSERT INTO `sys_job_log` VALUES (6829, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：11毫秒', '200', '', '2023-04-11 10:40:00');
INSERT INTO `sys_job_log` VALUES (6830, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 10:50:00');
INSERT INTO `sys_job_log` VALUES (6831, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 11:00:00');
INSERT INTO `sys_job_log` VALUES (6832, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 11:10:00');
INSERT INTO `sys_job_log` VALUES (6833, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 11:20:00');
INSERT INTO `sys_job_log` VALUES (6834, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 11:30:00');
INSERT INTO `sys_job_log` VALUES (6835, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 11:40:00');
INSERT INTO `sys_job_log` VALUES (6836, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 11:50:00');
INSERT INTO `sys_job_log` VALUES (6837, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 12:00:00');
INSERT INTO `sys_job_log` VALUES (6838, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 12:10:00');
INSERT INTO `sys_job_log` VALUES (6839, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 12:20:00');
INSERT INTO `sys_job_log` VALUES (6840, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-11 12:30:00');
INSERT INTO `sys_job_log` VALUES (6841, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 12:40:00');
INSERT INTO `sys_job_log` VALUES (6842, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-11 12:50:00');
INSERT INTO `sys_job_log` VALUES (6843, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-11 13:00:00');
INSERT INTO `sys_job_log` VALUES (6844, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-11 13:10:00');
INSERT INTO `sys_job_log` VALUES (6845, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 13:20:00');
INSERT INTO `sys_job_log` VALUES (6846, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 13:30:00');
INSERT INTO `sys_job_log` VALUES (6847, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 13:40:00');
INSERT INTO `sys_job_log` VALUES (6848, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 13:50:00');
INSERT INTO `sys_job_log` VALUES (6849, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 14:00:00');
INSERT INTO `sys_job_log` VALUES (6850, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 14:10:00');
INSERT INTO `sys_job_log` VALUES (6851, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 14:20:00');
INSERT INTO `sys_job_log` VALUES (6852, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 14:30:00');
INSERT INTO `sys_job_log` VALUES (6853, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-11 14:40:00');
INSERT INTO `sys_job_log` VALUES (6854, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 14:50:00');
INSERT INTO `sys_job_log` VALUES (6855, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 15:00:00');
INSERT INTO `sys_job_log` VALUES (6856, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-11 15:10:00');
INSERT INTO `sys_job_log` VALUES (6857, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-11 15:20:00');
INSERT INTO `sys_job_log` VALUES (6858, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-11 15:30:00');
INSERT INTO `sys_job_log` VALUES (6859, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-11 15:40:00');
INSERT INTO `sys_job_log` VALUES (6860, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 15:50:00');
INSERT INTO `sys_job_log` VALUES (6861, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：13毫秒', '200', '', '2023-04-11 16:00:00');
INSERT INTO `sys_job_log` VALUES (6862, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-11 16:10:00');
INSERT INTO `sys_job_log` VALUES (6863, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：9毫秒', '200', '', '2023-04-11 16:20:00');
INSERT INTO `sys_job_log` VALUES (6864, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-11 16:30:00');
INSERT INTO `sys_job_log` VALUES (6865, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：8毫秒', '200', '', '2023-04-11 16:40:00');
INSERT INTO `sys_job_log` VALUES (6866, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 16:50:00');
INSERT INTO `sys_job_log` VALUES (6867, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-11 17:00:00');
INSERT INTO `sys_job_log` VALUES (6868, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-11 17:10:00');
INSERT INTO `sys_job_log` VALUES (6869, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 17:20:00');
INSERT INTO `sys_job_log` VALUES (6870, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 17:30:00');
INSERT INTO `sys_job_log` VALUES (6871, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 17:40:00');
INSERT INTO `sys_job_log` VALUES (6872, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 17:50:00');
INSERT INTO `sys_job_log` VALUES (6873, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 18:00:00');
INSERT INTO `sys_job_log` VALUES (6874, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 18:10:00');
INSERT INTO `sys_job_log` VALUES (6875, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 18:20:00');
INSERT INTO `sys_job_log` VALUES (6876, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 18:30:00');
INSERT INTO `sys_job_log` VALUES (6877, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：8毫秒', '200', '', '2023-04-11 18:40:00');
INSERT INTO `sys_job_log` VALUES (6878, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 18:50:00');
INSERT INTO `sys_job_log` VALUES (6879, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 19:00:00');
INSERT INTO `sys_job_log` VALUES (6880, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 19:10:00');
INSERT INTO `sys_job_log` VALUES (6881, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 19:20:00');
INSERT INTO `sys_job_log` VALUES (6882, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 19:30:00');
INSERT INTO `sys_job_log` VALUES (6883, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 19:40:00');
INSERT INTO `sys_job_log` VALUES (6884, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 19:50:00');
INSERT INTO `sys_job_log` VALUES (6885, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 20:00:00');
INSERT INTO `sys_job_log` VALUES (6886, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 20:10:00');
INSERT INTO `sys_job_log` VALUES (6887, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 20:20:00');
INSERT INTO `sys_job_log` VALUES (6888, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 20:30:00');
INSERT INTO `sys_job_log` VALUES (6889, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 20:40:00');
INSERT INTO `sys_job_log` VALUES (6890, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 20:50:00');
INSERT INTO `sys_job_log` VALUES (6891, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 21:00:00');
INSERT INTO `sys_job_log` VALUES (6892, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 21:10:00');
INSERT INTO `sys_job_log` VALUES (6893, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 21:20:00');
INSERT INTO `sys_job_log` VALUES (6894, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-11 21:30:00');
INSERT INTO `sys_job_log` VALUES (6895, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 21:40:00');
INSERT INTO `sys_job_log` VALUES (6896, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 21:50:00');
INSERT INTO `sys_job_log` VALUES (6897, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-11 22:00:00');
INSERT INTO `sys_job_log` VALUES (6898, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 22:10:00');
INSERT INTO `sys_job_log` VALUES (6899, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 22:20:00');
INSERT INTO `sys_job_log` VALUES (6900, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-11 22:30:00');
INSERT INTO `sys_job_log` VALUES (6901, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 22:40:00');
INSERT INTO `sys_job_log` VALUES (6902, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 22:50:00');
INSERT INTO `sys_job_log` VALUES (6903, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 23:00:00');
INSERT INTO `sys_job_log` VALUES (6904, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 23:10:00');
INSERT INTO `sys_job_log` VALUES (6905, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-11 23:20:00');
INSERT INTO `sys_job_log` VALUES (6906, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 23:30:00');
INSERT INTO `sys_job_log` VALUES (6907, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-11 23:40:00');
INSERT INTO `sys_job_log` VALUES (6908, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-11 23:50:00');
INSERT INTO `sys_job_log` VALUES (6909, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-12 00:00:00');
INSERT INTO `sys_job_log` VALUES (6910, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-12 00:10:00');
INSERT INTO `sys_job_log` VALUES (6911, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 00:20:00');
INSERT INTO `sys_job_log` VALUES (6912, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 00:30:00');
INSERT INTO `sys_job_log` VALUES (6913, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 00:40:00');
INSERT INTO `sys_job_log` VALUES (6914, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 00:50:00');
INSERT INTO `sys_job_log` VALUES (6915, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 01:00:00');
INSERT INTO `sys_job_log` VALUES (6916, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-12 01:10:00');
INSERT INTO `sys_job_log` VALUES (6917, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 01:20:00');
INSERT INTO `sys_job_log` VALUES (6918, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 01:30:00');
INSERT INTO `sys_job_log` VALUES (6919, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 01:40:00');
INSERT INTO `sys_job_log` VALUES (6920, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-12 01:50:00');
INSERT INTO `sys_job_log` VALUES (6921, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 02:00:00');
INSERT INTO `sys_job_log` VALUES (6922, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 02:10:00');
INSERT INTO `sys_job_log` VALUES (6923, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-12 02:20:00');
INSERT INTO `sys_job_log` VALUES (6924, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-12 02:30:00');
INSERT INTO `sys_job_log` VALUES (6925, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-12 02:40:00');
INSERT INTO `sys_job_log` VALUES (6926, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 02:50:00');
INSERT INTO `sys_job_log` VALUES (6927, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 03:00:00');
INSERT INTO `sys_job_log` VALUES (6928, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 03:10:00');
INSERT INTO `sys_job_log` VALUES (6929, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 03:20:00');
INSERT INTO `sys_job_log` VALUES (6930, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-12 03:30:00');
INSERT INTO `sys_job_log` VALUES (6931, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 03:40:00');
INSERT INTO `sys_job_log` VALUES (6932, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 03:50:00');
INSERT INTO `sys_job_log` VALUES (6933, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 04:00:00');
INSERT INTO `sys_job_log` VALUES (6934, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 04:10:00');
INSERT INTO `sys_job_log` VALUES (6935, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-12 04:20:00');
INSERT INTO `sys_job_log` VALUES (6936, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 04:30:00');
INSERT INTO `sys_job_log` VALUES (6937, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 04:40:00');
INSERT INTO `sys_job_log` VALUES (6938, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 04:50:00');
INSERT INTO `sys_job_log` VALUES (6939, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 05:00:00');
INSERT INTO `sys_job_log` VALUES (6940, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 05:10:00');
INSERT INTO `sys_job_log` VALUES (6941, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 05:20:00');
INSERT INTO `sys_job_log` VALUES (6942, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 05:30:00');
INSERT INTO `sys_job_log` VALUES (6943, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 05:40:00');
INSERT INTO `sys_job_log` VALUES (6944, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 05:50:00');
INSERT INTO `sys_job_log` VALUES (6945, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 06:00:00');
INSERT INTO `sys_job_log` VALUES (6946, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 06:10:00');
INSERT INTO `sys_job_log` VALUES (6947, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 06:20:00');
INSERT INTO `sys_job_log` VALUES (6948, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 06:30:00');
INSERT INTO `sys_job_log` VALUES (6949, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：9毫秒', '200', '', '2023-04-12 06:40:00');
INSERT INTO `sys_job_log` VALUES (6950, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：2毫秒', '200', '', '2023-04-12 06:50:00');
INSERT INTO `sys_job_log` VALUES (6951, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 07:00:00');
INSERT INTO `sys_job_log` VALUES (6952, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 07:10:00');
INSERT INTO `sys_job_log` VALUES (6953, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 07:20:00');
INSERT INTO `sys_job_log` VALUES (6954, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 07:30:00');
INSERT INTO `sys_job_log` VALUES (6955, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 07:40:00');
INSERT INTO `sys_job_log` VALUES (6956, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 07:50:00');
INSERT INTO `sys_job_log` VALUES (6957, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 08:00:00');
INSERT INTO `sys_job_log` VALUES (6958, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-12 08:10:00');
INSERT INTO `sys_job_log` VALUES (6959, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-12 08:20:00');
INSERT INTO `sys_job_log` VALUES (6960, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 08:30:00');
INSERT INTO `sys_job_log` VALUES (6961, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：10毫秒', '200', '', '2023-04-12 08:40:00');
INSERT INTO `sys_job_log` VALUES (6962, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 08:50:00');
INSERT INTO `sys_job_log` VALUES (6963, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 09:00:00');
INSERT INTO `sys_job_log` VALUES (6964, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 09:10:00');
INSERT INTO `sys_job_log` VALUES (6965, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 09:20:00');
INSERT INTO `sys_job_log` VALUES (6966, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 09:30:00');
INSERT INTO `sys_job_log` VALUES (6967, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 09:40:00');
INSERT INTO `sys_job_log` VALUES (6968, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 09:50:00');
INSERT INTO `sys_job_log` VALUES (6969, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-12 10:00:00');
INSERT INTO `sys_job_log` VALUES (6970, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 10:10:00');
INSERT INTO `sys_job_log` VALUES (6971, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：1毫秒', '200', '', '2023-04-12 10:20:00');
INSERT INTO `sys_job_log` VALUES (6972, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 10:30:00');
INSERT INTO `sys_job_log` VALUES (6973, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 10:40:00');
INSERT INTO `sys_job_log` VALUES (6974, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 10:50:00');
INSERT INTO `sys_job_log` VALUES (6975, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：3毫秒', '200', '', '2023-04-12 11:00:00');
INSERT INTO `sys_job_log` VALUES (6976, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 11:10:00');
INSERT INTO `sys_job_log` VALUES (6977, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 11:20:00');
INSERT INTO `sys_job_log` VALUES (6978, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：4毫秒', '200', '', '2023-04-12 11:30:00');
INSERT INTO `sys_job_log` VALUES (6979, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 11:40:00');
INSERT INTO `sys_job_log` VALUES (6980, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 11:50:00');
INSERT INTO `sys_job_log` VALUES (6981, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 12:00:00');
INSERT INTO `sys_job_log` VALUES (6982, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 12:10:00');
INSERT INTO `sys_job_log` VALUES (6983, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 12:20:00');
INSERT INTO `sys_job_log` VALUES (6984, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 12:30:00');
INSERT INTO `sys_job_log` VALUES (6985, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 12:40:00');
INSERT INTO `sys_job_log` VALUES (6986, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 12:50:00');
INSERT INTO `sys_job_log` VALUES (6987, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 13:00:00');
INSERT INTO `sys_job_log` VALUES (6988, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：0毫秒', '200', '', '2023-04-12 13:10:00');
INSERT INTO `sys_job_log` VALUES (6989, '清除未支付超时订单(10分钟执行一次)', 'DEFAULT', 'myTask.cleanOrder', '清除未支付超时订单(10分钟执行一次) 总共耗时：5毫秒', '200', '', '2023-04-12 13:20:00');

-- ----------------------------
-- Table structure for sys_login_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_login_log`;
CREATE TABLE `sys_login_log`  (
  `log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '访问ID',
  `login_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '登录账号',
  `ipaddr` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '登录IP地址',
  `login_location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '登录地点',
  `browser` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '浏览器类型',
  `os` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '操作系统',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '登录状态（0成功 1失败）',
  `msg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '提示消息',
  `login_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '访问时间',
  `session_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '用户会话id',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`log_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 91 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统登录日志表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_login_log
-- ----------------------------
INSERT INTO `sys_login_log` VALUES (80, 'admin', '127.0.0.1', '内网IP', 'Chrome 11', 'Windows 10', '0', '【登录成功】:login success', '2023-04-07', 'sys_login_user:admin', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (81, 'admin', '127.0.0.1', '内网IP', 'Chrome 8', 'Windows 10', '0', '【登录成功】:login success', '2023-04-07', 'sys_login_user:admin', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (82, 'admin', '127.0.0.1', '内网IP', 'Chrome 11', 'Windows 10', '0', '【登录成功】:login success', '2023-04-07', 'sys_login_user:admin', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (83, 'admin', '127.0.0.1', '内网IP', 'Chrome 9', 'Windows 10', '0', '【登录成功】:login success', '2023-04-10', 'sys_login_user:admin', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (84, '13818613675', '127.0.0.1', '内网IP', 'Chrome 9', 'Windows 10', '1', '【登录异常】:用户名或密码不正确', '2023-04-10', 'sys_login_user:13818613675', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (85, '13818613675', '127.0.0.1', '内网IP', 'Chrome 9', 'Windows 10', '1', '【登录异常】:用户名或密码不正确', '2023-04-10', 'sys_login_user:13818613675', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (86, '13818613675', '127.0.0.1', '内网IP', 'Chrome 9', 'Windows 10', '1', '【登录异常】:用户名或密码不正确', '2023-04-10', 'sys_login_user:13818613675', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (87, '13818613675', '127.0.0.1', '内网IP', 'Chrome 9', 'Windows 10', '1', '【登录异常】:用户名或密码不正确', '2023-04-10', 'sys_login_user:13818613675', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (88, 'admin', '127.0.0.1', '内网IP', 'Chrome 9', 'Windows 10', '0', '【登录成功】:login success', '2023-04-10', 'sys_login_user:admin', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (89, 'admin', '127.0.0.1', '内网IP', 'Chrome 11', 'Windows 10', '0', '【登录成功】:login success', '2023-04-11', 'sys_login_user:admin', NULL, NULL, NULL, NULL);
INSERT INTO `sys_login_log` VALUES (90, 'admin', '127.0.0.1', '内网IP', 'Chrome 11', 'Windows 10', '0', '【登录成功】:login success', '2023-04-11', 'sys_login_user:admin', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sys_logininfor
-- ----------------------------
DROP TABLE IF EXISTS `sys_logininfor`;
CREATE TABLE `sys_logininfor`  (
  `info_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '访问ID',
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '用户账号',
  `ipaddr` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '登录IP地址',
  `login_location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '登录地点',
  `browser` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '浏览器类型',
  `os` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '操作系统',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '登录状态（0成功 1失败）',
  `msg` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '提示消息',
  `login_time` datetime NULL DEFAULT NULL COMMENT '访问时间',
  PRIMARY KEY (`info_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统访问记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_logininfor
-- ----------------------------
INSERT INTO `sys_logininfor` VALUES (1, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-03 13:09:07');
INSERT INTO `sys_logininfor` VALUES (2, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-04 10:01:43');
INSERT INTO `sys_logininfor` VALUES (3, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '1', '验证码已失效', '2023-01-04 17:56:14');
INSERT INTO `sys_logininfor` VALUES (4, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-04 17:56:16');
INSERT INTO `sys_logininfor` VALUES (5, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-05 10:35:40');
INSERT INTO `sys_logininfor` VALUES (6, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-05 13:12:36');
INSERT INTO `sys_logininfor` VALUES (7, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-07 09:39:35');
INSERT INTO `sys_logininfor` VALUES (8, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-11 17:10:42');
INSERT INTO `sys_logininfor` VALUES (9, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-11 17:56:52');
INSERT INTO `sys_logininfor` VALUES (10, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '退出成功', '2023-01-11 17:59:48');
INSERT INTO `sys_logininfor` VALUES (11, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-11 17:59:54');
INSERT INTO `sys_logininfor` VALUES (12, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-28 16:56:29');
INSERT INTO `sys_logininfor` VALUES (13, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-29 14:03:39');
INSERT INTO `sys_logininfor` VALUES (14, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '退出成功', '2023-01-29 18:05:17');
INSERT INTO `sys_logininfor` VALUES (15, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '1', '验证码错误', '2023-01-29 18:05:24');
INSERT INTO `sys_logininfor` VALUES (16, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-29 18:05:29');
INSERT INTO `sys_logininfor` VALUES (17, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '退出成功', '2023-01-29 18:05:29');
INSERT INTO `sys_logininfor` VALUES (18, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-30 09:09:43');
INSERT INTO `sys_logininfor` VALUES (19, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-30 09:09:43');
INSERT INTO `sys_logininfor` VALUES (20, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '退出成功', '2023-01-30 09:09:47');
INSERT INTO `sys_logininfor` VALUES (21, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-30 09:10:20');
INSERT INTO `sys_logininfor` VALUES (22, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-30 09:11:30');
INSERT INTO `sys_logininfor` VALUES (23, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '退出成功', '2023-01-30 09:11:30');
INSERT INTO `sys_logininfor` VALUES (24, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-30 09:12:11');
INSERT INTO `sys_logininfor` VALUES (25, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '退出成功', '2023-01-30 09:12:11');
INSERT INTO `sys_logininfor` VALUES (26, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-30 09:13:45');
INSERT INTO `sys_logininfor` VALUES (27, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '退出成功', '2023-01-30 09:13:45');
INSERT INTO `sys_logininfor` VALUES (28, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-30 09:15:22');
INSERT INTO `sys_logininfor` VALUES (29, 'admin2', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '退出成功', '2023-01-30 09:16:23');
INSERT INTO `sys_logininfor` VALUES (30, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-31 10:09:19');
INSERT INTO `sys_logininfor` VALUES (31, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-01-31 14:16:40');
INSERT INTO `sys_logininfor` VALUES (32, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-01 16:11:22');
INSERT INTO `sys_logininfor` VALUES (33, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '1', '验证码错误', '2023-02-02 10:54:06');
INSERT INTO `sys_logininfor` VALUES (34, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-02 10:54:10');
INSERT INTO `sys_logininfor` VALUES (35, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-03 15:37:11');
INSERT INTO `sys_logininfor` VALUES (36, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-03 18:01:07');
INSERT INTO `sys_logininfor` VALUES (37, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-07 09:46:03');
INSERT INTO `sys_logininfor` VALUES (38, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-07 16:23:19');
INSERT INTO `sys_logininfor` VALUES (39, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '1', '验证码错误', '2023-02-07 18:03:27');
INSERT INTO `sys_logininfor` VALUES (40, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-07 18:03:33');
INSERT INTO `sys_logininfor` VALUES (41, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-08 09:13:30');
INSERT INTO `sys_logininfor` VALUES (42, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-08 09:19:14');
INSERT INTO `sys_logininfor` VALUES (43, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-08 10:28:09');
INSERT INTO `sys_logininfor` VALUES (44, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-08 11:33:43');
INSERT INTO `sys_logininfor` VALUES (45, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-08 15:59:27');
INSERT INTO `sys_logininfor` VALUES (46, 'admin', '127.0.0.1', '内网IP', 'Chrome 10', 'Windows 10', '0', '登录成功', '2023-02-09 13:33:20');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `menu_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单ID',
  `menu_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单名称',
  `parent_id` bigint(20) NULL DEFAULT 0 COMMENT '父菜单ID',
  `order_num` int(4) NULL DEFAULT 0 COMMENT '显示顺序',
  `path` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '路由地址',
  `component` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组件路径',
  `query` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '路由参数',
  `is_frame` int(1) NULL DEFAULT 1 COMMENT '是否为外链（0是 1否）',
  `is_cache` int(1) NULL DEFAULT 0 COMMENT '是否缓存（0缓存 1不缓存）',
  `menu_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '菜单类型（M目录 C菜单 F按钮）',
  `visible` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '菜单状态（0显示 1隐藏）',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '菜单状态（0正常 1停用）',
  `perms` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限标识',
  `icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '#' COMMENT '菜单图标',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  `source_group` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单权限表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '建模', 0, 2, 'system', NULL, NULL, 1, 0, 'M', '0', '0', '', 'example', '1128558726395985919', '2018-03-16 11:33:00', 'admin', '2022-08-17 10:24:21', '系统管理目录', 'SYS');
INSERT INTO `sys_menu` VALUES ('10', '提成管理', 7, 0, 'dispatch', 'dispatch/index', NULL, 1, 0, 'C', '0', '0', 'buss:dispatch:list', 'github', '', NULL, '', NULL, '提成记录', NULL);
INSERT INTO `sys_menu` VALUES ('100', '用户管理', 1, 2, 'user', 'system/user/index', '', 1, 0, 'C', '0', '0', 'system:user:list', 'user', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '用户管理菜单', 'CRM');
INSERT INTO `sys_menu` VALUES ('1000', '用户查询', 100, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:user:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1001', '用户新增', 100, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:user:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1002', '用户修改', 100, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:user:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1003', '用户删除', 100, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:user:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1004', '用户导出', 100, 5, '', '', '', 1, 0, 'F', '0', '0', 'system:user:export', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1005', '用户导入', 100, 6, '', '', '', 1, 0, 'F', '0', '0', 'system:user:import', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1006', '重置密码', 100, 7, '', '', '', 1, 0, 'F', '0', '0', 'system:user:resetPwd', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1007', '角色查询', 101, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:role:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1008', '角色新增', 101, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:role:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1009', '角色修改', 101, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:role:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('101', '角色管理', 1, 3, 'role', 'system/role/index', '', 1, 0, 'C', '0', '0', 'system:role:list', 'peoples', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '角色管理菜单', 'HRS');
INSERT INTO `sys_menu` VALUES ('1010', '角色删除', 101, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:role:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1011', '角色导出', 101, 5, '', '', '', 1, 0, 'F', '0', '0', 'system:role:export', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1012', '菜单查询', 102, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:menu:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1013', '菜单新增', 102, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:menu:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1014', '菜单修改', 102, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:menu:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1015', '菜单删除', 102, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:menu:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1016', '部门查询', 103, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:dept:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1017', '部门新增', 103, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:dept:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1018', '部门修改', 103, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:dept:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1019', '部门删除', 103, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:dept:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('102', '菜单管理', 1, 4, 'menu', 'system/menu/index', '', 1, 0, 'C', '1', '0', 'system:menu:list', 'tree-table', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '菜单管理菜单', 'SYS');
INSERT INTO `sys_menu` VALUES ('1020', '岗位查询', 104, 1, '', '', '', 1, 0, 'F', '0', '0', 'system:post:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1021', '岗位新增', 104, 2, '', '', '', 1, 0, 'F', '0', '0', 'system:post:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1022', '岗位修改', 104, 3, '', '', '', 1, 0, 'F', '0', '0', 'system:post:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1023', '岗位删除', 104, 4, '', '', '', 1, 0, 'F', '0', '0', 'system:post:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1024', '岗位导出', 104, 5, '', '', '', 1, 0, 'F', '0', '0', 'system:post:export', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1025', '字典查询', 105, 1, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1026', '字典新增', 105, 2, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1027', '字典修改', 105, 3, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1028', '字典删除', 105, 4, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1029', '字典导出', 105, 5, '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:export', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('103', '部门管理', 1, 1, 'dept', 'system/dept/index', '', 1, 0, 'C', '0', '0', 'system:dept:list', 'tree', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '部门管理菜单', 'ORC');
INSERT INTO `sys_menu` VALUES ('1030', '参数查询', 106, 1, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1031', '参数新增', 106, 2, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1032', '参数修改', 106, 3, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1033', '参数删除', 106, 4, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1034', '参数导出', 106, 5, '#', '', '', 1, 0, 'F', '0', '0', 'system:config:export', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1035', '公告查询', 107, 1, '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1036', '公告新增', 107, 2, '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1037', '公告修改', 107, 3, '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1038', '公告删除', 107, 4, '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1039', '操作查询', 118, 1, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('104', '岗位管理', 1, 5, 'd_post', 'system/d_post/index', '', 1, 0, 'C', '1', '0', 'system:post:list', 'post', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '岗位管理菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1040', '操作删除', 118, 2, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1041', '日志导出', 118, 4, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:export', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1042', '登录查询', 119, 1, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1043', '登录删除', 119, 2, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1044', '日志导出', 119, 3, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:export', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1045', '在线查询', 109, 1, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1046', '批量强退', 109, 2, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:batchLogout', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1047', '单条强退', 109, 3, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:forceLogout', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1048', '任务查询', 110, 1, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1049', '任务新增', 110, 2, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:add', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('105', '字典管理', 1, 6, 'dict', 'system/dict/index', '', 1, 0, 'C', '0', '0', 'system:dict:list', 'dict', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '字典管理菜单', 'CAP');
INSERT INTO `sys_menu` VALUES ('1050', '任务修改', 110, 3, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1051', '任务删除', 110, 4, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1052', '状态修改', 110, 5, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:changeStatus', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1053', '任务导出', 110, 7, '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:export', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1054', '生成查询', 116, 1, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:query', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1055', '生成修改', 116, 2, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:edit', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1056', '生成删除', 116, 3, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:remove', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1057', '导入代码', 116, 2, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:import', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1058', '预览代码', 116, 4, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:preview', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1059', '执行生成', 116, 1, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:code', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('106', '参数设置', 1, 7, 'd_config', 'system/d_config/index', '', 1, 0, 'C', '0', '0', 'system:config:list', 'edit', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '参数设置菜单', 'SYS');
INSERT INTO `sys_menu` VALUES ('1060', '导入数据', 116, 2, '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:import', '#', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('107', '通知公告', 1, 8, 'notice', 'system/notice/index', '', 1, 0, 'C', '0', '0', 'system:notice:list', 'message', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '通知公告菜单', NULL);
INSERT INTO `sys_menu` VALUES ('109', '在线用户', 2, 1, 'online', 'monitor/online/index', '', 1, 0, 'C', '0', '1', 'monitor:online:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '在线用户菜单', NULL);
INSERT INTO `sys_menu` VALUES ('110', '定时任务', 2, 2, 'd_job', 'monitor/d_job/index', '', 1, 0, 'C', '0', '0', 'monitor:job:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '定时任务菜单', NULL);
INSERT INTO `sys_menu` VALUES ('111', '数据监控', 2, 3, 'druid', 'monitor/druid/index', '', 1, 0, 'C', '1', '0', 'monitor:druid:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '数据监控菜单', NULL);
INSERT INTO `sys_menu` VALUES ('112', '服务监控', 2, 4, 'server', 'monitor/server/index', '', 1, 0, 'C', '1', '0', 'monitor:server:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '服务监控菜单', NULL);
INSERT INTO `sys_menu` VALUES ('113', '缓存监控', 2, 5, 'cache', 'monitor/cache/index', '', 1, 0, 'C', '1', '0', 'monitor:cache:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '缓存监控菜单', NULL);
INSERT INTO `sys_menu` VALUES ('114', '缓存列表', 2, 6, 'cacheList', 'monitor/cache/list', '', 1, 0, 'C', '1', '0', 'monitor:cache:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '缓存列表菜单', NULL);
INSERT INTO `sys_menu` VALUES ('116', '代码生成', 2, 2, 'gen', 'tool/gen/index', '', 1, 0, 'C', '0', '0', 'tool:gen:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '代码生成菜单', NULL);
INSERT INTO `sys_menu` VALUES ('117', '系统接口', 2, 3, 'swagger', 'tool/swagger/index', '', 1, 0, 'C', '1', '0', 'tool:swagger:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '系统接口菜单', NULL);
INSERT INTO `sys_menu` VALUES ('118', '操作日志', 2, 1, 'operlog', 'monitor/operlog/index', '', 1, 0, 'C', '0', '0', 'monitor:operlog:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '操作日志菜单', NULL);
INSERT INTO `sys_menu` VALUES ('119', '登录日志', 2, 2, 'logininfor', 'monitor/logininfor/index', '', 1, 0, 'C', '0', '0', 'monitor:logininfor:list', 'github', '1128558726395985919', '2022-07-13 16:21:41', '', NULL, '登录日志菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1458', '产品信息', 5, 2, 'info', 'product/info/index', NULL, 1, 0, 'C', '0', '0', 'product:info:list', 'github', 'admin', '2022-10-20 16:08:47', '', NULL, '产品信息菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1459', '产品信息查询', 1458, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:info:query', '#', 'admin', '2022-10-20 16:08:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1460', '产品信息新增', 1458, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:info:add', '#', 'admin', '2022-10-20 16:08:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1461', '产品信息修改', 1458, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:info:edit', '#', 'admin', '2022-10-20 16:08:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1462', '产品信息删除', 1458, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:info:remove', '#', 'admin', '2022-10-20 16:08:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1463', '产品信息导出', 1458, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:info:export', '#', 'admin', '2022-10-20 16:08:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1464', '产品品牌', 5, 1, 'brand', 'product/brand/index', NULL, 1, 0, 'C', '0', '0', 'product:brand:list', 'github', 'admin', '2022-10-20 16:10:13', '', NULL, '产品品牌信息菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1465', '产品品牌查询', 1464, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:brand:query', '#', 'admin', '2022-10-20 16:10:13', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1466', '产品品牌新增', 1464, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:brand:add', '#', 'admin', '2022-10-20 16:10:13', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1467', '产品品牌修改', 1464, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:brand:edit', '#', 'admin', '2022-10-20 16:10:13', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1468', '产品品牌删除', 1464, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:brand:remove', '#', 'admin', '2022-10-20 16:10:14', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1469', '产品品牌导出', 1464, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:brand:export', '#', 'admin', '2022-10-20 16:10:14', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1470', '调价记录', 6, 3, 'record', 'product/record/index', NULL, 1, 0, 'C', '0', '0', 'product:record:list', 'github', 'admin', '2022-10-21 16:00:27', '', NULL, '产品调价记录菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1471', '调价查询', 1470, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:record:query', '#', 'admin', '2022-10-21 16:00:27', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1472', '调价新增', 1470, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:record:add', '#', 'admin', '2022-10-21 16:00:27', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1473', '调价修改', 1470, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:record:edit', '#', 'admin', '2022-10-21 16:00:27', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1474', '调价删除', 1470, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:record:remove', '#', 'admin', '2022-10-21 16:00:27', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1475', '调价导出', 1470, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:record:export', '#', 'admin', '2022-10-21 16:00:27', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1476', '订单信息', 7, 1, 'order_info', 'order/info/index', NULL, 1, 0, 'C', '0', '0', 'order:info:list', 'github', 'admin', '2022-10-21 16:33:41', '', NULL, '订单信息菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1477', '订单信息查询', 1476, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'order:info:query', '#', 'admin', '2022-10-21 16:33:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1478', '订单信息新增', 1476, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'order:info:add', '#', 'admin', '2022-10-21 16:33:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1479', '订单信息修改', 1476, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'order:info:edit', '#', 'admin', '2022-10-21 16:33:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1480', '订单信息删除', 1476, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'order:info:remove', '#', 'admin', '2022-10-21 16:33:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1481', '订单信息导出', 1476, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'order:info:export', '#', 'admin', '2022-10-21 16:33:41', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1482', 'Banner信息', 6, 1, 'banner', 'banner/info/index', NULL, 1, 0, 'C', '0', '0', 'banner:info:list', 'github', 'admin', '2022-10-25 16:59:44', '', NULL, 'Banner图信息菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1483', 'Banner查询', 1482, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'banner:info:query', '#', 'admin', '2022-10-25 16:59:44', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1484', 'Banner新增', 1482, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'banner:info:add', '#', 'admin', '2022-10-25 16:59:44', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1485', 'Banner修改', 1482, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'banner:info:edit', '#', 'admin', '2022-10-25 16:59:44', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1486', 'Banner删除', 1482, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'banner:info:remove', '#', 'admin', '2022-10-25 16:59:44', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1487', 'Banner导出', 1482, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'banner:info:export', '#', 'admin', '2022-10-25 16:59:44', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1488', '产品品类', 5, 1, 'type', 'product/type/index', NULL, 1, 0, 'C', '0', '0', 'buss:product_type:list', 'github', 'admin', '2022-10-29 11:41:05', '', NULL, '产品品类信息菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1489', '品类信息查询', 1488, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:product_type:query', '#', 'admin', '2022-10-29 11:41:05', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1490', '品类信息新增', 1488, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:product_type:add', '#', 'admin', '2022-10-29 11:41:05', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1491', '品类信息修改', 1488, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:product_type:edit', '#', 'admin', '2022-10-29 11:41:05', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1492', '品类信息删除', 1488, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:product_type:remove', '#', 'admin', '2022-10-29 11:41:05', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1493', '品类信息导出', 1488, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:product_type:export', '#', 'admin', '2022-10-29 11:41:05', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1510', '地区导出', 1505, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'baseInfo:areas:export', '#', 'admin', '2022-11-02 19:32:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1511', '水票信息', 6, 1, 'ticket', 'ticket/info/index', NULL, 1, 0, 'C', '0', '0', 'ticket:info:list', 'github', 'admin', '2022-11-08 16:22:48', '', NULL, '水票信息菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1512', '水票信息查询', 1511, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'ticket:info:query', '#', 'admin', '2022-11-08 16:22:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1513', '水票信息新增', 1511, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'ticket:info:add', '#', 'admin', '2022-11-08 16:22:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1514', '水票信息修改', 1511, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'ticket:info:edit', '#', 'admin', '2022-11-08 16:22:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1515', '水票信息删除', 1511, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'ticket:info:remove', '#', 'admin', '2022-11-08 16:22:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1516', '水票信息导出', 1511, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'ticket:info:export', '#', 'admin', '2022-11-08 16:22:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1517', '水站信息', 6, 1, 'station_info', 'station/info/index', NULL, 1, 0, 'C', '0', '0', 'station:info:list', 'github', 'admin', '2022-11-15 15:37:47', '', NULL, '水站信息菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1518', '水站信息查询', 1517, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'station:info:query', '#', 'admin', '2022-11-15 15:37:47', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1519', '水站信息新增', 1517, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'station:info:add', '#', 'admin', '2022-11-15 15:37:47', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1520', '水站信息修改', 1517, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'station:info:edit', '#', 'admin', '2022-11-15 15:37:47', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1521', '水站信息删除', 1517, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'station:info:remove', '#', 'admin', '2022-11-15 15:37:47', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1522', '水站信息导出', 1517, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'station:info:export', '#', 'admin', '2022-11-15 15:37:47', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1523', '水桶信息', 6, 6, 'buckets_info', 'bucket/record/index', NULL, 1, 0, 'C', '0', '0', 'bucket:record:list', 'github', 'admin', '2022-11-17 18:06:03', '', NULL, '水桶信息菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1524', '水桶信息查询', 1523, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'bucket:record:query', '#', 'admin', '2022-11-17 18:06:03', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1525', '水桶信息新增', 1523, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'bucket:record:add', '#', 'admin', '2022-11-17 18:06:03', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1526', '水桶信息修改', 1523, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'bucket:record:edit', '#', 'admin', '2022-11-17 18:06:03', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1527', '水桶信息删除', 1523, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'bucket:record:remove', '#', 'admin', '2022-11-17 18:06:03', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1528', '水桶信息导出', 1523, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'bucket:record:export', '#', 'admin', '2022-11-17 18:06:03', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1531', '开票记录查询', 9, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'invoice:record:query', '#', 'admin', '2023-01-05 10:38:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1532', '开票记录新增', 9, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'invoice:record:add', '#', 'admin', '2023-01-05 10:38:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1533', '开票记录修改', 9, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'invoice:record:edit', '#', 'admin', '2023-01-05 10:38:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1534', '开票记录删除', 9, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'invoice:record:remove', '#', 'admin', '2023-01-05 10:38:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1535', '开票记录导出', 9, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'invoice:record:export', '#', 'admin', '2023-01-05 10:38:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1536', '执行开票', 9, 6, '#', '', NULL, 1, 0, 'F', '0', '0', 'invoice:record:doinvoice', '#', 'admin', '2023-01-05 10:38:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1543', '配送员管理', 6, 5, 'poster', 'poster/index', NULL, 1, 0, 'C', '0', '0', 'buss:poster:list', 'github', 'admin', '2023-02-07 09:59:16', '', NULL, '配送员信息主菜单', NULL);
INSERT INTO `sys_menu` VALUES ('1544', '配送员信息主查询', 1543, 1, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:poster:query', '#', 'admin', '2023-02-07 09:59:16', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1545', '配送员信息主新增', 1543, 2, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:poster:add', '#', 'admin', '2023-02-07 09:59:16', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1546', '配送员信息主修改', 1543, 3, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:poster:edit', '#', 'admin', '2023-02-07 09:59:16', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1547', '配送员信息主删除', 1543, 4, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:poster:remove', '#', 'admin', '2023-02-07 09:59:16', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1548', '配送员信息主导出', 1543, 5, '#', '', NULL, 1, 0, 'F', '0', '0', 'buss:poster:export', '#', 'admin', '2023-02-07 09:59:16', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('1549', '调价', 1458, 6, '#', '', NULL, 1, 0, 'F', '0', '0', 'product:info:adjust', '#', 'admin', '2022-10-20 16:08:48', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('2', '监控', 0, 3, 'monitor', NULL, NULL, 1, 0, 'M', '0', '0', '', 'druid', '1128558726395985919', '2018-03-16 11:33:00', 'admin', '2022-08-17 11:10:09', '系统管理目录', 'BX');
INSERT INTO `sys_menu` VALUES ('3', '业务', 0, 3, 'buss', NULL, NULL, 1, 0, 'M', '0', '0', '', 'druid', '1128558726395985919', '2018-03-16 11:33:00', 'admin', '2022-08-17 11:10:09', '系统管理目录', 'BX');
INSERT INTO `sys_menu` VALUES ('5', '产品管理', 3, 5, 'product_infos', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'druid', '1128558726395985919', '2018-03-16 11:33:00', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('6', '水站管理', 3, 6, 'station_infos', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'druid', '1128558726395985919', '2018-03-16 11:33:00', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('7', '订单管理', 3, 6, 'order_infos', NULL, NULL, 1, 0, 'M', '0', '0', NULL, 'druid', '1128558726395985919', '2018-03-16 11:33:00', '', NULL, '', NULL);
INSERT INTO `sys_menu` VALUES ('9', '开票管理', 7, 2, 'invoice_record', 'invoice_record/index', NULL, 1, 0, 'C', '0', '0', 'invoice:record:list', 'druid', '1128558726395985919', '2023-01-05 10:38:48', '', NULL, '开票管理菜单', NULL);

-- ----------------------------
-- Table structure for sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `sys_notice`;
CREATE TABLE `sys_notice`  (
  `notice_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '公告ID',
  `notice_title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公告标题',
  `notice_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公告类型（1通知 2公告）',
  `notice_content` longblob NULL COMMENT '公告内容',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '公告状态（0正常 1关闭）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`notice_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '通知公告表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_notice
-- ----------------------------

-- ----------------------------
-- Table structure for sys_oper_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_oper_log`;
CREATE TABLE `sys_oper_log`  (
  `oper_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志主键',
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '模块标题',
  `business_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '业务类型（0其它 1新增 2修改 3删除）',
  `method` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '方法名称',
  `request_method` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '请求方式',
  `operator_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '操作类别（0其它 1后台用户 2手机端用户）',
  `oper_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '操作人员',
  `dept_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '部门名称',
  `oper_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '请求URL',
  `oper_ip` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '主机地址',
  `oper_location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '操作地点',
  `oper_param` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '请求参数',
  `json_result` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '返回参数',
  `status` int(1) NULL DEFAULT 0 COMMENT '操作状态（0正常 1异常）',
  `error_msg` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '错误消息',
  `oper_time` datetime NULL DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`oper_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '操作日志记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_oper_log
-- ----------------------------
INSERT INTO `sys_oper_log` VALUES (1, '定时任务', 'INSERT', 'SysJobCtl.add()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job', '127.0.0.1', NULL, '[{\"concurrent\":\"0\",\"createBy\":\"1128558726395985919\",\"createTime\":\"2022-07-01 17:54:26\",\"cronExpression\":\"0 0/10 * * * ?\",\"invokeTarget\":\"myTask.cleanOrder\",\"jobGroup\":\"DEFAULT\",\"jobId\":1,\"jobName\":\"清除未支付超时订单(10分钟执行一次)\",\"misfirePolicy\":\"1\",\"nextValidTime\":1677219600000,\"remark\":\"\",\"status\":\"1\"}]', '{\"code\":200,\"msg\":\"操作成功!\",\"success\":true}', 0, NULL, '2023-02-24 14:19:06');
INSERT INTO `sys_oper_log` VALUES (2, '定时任务', 'DELETE', 'SysJobCtl.remove()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/1', '127.0.0.1', NULL, '[[1]]', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.TooManyResultsException: Expected one result (or null) to be returned by selectOne(), but found: 2', '2023-02-24 14:19:31');
INSERT INTO `sys_oper_log` VALUES (3, '定时任务', 'UPDATE', 'SysJobCtl.run()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/run', '127.0.0.1', NULL, '[{\"jobGroup\":\"DEFAULT\",\"jobId\":1}]', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.TooManyResultsException: Expected one result (or null) to be returned by selectOne(), but found: 2', '2023-02-24 14:21:50');
INSERT INTO `sys_oper_log` VALUES (4, '定时任务', 'DELETE', 'SysJobCtl.remove()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/2', '127.0.0.1', NULL, '[[2]]', '{\"code\":200,\"msg\":\"操作成功!\",\"success\":true}', 0, NULL, '2023-02-24 14:22:49');
INSERT INTO `sys_oper_log` VALUES (5, '定时任务', 'UPDATE', 'SysJobCtl.changeStatus()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/changeStatus', '127.0.0.1', NULL, '[{\"jobId\":1,\"status\":\"0\"}]', '{\"code\":200,\"msg\":\"操作成功!\",\"success\":true}', 0, NULL, '2023-02-24 14:22:54');
INSERT INTO `sys_oper_log` VALUES (6, '定时任务', 'UPDATE', 'SysJobCtl.run()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/run', '127.0.0.1', NULL, '[{\"jobGroup\":\"DEFAULT\",\"jobId\":1}]', '{\"code\":200,\"msg\":\"操作成功!\",\"success\":true}', 0, NULL, '2023-02-24 14:23:08');
INSERT INTO `sys_oper_log` VALUES (7, '定时任务', 'INSERT', 'SysJobCtl.add()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job', '127.0.0.1', NULL, '[{\"concurrent\":\"0\",\"createBy\":\"1128558726395985919\",\"createTime\":\"2023-02-24 14:19:06\",\"cronExpression\":\"0 0/10 * * * ?\",\"invokeTarget\":\"myTask.cleanOrder\",\"jobGroup\":\"DEFAULT\",\"jobId\":1,\"jobName\":\"清除未支付超时订单(10分钟执行一次)\",\"misfirePolicy\":\"1\",\"nextValidTime\":1677220200000,\"remark\":\"\",\"status\":\"1\"}]', 'null', 1, '\r\n### Error updating database.  Cause: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'1-清除未支付超时订单(10分钟执行一次)-DEFAULT\' for key \'PRIMARY\'\r\n### The error may exist in file [E:\\Project_Rep\\OutWork\\App\\target\\classes\\mapper\\system_service\\quartz\\SysJobMapper.xml]\r\n### The error may involve com.cms.system_service.quartz.mapper.SysJobMapper.insertJob-Inline\r\n### The error occurred while setting parameters\r\n### SQL: insert into sys_job(      job_id,       job_name,       job_group,       invoke_target,       cron_expression,       misfire_policy,       concurrent,       status,             create_by,      create_time    )values(      ?,       ?,       ?,       ?,       ?,       ?,       ?,       ?,             ?,      sysdate()    )\r\n### Cause: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'1-清除未支付超时订单(10分钟执行一次)-DEFAULT\' for key \'PRIMARY\'\n; Duplicate entry \'1-清除未支付超时订单(10分钟执行一次)-DEFAULT\' for key \'PRIMARY\'; nested exception is java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'1-清除未支付超时订单(10分钟执行一次)-DEFAULT\' for key \'PRIMARY\'', '2023-02-24 14:25:32');
INSERT INTO `sys_oper_log` VALUES (8, '定时任务', 'UPDATE', 'SysJobCtl.run()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/run', '127.0.0.1', NULL, '[{\"jobGroup\":\"SYSTEM\",\"jobId\":2}]', 'null', 1, 'The job (SYSTEM.TASK_CLASS_NAME2) referenced by the trigger does not exist.', '2023-04-07 10:18:26');
INSERT INTO `sys_oper_log` VALUES (9, '定时任务', 'INSERT', 'SysJobCtl.add()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job', '127.0.0.1', NULL, '[{\"concurrent\":\"1\",\"createBy\":\"1128558726395985919\",\"createTime\":\"2023-04-06 14:20:19\",\"cronExpression\":\"0 0 2 1 * ?\",\"invokeTarget\":\"myTask.createYueJieOrder\",\"jobGroup\":\"SYSTEM\",\"jobId\":2,\"jobName\":\"每月1号2:00生成月结账单任务\",\"misfirePolicy\":\"3\",\"nextValidTime\":1682877600000,\"remark\":\"\",\"status\":\"1\"}]', 'null', 1, '\r\n### Error updating database.  Cause: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'2-每月1号2:00生成月结账单任务-SYSTEM\' for key \'PRIMARY\'\r\n### The error may exist in class path resource [mapper/system_service/quartz/SysJobMapper.xml]\r\n### The error may involve com.cms.system_service.quartz.mapper.SysJobMapper.insertJob-Inline\r\n### The error occurred while setting parameters\r\n### SQL: insert into sys_job(      job_id,       job_name,       job_group,       invoke_target,       cron_expression,       misfire_policy,       concurrent,       status,             create_by,      create_time    )values(      ?,       ?,       ?,       ?,       ?,       ?,       ?,       ?,             ?,      sysdate()    )\r\n### Cause: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'2-每月1号2:00生成月结账单任务-SYSTEM\' for key \'PRIMARY\'\n; Duplicate entry \'2-每月1号2:00生成月结账单任务-SYSTEM\' for key \'PRIMARY\'; nested exception is java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'2-每月1号2:00生成月结账单任务-SYSTEM\' for key \'PRIMARY\'', '2023-04-07 10:18:39');
INSERT INTO `sys_oper_log` VALUES (10, '定时任务', 'INSERT', 'SysJobCtl.add()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job', '127.0.0.1', NULL, '[{\"concurrent\":\"1\",\"createBy\":\"1128558726395985919\",\"createTime\":\"2023-04-06 14:20:19\",\"cronExpression\":\"0 0 2 1 * ?\",\"invokeTarget\":\"myTask.createYueJieOrder\",\"jobGroup\":\"SYSTEM\",\"jobId\":2,\"jobName\":\"每月1号2:00生成月结账单任务\",\"misfirePolicy\":\"3\",\"nextValidTime\":1682877600000,\"remark\":\"\",\"status\":\"1\"}]', 'null', 1, '\r\n### Error updating database.  Cause: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'2-每月1号2:00生成月结账单任务-SYSTEM\' for key \'PRIMARY\'\r\n### The error may exist in class path resource [mapper/system_service/quartz/SysJobMapper.xml]\r\n### The error may involve com.cms.system_service.quartz.mapper.SysJobMapper.insertJob-Inline\r\n### The error occurred while setting parameters\r\n### SQL: insert into sys_job(      job_id,       job_name,       job_group,       invoke_target,       cron_expression,       misfire_policy,       concurrent,       status,             create_by,      create_time    )values(      ?,       ?,       ?,       ?,       ?,       ?,       ?,       ?,             ?,      sysdate()    )\r\n### Cause: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'2-每月1号2:00生成月结账单任务-SYSTEM\' for key \'PRIMARY\'\n; Duplicate entry \'2-每月1号2:00生成月结账单任务-SYSTEM\' for key \'PRIMARY\'; nested exception is java.sql.SQLIntegrityConstraintViolationException: Duplicate entry \'2-每月1号2:00生成月结账单任务-SYSTEM\' for key \'PRIMARY\'', '2023-04-07 10:18:45');
INSERT INTO `sys_oper_log` VALUES (11, '定时任务', 'UPDATE', 'SysJobCtl.run()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/run', '127.0.0.1', NULL, '[{\"jobGroup\":\"SYSTEM\",\"jobId\":2}]', 'null', 1, 'The job (SYSTEM.TASK_CLASS_NAME2) referenced by the trigger does not exist.', '2023-04-07 10:20:04');
INSERT INTO `sys_oper_log` VALUES (12, '定时任务', 'DELETE', 'SysJobCtl.remove()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/2', '127.0.0.1', NULL, '[[2]]', '{\"code\":200,\"msg\":\"操作成功!\",\"success\":true}', 0, NULL, '2023-04-07 10:20:34');
INSERT INTO `sys_oper_log` VALUES (13, '定时任务', 'INSERT', 'SysJobCtl.add()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job', '127.0.0.1', NULL, '[{\"concurrent\":\"1\",\"createBy\":\"1128558726395985919\",\"cronExpression\":\"0 0 2 1 * ?\",\"invokeTarget\":\"myTask.createYueJieOrder\",\"jobId\":3,\"jobName\":\"每月1号2:00生成月结账单任务\",\"misfirePolicy\":\"3\",\"nextValidTime\":1682877600000,\"status\":\"1\"}]', '{\"code\":200,\"msg\":\"操作成功!\",\"success\":true}', 0, NULL, '2023-04-07 10:21:01');
INSERT INTO `sys_oper_log` VALUES (14, '定时任务', 'UPDATE', 'SysJobCtl.run()', 'POST', NULL, '1128558726395985919', NULL, '/monitor/job/run', '127.0.0.1', NULL, '[{\"jobGroup\":\"DEFAULT\",\"jobId\":3}]', '{\"code\":200,\"msg\":\"操作成功!\",\"success\":true}', 0, NULL, '2023-04-07 10:21:04');

-- ----------------------------
-- Table structure for sys_post
-- ----------------------------
DROP TABLE IF EXISTS `sys_post`;
CREATE TABLE `sys_post`  (
  `post_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '岗位ID',
  `post_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '岗位编码',
  `post_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '岗位名称',
  `post_sort` int(4) NOT NULL COMMENT '显示顺序',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`post_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '岗位信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_post
-- ----------------------------
INSERT INTO `sys_post` VALUES ('1', 'ceo', '董事长', 1, '0', 'admin', '2022-07-01 17:54:25', '', NULL, '');
INSERT INTO `sys_post` VALUES ('2', 'se', '项目经理', 2, '0', 'admin', '2022-07-01 17:54:25', '', NULL, '');
INSERT INTO `sys_post` VALUES ('3', 'hr', '人力资源', 3, '0', 'admin', '2022-07-01 17:54:25', '', NULL, '');

-- ----------------------------
-- Table structure for sys_resource_info
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource_info`;
CREATE TABLE `sys_resource_info`  (
  `pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源主键',
  `source_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源名称',
  `source_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源地址',
  `source_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源账户',
  `source_pass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源密码',
  `source_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源类型(远程账户 阿里云账户 域名账户)',
  `expir_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '过期时间',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ud5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '资源信息管理(服务器|域名|阿里云账户)' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_resource_info
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `role_key` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色权限字符串',
  `role_sort` int(4) NOT NULL COMMENT '显示顺序',
  `data_scope` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）',
  `menu_check_strictly` tinyint(1) NULL DEFAULT 1 COMMENT '菜单树选择项是否关联显示',
  `dept_check_strictly` tinyint(1) NULL DEFAULT 1 COMMENT '部门树选择项是否关联显示',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色状态（0正常 1停用）',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`role_id`) USING BTREE,
  UNIQUE INDEX `role_key`(`role_key`) USING BTREE,
  UNIQUE INDEX `role_name`(`role_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, '超级管理员', 'ADMIN', 1, '1', 1, 1, '0', '0', '1128558726395985920', '2021-08-27 10:14:27', NULL, NULL, NULL);
INSERT INTO `sys_role` VALUES (2, '管理员', 'Admin-common', 1, '1', 1, 1, '0', '0', 'admin', '2018-03-16 11:33:00', 'admin', '2023-03-17 11:17:42', '管理员');
INSERT INTO `sys_role` VALUES (3, '普通角色', 'common', 2, '2', 1, 1, '0', '0', 'admin', '2018-03-16 11:33:00', 'admin', '2023-03-17 15:54:39', '普通角色');
INSERT INTO `sys_role` VALUES (4, '测试角色', 'test', 3, '1', 1, 1, '0', '0', '1128558726395985920', '2021-08-27 10:14:27', NULL, NULL, NULL);
INSERT INTO `sys_role` VALUES (5, '演示角色', 'YSJS', 3, '1', 1, 1, '0', '0', '1128558726395985920', '2021-08-27 10:14:27', 'admin', '2023-01-03 10:49:31', NULL);
INSERT INTO `sys_role` VALUES (6, '水站管理员', 'station_manger', 0, '4', 1, 1, '0', '0', 'admin', '2023-03-17 11:02:15', 'admin', '2023-03-27 18:30:35', NULL);

-- ----------------------------
-- Table structure for sys_role_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_dept`;
CREATE TABLE `sys_role_dept`  (
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `dept_id` bigint(20) NOT NULL COMMENT '部门ID',
  PRIMARY KEY (`role_id`, `dept_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色和部门关联表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role_dept
-- ----------------------------
INSERT INTO `sys_role_dept` VALUES (2, 100);
INSERT INTO `sys_role_dept` VALUES (2, 101);
INSERT INTO `sys_role_dept` VALUES (2, 105);

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu`  (
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `menu_id` bigint(20) NOT NULL COMMENT '菜单ID',
  PRIMARY KEY (`role_id`, `menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色和菜单关联表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES (3, 1);
INSERT INTO `sys_role_menu` VALUES (3, 100);
INSERT INTO `sys_role_menu` VALUES (3, 101);
INSERT INTO `sys_role_menu` VALUES (3, 102);
INSERT INTO `sys_role_menu` VALUES (3, 103);
INSERT INTO `sys_role_menu` VALUES (3, 104);
INSERT INTO `sys_role_menu` VALUES (3, 105);
INSERT INTO `sys_role_menu` VALUES (3, 106);
INSERT INTO `sys_role_menu` VALUES (3, 107);
INSERT INTO `sys_role_menu` VALUES (3, 1000);
INSERT INTO `sys_role_menu` VALUES (3, 1001);
INSERT INTO `sys_role_menu` VALUES (3, 1002);
INSERT INTO `sys_role_menu` VALUES (3, 1003);
INSERT INTO `sys_role_menu` VALUES (3, 1004);
INSERT INTO `sys_role_menu` VALUES (3, 1005);
INSERT INTO `sys_role_menu` VALUES (3, 1006);
INSERT INTO `sys_role_menu` VALUES (3, 1007);
INSERT INTO `sys_role_menu` VALUES (3, 1008);
INSERT INTO `sys_role_menu` VALUES (3, 1009);
INSERT INTO `sys_role_menu` VALUES (3, 1010);
INSERT INTO `sys_role_menu` VALUES (3, 1011);
INSERT INTO `sys_role_menu` VALUES (3, 1012);
INSERT INTO `sys_role_menu` VALUES (3, 1013);
INSERT INTO `sys_role_menu` VALUES (3, 1014);
INSERT INTO `sys_role_menu` VALUES (3, 1015);
INSERT INTO `sys_role_menu` VALUES (3, 1016);
INSERT INTO `sys_role_menu` VALUES (3, 1017);
INSERT INTO `sys_role_menu` VALUES (3, 1018);
INSERT INTO `sys_role_menu` VALUES (3, 1019);
INSERT INTO `sys_role_menu` VALUES (3, 1020);
INSERT INTO `sys_role_menu` VALUES (3, 1021);
INSERT INTO `sys_role_menu` VALUES (3, 1022);
INSERT INTO `sys_role_menu` VALUES (3, 1023);
INSERT INTO `sys_role_menu` VALUES (3, 1024);
INSERT INTO `sys_role_menu` VALUES (3, 1025);
INSERT INTO `sys_role_menu` VALUES (3, 1026);
INSERT INTO `sys_role_menu` VALUES (3, 1027);
INSERT INTO `sys_role_menu` VALUES (3, 1028);
INSERT INTO `sys_role_menu` VALUES (3, 1029);
INSERT INTO `sys_role_menu` VALUES (3, 1030);
INSERT INTO `sys_role_menu` VALUES (3, 1031);
INSERT INTO `sys_role_menu` VALUES (3, 1032);
INSERT INTO `sys_role_menu` VALUES (3, 1033);
INSERT INTO `sys_role_menu` VALUES (3, 1034);
INSERT INTO `sys_role_menu` VALUES (3, 1035);
INSERT INTO `sys_role_menu` VALUES (3, 1036);
INSERT INTO `sys_role_menu` VALUES (3, 1037);
INSERT INTO `sys_role_menu` VALUES (3, 1038);
INSERT INTO `sys_role_menu` VALUES (6, 3);
INSERT INTO `sys_role_menu` VALUES (6, 5);
INSERT INTO `sys_role_menu` VALUES (6, 6);
INSERT INTO `sys_role_menu` VALUES (6, 7);
INSERT INTO `sys_role_menu` VALUES (6, 9);
INSERT INTO `sys_role_menu` VALUES (6, 10);
INSERT INTO `sys_role_menu` VALUES (6, 1458);
INSERT INTO `sys_role_menu` VALUES (6, 1459);
INSERT INTO `sys_role_menu` VALUES (6, 1460);
INSERT INTO `sys_role_menu` VALUES (6, 1461);
INSERT INTO `sys_role_menu` VALUES (6, 1462);
INSERT INTO `sys_role_menu` VALUES (6, 1463);
INSERT INTO `sys_role_menu` VALUES (6, 1464);
INSERT INTO `sys_role_menu` VALUES (6, 1465);
INSERT INTO `sys_role_menu` VALUES (6, 1466);
INSERT INTO `sys_role_menu` VALUES (6, 1467);
INSERT INTO `sys_role_menu` VALUES (6, 1468);
INSERT INTO `sys_role_menu` VALUES (6, 1469);
INSERT INTO `sys_role_menu` VALUES (6, 1470);
INSERT INTO `sys_role_menu` VALUES (6, 1471);
INSERT INTO `sys_role_menu` VALUES (6, 1472);
INSERT INTO `sys_role_menu` VALUES (6, 1473);
INSERT INTO `sys_role_menu` VALUES (6, 1474);
INSERT INTO `sys_role_menu` VALUES (6, 1475);
INSERT INTO `sys_role_menu` VALUES (6, 1476);
INSERT INTO `sys_role_menu` VALUES (6, 1477);
INSERT INTO `sys_role_menu` VALUES (6, 1478);
INSERT INTO `sys_role_menu` VALUES (6, 1479);
INSERT INTO `sys_role_menu` VALUES (6, 1480);
INSERT INTO `sys_role_menu` VALUES (6, 1481);
INSERT INTO `sys_role_menu` VALUES (6, 1482);
INSERT INTO `sys_role_menu` VALUES (6, 1483);
INSERT INTO `sys_role_menu` VALUES (6, 1484);
INSERT INTO `sys_role_menu` VALUES (6, 1485);
INSERT INTO `sys_role_menu` VALUES (6, 1486);
INSERT INTO `sys_role_menu` VALUES (6, 1487);
INSERT INTO `sys_role_menu` VALUES (6, 1488);
INSERT INTO `sys_role_menu` VALUES (6, 1489);
INSERT INTO `sys_role_menu` VALUES (6, 1490);
INSERT INTO `sys_role_menu` VALUES (6, 1491);
INSERT INTO `sys_role_menu` VALUES (6, 1492);
INSERT INTO `sys_role_menu` VALUES (6, 1493);
INSERT INTO `sys_role_menu` VALUES (6, 1511);
INSERT INTO `sys_role_menu` VALUES (6, 1512);
INSERT INTO `sys_role_menu` VALUES (6, 1513);
INSERT INTO `sys_role_menu` VALUES (6, 1514);
INSERT INTO `sys_role_menu` VALUES (6, 1515);
INSERT INTO `sys_role_menu` VALUES (6, 1516);
INSERT INTO `sys_role_menu` VALUES (6, 1517);
INSERT INTO `sys_role_menu` VALUES (6, 1518);
INSERT INTO `sys_role_menu` VALUES (6, 1519);
INSERT INTO `sys_role_menu` VALUES (6, 1520);
INSERT INTO `sys_role_menu` VALUES (6, 1521);
INSERT INTO `sys_role_menu` VALUES (6, 1522);
INSERT INTO `sys_role_menu` VALUES (6, 1523);
INSERT INTO `sys_role_menu` VALUES (6, 1524);
INSERT INTO `sys_role_menu` VALUES (6, 1525);
INSERT INTO `sys_role_menu` VALUES (6, 1526);
INSERT INTO `sys_role_menu` VALUES (6, 1527);
INSERT INTO `sys_role_menu` VALUES (6, 1528);
INSERT INTO `sys_role_menu` VALUES (6, 1531);
INSERT INTO `sys_role_menu` VALUES (6, 1532);
INSERT INTO `sys_role_menu` VALUES (6, 1533);
INSERT INTO `sys_role_menu` VALUES (6, 1534);
INSERT INTO `sys_role_menu` VALUES (6, 1535);
INSERT INTO `sys_role_menu` VALUES (6, 1536);
INSERT INTO `sys_role_menu` VALUES (6, 1543);
INSERT INTO `sys_role_menu` VALUES (6, 1544);
INSERT INTO `sys_role_menu` VALUES (6, 1545);
INSERT INTO `sys_role_menu` VALUES (6, 1546);
INSERT INTO `sys_role_menu` VALUES (6, 1547);
INSERT INTO `sys_role_menu` VALUES (6, 1548);
INSERT INTO `sys_role_menu` VALUES (6, 1549);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户ID',
  `org_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '所属组织',
  `dept_id` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '部门ID',
  `user_name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户账号',
  `nick_name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户昵称',
  `user_type` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '00' COMMENT '用户类型（00系统用户）',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '' COMMENT '用户邮箱',
  `phonenumber` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '' COMMENT '手机号码',
  `sex` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '0' COMMENT '用户性别（0男 1女 2未知）',
  `avatar` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '' COMMENT '头像地址',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '' COMMENT '密码',
  `status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '0' COMMENT '帐号状态（0正常 1停用）',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `login_ip` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '' COMMENT '最后登录IP',
  `login_date` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '备注',
  `cloud_pk` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '归属水站',
  `ud1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud3` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud4` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud5` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud6` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud7` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud8` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud9` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `ud10` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE INDEX `user_name`(`user_name`) USING BTREE,
  INDEX `user_id`(`user_id`, `org_id`, `dept_id`, `phonenumber`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '用户信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1128558726395985919', '1', '1', 'admin', 'SuperAdmin', '0', '1060296473@qq.com', '15221908585', '0', '/profile/upload/20230202/O50E47O3ekPg941b20c05926c680006e40ba50657017_20230202095300A001.jpeg', 'ea77d51mdaib0nab00108c0a30820f503d03506f02f0fd0a', '0', '0', '127.0.0.1', '2023-02-09 13:33:20', NULL, '1900-01-21 15:12:22', NULL, '2023-02-09 13:33:20', NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_user` VALUES ('1631170740586536960', NULL, '1', '13818613675', '老张同学', '00', '', '13818613675', '0', '/profile/upload/20230315/tmp_f6e7394fd3353c90a270bc9c4ab076b46f61d4665447842f_1635924692209229824.jpg', 'D1F73AA8D719B87D63012031162C7E45000690F80A40940E', '0', '0', '', NULL, '', '2023-03-02 13:53:04', 'admin', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'ou7Kr4uoi2aQDCVCnhC2J3O5wsqw');
INSERT INTO `sys_user` VALUES ('1632045246196736000', '1', '1', '13681669688', '营泉吴总', '00', '', '13681669688', '0', '', '910B30E64F8BF1236EA66299866D8F88170340CF0D90CC0E', '0', '0', '', NULL, '', '2023-03-04 23:48:03', 'admin', NULL, NULL, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'ou7Kr4jL9TxG9SWcm4GntwgCpyGo');
INSERT INTO `sys_user` VALUES ('1645697862684368896', NULL, NULL, '15801896440', '微信用户', '00', '', '15801896440', '0', '', '11E35948360681EE8879136FB42D4120340ED02500305A01', '0', '0', '', NULL, '', '2023-04-11 15:58:40', '', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'ou7Kr4gb_Wt8-biyiS4dgpa-XCaQ');
INSERT INTO `sys_user` VALUES ('1645699973551742976', NULL, NULL, '18018665834', '微信用户', '00', '', '18018665834', '0', '', '41D88FD02C1718BD6546E85E18E233340D02F0B70FF0FA06', '0', '0', '', NULL, '', '2023-04-11 16:07:03', '', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'ou7Kr4rkDm2UahwGaQPfaQm029V4');
INSERT INTO `sys_user` VALUES ('1645797594857463808', NULL, NULL, '17360498262', '微信用户', '00', '', '17360498262', '0', '', '31637443266FD0DF4389F784F2E06992EB0790FB09D0440D', '0', '0', '', NULL, '', '2023-04-11 22:34:58', '', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'ou7Kr4mXyGNNulbaOcRzhJyF69gw');
INSERT INTO `sys_user` VALUES ('1645987785777864704', NULL, NULL, '18933807696', '微信用户', '00', '', '18933807696', '0', '', '81A789F92B31F3B188B0E07E76E89566350870EE0E203306', '0', '0', '', NULL, '', '2023-04-12 11:10:43', '', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'ou7Kr4tvlh-eqyarbozWOJVvHpZM');

-- ----------------------------
-- Table structure for sys_user_post
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_post`;
CREATE TABLE `sys_user_post`  (
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `post_id` bigint(20) NOT NULL COMMENT '岗位ID',
  PRIMARY KEY (`user_id`, `post_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户与岗位关联表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user_post
-- ----------------------------
INSERT INTO `sys_user_post` VALUES (1, 1);
INSERT INTO `sys_user_post` VALUES (2, 2);
INSERT INTO `sys_user_post` VALUES (1543847093518196736, 1);

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户和角色关联表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES (1, 1);
INSERT INTO `sys_user_role` VALUES (2, 2);
INSERT INTO `sys_user_role` VALUES (1435493351615889408, 61);
INSERT INTO `sys_user_role` VALUES (1543847093518196736, 61);
INSERT INTO `sys_user_role` VALUES (1631547519121743872, 6);
INSERT INTO `sys_user_role` VALUES (1640667914923925504, 6);

-- ----------------------------
-- Table structure for sys_user_source_info
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_source_info`;
CREATE TABLE `sys_user_source_info`  (
  `pk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主键',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户Id',
  `parent_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上级用户ID',
  `station_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '水站ID',
  `reversion` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乐观锁',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `no1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `no15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息子表(用户来源信息-分销系统)' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user_source_info
-- ----------------------------

-- ----------------------------
-- Table structure for xx_integrate
-- ----------------------------
DROP TABLE IF EXISTS `xx_integrate`;
CREATE TABLE `xx_integrate`  (
  `pk` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `issyn` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'N' COMMENT '是否同步',
  `itfaddress` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口地址',
  `syndays` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '同步天数',
  `nctbm` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'NC考勤同步',
  `ncapprove` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'NC审批同步',
  `direction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '同步方向',
  `corpid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '钉钉(微信)corpid',
  `appkey` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '钉钉(微信)appkey',
  `appsecret` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '钉钉(微信)appsecret',
  `agentId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '钉钉(微信)agentId',
  `create_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `delete_flag` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '删除标识(0否:1是)',
  `enabled_flag` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Y' COMMENT '启用标识(N:Y)',
  `sdf01` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段1',
  `sdf02` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段2',
  `sdf03` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段3',
  `sdf04` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段4',
  `sdf05` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段5',
  `sdf06` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段6',
  `sdf07` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段7',
  `sdf08` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段8',
  `sdf09` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段9',
  `sdf10` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段10',
  `sdf11` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段11',
  `sdf12` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段12',
  `sdf13` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段13',
  `sdf14` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段14',
  `sdf15` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段15',
  `sdf16` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段16',
  `sdf17` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段17',
  `sdf18` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段18',
  `sdf19` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段19',
  `sdf20` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段20',
  PRIMARY KEY (`pk`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '与第三方系统集成' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of xx_integrate
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
