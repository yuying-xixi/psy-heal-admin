-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师等级', '2037', '1', 'level', 'consult/level/index', 1, 0, 'C', '0', '0', 'consult:level:list', '#', 'admin', sysdate(), '', null, '咨询师等级菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师等级查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'consult:level:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师等级新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'consult:level:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师等级修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'consult:level:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师等级删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'consult:level:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师等级导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'consult:level:export',       '#', 'admin', sysdate(), '', null, '');