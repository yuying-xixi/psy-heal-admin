import request from '@/utils/request'

// 查询测评结果列表
export function listResult(query) {
  return request({
    url: '/assessment/result/list',
    method: 'get',
    params: query
  })
}

// 查询测评结果详细
export function getResult(id) {
  return request({
    url: '/assessment/result/' + id,
    method: 'get'
  })
}

// 新增测评结果
export function addResult(data) {
  return request({
    url: '/assessment/result',
    method: 'post',
    data: data
  })
}

// 修改测评结果
export function updateResult(data) {
  return request({
    url: '/assessment/result',
    method: 'put',
    data: data
  })
}

// 删除测评结果
export function delResult(id) {
  return request({
    url: '/assessment/result/' + id,
    method: 'delete'
  })
}
