package com.ruoyi.assessment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.assessment.mapper.AssessmentCategoryMapper;
import com.ruoyi.assessment.domain.AssessmentCategory;
import com.ruoyi.assessment.service.IAssessmentCategoryService;

/**
 * 心理测评分类Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class AssessmentCategoryServiceImpl implements IAssessmentCategoryService 
{
    @Autowired
    private AssessmentCategoryMapper assessmentCategoryMapper;

    /**
     * 查询心理测评分类
     * 
     * @param id 心理测评分类主键
     * @return 心理测评分类
     */
    @Override
    public AssessmentCategory selectAssessmentCategoryById(Long id)
    {
        return assessmentCategoryMapper.selectAssessmentCategoryById(id);
    }

    /**
     * 查询心理测评分类列表
     * 
     * @param assessmentCategory 心理测评分类
     * @return 心理测评分类
     */
    @Override
    public List<AssessmentCategory> selectAssessmentCategoryList(AssessmentCategory assessmentCategory)
    {
        return assessmentCategoryMapper.selectAssessmentCategoryList(assessmentCategory);
    }

    /**
     * 新增心理测评分类
     * 
     * @param assessmentCategory 心理测评分类
     * @return 结果
     */
    @Override
    public int insertAssessmentCategory(AssessmentCategory assessmentCategory)
    {
        assessmentCategory.setCreateTime(DateUtils.getNowDate());
        return assessmentCategoryMapper.insertAssessmentCategory(assessmentCategory);
    }

    /**
     * 修改心理测评分类
     * 
     * @param assessmentCategory 心理测评分类
     * @return 结果
     */
    @Override
    public int updateAssessmentCategory(AssessmentCategory assessmentCategory)
    {
        assessmentCategory.setUpdateTime(DateUtils.getNowDate());
        return assessmentCategoryMapper.updateAssessmentCategory(assessmentCategory);
    }

    /**
     * 批量删除心理测评分类
     * 
     * @param ids 需要删除的心理测评分类主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentCategoryByIds(Long[] ids)
    {
        return assessmentCategoryMapper.deleteAssessmentCategoryByIds(ids);
    }

    /**
     * 删除心理测评分类信息
     * 
     * @param id 心理测评分类主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentCategoryById(Long id)
    {
        return assessmentCategoryMapper.deleteAssessmentCategoryById(id);
    }
}
