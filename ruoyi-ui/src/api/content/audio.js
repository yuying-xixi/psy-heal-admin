import request from '@/utils/request'

// 查询FM音频列表
export function listAudio(query) {
  return request({
    url: '/content/audio/list',
    method: 'get',
    params: query
  })
}

// 查询FM音频详细
export function getAudio(id) {
  return request({
    url: '/content/audio/' + id,
    method: 'get'
  })
}

// 新增FM音频
export function addAudio(data) {
  return request({
    url: '/content/audio',
    method: 'post',
    data: data
  })
}

// 修改FM音频
export function updateAudio(data) {
  return request({
    url: '/content/audio',
    method: 'put',
    data: data
  })
}

// 删除FM音频
export function delAudio(id) {
  return request({
    url: '/content/audio/' + id,
    method: 'delete'
  })
}
