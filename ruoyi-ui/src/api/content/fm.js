import request from '@/utils/request'

// 查询FM列表
export function listFm(query) {
  return request({
    url: '/content/fm/list',
    method: 'get',
    params: query
  })
}

// 查询FM详细
export function getFm(id) {
  return request({
    url: '/content/fm/' + id,
    method: 'get'
  })
}

// 新增FM
export function addFm(data) {
  return request({
    url: '/content/fm',
    method: 'post',
    data: data
  })
}

// 修改FM
export function updateFm(data) {
  return request({
    url: '/content/fm',
    method: 'put',
    data: data
  })
}

// 删除FM
export function delFm(id) {
  return request({
    url: '/content/fm/' + id,
    method: 'delete'
  })
}
