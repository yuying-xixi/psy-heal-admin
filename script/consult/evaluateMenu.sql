-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询评价', '2037', '1', 'evaluate', 'consult/evaluate/index', 1, 0, 'C', '0', '0', 'consult:evaluate:list', '#', 'admin', sysdate(), '', null, '咨询评价菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询评价查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'consult:evaluate:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询评价新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'consult:evaluate:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询评价修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'consult:evaluate:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询评价删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'consult:evaluate:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询评价导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'consult:evaluate:export',       '#', 'admin', sysdate(), '', null, '');