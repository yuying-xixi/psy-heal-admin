package com.ruoyi.content.service;

import java.util.List;
import com.ruoyi.content.domain.FmCategory;

/**
 * FM分类Service接口
 * 
 * @author ruoyi
 * @date 2026-06-23
 */
public interface IFmCategoryService 
{
    /**
     * 查询FM分类
     * 
     * @param id FM分类主键
     * @return FM分类
     */
    public FmCategory selectFmCategoryById(Long id);

    /**
     * 查询FM分类列表
     * 
     * @param fmCategory FM分类
     * @return FM分类集合
     */
    public List<FmCategory> selectFmCategoryList(FmCategory fmCategory);

    /**
     * 新增FM分类
     * 
     * @param fmCategory FM分类
     * @return 结果
     */
    public int insertFmCategory(FmCategory fmCategory);

    /**
     * 修改FM分类
     * 
     * @param fmCategory FM分类
     * @return 结果
     */
    public int updateFmCategory(FmCategory fmCategory);

    /**
     * 批量删除FM分类
     * 
     * @param ids 需要删除的FM分类主键集合
     * @return 结果
     */
    public int deleteFmCategoryByIds(Long[] ids);

    /**
     * 删除FM分类信息
     * 
     * @param id FM分类主键
     * @return 结果
     */
    public int deleteFmCategoryById(Long id);
}
