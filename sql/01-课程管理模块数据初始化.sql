/* ============================================================
   课程系统初始化测试数据
   Author : 雨影熙熙
   ============================================================ */

SET NAMES utf8mb4;

-- ============================================================
-- 一、初始化课程数据（course）
-- ============================================================

INSERT INTO course
(course_name, thumbnail, introduction, suitable_people, learning_harvest,
 subscription_notice, original_price, discount_price, charge_type,
 category_id, mentor_id, total_duration, video_count, study_count, create_time)
VALUES

    ('心理咨询师基础培训','/upload/course/course1.jpg',
     '系统学习心理咨询基础知识。',
     '零基础心理学爱好者',
     '掌握心理咨询流程及沟通技巧',
     '购买后永久学习',
     999.00,699.00,1,1,1,3600,3,236,NOW()),

    ('家庭教育心理课程','/upload/course/course2.jpg',
     '帮助家长了解儿童心理发展。',
     '家长、教师',
     '提高家庭教育能力',
     '购买后永久观看',
     399.00,199.00,1,3,2,2700,3,512,NOW()),

    ('情绪管理公开课','/upload/course/course3.jpg',
     '免费学习情绪调节技巧。',
     '所有用户',
     '掌握情绪管理方法',
     '永久免费',
     0.00,0.00,0,5,3,1800,2,1680,NOW()),

    ('睡眠心理调节课程','/upload/course/course4.jpg',
     '改善睡眠质量。',
     '失眠及压力人群',
     '掌握睡眠放松训练',
     '购买后永久有效',
     299.00,99.00,1,2,4,2400,2,380,NOW()),

    ('心理医生职业成长课程','/upload/course/course5.jpg',
     '提高心理医生职业技能。',
     '心理医生',
     '掌握临床心理咨询能力',
     '一年内可反复学习',
     1299.00,999.00,1,4,5,4200,4,96,NOW());



-- ============================================================
-- 二、初始化课程视频（course_video）
-- ============================================================

INSERT INTO course_video
(video_name,duration,video_url,course_id,create_time)
VALUES

    ('第一章 心理学基础',1200,'/video/course1_1.mp4',1,NOW()),
    ('第二章 咨询流程',1200,'/video/course1_2.mp4',1,NOW()),
    ('第三章 案例分析',1200,'/video/course1_3.mp4',1,NOW()),

    ('第一章 家庭关系',900,'/video/course2_1.mp4',2,NOW()),
    ('第二章 儿童成长',900,'/video/course2_2.mp4',2,NOW()),
    ('第三章 家庭沟通',900,'/video/course2_3.mp4',2,NOW()),

    ('第一章 情绪认知',900,'/video/course3_1.mp4',3,NOW()),
    ('第二章 情绪调节',900,'/video/course3_2.mp4',3,NOW()),

    ('第一章 睡眠心理',1200,'/video/course4_1.mp4',4,NOW()),
    ('第二章 放松训练',1200,'/video/course4_2.mp4',4,NOW()),

    ('第一章 医患沟通',1050,'/video/course5_1.mp4',5,NOW()),
    ('第二章 危机干预',1050,'/video/course5_2.mp4',5,NOW()),
    ('第三章 心理评估',1050,'/video/course5_3.mp4',5,NOW()),
    ('第四章 综合案例',1050,'/video/course5_4.mp4',5,NOW());



-- ============================================================
-- 三、初始化课程评价（course_comment）
-- ============================================================

INSERT INTO course_comment
(content,score,comment_time,user_id,course_id,create_time)
VALUES

    ('老师讲解非常详细，适合零基础学习。',5.0,NOW(),1001,1,NOW()),
    ('课程内容丰富，案例很多。',4.8,NOW(),1002,1,NOW()),
    ('值得推荐。',4.6,NOW(),1003,1,NOW()),

    ('家庭教育方面收获很大。',5.0,NOW(),1004,2,NOW()),
    ('讲得很接地气。',4.7,NOW(),1005,2,NOW()),

    ('免费课程质量很高。',5.0,NOW(),1006,3,NOW()),
    ('学习之后情绪改善不少。',4.9,NOW(),1007,3,NOW()),

    ('睡眠课程非常有帮助。',5.0,NOW(),1008,4,NOW()),

    ('专业性很强。',5.0,NOW(),1009,5,NOW()),
    ('案例分析十分实用。',4.9,NOW(),1010,5,NOW());



-- ============================================================
-- 四、初始化课程收藏（course_collect）
-- ============================================================

INSERT INTO course_collect
(course_id,user_id,create_time)
VALUES

    (1,1001,NOW()),
    (1,1002,NOW()),
    (2,1001,NOW()),
    (2,1003,NOW()),
    (3,1004,NOW()),
    (3,1005,NOW()),
    (3,1006,NOW()),
    (4,1007,NOW()),
    (5,1008,NOW()),
    (5,1009,NOW());



-- ============================================================
-- 五、初始化课程订单（course_order）
-- ============================================================

INSERT INTO course_order
(course_id,user_id,order_time,order_status,pay_amount,create_time)
VALUES

    (1,1001,NOW(),3,699.00,NOW()),
    (1,1002,NOW(),1,699.00,NOW()),
    (1,1003,NOW(),2,699.00,NOW()),

    (2,1004,NOW(),3,199.00,NOW()),
    (2,1005,NOW(),1,199.00,NOW()),

    (4,1006,NOW(),3,99.00,NOW()),
    (4,1007,NOW(),1,99.00,NOW()),

    (5,1008,NOW(),3,999.00,NOW()),
    (5,1009,NOW(),2,999.00,NOW()),
    (5,1010,NOW(),1,999.00,NOW());



-- ============================================================
-- 六、同步课程统计信息（自动统计视频数量和总时长）
-- ============================================================

UPDATE course c
SET
    video_count = (
        SELECT COUNT(*)
        FROM course_video v
        WHERE v.course_id = c.id
    ),
    total_duration = (
        SELECT IFNULL(SUM(duration),0)
        FROM course_video v
        WHERE v.course_id = c.id
    );

-- ============================================================
-- 初始化完成
--
-- 数据统计：
-- course              5条
-- course_video       14条
-- course_comment     10条
-- course_collect     10条
-- course_order       10条
-- ============================================================