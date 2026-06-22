import request from '@/utils/request'

// 查询收费类型列表
export function listType(query) {
  return request({
    url: '/consult/type/list',
    method: 'get',
    params: query
  })
}

// 查询收费类型详细
export function getType(id) {
  return request({
    url: '/consult/type/' + id,
    method: 'get'
  })
}

// 新增收费类型
export function addType(data) {
  return request({
    url: '/consult/type',
    method: 'post',
    data: data
  })
}

// 修改收费类型
export function updateType(data) {
  return request({
    url: '/consult/type',
    method: 'put',
    data: data
  })
}

// 删除收费类型
export function delType(id) {
  return request({
    url: '/consult/type/' + id,
    method: 'delete'
  })
}
