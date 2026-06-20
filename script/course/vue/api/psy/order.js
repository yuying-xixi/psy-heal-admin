import request from '@/utils/request'

// 查询课程订单列表
export function listOrder(query) {
  return request({
    url: '/psy/order/list',
    method: 'get',
    params: query
  })
}

// 查询课程订单详细
export function getOrder(id) {
  return request({
    url: '/psy/order/' + id,
    method: 'get'
  })
}

// 新增课程订单
export function addOrder(data) {
  return request({
    url: '/psy/order',
    method: 'post',
    data: data
  })
}

// 修改课程订单
export function updateOrder(data) {
  return request({
    url: '/psy/order',
    method: 'put',
    data: data
  })
}

// 删除课程订单
export function delOrder(id) {
  return request({
    url: '/psy/order/' + id,
    method: 'delete'
  })
}
