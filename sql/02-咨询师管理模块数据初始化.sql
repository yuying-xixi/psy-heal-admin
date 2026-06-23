/*==============================================================
 咨询师管理模块初始化数据（每表约5条）
==============================================================*/

SET FOREIGN_KEY_CHECKS = 0;

-- ============================================================
-- 1、咨询师等级表（已有3条，这里补2条）
-- ============================================================
INSERT INTO consult_level (level_name, create_by, create_time)
VALUES
    ('特级咨询师','admin',NOW()),
    ('高级咨询师','admin',NOW());


-- ============================================================
-- 2、咨询师表（5条）
-- ============================================================
INSERT INTO consult
(sys_user_id, name, level_id, mobile, email, avatar, gender, cert_img, address, intro, position, create_by, create_time)
VALUES
    (1001,'张晨曦',1,'13800000001','zhang1@test.com','/img/c1.jpg','1','/cert/c1.jpg','上海','专注情绪与焦虑干预',0,'admin',NOW()),
    (1002,'李思远',2,'13800000002','li2@test.com','/img/c2.jpg','0','/cert/c2.jpg','北京','擅长婚姻家庭咨询',0,'admin',NOW()),
    (1003,'王静怡',3,'13800000003','wang3@test.com','/img/c3.jpg','1','/cert/c3.jpg','广州','青少年心理专家',0,'admin',NOW()),
    (1004,'陈浩然',4,'13800000004','chen4@test.com','/img/c4.jpg','0','/cert/c4.jpg','深圳','职场压力管理专家',0,'admin',NOW()),
    (1005,'刘雨晴',1,'13800000005','liu5@test.com','/img/c5.jpg','1','/cert/c5.jpg','杭州','危机干预与创伤疗愈',1,'admin',NOW());


-- ============================================================
-- 3、擅长领域（已有8条，这里补2条）
-- ============================================================
INSERT INTO consult_good_at (field_name, create_by, create_time)
VALUES
    ('焦虑抑郁干预','admin',NOW()),
    ('创伤心理治疗','admin',NOW());


-- ============================================================
-- 4、咨询师擅长关联（5条）
-- ============================================================
INSERT INTO consult_good_at_rel (consult_id, field_id)
VALUES
    (1,1),
    (1,9),
    (2,3),
    (3,6),
    (4,4);


-- ============================================================
-- 5、收费类型（已有4条，这里补1条）
-- ============================================================
INSERT INTO consult_charge_type (type_name, create_by, create_time)
VALUES
    ('图文咨询','admin',NOW());


-- ============================================================
-- 6、收费标准（5条）
-- ============================================================
INSERT INTO consult_charge_standard
(charge_type_id, consult_id, price, create_by, create_time)
VALUES
    (1,1,199.00,'admin',NOW()),
    (2,1,299.00,'admin',NOW()),
    (1,2,159.00,'admin',NOW()),
    (2,3,259.00,'admin',NOW()),
    (3,4,399.00,'admin',NOW());


-- ============================================================
-- 7、咨询留言表（5条）
-- ============================================================
INSERT INTO consult_message
(content, reply, reply_time, user_id, consult_id, message_time, create_by, create_time)
VALUES
    ('最近压力很大怎么办？','建议规律作息+运动',NOW(),101,1,NOW(),'admin',NOW()),
    ('经常失眠','可以尝试正念呼吸',NOW(),102,2,NOW(),'admin',NOW()),
    ('情绪容易崩溃','需要情绪记录训练',NOW(),103,3,NOW(),'admin',NOW()),
    ('工作焦虑严重','建议做压力分解',NOW(),104,4,NOW(),'admin',NOW()),
    ('社交恐惧','逐步暴露训练效果好',NOW(),105,5,NOW(),'admin',NOW());


-- ============================================================
-- 8、咨询评价表（5条）
-- ============================================================
INSERT INTO consult_evaluate
(order_id, content, score, evaluate_time, user_id, consult_id, create_by, create_time)
VALUES
    (1,'非常专业，帮助很大',5.0,NOW(),101,1,'admin',NOW()),
    (2,'体验不错',4.5,NOW(),102,2,'admin',NOW()),
    (3,'老师很耐心',5.0,NOW(),103,3,'admin',NOW()),
    (4,'效果明显',4.8,NOW(),104,4,'admin',NOW()),
    (5,'值得推荐',5.0,NOW(),105,5,'admin',NOW());


-- ============================================================
-- 9、咨询订单表（5条）
-- ============================================================
INSERT INTO consult_order
(order_no, charge_standard_id, consult_id, user_id, order_time, appoint_time, pay_time, finish_time, pay_amount, problem_desc, order_status, create_by, create_time)
VALUES
    ('ORD20260001',1,1,101,NOW(),NOW(),NOW(),NOW(),199.00,'焦虑问题',4,'admin',NOW()),
    ('ORD20260002',2,1,102,NOW(),NOW(),NOW(),NULL,299.00,'失眠严重',2,'admin',NOW()),
    ('ORD20260003',3,2,103,NOW(),NOW(),NOW(),NOW(),159.00,'情绪问题',4,'admin',NOW()),
    ('ORD20260004',4,3,104,NOW(),NOW(),NOW(),NULL,259.00,'职场压力',1,'admin',NOW()),
    ('ORD20260005',5,4,105,NOW(),NOW(),NOW(),NOW(),399.00,'社交恐惧',5,'admin',NOW());


SET FOREIGN_KEY_CHECKS = 1;