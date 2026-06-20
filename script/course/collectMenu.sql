-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('课程收藏', '2000', '1', 'collect', 'psy/collect/index', 1, 0, 'C', '0', '0', 'psy:collect:list', '#', 'admin', sysdate(), '', null, '课程收藏菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('课程收藏查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'psy:collect:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('课程收藏新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'psy:collect:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('课程收藏修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'psy:collect:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('课程收藏删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'psy:collect:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('课程收藏导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'psy:collect:export',       '#', 'admin', sysdate(), '', null, '');