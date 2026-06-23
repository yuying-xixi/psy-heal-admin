package com.ruoyi.assessment.service;

import java.util.List;
import com.ruoyi.assessment.domain.AssessmentQuestion;

/**
 * 题目Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface IAssessmentQuestionService 
{
    /**
     * 查询题目
     * 
     * @param id 题目主键
     * @return 题目
     */
    public AssessmentQuestion selectAssessmentQuestionById(Long id);

    /**
     * 查询题目列表
     * 
     * @param assessmentQuestion 题目
     * @return 题目集合
     */
    public List<AssessmentQuestion> selectAssessmentQuestionList(AssessmentQuestion assessmentQuestion);

    /**
     * 新增题目
     * 
     * @param assessmentQuestion 题目
     * @return 结果
     */
    public int insertAssessmentQuestion(AssessmentQuestion assessmentQuestion);

    /**
     * 修改题目
     * 
     * @param assessmentQuestion 题目
     * @return 结果
     */
    public int updateAssessmentQuestion(AssessmentQuestion assessmentQuestion);

    /**
     * 批量删除题目
     * 
     * @param ids 需要删除的题目主键集合
     * @return 结果
     */
    public int deleteAssessmentQuestionByIds(Long[] ids);

    /**
     * 删除题目信息
     * 
     * @param id 题目主键
     * @return 结果
     */
    public int deleteAssessmentQuestionById(Long id);
}
