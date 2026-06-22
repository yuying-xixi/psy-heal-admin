-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('收费类型', '2037', '1', 'type', 'consult/type/index', 1, 0, 'C', '0', '0', 'consult:type:list', '#', 'admin', sysdate(), '', null, '收费类型菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('收费类型查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'consult:type:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('收费类型新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'consult:type:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('收费类型修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'consult:type:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('收费类型删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'consult:type:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('收费类型导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'consult:type:export',       '#', 'admin', sysdate(), '', null, '');