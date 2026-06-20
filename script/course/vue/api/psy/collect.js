import request from '@/utils/request'

// 查询课程收藏列表
export function listCollect(query) {
  return request({
    url: '/psy/collect/list',
    method: 'get',
    params: query
  })
}

// 查询课程收藏详细
export function getCollect(id) {
  return request({
    url: '/psy/collect/' + id,
    method: 'get'
  })
}

// 新增课程收藏
export function addCollect(data) {
  return request({
    url: '/psy/collect',
    method: 'post',
    data: data
  })
}

// 修改课程收藏
export function updateCollect(data) {
  return request({
    url: '/psy/collect',
    method: 'put',
    data: data
  })
}

// 删除课程收藏
export function delCollect(id) {
  return request({
    url: '/psy/collect/' + id,
    method: 'delete'
  })
}
