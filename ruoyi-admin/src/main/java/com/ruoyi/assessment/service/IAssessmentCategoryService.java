package com.ruoyi.assessment.service;

import java.util.List;
import com.ruoyi.assessment.domain.AssessmentCategory;

/**
 * 心理测评分类Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface IAssessmentCategoryService 
{
    /**
     * 查询心理测评分类
     * 
     * @param id 心理测评分类主键
     * @return 心理测评分类
     */
    public AssessmentCategory selectAssessmentCategoryById(Long id);

    /**
     * 查询心理测评分类列表
     * 
     * @param assessmentCategory 心理测评分类
     * @return 心理测评分类集合
     */
    public List<AssessmentCategory> selectAssessmentCategoryList(AssessmentCategory assessmentCategory);

    /**
     * 新增心理测评分类
     * 
     * @param assessmentCategory 心理测评分类
     * @return 结果
     */
    public int insertAssessmentCategory(AssessmentCategory assessmentCategory);

    /**
     * 修改心理测评分类
     * 
     * @param assessmentCategory 心理测评分类
     * @return 结果
     */
    public int updateAssessmentCategory(AssessmentCategory assessmentCategory);

    /**
     * 批量删除心理测评分类
     * 
     * @param ids 需要删除的心理测评分类主键集合
     * @return 结果
     */
    public int deleteAssessmentCategoryByIds(Long[] ids);

    /**
     * 删除心理测评分类信息
     * 
     * @param id 心理测评分类主键
     * @return 结果
     */
    public int deleteAssessmentCategoryById(Long id);
}
