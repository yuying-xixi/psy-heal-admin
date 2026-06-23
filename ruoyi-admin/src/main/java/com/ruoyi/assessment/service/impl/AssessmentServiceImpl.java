package com.ruoyi.assessment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.assessment.mapper.AssessmentMapper;
import com.ruoyi.assessment.domain.Assessment;
import com.ruoyi.assessment.service.IAssessmentService;

/**
 * 心理测评Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class AssessmentServiceImpl implements IAssessmentService 
{
    @Autowired
    private AssessmentMapper assessmentMapper;

    /**
     * 查询心理测评
     * 
     * @param id 心理测评主键
     * @return 心理测评
     */
    @Override
    public Assessment selectAssessmentById(Long id)
    {
        return assessmentMapper.selectAssessmentById(id);
    }

    /**
     * 查询心理测评列表
     * 
     * @param assessment 心理测评
     * @return 心理测评
     */
    @Override
    public List<Assessment> selectAssessmentList(Assessment assessment)
    {
        return assessmentMapper.selectAssessmentList(assessment);
    }

    /**
     * 新增心理测评
     * 
     * @param assessment 心理测评
     * @return 结果
     */
    @Override
    public int insertAssessment(Assessment assessment)
    {
        assessment.setCreateTime(DateUtils.getNowDate());
        return assessmentMapper.insertAssessment(assessment);
    }

    /**
     * 修改心理测评
     * 
     * @param assessment 心理测评
     * @return 结果
     */
    @Override
    public int updateAssessment(Assessment assessment)
    {
        assessment.setUpdateTime(DateUtils.getNowDate());
        return assessmentMapper.updateAssessment(assessment);
    }

    /**
     * 批量删除心理测评
     * 
     * @param ids 需要删除的心理测评主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentByIds(Long[] ids)
    {
        return assessmentMapper.deleteAssessmentByIds(ids);
    }

    /**
     * 删除心理测评信息
     * 
     * @param id 心理测评主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentById(Long id)
    {
        return assessmentMapper.deleteAssessmentById(id);
    }
}
