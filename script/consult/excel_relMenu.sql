-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师擅长关联', '2037', '1', 'excel_rel', 'consult/excel_rel/index', 1, 0, 'C', '0', '0', 'consult:excel_rel:list', '#', 'admin', sysdate(), '', null, '咨询师擅长关联菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师擅长关联查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel_rel:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师擅长关联新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel_rel:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师擅长关联修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel_rel:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师擅长关联删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel_rel:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询师擅长关联导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'consult:excel_rel:export',       '#', 'admin', sysdate(), '', null, '');