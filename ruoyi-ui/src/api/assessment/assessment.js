import request from '@/utils/request'

// 查询心理测评列表
export function listAssessment(query) {
  return request({
    url: '/assessment/assessment/list',
    method: 'get',
    params: query
  })
}

// 查询心理测评详细
export function getAssessment(id) {
  return request({
    url: '/assessment/assessment/' + id,
    method: 'get'
  })
}

// 新增心理测评
export function addAssessment(data) {
  return request({
    url: '/assessment/assessment',
    method: 'post',
    data: data
  })
}

// 修改心理测评
export function updateAssessment(data) {
  return request({
    url: '/assessment/assessment',
    method: 'put',
    data: data
  })
}

// 删除心理测评
export function delAssessment(id) {
  return request({
    url: '/assessment/assessment/' + id,
    method: 'delete'
  })
}
