-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('题目选项', '2092', '1', 'option', 'assessment/option/index', 1, 0, 'C', '0', '0', 'assessment:option:list', '#', 'admin', sysdate(), '', null, '题目选项菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('题目选项查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'assessment:option:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('题目选项新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'assessment:option:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('题目选项修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'assessment:option:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('题目选项删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'assessment:option:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('题目选项导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'assessment:option:export',       '#', 'admin', sysdate(), '', null, '');