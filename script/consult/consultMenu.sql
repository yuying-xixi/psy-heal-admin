-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师', '2037', '1', 'consult', 'consult/consult/index', 1, 0, 'C', '0', '0', 'consult:consult:list', '#', 'admin', sysdate(), '', null, '咨询师菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'consult:consult:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'consult:consult:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'consult:consult:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'consult:consult:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'consult:consult:export',       '#', 'admin', sysdate(), '', null, '');