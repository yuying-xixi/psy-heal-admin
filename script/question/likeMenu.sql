-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('问题点赞', '2093', '1', 'like', 'question/like/index', 1, 0, 'C', '0', '0', 'question:like:list', '#', 'admin', sysdate(), '', null, '问题点赞菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('问题点赞查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'question:like:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('问题点赞新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'question:like:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('问题点赞修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'question:like:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('问题点赞删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'question:like:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('问题点赞导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'question:like:export',       '#', 'admin', sysdate(), '', null, '');