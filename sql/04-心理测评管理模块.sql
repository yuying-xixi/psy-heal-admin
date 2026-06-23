/*

 心理测评模块数据库表
 Author : 雨影熙熙
 Date   : 2026-06

*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 1、心理测评分类表
-- ----------------------------
DROP TABLE IF EXISTS `assessment_category`;

CREATE TABLE `assessment_category` (
                                       `id`             bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                       `category_name`  varchar(50) NOT NULL COMMENT '分类名称',
                                       `thumbnail`      varchar(255) DEFAULT NULL COMMENT '缩略图URL',
                                       `del_flag`       char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                                       `create_by`      varchar(64) DEFAULT '' COMMENT '创建者',
                                       `create_time`    datetime DEFAULT NULL COMMENT '创建时间',
                                       `update_by`      varchar(64) DEFAULT '' COMMENT '更新者',
                                       `update_time`    datetime DEFAULT NULL COMMENT '更新时间',

                                       PRIMARY KEY (`id`),
                                       UNIQUE KEY `uk_category_name` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='心理测评分类表';


-- ----------------------------
-- 2、心理测评表
-- ----------------------------
DROP TABLE IF EXISTS `assessment`;

CREATE TABLE `assessment` (
                              `id`                  bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                              `assessment_name`     varchar(200) NOT NULL COMMENT '测评名称',
                              `assessment_intro`    varchar(500) DEFAULT NULL COMMENT '测评简介',
                              `thumbnail`           varchar(255) DEFAULT NULL COMMENT '缩略图URL',
                              `about_assessment`    text COMMENT '关于测评',
                              `what_you_get`        text COMMENT '你将获得',
                              `suitable_for`        text COMMENT '适合谁测',
                              `reference`           text COMMENT '参考文献',
                              `original_price`      decimal(10,2) DEFAULT 0.00 COMMENT '原价',
                              `discount_price`      decimal(10,2) DEFAULT 0.00 COMMENT '折扣价',
                              `category_id`         bigint NOT NULL COMMENT '所属分类ID',
                              `del_flag`            char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                              `create_by`           varchar(64) DEFAULT '' COMMENT '创建者',
                              `create_time`         datetime DEFAULT NULL COMMENT '创建时间',
                              `update_by`           varchar(64) DEFAULT '' COMMENT '更新者',
                              `update_time`         datetime DEFAULT NULL COMMENT '更新时间',

                              PRIMARY KEY (`id`),
                              KEY `idx_category` (`category_id`),
                              CONSTRAINT `fk_assessment_category`
                                  FOREIGN KEY (`category_id`)
                                      REFERENCES `assessment_category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='心理测评表';

-- ----------------------------
-- 3、题目表
-- ----------------------------
DROP TABLE IF EXISTS `assessment_question`;

CREATE TABLE `assessment_question` (
                                       `id`              bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                       `question_name`   varchar(500) NOT NULL COMMENT '题目名称',
                                       `assessment_id`   bigint NOT NULL COMMENT '所属心理测评ID',
                                       `sort_order`      int DEFAULT 0 COMMENT '排序',
                                       `del_flag`        char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                                       `create_by`       varchar(64) DEFAULT '' COMMENT '创建者',
                                       `create_time`     datetime DEFAULT NULL COMMENT '创建时间',
                                       `update_by`       varchar(64) DEFAULT '' COMMENT '更新者',
                                       `update_time`     datetime DEFAULT NULL COMMENT '更新时间',

                                       PRIMARY KEY (`id`),
                                       KEY `idx_assessment` (`assessment_id`),
                                       CONSTRAINT `fk_question_assessment`
                                           FOREIGN KEY (`assessment_id`)
                                               REFERENCES `assessment` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='题目表';


-- ----------------------------
-- 4、题目选项表
-- ----------------------------
DROP TABLE IF EXISTS `assessment_option`;

CREATE TABLE `assessment_option` (
                                     `id`               bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                     `option_content`   varchar(500) NOT NULL COMMENT '选项内容',
                                     `score`            int DEFAULT 0 COMMENT '选项分值',
                                     `question_id`      bigint NOT NULL COMMENT '所属题目ID',
                                     `sort_order`       int DEFAULT 0 COMMENT '排序',
                                     `del_flag`         char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                                     `create_by`        varchar(64) DEFAULT '' COMMENT '创建者',
                                     `create_time`      datetime DEFAULT NULL COMMENT '创建时间',
                                     `update_by`        varchar(64) DEFAULT '' COMMENT '更新者',
                                     `update_time`      datetime DEFAULT NULL COMMENT '更新时间',

                                     PRIMARY KEY (`id`),
                                     KEY `idx_question` (`question_id`),
                                     CONSTRAINT `fk_option_question`
                                         FOREIGN KEY (`question_id`)
                                             REFERENCES `assessment_question` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='题目选项表';


-- ----------------------------
-- 5、测评结果表
-- ----------------------------
DROP TABLE IF EXISTS `assessment_result`;

CREATE TABLE `assessment_result` (
                                     `id`                 bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                     `score`              int DEFAULT 0 COMMENT '总分',
                                     `result_content`     text COMMENT '结论内容',
                                     `assessment_id`      bigint NOT NULL COMMENT '心理测评ID',
                                     `user_id`            bigint NOT NULL COMMENT '用户ID',
                                     `assessment_time`    datetime DEFAULT NULL COMMENT '测评时间',
                                     `del_flag`           char(1) DEFAULT '0' COMMENT '删除标志（0存在 2删除）',
                                     `create_by`          varchar(64) DEFAULT '' COMMENT '创建者',
                                     `create_time`        datetime DEFAULT NULL COMMENT '创建时间',
                                     `update_by`          varchar(64) DEFAULT '' COMMENT '更新者',
                                     `update_time`        datetime DEFAULT NULL COMMENT '更新时间',

                                     PRIMARY KEY (`id`),
                                     KEY `idx_assessment` (`assessment_id`),
                                     KEY `idx_user` (`user_id`),
                                     CONSTRAINT `fk_result_assessment`
                                         FOREIGN KEY (`assessment_id`)
                                             REFERENCES `assessment` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='测评结果表';


-- ----------------------------
-- 6、用户答题详情表
-- ----------------------------
DROP TABLE IF EXISTS `assessment_answer_detail`;

CREATE TABLE `assessment_answer_detail` (
                                            `id`             bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                            `result_id`      bigint NOT NULL COMMENT '测评结果ID',
                                            `question_id`    bigint NOT NULL COMMENT '题目ID',
                                            `option_id`      bigint DEFAULT NULL COMMENT '所选选项ID',
                                            `score`          int DEFAULT 0 COMMENT '本题得分',
                                            `del_flag`       char(1) DEFAULT '0' COMMENT '删除标志',
                                            `create_by`      varchar(64) DEFAULT '' COMMENT '创建者',
                                            `create_time`    datetime DEFAULT NULL COMMENT '创建时间',
                                            `update_by`      varchar(64) DEFAULT '' COMMENT '更新者',
                                            `update_time`    datetime DEFAULT NULL COMMENT '更新时间',

                                            PRIMARY KEY (`id`),
                                            KEY `idx_result` (`result_id`),
                                            KEY `idx_question` (`question_id`),
                                            CONSTRAINT `fk_detail_result`
                                                FOREIGN KEY (`result_id`)
                                                    REFERENCES `assessment_result` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户答题详情表';


SET FOREIGN_KEY_CHECKS = 1;