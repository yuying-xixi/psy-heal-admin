import request from '@/utils/request'

// 查询用户答题详情列表
export function listDetail(query) {
  return request({
    url: '/assessment/detail/list',
    method: 'get',
    params: query
  })
}

// 查询用户答题详情详细
export function getDetail(id) {
  return request({
    url: '/assessment/detail/' + id,
    method: 'get'
  })
}

// 新增用户答题详情
export function addDetail(data) {
  return request({
    url: '/assessment/detail',
    method: 'post',
    data: data
  })
}

// 修改用户答题详情
export function updateDetail(data) {
  return request({
    url: '/assessment/detail',
    method: 'put',
    data: data
  })
}

// 删除用户答题详情
export function delDetail(id) {
  return request({
    url: '/assessment/detail/' + id,
    method: 'delete'
  })
}
