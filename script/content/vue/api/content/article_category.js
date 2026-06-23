import request from '@/utils/request'

// 查询文章分类列表
export function listArticle_category(query) {
  return request({
    url: '/content/article_category/list',
    method: 'get',
    params: query
  })
}

// 查询文章分类详细
export function getArticle_category(id) {
  return request({
    url: '/content/article_category/' + id,
    method: 'get'
  })
}

// 新增文章分类
export function addArticle_category(data) {
  return request({
    url: '/content/article_category',
    method: 'post',
    data: data
  })
}

// 修改文章分类
export function updateArticle_category(data) {
  return request({
    url: '/content/article_category',
    method: 'put',
    data: data
  })
}

// 删除文章分类
export function delArticle_category(id) {
  return request({
    url: '/content/article_category/' + id,
    method: 'delete'
  })
}
