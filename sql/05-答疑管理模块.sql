/*

 心理答疑管理模块数据库表
 Author : 雨影熙熙
 Date   : 2026-06

*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- 1、问题表
-- ----------------------------
DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
                            `id`                bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                            `question_title`    varchar(200) NOT NULL COMMENT '问题标题',
                            `question_content`  text NOT NULL COMMENT '问题内容',
                            `user_id`           bigint NOT NULL COMMENT '提问用户ID',
                            `view_count`        int DEFAULT 0 COMMENT '浏览量',
                            `reply_count`       int DEFAULT 0 COMMENT '回复数',
                            `is_resolved`       tinyint DEFAULT 0 COMMENT '是否解决（0未解决 1已解决）',
                            `publish_time`      datetime DEFAULT NULL COMMENT '发布时间',
                            `del_flag`          char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                            `create_by`         varchar(64) DEFAULT '' COMMENT '创建者',
                            `create_time`       datetime DEFAULT NULL COMMENT '创建时间',
                            `update_by`         varchar(64) DEFAULT '' COMMENT '更新者',
                            `update_time`       datetime DEFAULT NULL COMMENT '更新时间',

                            PRIMARY KEY (`id`),
                            KEY `idx_user` (`user_id`),
                            KEY `idx_publish_time` (`publish_time`),
                            KEY `idx_is_resolved` (`is_resolved`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='问题表';


-- ----------------------------
-- 2、回复表
-- ----------------------------
DROP TABLE IF EXISTS `question_reply`;

CREATE TABLE `question_reply` (
                                  `id`              bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                  `reply_content`   text NOT NULL COMMENT '回复内容',
                                  `reply_time`      datetime DEFAULT NULL COMMENT '回复时间',
                                  `user_id`         bigint DEFAULT NULL COMMENT '回复用户ID（普通用户）',
                                  `consult_id`      bigint DEFAULT NULL COMMENT '回复咨询师ID',
                                  `question_id`     bigint NOT NULL COMMENT '所属问题ID',
                                  `is_best`         tinyint DEFAULT 0 COMMENT '是否为最佳答案（0否 1是）',
                                  `del_flag`        char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                                  `create_by`       varchar(64) DEFAULT '' COMMENT '创建者',
                                  `create_time`     datetime DEFAULT NULL COMMENT '创建时间',
                                  `update_by`       varchar(64) DEFAULT '' COMMENT '更新者',
                                  `update_time`     datetime DEFAULT NULL COMMENT '更新时间',

                                  PRIMARY KEY (`id`),
                                  KEY `idx_question` (`question_id`),
                                  KEY `idx_user` (`user_id`),
                                  KEY `idx_consult` (`consult_id`),
                                  KEY `idx_reply_time` (`reply_time`),
                                  CONSTRAINT `fk_reply_question`
                                      FOREIGN KEY (`question_id`)
                                          REFERENCES `question` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='回复表';


-- ----------------------------
-- 3、问题点赞表
-- ----------------------------
DROP TABLE IF EXISTS `question_like`;

CREATE TABLE `question_like` (
                                 `id`             bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                 `question_id`    bigint NOT NULL COMMENT '问题ID',
                                 `user_id`        bigint NOT NULL COMMENT '用户ID',
                                 `like_time`      datetime DEFAULT NULL COMMENT '点赞时间',
                                 `del_flag`       char(1) DEFAULT '0' COMMENT '删除标志',
                                 `create_by`      varchar(64) DEFAULT '' COMMENT '创建者',
                                 `create_time`    datetime DEFAULT NULL COMMENT '创建时间',
                                 `update_by`      varchar(64) DEFAULT '' COMMENT '更新者',
                                 `update_time`    datetime DEFAULT NULL COMMENT '更新时间',

                                 PRIMARY KEY (`id`),
                                 UNIQUE KEY `uk_question_user` (`question_id`, `user_id`),
                                 CONSTRAINT `fk_like_question`
                                     FOREIGN KEY (`question_id`)
                                         REFERENCES `question` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='问题点赞表';


SET FOREIGN_KEY_CHECKS = 1;