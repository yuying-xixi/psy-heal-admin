-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理测评', '2092', '1', 'assessment', 'assessment/assessment/index', 1, 0, 'C', '0', '0', 'assessment:assessment:list', '#', 'admin', sysdate(), '', null, '心理测评菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理测评查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'assessment:assessment:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理测评新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'assessment:assessment:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理测评修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'assessment:assessment:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理测评删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'assessment:assessment:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理测评导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'assessment:assessment:export',       '#', 'admin', sysdate(), '', null, '');