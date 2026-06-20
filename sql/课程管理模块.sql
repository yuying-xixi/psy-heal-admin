/*
 Navicat Premium Data Transfer

 课程系统数据库表
 Author : 雨影熙熙
 Date   : 2026-06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 1、课程分类表
-- ----------------------------
DROP TABLE IF EXISTS `course_category`;
CREATE TABLE `course_category` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                   `category_name` varchar(50) NOT NULL COMMENT '分类名称',
                                   `category_icon` varchar(255) DEFAULT NULL COMMENT '分类图标',
                                   `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',

                                   `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                   `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                   `update_time` datetime DEFAULT NULL COMMENT '更新时间',

                                   PRIMARY KEY (`id`),
                                   UNIQUE KEY `uk_category_name` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程分类';

-- ----------------------------
-- 初始化课程分类
-- ----------------------------
INSERT INTO `course_category` (`category_name`) VALUES
                                                    ('咨询师培训'),
                                                    ('智慧生活'),
                                                    ('教师版块'),
                                                    ('身心医生'),
                                                    ('免费公开课');


-- ----------------------------
-- 2、课程表
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (

                          `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',

                          `course_name` varchar(200) NOT NULL COMMENT '课程名称',

                          `thumbnail` varchar(255) DEFAULT NULL COMMENT '课程缩略图',

                          `total_duration` int DEFAULT 0 COMMENT '课程总时长(秒，自动统计)',

                          `video_count` int DEFAULT 0 COMMENT '视频数量(自动统计)',

                          `study_count` int DEFAULT 0 COMMENT '学习量',

                          `introduction` text COMMENT '课程简介',

                          `suitable_people` text COMMENT '适用人群',

                          `learning_harvest` text COMMENT '学习收获',

                          `subscription_notice` text COMMENT '订阅须知',

                          `original_price` decimal(10,2) DEFAULT 0.00 COMMENT '课程原价',

                          `discount_price` decimal(10,2) DEFAULT 0.00 COMMENT '课程折扣价',

                          `charge_type` tinyint DEFAULT 0 COMMENT '收费类型（0免费 1收费）',

                          `category_id` bigint NOT NULL COMMENT '课程分类ID',

                          `mentor_id` bigint DEFAULT NULL COMMENT '心理导师ID',

                          `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',

                          `create_by` varchar(64) DEFAULT '' COMMENT '创建者',

                          `create_time` datetime DEFAULT NULL COMMENT '创建时间',

                          `update_by` varchar(64) DEFAULT '' COMMENT '更新者',

                          `update_time` datetime DEFAULT NULL COMMENT '更新时间',

                          PRIMARY KEY (`id`),

                          KEY `idx_category` (`category_id`),

                          KEY `idx_mentor` (`mentor_id`),

                          CONSTRAINT `fk_course_category`
                              FOREIGN KEY (`category_id`)
                                  REFERENCES `course_category` (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程表';


-- ----------------------------
-- 3、课程视频表
-- ----------------------------
DROP TABLE IF EXISTS `course_video`;
CREATE TABLE `course_video` (

                                `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',

                                `video_name` varchar(200) NOT NULL COMMENT '视频名称',

                                `duration` int DEFAULT 0 COMMENT '视频时长(秒)',

                                `video_url` varchar(500) NOT NULL COMMENT '视频地址',

                                `course_id` bigint NOT NULL COMMENT '所属课程',

                                `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',

                                `create_by` varchar(64) DEFAULT '' COMMENT '创建者',

                                `create_time` datetime DEFAULT NULL COMMENT '创建时间',

                                `update_by` varchar(64) DEFAULT '' COMMENT '更新者',

                                `update_time` datetime DEFAULT NULL COMMENT '更新时间',

                                PRIMARY KEY (`id`),

                                KEY `idx_course` (`course_id`),

                                CONSTRAINT `fk_video_course`
                                    FOREIGN KEY (`course_id`)
                                        REFERENCES `course` (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程视频表';


-- ----------------------------
-- 4、课程评价表
-- ----------------------------
DROP TABLE IF EXISTS `course_comment`;
CREATE TABLE `course_comment` (

                                  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',

                                  `content` text COMMENT '评价内容',

                                  `score` decimal(2,1) DEFAULT 5.0 COMMENT '评分(1~5)',

                                  `comment_time` datetime DEFAULT NULL COMMENT '评价时间',

                                  `user_id` bigint NOT NULL COMMENT '用户ID',

                                  `course_id` bigint NOT NULL COMMENT '课程ID',

                                  `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',

                                  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',

                                  `create_time` datetime DEFAULT NULL COMMENT '创建时间',

                                  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',

                                  `update_time` datetime DEFAULT NULL COMMENT '更新时间',

                                  PRIMARY KEY (`id`),

                                  KEY `idx_user` (`user_id`),

                                  KEY `idx_course` (`course_id`),

                                  CONSTRAINT `fk_comment_course`
                                      FOREIGN KEY (`course_id`)
                                          REFERENCES `course` (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程评价表';


-- ----------------------------
-- 5、课程收藏表
-- ----------------------------
DROP TABLE IF EXISTS `course_collect`;
CREATE TABLE `course_collect` (

                                  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',

                                  `course_id` bigint NOT NULL COMMENT '课程ID',

                                  `user_id` bigint NOT NULL COMMENT '用户ID',

                                  `create_time` datetime DEFAULT NULL COMMENT '收藏时间',

                                  PRIMARY KEY (`id`),

                                  UNIQUE KEY `uk_collect` (`course_id`,`user_id`),

                                  KEY `idx_user` (`user_id`),

                                  CONSTRAINT `fk_collect_course`
                                      FOREIGN KEY (`course_id`)
                                          REFERENCES `course` (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程收藏表';


-- ----------------------------
-- 6、课程订单表
-- ----------------------------
DROP TABLE IF EXISTS `course_order`;
CREATE TABLE `course_order` (

                                `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',

                                `course_id` bigint NOT NULL COMMENT '课程ID',

                                `user_id` bigint NOT NULL COMMENT '用户ID',

                                `order_time` datetime DEFAULT NULL COMMENT '下单时间',

                                `order_status` tinyint DEFAULT 0 COMMENT '订单状态（0未支付 1已支付 2待评价 3已评价）',

                                `pay_amount` decimal(10,2) DEFAULT 0.00 COMMENT '实际支付金额',

                                `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',

                                `create_by` varchar(64) DEFAULT '' COMMENT '创建者',

                                `create_time` datetime DEFAULT NULL COMMENT '创建时间',

                                `update_by` varchar(64) DEFAULT '' COMMENT '更新者',

                                `update_time` datetime DEFAULT NULL COMMENT '更新时间',

                                PRIMARY KEY (`id`),

                                KEY `idx_user` (`user_id`),

                                KEY `idx_course` (`course_id`),

                                CONSTRAINT `fk_order_course`
                                    FOREIGN KEY (`course_id`)
                                        REFERENCES `course` (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程订单表';

SET FOREIGN_KEY_CHECKS = 1;