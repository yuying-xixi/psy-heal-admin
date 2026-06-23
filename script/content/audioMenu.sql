-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM音频', '2094', '1', 'audio', 'content/audio/index', 1, 0, 'C', '0', '0', 'content:audio:list', '#', 'admin', sysdate(), '', null, 'FM音频菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM音频查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'content:audio:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM音频新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'content:audio:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM音频修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'content:audio:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM音频删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'content:audio:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('FM音频导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'content:audio:export',       '#', 'admin', sysdate(), '', null, '');