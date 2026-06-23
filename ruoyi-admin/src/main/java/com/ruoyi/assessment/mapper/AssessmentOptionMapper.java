package com.ruoyi.assessment.mapper;

import java.util.List;
import com.ruoyi.assessment.domain.AssessmentOption;

/**
 * 题目选项Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface AssessmentOptionMapper 
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
     * 删除题目选项
     * 
     * @param id 题目选项主键
     * @return 结果
     */
    public int deleteAssessmentOptionById(Long id);

    /**
     * 批量删除题目选项
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAssessmentOptionByIds(Long[] ids);
}
