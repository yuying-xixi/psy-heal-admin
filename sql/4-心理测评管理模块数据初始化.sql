-- ============================================================
-- 心理咨询平台 - 心理测评模块测试数据初始化
-- Author : 雨影熙熙
-- Date   : 2026-06
-- ============================================================

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ============================================================
-- 1. 心理测评分类表（已有初始化数据，此处补充更多分类）
-- ============================================================
INSERT INTO `assessment_category` (`category_name`) VALUES
                                                        ('职业发展'),
                                                        ('心理健康筛查');

-- ============================================================
-- 2. 心理测评表
-- ============================================================
INSERT INTO `assessment` (`assessment_name`, `assessment_intro`, `thumbnail`, `about_assessment`, `what_you_get`, `suitable_for`, `reference`, `original_price`, `discount_price`, `category_id`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('亲密关系质量评估', '评估您当前亲密关系的满意度与潜在问题', NULL, '本测评基于亲密关系理论，帮助您了解关系中的优势与待改进之处。', '一份详细的亲密关系分析报告', '正在恋爱或已婚人士', 'John Gottman 关系理论', 29.90, 9.90, 1, '0', 'admin', NOW(), 'admin', NOW()),
('大五人格测试', '测量您的开放性、尽责性、外向性、宜人性、神经质', NULL, '经典的大五人格模型，全面了解您的性格特质。', '五维度人格剖面图', '任何想了解自己性格的人', 'Costa & McCrae NEO-PI-R', 39.90, 19.90, 2, '0', 'admin', NOW(), 'admin', NOW()),
('情绪管理能力测评', '评估您识别、理解、调节情绪的能力', NULL, '情绪智力（EQ）的重要组成部分，帮助您提升情绪管理技巧。', '情绪管理能力得分及改善建议', '经常感到情绪波动或压力大的人', 'Salovey & Mayer 情绪智力模型', 19.90, 0.00, 3, '0', 'admin', NOW(), 'admin', NOW()),
('原生家庭影响评估', '探索原生家庭对您当前行为模式的影响', NULL, '通过回顾成长经历，发现潜在的心理模式。', '原生家庭影响分析报告', '对自我成长感兴趣的人', 'Bowen 家庭系统理论', 24.90, 14.90, 4, '0', 'admin', NOW(), 'admin', NOW()),
('职业兴趣测评', '帮助您发现适合自己的职业方向', NULL, '基于霍兰德职业兴趣理论，推荐适合您的职业类型。', '职业兴趣类型及推荐职业', '即将毕业或考虑转行的人', 'Holland 职业兴趣理论', 34.90, 24.90, 5, '0', 'admin', NOW(), 'admin', NOW()),
('心理健康自评量表', '快速筛查常见的心理健康问题', NULL, '包含焦虑、抑郁、压力等多维度评估。', '心理健康状况概览及建议', '任何关注心理健康的人', 'SCL-90 症状自评量表', 0.00, 0.00, 6, '0', 'admin', NOW(), 'admin', NOW());

-- ============================================================
-- 3. 题目表（每个测评至少3题）
-- ============================================================
-- 亲密关系质量评估 (assessment_id = 1)
INSERT INTO `assessment_question` (`question_name`, `assessment_id`, `sort_order`) VALUES
('您是否经常与伴侣分享内心感受？', 1, 1),
('当出现分歧时，您通常如何处理？', 1, 2),
('您对目前的亲密关系总体满意度如何？', 1, 3);

-- 大五人格测试 (assessment_id = 2)
INSERT INTO `assessment_question` (`question_name`, `assessment_id`, `sort_order`) VALUES
('您是否喜欢参加社交活动？', 2, 1),
('您做事通常有条理且有计划吗？', 2, 2),
('您是否容易感受到他人的情绪？', 2, 3);

-- 情绪管理能力测评 (assessment_id = 3)
INSERT INTO `assessment_question` (`question_name`, `assessment_id`, `sort_order`) VALUES
('当您生气时，能否快速冷静下来？', 3, 1),
('您是否能够准确识别自己的情绪？', 3, 2),
('您是否经常因为小事而情绪失控？', 3, 3);

-- 原生家庭影响评估 (assessment_id = 4)
INSERT INTO `assessment_question` (`question_name`, `assessment_id`, `sort_order`) VALUES
('您童年时期与父母的关系如何？', 4, 1),
('您是否觉得原生家庭对您现在的性格有影响？', 4, 2),
('您是否经常回忆起童年不愉快的经历？', 4, 3);

-- 职业兴趣测评 (assessment_id = 5)
INSERT INTO `assessment_question` (`question_name`, `assessment_id`, `sort_order`) VALUES
('您更喜欢与人打交道还是与事物打交道？', 5, 1),
('您是否喜欢研究抽象的理论问题？', 5, 2),
('您是否愿意从事重复性但稳定的工作？', 5, 3);

-- 心理健康自评量表 (assessment_id = 6)
INSERT INTO `assessment_question` (`question_name`, `assessment_id`, `sort_order`) VALUES
('最近两周您是否经常感到紧张或焦虑？', 6, 1),
('您是否对以前感兴趣的事情失去了兴趣？', 6, 2),
('您是否经常感到疲倦或精力不足？', 6, 3);

-- ============================================================
-- 4. 题目选项表（每个题目4个选项，分值1-4）
-- ============================================================
-- 亲密关系质量评估 题目1 (question_id 1)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('从不', 1, 1, 1),
('偶尔', 2, 1, 2),
('经常', 3, 1, 3),
('总是', 4, 1, 4);

-- 题目2 (question_id 2)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('争吵', 1, 2, 1),
('冷战', 2, 2, 2),
('沟通解决', 3, 2, 3),
('寻求第三方帮助', 4, 2, 4);

-- 题目3 (question_id 3)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('非常不满意', 1, 3, 1),
('不太满意', 2, 3, 2),
('比较满意', 3, 3, 3),
('非常满意', 4, 3, 4);

-- 大五人格测试 题目1 (question_id 4)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('非常不符合', 1, 4, 1),
('比较不符合', 2, 4, 2),
('比较符合', 3, 4, 3),
('非常符合', 4, 4, 4);

-- 题目2 (question_id 5)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('非常不符合', 1, 5, 1),
('比较不符合', 2, 5, 2),
('比较符合', 3, 5, 3),
('非常符合', 4, 5, 4);

-- 题目3 (question_id 6)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('非常不符合', 1, 6, 1),
('比较不符合', 2, 6, 2),
('比较符合', 3, 6, 3),
('非常符合', 4, 6, 4);

-- 情绪管理能力测评 题目1 (question_id 7)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('完全不能', 1, 7, 1),
('很少能', 2, 7, 2),
('有时能', 3, 7, 3),
('总是能', 4, 7, 4);

-- 题目2 (question_id 8)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('完全不能', 1, 8, 1),
('很少能', 2, 8, 2),
('有时能', 3, 8, 3),
('总是能', 4, 8, 4);

-- 题目3 (question_id 9)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('总是', 1, 9, 1),
('经常', 2, 9, 2),
('偶尔', 3, 9, 3),
('从不', 4, 9, 4);

-- 原生家庭影响评估 题目1 (question_id 10)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('非常差', 1, 10, 1),
('较差', 2, 10, 2),
('较好', 3, 10, 3),
('非常好', 4, 10, 4);

-- 题目2 (question_id 11)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('完全没有', 1, 11, 1),
('有一点', 2, 11, 2),
('有较大影响', 3, 11, 3),
('影响非常大', 4, 11, 4);

-- 题目3 (question_id 12)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('从不', 1, 12, 1),
('偶尔', 2, 12, 2),
('经常', 3, 12, 3),
('总是', 4, 12, 4);

-- 职业兴趣测评 题目1 (question_id 13)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('完全喜欢与人打交道', 1, 13, 1),
('偏向与人打交道', 2, 13, 2),
('偏向与事物打交道', 3, 13, 3),
('完全喜欢与事物打交道', 4, 13, 4);

-- 题目2 (question_id 14)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('非常不喜欢', 1, 14, 1),
('不太喜欢', 2, 14, 2),
('比较喜欢', 3, 14, 3),
('非常喜欢', 4, 14, 4);

-- 题目3 (question_id 15)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('非常不愿意', 1, 15, 1),
('不太愿意', 2, 15, 2),
('比较愿意', 3, 15, 3),
('非常愿意', 4, 15, 4);

-- 心理健康自评量表 题目1 (question_id 16)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('没有', 1, 16, 1),
('偶尔', 2, 16, 2),
('经常', 3, 16, 3),
('总是', 4, 16, 4);

-- 题目2 (question_id 17)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('没有', 1, 17, 1),
('偶尔', 2, 17, 2),
('经常', 3, 17, 3),
('总是', 4, 17, 4);

-- 题目3 (question_id 18)
INSERT INTO `assessment_option` (`option_content`, `score`, `question_id`, `sort_order`) VALUES
('没有', 1, 18, 1),
('偶尔', 2, 18, 2),
('经常', 3, 18, 3),
('总是', 4, 18, 4);

-- ============================================================
-- 5. 测评结果表（模拟用户完成测评后的结果）
-- ============================================================
INSERT INTO `assessment_result` (`score`, `result_content`, `assessment_id`, `user_id`, `assessment_time`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
(8, '您的亲密关系质量处于中等水平，建议加强沟通。', 1, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(10, '您的大五人格特质表现为：外向性较高，尽责性中等，宜人性较高。', 2, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(7, '您的情绪管理能力有待提升，建议学习情绪调节技巧。', 3, 2, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(9, '原生家庭对您有一定影响，但您已经能够理性看待。', 4, 2, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(11, '您的职业兴趣偏向研究型和企业型，适合从事技术管理类工作。', 5, 3, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(6, '您的心理健康状况需要关注，建议寻求专业帮助。', 6, 3, NOW(), '0', 'admin', NOW(), 'admin', NOW());

-- ============================================================
-- 6. 用户答题详情表（模拟每个题目的选择）
-- ============================================================
-- 结果1 (result_id 1) 对应测评1，用户1
INSERT INTO `assessment_answer_detail` (`result_id`, `question_id`, `option_id`, `score`) VALUES
(1, 1, 2, 2),   -- 偶尔
(1, 2, 3, 3),   -- 沟通解决
(1, 3, 3, 3);   -- 比较满意

-- 结果2 (result_id 2) 对应测评2，用户1
INSERT INTO `assessment_answer_detail` (`result_id`, `question_id`, `option_id`, `score`) VALUES
(2, 4, 4, 4),   -- 非常符合
(2, 5, 3, 3),   -- 比较符合
(2, 6, 3, 3);   -- 比较符合

-- 结果3 (result_id 3) 对应测评3，用户2
INSERT INTO `assessment_answer_detail` (`result_id`, `question_id`, `option_id`, `score`) VALUES
(3, 7, 2, 2),   -- 很少能
(3, 8, 3, 3),   -- 有时能
(3, 9, 2, 2);   -- 经常

-- 结果4 (result_id 4) 对应测评4，用户2
INSERT INTO `assessment_answer_detail` (`result_id`, `question_id`, `option_id`, `score`) VALUES
(4, 10, 3, 3),  -- 较好
(4, 11, 3, 3),  -- 有较大影响
(4, 12, 2, 2);  -- 偶尔

-- 结果5 (result_id 5) 对应测评5，用户3
INSERT INTO `assessment_answer_detail` (`result_id`, `question_id`, `option_id`, `score`) VALUES
(5, 13, 2, 2),  -- 偏向与人打交道
(5, 14, 4, 4),  -- 非常喜欢
(5, 15, 3, 3);  -- 比较愿意

-- 结果6 (result_id 6) 对应测评6，用户3
INSERT INTO `assessment_answer_detail` (`result_id`, `question_id`, `option_id`, `score`) VALUES
(6, 16, 2, 2),  -- 偶尔
(6, 17, 2, 2),  -- 偶尔
(6, 18, 2, 2);  -- 偶尔

SET FOREIGN_KEY_CHECKS = 1;
