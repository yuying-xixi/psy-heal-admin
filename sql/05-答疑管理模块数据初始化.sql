-- ============================================================
-- 心理咨询平台 - 答疑管理模块测试数据初始化
-- Author : 雨影熙熙
-- Date   : 2026-06
-- ============================================================

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ============================================================
-- 1. 问题表
-- ============================================================
INSERT INTO `question` (`question_title`, `question_content`, `user_id`, `view_count`, `reply_count`, `is_resolved`, `publish_time`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('如何缓解考试前的焦虑情绪？', '每次考试前我都会非常紧张，心跳加速，晚上睡不着觉，请问有什么有效的方法可以缓解这种焦虑？', 1, 120, 3, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
('和伴侣沟通时总是容易吵架怎么办？', '我和伴侣经常因为小事争吵，每次沟通到最后都会变成互相指责，请问如何改善我们的沟通方式？', 2, 85, 2, 0, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
('工作压力大导致失眠，该如何调整？', '最近工作压力很大，晚上总是睡不着，白天精神很差，已经持续两周了，请问有什么建议？', 3, 200, 4, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
('如何克服社交恐惧？', '我在人多的地方会感到不自在，不敢主动和别人说话，这严重影响了我的工作和生活，请问该怎么办？', 1, 150, 3, 0, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
('失恋后如何快速走出阴影？', '和相恋三年的女友分手了，感觉非常痛苦，做什么都提不起兴趣，请问怎样才能尽快走出来？', 4, 95, 2, 0, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
('如何提高自己的自信心？', '我总是觉得自己不够好，不敢在会议上发言，也不敢尝试新事物，请问有什么方法可以提升自信心？', 5, 180, 5, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
('原生家庭带来的心理创伤如何疗愈？', '从小父母关系不好，经常吵架，导致我现在对亲密关系非常恐惧，请问该如何疗愈这种创伤？', 2, 130, 3, 0, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
('如何判断自己是否需要心理咨询？', '最近情绪一直很低落，但不确定是否严重到需要寻求专业帮助，请问有哪些判断标准？', 3, 160, 4, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW());

-- ============================================================
-- 2. 回复表
-- ============================================================
-- 问题1（question_id = 1）的回复
INSERT INTO `question_reply` (`reply_content`, `reply_time`, `user_id`, `consult_id`, `question_id`, `is_best`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('可以尝试深呼吸练习，每次吸气4秒，屏住4秒，呼气6秒，重复几次就能缓解紧张。', NOW(), NULL, 1, 1, 1, '0', 'admin', NOW(), 'admin', NOW()),
('建议提前做好复习计划，减少临时抱佛脚带来的压力。', NOW(), 2, NULL, 1, 0, '0', 'admin', NOW(), 'admin', NOW()),
('也可以试试正念冥想，每天花10分钟关注自己的呼吸。', NOW(), NULL, 2, 1, 0, '0', 'admin', NOW(), 'admin', NOW());

-- 问题2（question_id = 2）的回复
INSERT INTO `question_reply` (`reply_content`, `reply_time`, `user_id`, `consult_id`, `question_id`, `is_best`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('建议使用“我”开头的表达方式，比如“我感到难过”而不是“你总是让我难过”。', NOW(), NULL, 1, 2, 1, '0', 'admin', NOW(), 'admin', NOW()),
('可以约定一个“暂停”信号，当情绪激动时先暂停10分钟再继续沟通。', NOW(), 3, NULL, 2, 0, '0', 'admin', NOW(), 'admin', NOW());

-- 问题3（question_id = 3）的回复
INSERT INTO `question_reply` (`reply_content`, `reply_time`, `user_id`, `consult_id`, `question_id`, `is_best`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('建议建立固定的睡前仪式，比如泡脚、听轻音乐、远离手机。', NOW(), NULL, 2, 3, 1, '0', 'admin', NOW(), 'admin', NOW()),
('如果持续两周以上，建议咨询专业医生或心理咨询师。', NOW(), NULL, 1, 3, 0, '0', 'admin', NOW(), 'admin', NOW()),
('白天适当运动也有助于改善睡眠质量。', NOW(), 4, NULL, 3, 0, '0', 'admin', NOW(), 'admin', NOW()),
('可以尝试写“烦恼日记”，把担心的事情写下来，有助于释放压力。', NOW(), 5, NULL, 3, 0, '0', 'admin', NOW(), 'admin', NOW());

-- 问题4（question_id = 4）的回复
INSERT INTO `question_reply` (`reply_content`, `reply_time`, `user_id`, `consult_id`, `question_id`, `is_best`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('可以从小的社交场合开始练习，比如每天和便利店店员说一句“谢谢”。', NOW(), NULL, 1, 4, 1, '0', 'admin', NOW(), 'admin', NOW()),
('认知行为疗法（CBT）对社交恐惧非常有效，建议寻求专业帮助。', NOW(), NULL, 2, 4, 0, '0', 'admin', NOW(), 'admin', NOW()),
('也可以参加一些兴趣小组，在共同爱好中自然建立社交。', NOW(), 1, NULL, 4, 0, '0', 'admin', NOW(), 'admin', NOW());

-- 问题5（question_id = 5）的回复
INSERT INTO `question_reply` (`reply_content`, `reply_time`, `user_id`, `consult_id`, `question_id`, `is_best`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('允许自己悲伤，给自己一段时间去接受这个事实，不要强迫自己立刻好起来。', NOW(), NULL, 1, 5, 1, '0', 'admin', NOW(), 'admin', NOW()),
('可以尝试培养新的兴趣爱好，转移注意力。', NOW(), 2, NULL, 5, 0, '0', 'admin', NOW(), 'admin', NOW());

-- 问题6（question_id = 6）的回复
INSERT INTO `question_reply` (`reply_content`, `reply_time`, `user_id`, `consult_id`, `question_id`, `is_best`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('每天记录三件自己做得好的事情，哪怕是小事，慢慢积累自信。', NOW(), NULL, 2, 6, 1, '0', 'admin', NOW(), 'admin', NOW()),
('可以尝试在安全的环境中挑战自己，比如在小组会议上先发表一个简短的观点。', NOW(), 3, NULL, 6, 0, '0', 'admin', NOW(), 'admin', NOW()),
('学习一项新技能也能有效提升自信心。', NOW(), 4, NULL, 6, 0, '0', 'admin', NOW(), 'admin', NOW()),
('如果自卑感严重影响生活，建议寻求心理咨询。', NOW(), NULL, 1, 6, 0, '0', 'admin', NOW(), 'admin', NOW()),
('不要和别人比较，每个人的成长节奏不同。', NOW(), 5, NULL, 6, 0, '0', 'admin', NOW(), 'admin', NOW());

-- 问题7（question_id = 7）的回复
INSERT INTO `question_reply` (`reply_content`, `reply_time`, `user_id`, `consult_id`, `question_id`, `is_best`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('原生家庭的影响是深远的，但可以通过自我觉察和心理咨询来疗愈。', NOW(), NULL, 1, 7, 1, '0', 'admin', NOW(), 'admin', NOW()),
('推荐阅读《原生家庭》这本书，可能会对你有帮助。', NOW(), 2, NULL, 7, 0, '0', 'admin', NOW(), 'admin', NOW()),
('可以尝试写一封给父母的信（不需要寄出），表达自己的感受。', NOW(), NULL, 2, 7, 0, '0', 'admin', NOW(), 'admin', NOW());

-- 问题8（question_id = 8）的回复
INSERT INTO `question_reply` (`reply_content`, `reply_time`, `user_id`, `consult_id`, `question_id`, `is_best`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
('如果情绪低落持续超过两周，且影响日常生活，建议寻求专业评估。', NOW(), NULL, 1, 8, 1, '0', 'admin', NOW(), 'admin', NOW()),
('可以先用一些自评量表（如PHQ-9）进行初步筛查。', NOW(), 3, NULL, 8, 0, '0', 'admin', NOW(), 'admin', NOW()),
('如果你发现自己对以前喜欢的事情失去了兴趣，这也是一个重要的信号。', NOW(), NULL, 2, 8, 0, '0', 'admin', NOW(), 'admin', NOW()),
('不要害怕寻求帮助，心理咨询是维护心理健康的重要方式。', NOW(), 4, NULL, 8, 0, '0', 'admin', NOW(), 'admin', NOW());

-- ============================================================
-- 3. 问题点赞表
-- ============================================================
INSERT INTO `question_like` (`question_id`, `user_id`, `like_time`, `del_flag`, `create_by`, `create_time`, `update_by`, `update_time`)
VALUES
(1, 2, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(1, 3, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(1, 4, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(2, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(2, 3, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(3, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(3, 2, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(3, 4, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(3, 5, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(4, 2, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(4, 3, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(5, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(5, 3, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(6, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(6, 2, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(6, 4, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(6, 5, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(7, 1, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(7, 3, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(8, 2, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(8, 4, NOW(), '0', 'admin', NOW(), 'admin', NOW()),
(8, 5, NOW(), '0', 'admin', NOW(), 'admin', NOW());

SET FOREIGN_KEY_CHECKS = 1;
