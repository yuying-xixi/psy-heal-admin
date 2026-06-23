package com.ruoyi.content.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.content.mapper.FmCategoryMapper;
import com.ruoyi.content.domain.FmCategory;
import com.ruoyi.content.service.IFmCategoryService;

/**
 * FM分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-06-23
 */
@Service
public class FmCategoryServiceImpl implements IFmCategoryService 
{
    @Autowired
    private FmCategoryMapper fmCategoryMapper;

    /**
     * 查询FM分类
     * 
     * @param id FM分类主键
     * @return FM分类
     */
    @Override
    public FmCategory selectFmCategoryById(Long id)
    {
        return fmCategoryMapper.selectFmCategoryById(id);
    }

    /**
     * 查询FM分类列表
     * 
     * @param fmCategory FM分类
     * @return FM分类
     */
    @Override
    public List<FmCategory> selectFmCategoryList(FmCategory fmCategory)
    {
        return fmCategoryMapper.selectFmCategoryList(fmCategory);
    }

    /**
     * 新增FM分类
     * 
     * @param fmCategory FM分类
     * @return 结果
     */
    @Override
    public int insertFmCategory(FmCategory fmCategory)
    {
        fmCategory.setCreateTime(DateUtils.getNowDate());
        return fmCategoryMapper.insertFmCategory(fmCategory);
    }

    /**
     * 修改FM分类
     * 
     * @param fmCategory FM分类
     * @return 结果
     */
    @Override
    public int updateFmCategory(FmCategory fmCategory)
    {
        fmCategory.setUpdateTime(DateUtils.getNowDate());
        return fmCategoryMapper.updateFmCategory(fmCategory);
    }

    /**
     * 批量删除FM分类
     * 
     * @param ids 需要删除的FM分类主键
     * @return 结果
     */
    @Override
    public int deleteFmCategoryByIds(Long[] ids)
    {
        return fmCategoryMapper.deleteFmCategoryByIds(ids);
    }

    /**
     * 删除FM分类信息
     * 
     * @param id FM分类主键
     * @return 结果
     */
    @Override
    public int deleteFmCategoryById(Long id)
    {
        return fmCategoryMapper.deleteFmCategoryById(id);
    }
}
