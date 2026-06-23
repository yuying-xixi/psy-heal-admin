import request from '@/utils/request'

// 查询问题点赞列表
export function listLike(query) {
  return request({
    url: '/question/like/list',
    method: 'get',
    params: query
  })
}

// 查询问题点赞详细
export function getLike(id) {
  return request({
    url: '/question/like/' + id,
    method: 'get'
  })
}

// 新增问题点赞
export function addLike(data) {
  return request({
    url: '/question/like',
    method: 'post',
    data: data
  })
}

// 修改问题点赞
export function updateLike(data) {
  return request({
    url: '/question/like',
    method: 'put',
    data: data
  })
}

// 删除问题点赞
export function delLike(id) {
  return request({
    url: '/question/like/' + id,
    method: 'delete'
  })
}
