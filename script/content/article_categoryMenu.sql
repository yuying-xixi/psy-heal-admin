-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('文章分类', '2094', '1', 'article_category', 'content/article_category/index', 1, 0, 'C', '0', '0', 'content:article_category:list', '#', 'admin', sysdate(), '', null, '文章分类菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('文章分类查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'content:article_category:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('文章分类新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'content:article_category:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('文章分类修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'content:article_category:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('文章分类删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'content:article_category:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('文章分类导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'content:article_category:export',       '#', 'admin', sysdate(), '', null, '');