import request from '@/utils/request'

// 查询咨询师等级列表
export function listLevel(query) {
  return request({
    url: '/consult/level/list',
    method: 'get',
    params: query
  })
}

// 查询咨询师等级详细
export function getLevel(id) {
  return request({
    url: '/consult/level/' + id,
    method: 'get'
  })
}

// 新增咨询师等级
export function addLevel(data) {
  return request({
    url: '/consult/level',
    method: 'post',
    data: data
  })
}

// 修改咨询师等级
export function updateLevel(data) {
  return request({
    url: '/consult/level',
    method: 'put',
    data: data
  })
}

// 删除咨询师等级
export function delLevel(id) {
  return request({
    url: '/consult/level/' + id,
    method: 'delete'
  })
}
