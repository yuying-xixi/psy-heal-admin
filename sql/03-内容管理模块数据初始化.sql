/*==============================================================*/
/* 初始化数据 - 心理咨询平台                                      */
/*==============================================================*/

-- ============================================================
-- 一、文章分类
-- ============================================================
INSERT INTO article_category
(category_name, del_flag, create_by, create_time, update_by, update_time)
VALUES
    ('心理科普','0','admin',NOW(),'admin',NOW()),
    ('心理健康','0','admin',NOW(),'admin',NOW()),
    ('情绪管理','0','admin',NOW(),'admin',NOW()),
    ('压力管理','0','admin',NOW(),'admin',NOW()),
    ('焦虑缓解','0','admin',NOW(),'admin',NOW()),
    ('抑郁识别','0','admin',NOW(),'admin',NOW()),
    ('睡眠改善','0','admin',NOW(),'admin',NOW()),
    ('人际关系','0','admin',NOW(),'admin',NOW()),
    ('亲子教育','0','admin',NOW(),'admin',NOW()),
    ('婚恋情感','0','admin',NOW(),'admin',NOW()),
    ('青少年心理','0','admin',NOW(),'admin',NOW()),
    ('大学生心理','0','admin',NOW(),'admin',NOW()),
    ('职场心理','0','admin',NOW(),'admin',NOW()),
    ('老年心理','0','admin',NOW(),'admin',NOW()),
    ('自我成长','0','admin',NOW(),'admin',NOW()),
    ('心理咨询','0','admin',NOW(),'admin',NOW()),
    ('心理测评','0','admin',NOW(),'admin',NOW()),
    ('危机干预','0','admin',NOW(),'admin',NOW()),
    ('正念冥想','0','admin',NOW(),'admin',NOW()),
    ('心理案例','0','admin',NOW(),'admin',NOW());



-- ============================================================
-- 二、FM分类
-- ============================================================
INSERT INTO fm_category
(category_name, del_flag, create_by, create_time, update_by, update_time)
VALUES
    ('睡前故事','0','admin',NOW(),'admin',NOW()),
    ('情绪疗愈','0','admin',NOW(),'admin',NOW()),
    ('减压放松','0','admin',NOW(),'admin',NOW()),
    ('正念冥想','0','admin',NOW(),'admin',NOW()),
    ('心理课堂','0','admin',NOW(),'admin',NOW()),
    ('亲子成长','0','admin',NOW(),'admin',NOW()),
    ('职场心理','0','admin',NOW(),'admin',NOW()),
    ('恋爱婚姻','0','admin',NOW(),'admin',NOW()),
    ('睡眠助眠','0','admin',NOW(),'admin',NOW()),
    ('成长电台','0','admin',NOW(),'admin',NOW());



-- ============================================================
-- 三、FM
-- ============================================================
INSERT INTO fm
(title,thumbnail,fm_category_id,del_flag,create_by,create_time)
VALUES
    ('十分钟缓解焦虑','/profile/fm/fm01.jpg',2,'0','admin',NOW()),
    ('睡前放松冥想','/profile/fm/fm02.jpg',9,'0','admin',NOW()),
    ('正念呼吸训练','/profile/fm/fm03.jpg',4,'0','admin',NOW()),
    ('如何调节情绪','/profile/fm/fm04.jpg',5,'0','admin',NOW()),
    ('缓解工作压力','/profile/fm/fm05.jpg',7,'0','admin',NOW()),
    ('亲子沟通技巧','/profile/fm/fm06.jpg',6,'0','admin',NOW()),
    ('提升自信心','/profile/fm/fm07.jpg',10,'0','admin',NOW()),
    ('晚安心理电台','/profile/fm/fm08.jpg',1,'0','admin',NOW());



-- ============================================================
-- 四、FM音频
-- ============================================================
INSERT INTO fm_audio
(fm_id,audio_name,audio_url,audio_duration,audio_size,sort_order,play_count,del_flag,create_by,create_time)
VALUES
    (1,'十分钟缓解焦虑','/profile/audio/anxiety.mp3',600,10240000,1,320,'0','admin',NOW()),
    (2,'睡前放松冥想','/profile/audio/sleep.mp3',1200,18500000,1,520,'0','admin',NOW()),
    (3,'正念呼吸训练','/profile/audio/breath.mp3',480,8600000,1,180,'0','admin',NOW()),
    (4,'如何调节情绪','/profile/audio/emotion.mp3',960,15000000,1,410,'0','admin',NOW()),
    (5,'缓解工作压力','/profile/audio/work.mp3',900,13200000,1,280,'0','admin',NOW()),
    (6,'亲子沟通技巧','/profile/audio/family.mp3',980,15600000,1,195,'0','admin',NOW()),
    (7,'提升自信心','/profile/audio/confidence.mp3',760,12400000,1,235,'0','admin',NOW()),
    (8,'晚安心理电台','/profile/audio/goodnight.mp3',1500,23000000,1,630,'0','admin',NOW());



-- ============================================================
-- 五、公益中心
-- ============================================================
INSERT INTO public_welfare
(title,intro,thumbnail,content,mentor_id,read_count,del_flag,create_by,create_time)
VALUES
    ('525心理健康日公益讲座','关注心理健康，共建阳光生活','/profile/public/1.jpg','活动详情......',1,562,'0','admin',NOW()),
    ('高考减压公益课堂','帮助考生缓解焦虑压力','/profile/public/2.jpg','活动详情......',2,435,'0','admin',NOW()),
    ('社区心理健康宣传','传播心理健康知识','/profile/public/3.jpg','活动详情......',1,356,'0','admin',NOW()),
    ('大学生心理成长计划','关注大学生心理健康','/profile/public/4.jpg','活动详情......',3,287,'0','admin',NOW()),
    ('职场减压公益沙龙','提升职场幸福感','/profile/public/5.jpg','活动详情......',2,215,'0','admin',NOW());



-- ============================================================
-- 六、心理知识
-- ============================================================
INSERT INTO psychology_knowledge
(title,intro,thumbnail,content,mentor_id,read_count,del_flag,create_by,create_time)
VALUES
    ('什么是焦虑症','认识焦虑症及其常见表现','/profile/knowledge/1.jpg','正文内容......',1,1320,'0','admin',NOW()),
    ('如何改善睡眠质量','掌握科学睡眠方法','/profile/knowledge/2.jpg','正文内容......',2,1086,'0','admin',NOW()),
    ('压力管理技巧','学会释放压力','/profile/knowledge/3.jpg','正文内容......',1,965,'0','admin',NOW()),
    ('情绪调节的方法','认识自己的情绪','/profile/knowledge/4.jpg','正文内容......',3,852,'0','admin',NOW()),
    ('心理健康十问','常见心理问题答疑','/profile/knowledge/5.jpg','正文内容......',2,716,'0','admin',NOW()),
    ('提升幸福感的方法','建立积极心态','/profile/knowledge/6.jpg','正文内容......',1,632,'0','admin',NOW()),
    ('青少年心理发展','青春期心理特点','/profile/knowledge/7.jpg','正文内容......',3,528,'0','admin',NOW()),
    ('家庭关系与心理健康','构建和谐家庭关系','/profile/knowledge/8.jpg','正文内容......',2,462,'0','admin',NOW()),
    ('认识抑郁情绪','了解抑郁情绪与抑郁症的区别','/profile/knowledge/9.jpg','正文内容......',1,598,'0','admin',NOW()),
    ('正念冥想入门','学习正念放松技巧','/profile/knowledge/10.jpg','正文内容......',3,485,'0','admin',NOW());

-- ============================================================
-- 七、文章初始化
-- ============================================================
INSERT INTO article
(article_name, article_intro, mentor_id, thumbnail, content,
 read_count, category_id, status, del_flag, create_by, create_time)
VALUES
    ('认识焦虑情绪','了解焦虑情绪产生的原因及缓解方法',1,'/profile/article/1.jpg','焦虑是一种常见的情绪反应，当面对压力时适度焦虑有助于提高效率，但持续焦虑则需要及时调整。',856,5,1,'0','admin',NOW()),

    ('如何改善睡眠质量','掌握科学睡眠方法，提高睡眠质量',2,'/profile/article/2.jpg','保持规律作息、减少睡前电子产品使用、营造舒适睡眠环境，都有助于改善睡眠。',725,7,1,'0','admin',NOW()),

    ('压力管理的五个技巧','学会释放压力，提升生活幸福感',1,'/profile/article/3.jpg','合理规划时间、坚持运动、学会倾诉、培养兴趣爱好以及保持积极心态，是缓解压力的重要方式。',612,4,1,'0','admin',NOW()),

    ('什么是心理健康','正确认识心理健康的重要性',3,'/profile/article/4.jpg','心理健康不仅意味着没有心理疾病，更意味着拥有积极乐观的生活态度。',1032,2,1,'0','admin',NOW()),

    ('情绪调节的方法','帮助自己管理负面情绪',2,'/profile/article/5.jpg','通过深呼吸、正念练习、运动等方式，可以有效调节情绪。',589,3,1,'0','admin',NOW()),

    ('大学生如何缓解考试焦虑','考试焦虑的自我调节方法',1,'/profile/article/6.jpg','制定合理复习计划、保证睡眠和适当运动，有助于减轻考试焦虑。',932,12,1,'0','admin',NOW()),

    ('亲子沟通的三个原则','建立良好的家庭沟通方式',3,'/profile/article/7.jpg','倾听、尊重和鼓励，是建立亲子关系的重要基础。',468,9,1,'0','admin',NOW()),

    ('如何建立自信心','培养积极的自我认知',2,'/profile/article/8.jpg','通过不断积累成功经验和积极心理暗示，可以逐渐建立自信。',514,15,1,'0','admin',NOW()),

    ('职场压力如何缓解','面对工作压力的心理调适',1,'/profile/article/9.jpg','保持工作与生活平衡，学会拒绝无效加班，是缓解压力的重要方式。',687,13,1,'0','admin',NOW()),

    ('正念冥想入门','体验正念带来的平静',2,'/profile/article/10.jpg','每天坚持10分钟正念冥想，可以有效缓解焦虑，提高专注力。',743,19,1,'0','admin',NOW()),

    ('社交恐惧如何改善','逐步建立社交自信',3,'/profile/article/11.jpg','从小范围社交开始，逐步建立积极体验，是改善社交恐惧的重要方法。',365,8,1,'0','admin',NOW()),

    ('青春期心理特点','了解青春期心理变化',1,'/profile/article/12.jpg','青春期是心理快速发展的阶段，需要家庭和学校共同关注。',492,11,1,'0','admin',NOW()),

    ('抑郁情绪与抑郁症的区别','正确认识抑郁',2,'/profile/article/13.jpg','短暂情绪低落与持续抑郁症存在明显区别，应及时寻求专业帮助。',821,6,1,'0','admin',NOW()),

    ('心理咨询能帮助什么','走进心理咨询',3,'/profile/article/14.jpg','心理咨询可以帮助来访者认识自己、调整情绪和改善人际关系。',598,16,1,'0','admin',NOW()),

    ('建立积极心理状态','培养积极思维方式',1,'/profile/article/15.jpg','积极关注生活中的美好事物，可以提升幸福感和抗压能力。',536,15,1,'0','admin',NOW()),

    ('如何缓解孤独感','面对孤独的心理调节',2,'/profile/article/16.jpg','主动建立社交联系，培养兴趣爱好，有助于缓解孤独感。',421,8,1,'0','admin',NOW()),

    ('家庭关系与心理健康','良好的家庭氛围促进心理成长',3,'/profile/article/17.jpg','家庭支持是维护心理健康的重要因素。',478,9,1,'0','admin',NOW()),

    ('儿童心理健康教育','关注孩子心理成长',1,'/profile/article/18.jpg','家长应关注孩子情绪变化，营造安全温暖的成长环境。',554,9,1,'0','admin',NOW()),

    ('认识心理危机','心理危机的识别与应对',2,'/profile/article/19.jpg','及时识别心理危机信号，主动寻求专业帮助十分重要。',392,18,1,'0','admin',NOW()),

    ('每天十分钟放松训练','缓解焦虑与压力的小技巧',3,'/profile/article/20.jpg','坚持每天进行呼吸训练和肌肉放松，有助于保持心理健康。',961,19,1,'0','admin',NOW());