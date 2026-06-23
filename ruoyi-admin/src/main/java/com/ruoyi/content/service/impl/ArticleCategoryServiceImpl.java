package com.ruoyi.content.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.content.mapper.ArticleCategoryMapper;
import com.ruoyi.content.domain.ArticleCategory;
import com.ruoyi.content.service.IArticleCategoryService;

/**
 * 文章分类Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class ArticleCategoryServiceImpl implements IArticleCategoryService 
{
    @Autowired
    private ArticleCategoryMapper articleCategoryMapper;

    /**
     * 查询文章分类
     * 
     * @param id 文章分类主键
     * @return 文章分类
     */
    @Override
    public ArticleCategory selectArticleCategoryById(Long id)
    {
        return articleCategoryMapper.selectArticleCategoryById(id);
    }

    /**
     * 查询文章分类列表
     * 
     * @param articleCategory 文章分类
     * @return 文章分类
     */
    @Override
    public List<ArticleCategory> selectArticleCategoryList(ArticleCategory articleCategory)
    {
        return articleCategoryMapper.selectArticleCategoryList(articleCategory);
    }

    /**
     * 新增文章分类
     * 
     * @param articleCategory 文章分类
     * @return 结果
     */
    @Override
    public int insertArticleCategory(ArticleCategory articleCategory)
    {
        articleCategory.setCreateTime(DateUtils.getNowDate());
        return articleCategoryMapper.insertArticleCategory(articleCategory);
    }

    /**
     * 修改文章分类
     * 
     * @param articleCategory 文章分类
     * @return 结果
     */
    @Override
    public int updateArticleCategory(ArticleCategory articleCategory)
    {
        articleCategory.setUpdateTime(DateUtils.getNowDate());
        return articleCategoryMapper.updateArticleCategory(articleCategory);
    }

    /**
     * 批量删除文章分类
     * 
     * @param ids 需要删除的文章分类主键
     * @return 结果
     */
    @Override
    public int deleteArticleCategoryByIds(Long[] ids)
    {
        return articleCategoryMapper.deleteArticleCategoryByIds(ids);
    }

    /**
     * 删除文章分类信息
     * 
     * @param id 文章分类主键
     * @return 结果
     */
    @Override
    public int deleteArticleCategoryById(Long id)
    {
        return articleCategoryMapper.deleteArticleCategoryById(id);
    }
}
