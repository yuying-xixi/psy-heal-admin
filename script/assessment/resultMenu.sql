-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测评结果', '2092', '1', 'result', 'assessment/result/index', 1, 0, 'C', '0', '0', 'assessment:result:list', '#', 'admin', sysdate(), '', null, '测评结果菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测评结果查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'assessment:result:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测评结果新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'assessment:result:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测评结果修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'assessment:result:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测评结果删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'assessment:result:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测评结果导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'assessment:result:export',       '#', 'admin', sysdate(), '', null, '');