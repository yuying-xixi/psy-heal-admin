import request from '@/utils/request'

// 查询心理知识列表
export function listKnowledge(query) {
  return request({
    url: '/content/knowledge/list',
    method: 'get',
    params: query
  })
}

// 查询心理知识详细
export function getKnowledge(id) {
  return request({
    url: '/content/knowledge/' + id,
    method: 'get'
  })
}

// 新增心理知识
export function addKnowledge(data) {
  return request({
    url: '/content/knowledge',
    method: 'post',
    data: data
  })
}

// 修改心理知识
export function updateKnowledge(data) {
  return request({
    url: '/content/knowledge',
    method: 'put',
    data: data
  })
}

// 删除心理知识
export function delKnowledge(id) {
  return request({
    url: '/content/knowledge/' + id,
    method: 'delete'
  })
}
