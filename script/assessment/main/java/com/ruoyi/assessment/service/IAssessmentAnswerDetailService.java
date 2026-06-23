package com.ruoyi.assessment.service;

import java.util.List;
import com.ruoyi.assessment.domain.AssessmentAnswerDetail;

/**
 * 用户答题详情Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface IAssessmentAnswerDetailService 
{
    /**
     * 查询用户答题详情
     * 
     * @param id 用户答题详情主键
     * @return 用户答题详情
     */
    public AssessmentAnswerDetail selectAssessmentAnswerDetailById(Long id);

    /**
     * 查询用户答题详情列表
     * 
     * @param assessmentAnswerDetail 用户答题详情
     * @return 用户答题详情集合
     */
    public List<AssessmentAnswerDetail> selectAssessmentAnswerDetailList(AssessmentAnswerDetail assessmentAnswerDetail);

    /**
     * 新增用户答题详情
     * 
     * @param assessmentAnswerDetail 用户答题详情
     * @return 结果
     */
    public int insertAssessmentAnswerDetail(AssessmentAnswerDetail assessmentAnswerDetail);

    /**
     * 修改用户答题详情
     * 
     * @param assessmentAnswerDetail 用户答题详情
     * @return 结果
     */
    public int updateAssessmentAnswerDetail(AssessmentAnswerDetail assessmentAnswerDetail);

    /**
     * 批量删除用户答题详情
     * 
     * @param ids 需要删除的用户答题详情主键集合
     * @return 结果
     */
    public int deleteAssessmentAnswerDetailByIds(Long[] ids);

    /**
     * 删除用户答题详情信息
     * 
     * @param id 用户答题详情主键
     * @return 结果
     */
    public int deleteAssessmentAnswerDetailById(Long id);
}
