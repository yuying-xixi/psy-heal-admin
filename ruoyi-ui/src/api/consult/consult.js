import request from '@/utils/request'

// 查询咨询师列表
export function listConsult(query) {
  return request({
    url: '/consult/consult/list',
    method: 'get',
    params: query
  })
}

// 查询咨询师详细
export function getConsult(id) {
  return request({
    url: '/consult/consult/' + id,
    method: 'get'
  })
}

// 新增咨询师
export function addConsult(data) {
  return request({
    url: '/consult/consult',
    method: 'post',
    data: data
  })
}

// 修改咨询师
export function updateConsult(data) {
  return request({
    url: '/consult/consult',
    method: 'put',
    data: data
  })
}

// 删除咨询师
export function delConsult(id) {
  return request({
    url: '/consult/consult/' + id,
    method: 'delete'
  })
}
