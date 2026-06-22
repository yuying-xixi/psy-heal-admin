import request from '@/utils/request'

// 查询咨询师擅长关联列表
export function listExcel_rel(query) {
  return request({
    url: '/consult/excel_rel/list',
    method: 'get',
    params: query
  })
}

// 查询咨询师擅长关联详细
export function getExcel_rel(id) {
  return request({
    url: '/consult/excel_rel/' + id,
    method: 'get'
  })
}

// 新增咨询师擅长关联
export function addExcel_rel(data) {
  return request({
    url: '/consult/excel_rel',
    method: 'post',
    data: data
  })
}

// 修改咨询师擅长关联
export function updateExcel_rel(data) {
  return request({
    url: '/consult/excel_rel',
    method: 'put',
    data: data
  })
}

// 删除咨询师擅长关联
export function delExcel_rel(id) {
  return request({
    url: '/consult/excel_rel/' + id,
    method: 'delete'
  })
}
