-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理知识', '2094', '1', 'knowledge', 'content/knowledge/index', 1, 0, 'C', '0', '0', 'content:knowledge:list', '#', 'admin', sysdate(), '', null, '心理知识菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理知识查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'content:knowledge:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理知识新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'content:knowledge:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理知识修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'content:knowledge:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理知识删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'content:knowledge:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('心理知识导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'content:knowledge:export',       '#', 'admin', sysdate(), '', null, '');