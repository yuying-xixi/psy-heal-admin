-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('擅长领域', '2037', '1', 'excel', 'consult/excel/index', 1, 0, 'C', '0', '0', 'consult:excel:list', '#', 'admin', sysdate(), '', null, '擅长领域菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('擅长领域查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('擅长领域新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('擅长领域修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('擅长领域删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('擅长领域导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel:export',       '#', 'admin', sysdate(), '', null, '');