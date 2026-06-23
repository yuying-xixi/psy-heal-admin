package com.ruoyi.assessment.mapper;

import java.util.List;
import com.ruoyi.assessment.domain.AssessmentAnswerDetail;

/**
 * 用户答题详情Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface AssessmentAnswerDetailMapper 
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
     * 删除用户答题详情
     * 
     * @param id 用户答题详情主键
     * @return 结果
     */
    public int deleteAssessmentAnswerDetailById(Long id);

    /**
     * 批量删除用户答题详情
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAssessmentAnswerDetailByIds(Long[] ids);
}
