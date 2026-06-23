-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('回复', '2092', '1', 'reply', 'assessment/reply/index', 1, 0, 'C', '0', '0', 'assessment:reply:list', '#', 'admin', sysdate(), '', null, '回复菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('回复查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'assessment:reply:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('回复新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'assessment:reply:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('回复修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'assessment:reply:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('回复删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'assessment:reply:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('回复导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'assessment:reply:export',       '#', 'admin', sysdate(), '', null, '');