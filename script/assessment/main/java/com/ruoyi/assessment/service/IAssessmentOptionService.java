package com.ruoyi.assessment.service;

import java.util.List;
import com.ruoyi.assessment.domain.AssessmentOption;

/**
 * 题目选项Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface IAssessmentOptionService 
{
    /**
     * 查询题目选项
     * 
     * @param id 题目选项主键
     * @return 题目选项
     */
    public AssessmentOption selectAssessmentOptionById(Long id);

    /**
     * 查询题目选项列表
     * 
     * @param assessmentOption 题目选项
     * @return 题目选项集合
     */
    public List<AssessmentOption> selectAssessmentOptionList(AssessmentOption assessmentOption);

    /**
     * 新增题目选项
     * 
     * @param assessmentOption 题目选项
     * @return 结果
     */
    public int insertAssessmentOption(AssessmentOption assessmentOption);

    /**
     * 修改题目选项
     * 
     * @param assessmentOption 题目选项
     * @return 结果
     */
    public int updateAssessmentOption(AssessmentOption assessmentOption);

    /**
     * 批量删除题目选项
     * 
     * @param ids 需要删除的题目选项主键集合
     * @return 结果
     */
    public int deleteAssessmentOptionByIds(Long[] ids);

    /**
     * 删除题目选项信息
     * 
     * @param id 题目选项主键
     * @return 结果
     */
    public int deleteAssessmentOptionById(Long id);
}
