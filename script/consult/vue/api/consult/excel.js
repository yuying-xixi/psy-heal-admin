import request from '@/utils/request'

// 查询擅长领域列表
export function listExcel(query) {
  return request({
    url: '/consult/excel/list',
    method: 'get',
    params: query
  })
}

// 查询擅长领域详细
export function getExcel(id) {
  return request({
    url: '/consult/excel/' + id,
    method: 'get'
  })
}

// 新增擅长领域
export function addExcel(data) {
  return request({
    url: '/consult/excel',
    method: 'post',
    data: data
  })
}

// 修改擅长领域
export function updateExcel(data) {
  return request({
    url: '/consult/excel',
    method: 'put',
    data: data
  })
}

// 删除擅长领域
export function delExcel(id) {
  return request({
    url: '/consult/excel/' + id,
    method: 'delete'
  })
}
