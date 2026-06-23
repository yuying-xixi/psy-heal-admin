import request from '@/utils/request'

// 查询FM分类列表
export function listFm_category(query) {
  return request({
    url: '/content/fm_category/list',
    method: 'get',
    params: query
  })
}

// 查询FM分类详细
export function getFm_category(id) {
  return request({
    url: '/content/fm_category/' + id,
    method: 'get'
  })
}

// 新增FM分类
export function addFm_category(data) {
  return request({
    url: '/content/fm_category',
    method: 'post',
    data: data
  })
}

// 修改FM分类
export function updateFm_category(data) {
  return request({
    url: '/content/fm_category',
    method: 'put',
    data: data
  })
}

// 删除FM分类
export function delFm_category(id) {
  return request({
    url: '/content/fm_category/' + id,
    method: 'delete'
  })
}
