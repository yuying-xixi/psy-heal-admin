import request from '@/utils/request'

// 查询公益中心列表
export function listWelfare(query) {
  return request({
    url: '/content/welfare/list',
    method: 'get',
    params: query
  })
}

// 查询公益中心详细
export function getWelfare(id) {
  return request({
    url: '/content/welfare/' + id,
    method: 'get'
  })
}

// 新增公益中心
export function addWelfare(data) {
  return request({
    url: '/content/welfare',
    method: 'post',
    data: data
  })
}

// 修改公益中心
export function updateWelfare(data) {
  return request({
    url: '/content/welfare',
    method: 'put',
    data: data
  })
}

// 删除公益中心
export function delWelfare(id) {
  return request({
    url: '/content/welfare/' + id,
    method: 'delete'
  })
}
