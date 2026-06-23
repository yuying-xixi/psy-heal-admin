import request from '@/utils/request'

// 查询题目选项列表
export function listOption(query) {
  return request({
    url: '/assessment/option/list',
    method: 'get',
    params: query
  })
}

// 查询题目选项详细
export function getOption(id) {
  return request({
    url: '/assessment/option/' + id,
    method: 'get'
  })
}

// 新增题目选项
export function addOption(data) {
  return request({
    url: '/assessment/option',
    method: 'post',
    data: data
  })
}

// 修改题目选项
export function updateOption(data) {
  return request({
    url: '/assessment/option',
    method: 'put',
    data: data
  })
}

// 删除题目选项
export function delOption(id) {
  return request({
    url: '/assessment/option/' + id,
    method: 'delete'
  })
}
