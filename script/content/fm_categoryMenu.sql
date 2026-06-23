-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM分类', '2094', '1', 'fm_category', 'content/fm_category/index', 1, 0, 'C', '0', '0', 'content:fm_category:list', '#', 'admin', sysdate(), '', null, 'FM分类菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM分类查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'content:fm_category:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM分类新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'content:fm_category:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM分类修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'content:fm_category:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM分类删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'content:fm_category:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM分类导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'content:fm_category:export',       '#', 'admin', sysdate(), '', null, '');