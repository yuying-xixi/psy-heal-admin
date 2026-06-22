/*

 咨询师管理模块数据库表
 Author : 雨影熙熙
 Date   : 2026-06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- 1、咨询师等级表
-- ----------------------------
DROP TABLE IF EXISTS `consult_level`;
CREATE TABLE `consult_level` (
                                 `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                 `level_name` varchar(50) NOT NULL COMMENT '等级名称',
                                 `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                 `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                 `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                 `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                 `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                 UNIQUE KEY `uk_level_name` (`level_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='咨询师等级';

-- 初始化等级数据
INSERT INTO `consult_level` (`level_name`) VALUES
                                               ('一级咨询师'),
                                               ('二级咨询师'),
                                               ('三级咨询师');

-- ----------------------------
-- 2、咨询师表
-- ----------------------------
DROP TABLE IF EXISTS `consult`;
CREATE TABLE `consult` (
                           `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                           `sys_user_id` bigint COMMENT '系统用户ID',
                           `name` varchar(50) NOT NULL COMMENT '姓名',
                           `level_id` bigint COMMENT '等级ID',
                           `mobile` varchar(11) NOT NULL COMMENT '手机号',
                           `email` varchar(100) COMMENT '邮箱',
                           `avatar` varchar(255) COMMENT '头像',
                           `gender` char(1) DEFAULT '2' COMMENT '性别（0男 1女 2未知）',
                           `cert_img` varchar(255) COMMENT '证书图片',
                           `address` varchar(255) COMMENT '地址',
                           `intro` text COMMENT '个人简介',
                           `position` tinyint DEFAULT 0 COMMENT '0咨询师 1导师',
                           `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                           `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                           `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                           `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                           `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                           UNIQUE KEY `uk_mobile` (`mobile`),
                           KEY `idx_level` (`level_id`),
                           CONSTRAINT `fk_consult_level` FOREIGN KEY (`level_id`) REFERENCES `consult_level` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='咨询师';

-- ----------------------------
-- 3、擅长领域
-- ----------------------------
DROP TABLE IF EXISTS `consult_good_at`;
CREATE TABLE `consult_good_at` (
                                   `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                   `field_name` varchar(100) NOT NULL COMMENT '领域名称',
                                   `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                   `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                   `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                   UNIQUE KEY `uk_field` (`field_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='擅长领域';

-- 初始化擅长领域
INSERT INTO `consult_good_at` (`field_name`) VALUES
                                                 ('情绪管理'),
                                                 ('人际关系'),
                                                 ('婚姻家庭'),
                                                 ('职业规划'),
                                                 ('儿童心理'),
                                                 ('青少年心理'),
                                                 ('老年心理'),
                                                 ('危机干预');

-- ----------------------------
-- 4、咨询师擅长关联
-- ----------------------------
DROP TABLE IF EXISTS `consult_good_at_rel`;
CREATE TABLE `consult_good_at_rel` (
                                       `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                       `consult_id` bigint NOT NULL COMMENT '咨询师ID',
                                       `field_id` bigint NOT NULL COMMENT '领域ID',
                                       UNIQUE KEY `uk_consult_field` (`consult_id`,`field_id`),
                                       CONSTRAINT `fk_rel_consult` FOREIGN KEY (`consult_id`) REFERENCES `consult` (`id`),
                                       CONSTRAINT `fk_rel_field` FOREIGN KEY (`field_id`) REFERENCES `consult_good_at` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='咨询师擅长关联';

-- ----------------------------
-- 5、收费类型
-- ----------------------------
DROP TABLE IF EXISTS `consult_charge_type`;
CREATE TABLE `consult_charge_type` (
                                       `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                       `type_name` varchar(50) NOT NULL COMMENT '收费类型名称',
                                       `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                       `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                       `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                       `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                       `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                       UNIQUE KEY `uk_type` (`type_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='收费类型';

-- 初始化收费类型
INSERT INTO `consult_charge_type` (`type_name`) VALUES
                                                    ('语音咨询'),
                                                    ('视频咨询'),
                                                    ('线下咨询'),
                                                    ('上门咨询');

-- ----------------------------
-- 6、收费标准
-- ----------------------------
DROP TABLE IF EXISTS `consult_charge_standard`;
CREATE TABLE `consult_charge_standard` (
                                           `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                           `charge_type_id` bigint NOT NULL COMMENT '收费类型ID',
                                           `consult_id` bigint NOT NULL COMMENT '咨询师ID',
                                           `price` decimal(10,2) NOT NULL COMMENT '价格',
                                           `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                           `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                           `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                           `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                           `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                           UNIQUE KEY `uk_consult_charge` (`consult_id`,`charge_type_id`),
                                           CONSTRAINT `fk_cs_type` FOREIGN KEY (`charge_type_id`) REFERENCES `consult_charge_type` (`id`),
                                           CONSTRAINT `fk_cs_consult` FOREIGN KEY (`consult_id`) REFERENCES `consult` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='收费标准';

-- ----------------------------
-- 7、咨询留言表
-- ----------------------------
DROP TABLE IF EXISTS `consult_message`;
CREATE TABLE `consult_message` (
                                   `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                   `content` text NOT NULL COMMENT '留言内容',
                                   `reply` text COMMENT '回复内容',
                                   `reply_time` datetime DEFAULT NULL COMMENT '回复时间',
                                   `user_id` bigint NOT NULL COMMENT '用户ID',
                                   `consult_id` bigint NOT NULL COMMENT '咨询师ID',
                                   `message_time` datetime DEFAULT NULL COMMENT '留言时间',
                                   `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                   `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                   `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                   KEY `idx_user` (`user_id`),
                                   KEY `idx_consult` (`consult_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='咨询留言表';

-- ----------------------------
-- 8、咨询评价表
-- ----------------------------
DROP TABLE IF EXISTS `consult_evaluate`;
CREATE TABLE `consult_evaluate` (
                                    `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                    `order_id` bigint COMMENT '订单ID',
                                    `content` text COMMENT '评价内容',
                                    `score` decimal(2,1) DEFAULT 5.0 COMMENT '评分(1~5)',
                                    `evaluate_time` datetime DEFAULT NULL COMMENT '评价时间',
                                    `user_id` bigint NOT NULL COMMENT '用户ID',
                                    `consult_id` bigint NOT NULL COMMENT '咨询师ID',
                                    `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                    `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                    `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                    KEY `idx_order` (`order_id`),
                                    KEY `idx_user` (`user_id`),
                                    KEY `idx_consult` (`consult_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='咨询评价表';

-- ----------------------------
-- 9、咨询订单表
-- ----------------------------
DROP TABLE IF EXISTS `consult_order`;
CREATE TABLE `consult_order` (
                                 `id` bigint PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                 `order_no` varchar(32) NOT NULL COMMENT '订单号',
                                 `charge_standard_id` bigint NOT NULL COMMENT '收费标准ID',
                                 `consult_id` bigint NOT NULL COMMENT '咨询师ID',
                                 `user_id` bigint NOT NULL COMMENT '用户ID',
                                 `order_time` datetime DEFAULT NULL COMMENT '下单时间',
                                 `appoint_time` datetime DEFAULT NULL COMMENT '预约时间',
                                 `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
                                 `finish_time` datetime DEFAULT NULL COMMENT '完成时间',
                                 `pay_amount` decimal(10,2) COMMENT '实际支付金额',
                                 `problem_desc` text COMMENT '问题描述',
                                 `order_status` tinyint DEFAULT 0 COMMENT '0待支付 1已预约 2已完成 3待评价 4已评价 5已取消',
                                 `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                 `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                 `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                 `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                 `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                 UNIQUE KEY `uk_order_no` (`order_no`),
                                 KEY `idx_user` (`user_id`),
                                 KEY `idx_consult` (`consult_id`),
                                 KEY `idx_charge_standard` (`charge_standard_id`),
                                 CONSTRAINT `fk_order_standard` FOREIGN KEY (`charge_standard_id`) REFERENCES `consult_charge_standard` (`id`),
                                 CONSTRAINT `fk_order_consult` FOREIGN KEY (`consult_id`) REFERENCES `consult` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='咨询订单表';

SET FOREIGN_KEY_CHECKS = 1;