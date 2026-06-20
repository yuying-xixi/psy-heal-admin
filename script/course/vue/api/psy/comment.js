import request from '@/utils/request'

// 查询课程评价列表
export function listComment(query) {
  return request({
    url: '/psy/comment/list',
    method: 'get',
    params: query
  })
}

// 查询课程评价详细
export function getComment(id) {
  return request({
    url: '/psy/comment/' + id,
    method: 'get'
  })
}

// 新增课程评价
export function addComment(data) {
  return request({
    url: '/psy/comment',
    method: 'post',
    data: data
  })
}

// 修改课程评价
export function updateComment(data) {
  return request({
    url: '/psy/comment',
    method: 'put',
    data: data
  })
}

// 删除课程评价
export function delComment(id) {
  return request({
    url: '/psy/comment/' + id,
    method: 'delete'
  })
}
