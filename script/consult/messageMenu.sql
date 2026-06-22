-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询留言', '2037', '1', 'message', 'consult/message/index', 1, 0, 'C', '0', '0', 'consult:message:list', '#', 'admin', sysdate(), '', null, '咨询留言菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询留言查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'consult:message:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询留言新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'consult:message:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询留言修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'consult:message:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询留言删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'consult:message:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('咨询留言导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'consult:message:export',       '#', 'admin', sysdate(), '', null, '');