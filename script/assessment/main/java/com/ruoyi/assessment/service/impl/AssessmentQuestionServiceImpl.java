package com.ruoyi.assessment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.assessment.mapper.AssessmentQuestionMapper;
import com.ruoyi.assessment.domain.AssessmentQuestion;
import com.ruoyi.assessment.service.IAssessmentQuestionService;

/**
 * 题目Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class AssessmentQuestionServiceImpl implements IAssessmentQuestionService 
{
    @Autowired
    private AssessmentQuestionMapper assessmentQuestionMapper;

    /**
     * 查询题目
     * 
     * @param id 题目主键
     * @return 题目
     */
    @Override
    public AssessmentQuestion selectAssessmentQuestionById(Long id)
    {
        return assessmentQuestionMapper.selectAssessmentQuestionById(id);
    }

    /**
     * 查询题目列表
     * 
     * @param assessmentQuestion 题目
     * @return 题目
     */
    @Override
    public List<AssessmentQuestion> selectAssessmentQuestionList(AssessmentQuestion assessmentQuestion)
    {
        return assessmentQuestionMapper.selectAssessmentQuestionList(assessmentQuestion);
    }

    /**
     * 新增题目
     * 
     * @param assessmentQuestion 题目
     * @return 结果
     */
    @Override
    public int insertAssessmentQuestion(AssessmentQuestion assessmentQuestion)
    {
        assessmentQuestion.setCreateTime(DateUtils.getNowDate());
        return assessmentQuestionMapper.insertAssessmentQuestion(assessmentQuestion);
    }

    /**
     * 修改题目
     * 
     * @param assessmentQuestion 题目
     * @return 结果
     */
    @Override
    public int updateAssessmentQuestion(AssessmentQuestion assessmentQuestion)
    {
        assessmentQuestion.setUpdateTime(DateUtils.getNowDate());
        return assessmentQuestionMapper.updateAssessmentQuestion(assessmentQuestion);
    }

    /**
     * 批量删除题目
     * 
     * @param ids 需要删除的题目主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentQuestionByIds(Long[] ids)
    {
        return assessmentQuestionMapper.deleteAssessmentQuestionByIds(ids);
    }

    /**
     * 删除题目信息
     * 
     * @param id 题目主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentQuestionById(Long id)
    {
        return assessmentQuestionMapper.deleteAssessmentQuestionById(id);
    }
}
