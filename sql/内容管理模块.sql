-- ============================================================
-- 心理咨询平台 - 内容管理模块数据库脚本
-- Author : 雨影熙熙
-- Date   : 2026-06
-- ============================================================

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ============================================================
-- 一、文章管理
-- ============================================================

-- ----------------------------
-- 1、文章分类表
-- ----------------------------
DROP TABLE IF EXISTS `article_category`;
CREATE TABLE `article_category` (
                                    `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                    `category_name` varchar(50) NOT NULL COMMENT '分类名称',
                                    `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                                    `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                    `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                    PRIMARY KEY (`id`),
                                    UNIQUE KEY `uk_category_name` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章分类表';

-- 初始化文章分类
INSERT INTO `article_category` (`category_name`) VALUES
                                                     ('心理咨询'),
                                                     ('缓解焦虑'),
                                                     ('情感危机'),
                                                     ('改善人际'),
                                                     ('个人成长');

-- ----------------------------
-- 2、文章表
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
                           `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                           `article_name` varchar(200) NOT NULL COMMENT '文章名称',
                           `article_intro` varchar(500) DEFAULT NULL COMMENT '文章简介',
                           `mentor_id` bigint DEFAULT NULL COMMENT '心理导师ID（关联consult表）',
                           `thumbnail` varchar(255) DEFAULT NULL COMMENT '缩略图URL',
                           `content` longtext COMMENT '详情内容（富文本）',
                           `read_count` int DEFAULT 0 COMMENT '阅读量',
                           `category_id` bigint NOT NULL COMMENT '所属分类ID',
                           `status` tinyint DEFAULT 0 COMMENT '状态（0审核中 1已审核 2未通过审核）',
                           `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                           `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                           `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                           `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                           `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                           PRIMARY KEY (`id`),
                           KEY `idx_category` (`category_id`),
                           KEY `idx_mentor` (`mentor_id`),
                           KEY `idx_status` (`status`),
                           CONSTRAINT `fk_article_category` FOREIGN KEY (`category_id`) REFERENCES `article_category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章表';

-- ----------------------------
-- 3、文章审核记录表（可选扩展）
-- ----------------------------
DROP TABLE IF EXISTS `article_audit_log`;
CREATE TABLE `article_audit_log` (
                                     `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                     `article_id` bigint NOT NULL COMMENT '文章ID',
                                     `audit_user_id` bigint NOT NULL COMMENT '审核管理员ID',
                                     `audit_result` tinyint NOT NULL COMMENT '审核结果（1通过 2拒绝）',
                                     `audit_remark` varchar(500) DEFAULT NULL COMMENT '审核备注',
                                     `audit_time` datetime DEFAULT NULL COMMENT '审核时间',
                                     `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                     `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                     `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                     `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                     `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                     PRIMARY KEY (`id`),
                                     KEY `idx_article` (`article_id`),
                                     KEY `idx_audit_user` (`audit_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章审核记录表';


-- ============================================================
-- 二、FM管理
-- ============================================================

-- ----------------------------
-- 4、FM分类表
-- ----------------------------
DROP TABLE IF EXISTS `fm_category`;
CREATE TABLE `fm_category` (
                               `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                               `category_name` varchar(50) NOT NULL COMMENT '分类名称',
                               `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                               `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                               `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                               `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                               `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                               PRIMARY KEY (`id`),
                               UNIQUE KEY `uk_category_name` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='FM分类表';

-- 初始化FM分类
INSERT INTO `fm_category` (`category_name`) VALUES
                                                ('咨询师培训'),
                                                ('智慧生活'),
                                                ('素质教育'),
                                                ('身心健康'),
                                                ('免费公开课');

-- ----------------------------
-- 5、FM表
-- ----------------------------
DROP TABLE IF EXISTS `fm`;
CREATE TABLE `fm` (
                      `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                      `title` varchar(200) NOT NULL COMMENT 'FM标题',
                      `thumbnail` varchar(255) DEFAULT NULL COMMENT '缩略图URL',
                      `fm_category_id` bigint NOT NULL COMMENT 'FM分类ID',
                      `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                      `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                      `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                      `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                      `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                      PRIMARY KEY (`id`),
                      KEY `idx_category` (`fm_category_id`),
                      CONSTRAINT `fk_fm_category` FOREIGN KEY (`fm_category_id`) REFERENCES `fm_category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='FM表';

-- ----------------------------
-- 6、FM音频表
-- ----------------------------
DROP TABLE IF EXISTS `fm_audio`;
CREATE TABLE `fm_audio` (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                            `fm_id` bigint NOT NULL COMMENT '所属FM ID',
                            `audio_name` varchar(200) NOT NULL COMMENT '音频名称',
                            `audio_url` varchar(500) NOT NULL COMMENT '音频文件URL',
                            `audio_duration` int DEFAULT 0 COMMENT '音频时长（秒）',
                            `audio_size` bigint DEFAULT 0 COMMENT '音频大小（字节）',
                            `sort_order` int DEFAULT 0 COMMENT '排序（用于音频列表顺序）',
                            `play_count` int DEFAULT 0 COMMENT '播放量',
                            `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                            `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                            `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                            PRIMARY KEY (`id`),
                            KEY `idx_fm` (`fm_id`),
                            KEY `idx_sort` (`sort_order`),
                            CONSTRAINT `fk_audio_fm` FOREIGN KEY (`fm_id`) REFERENCES `fm` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='FM音频表';


-- ============================================================
-- 三、公益中心管理
-- ============================================================

-- ----------------------------
-- 7、公益中心表
-- ----------------------------
DROP TABLE IF EXISTS `public_welfare`;
CREATE TABLE `public_welfare` (
                                  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                  `title` varchar(200) NOT NULL COMMENT '标题',
                                  `intro` varchar(500) DEFAULT NULL COMMENT '简介',
                                  `thumbnail` varchar(255) DEFAULT NULL COMMENT '缩略图URL',
                                  `content` longtext COMMENT '详情内容（富文本）',
                                  `mentor_id` bigint DEFAULT NULL COMMENT '心理导师ID（关联consult表）',
                                  `read_count` int DEFAULT 0 COMMENT '阅读量',
                                  `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                                  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                  PRIMARY KEY (`id`),
                                  KEY `idx_mentor` (`mentor_id`),
                                  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='公益中心表';


-- ============================================================
-- 四、心理知识管理
-- ============================================================

-- ----------------------------
-- 8、心理知识表
-- ----------------------------
DROP TABLE IF EXISTS `psychology_knowledge`;
CREATE TABLE `psychology_knowledge` (
                                        `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                        `title` varchar(200) NOT NULL COMMENT '标题',
                                        `intro` varchar(500) DEFAULT NULL COMMENT '简介',
                                        `thumbnail` varchar(255) DEFAULT NULL COMMENT '缩略图URL',
                                        `content` longtext COMMENT '详情内容（富文本）',
                                        `mentor_id` bigint DEFAULT NULL COMMENT '心理导师ID（关联consult表）',
                                        `read_count` int DEFAULT 0 COMMENT '阅读量',
                                        `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                                        `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                        `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                        `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                        `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                        PRIMARY KEY (`id`),
                                        KEY `idx_mentor` (`mentor_id`),
                                        KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='心理知识表';


-- ============================================================
-- 五、内容阅读统计表（缓存扩展）
-- ============================================================

-- ----------------------------
-- 9、内容阅读记录表（用于防刷和统计）
-- ----------------------------
DROP TABLE IF EXISTS `content_read_log`;
CREATE TABLE `content_read_log` (
                                    `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                    `content_type` tinyint NOT NULL COMMENT '内容类型（1文章 2公益 3心理知识）',
                                    `content_id` bigint NOT NULL COMMENT '内容ID',
                                    `user_id` bigint DEFAULT NULL COMMENT '阅读用户ID（未登录可为NULL）',
                                    `ip_address` varchar(50) DEFAULT NULL COMMENT 'IP地址',
                                    `read_time` datetime DEFAULT NULL COMMENT '阅读时间',
                                    `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                    `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                    `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                    PRIMARY KEY (`id`),
                                    KEY `idx_content` (`content_type`,`content_id`),
                                    KEY `idx_user` (`user_id`),
                                    KEY `idx_read_time` (`read_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='内容阅读记录表';


-- ============================================================
-- 六、用户积分记录表（阅读积分）
-- ============================================================

-- ----------------------------
-- 10、用户积分记录表
-- ----------------------------
DROP TABLE IF EXISTS `user_points_log`;
CREATE TABLE `user_points_log` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                   `user_id` bigint NOT NULL COMMENT '用户ID',
                                   `points` int NOT NULL COMMENT '变动积分（正数增加，负数减少）',
                                   `points_type` tinyint NOT NULL COMMENT '积分类型（1阅读文章 2阅读公益 3阅读心理知识 4其他）',
                                   `source_id` bigint DEFAULT NULL COMMENT '来源ID（文章ID/公益ID/心理知识ID）',
                                   `source_type` tinyint DEFAULT NULL COMMENT '来源类型（1文章 2公益 3心理知识）',
                                   `remark` varchar(255) DEFAULT NULL COMMENT '备注',
                                   `del_flag` char(1) DEFAULT '0' COMMENT '删除标志',
                                   `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                   `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                   PRIMARY KEY (`id`),
                                   KEY `idx_user` (`user_id`),
                                   KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户积分记录表';

SET FOREIGN_KEY_CHECKS = 1;
