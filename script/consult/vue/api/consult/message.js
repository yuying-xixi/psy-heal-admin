import request from '@/utils/request'

// 查询咨询留言列表
export function listMessage(query) {
  return request({
    url: '/consult/message/list',
    method: 'get',
    params: query
  })
}

// 查询咨询留言详细
export function getMessage(id) {
  return request({
    url: '/consult/message/' + id,
    method: 'get'
  })
}

// 新增咨询留言
export function addMessage(data) {
  return request({
    url: '/consult/message',
    method: 'post',
    data: data
  })
}

// 修改咨询留言
export function updateMessage(data) {
  return request({
    url: '/consult/message',
    method: 'put',
    data: data
  })
}

// 删除咨询留言
export function delMessage(id) {
  return request({
    url: '/consult/message/' + id,
    method: 'delete'
  })
}
