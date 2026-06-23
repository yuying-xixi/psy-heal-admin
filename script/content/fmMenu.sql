-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM', '2094', '1', 'fm', 'content/fm/index', 1, 0, 'C', '0', '0', 'content:fm:list', '#', 'admin', sysdate(), '', null, 'FM菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'content:fm:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'content:fm:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'content:fm:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'content:fm:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'content:fm:export',       '#', 'admin', sysdate(), '', null, '');