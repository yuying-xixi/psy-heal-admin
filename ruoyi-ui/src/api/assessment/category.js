import request from '@/utils/request'

// 查询心理测评分类列表
export function listCategory(query) {
  return request({
    url: '/assessment/category/list',
    method: 'get',
    params: query
  })
}

// 查询心理测评分类详细
export function getCategory(id) {
  return request({
    url: '/assessment/category/' + id,
    method: 'get'
  })
}

// 新增心理测评分类
export function addCategory(data) {
  return request({
    url: '/assessment/category',
    method: 'post',
    data: data
  })
}

// 修改心理测评分类
export function updateCategory(data) {
  return request({
    url: '/assessment/category',
    method: 'put',
    data: data
  })
}

// 删除心理测评分类
export function delCategory(id) {
  return request({
    url: '/assessment/category/' + id,
    method: 'delete'
  })
}
