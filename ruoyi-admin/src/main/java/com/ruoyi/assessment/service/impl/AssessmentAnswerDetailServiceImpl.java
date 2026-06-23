package com.ruoyi.assessment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.assessment.mapper.AssessmentAnswerDetailMapper;
import com.ruoyi.assessment.domain.AssessmentAnswerDetail;
import com.ruoyi.assessment.service.IAssessmentAnswerDetailService;

/**
 * 用户答题详情Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class AssessmentAnswerDetailServiceImpl implements IAssessmentAnswerDetailService 
{
    @Autowired
    private AssessmentAnswerDetailMapper assessmentAnswerDetailMapper;

    /**
     * 查询用户答题详情
     * 
     * @param id 用户答题详情主键
     * @return 用户答题详情
     */
    @Override
    public AssessmentAnswerDetail selectAssessmentAnswerDetailById(Long id)
    {
        return assessmentAnswerDetailMapper.selectAssessmentAnswerDetailById(id);
    }

    /**
     * 查询用户答题详情列表
     * 
     * @param assessmentAnswerDetail 用户答题详情
     * @return 用户答题详情
     */
    @Override
    public List<AssessmentAnswerDetail> selectAssessmentAnswerDetailList(AssessmentAnswerDetail assessmentAnswerDetail)
    {
        return assessmentAnswerDetailMapper.selectAssessmentAnswerDetailList(assessmentAnswerDetail);
    }

    /**
     * 新增用户答题详情
     * 
     * @param assessmentAnswerDetail 用户答题详情
     * @return 结果
     */
    @Override
    public int insertAssessmentAnswerDetail(AssessmentAnswerDetail assessmentAnswerDetail)
    {
        assessmentAnswerDetail.setCreateTime(DateUtils.getNowDate());
        return assessmentAnswerDetailMapper.insertAssessmentAnswerDetail(assessmentAnswerDetail);
    }

    /**
     * 修改用户答题详情
     * 
     * @param assessmentAnswerDetail 用户答题详情
     * @return 结果
     */
    @Override
    public int updateAssessmentAnswerDetail(AssessmentAnswerDetail assessmentAnswerDetail)
    {
        assessmentAnswerDetail.setUpdateTime(DateUtils.getNowDate());
        return assessmentAnswerDetailMapper.updateAssessmentAnswerDetail(assessmentAnswerDetail);
    }

    /**
     * 批量删除用户答题详情
     * 
     * @param ids 需要删除的用户答题详情主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentAnswerDetailByIds(Long[] ids)
    {
        return assessmentAnswerDetailMapper.deleteAssessmentAnswerDetailByIds(ids);
    }

    /**
     * 删除用户答题详情信息
     * 
     * @param id 用户答题详情主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentAnswerDetailById(Long id)
    {
        return assessmentAnswerDetailMapper.deleteAssessmentAnswerDetailById(id);
    }
}
