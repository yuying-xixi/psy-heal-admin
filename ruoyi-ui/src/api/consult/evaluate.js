import request from '@/utils/request'

// 查询咨询评价列表
export function listEvaluate(query) {
  return request({
    url: '/consult/evaluate/list',
    method: 'get',
    params: query
  })
}

// 查询咨询评价详细
export function getEvaluate(id) {
  return request({
    url: '/consult/evaluate/' + id,
    method: 'get'
  })
}

// 新增咨询评价
export function addEvaluate(data) {
  return request({
    url: '/consult/evaluate',
    method: 'post',
    data: data
  })
}

// 修改咨询评价
export function updateEvaluate(data) {
  return request({
    url: '/consult/evaluate',
    method: 'put',
    data: data
  })
}

// 删除咨询评价
export function delEvaluate(id) {
  return request({
    url: '/consult/evaluate/' + id,
    method: 'delete'
  })
}
