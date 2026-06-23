package com.ruoyi.assessment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.assessment.mapper.AssessmentOptionMapper;
import com.ruoyi.assessment.domain.AssessmentOption;
import com.ruoyi.assessment.service.IAssessmentOptionService;

/**
 * 题目选项Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class AssessmentOptionServiceImpl implements IAssessmentOptionService 
{
    @Autowired
    private AssessmentOptionMapper assessmentOptionMapper;

    /**
     * 查询题目选项
     * 
     * @param id 题目选项主键
     * @return 题目选项
     */
    @Override
    public AssessmentOption selectAssessmentOptionById(Long id)
    {
        return assessmentOptionMapper.selectAssessmentOptionById(id);
    }

    /**
     * 查询题目选项列表
     * 
     * @param assessmentOption 题目选项
     * @return 题目选项
     */
    @Override
    public List<AssessmentOption> selectAssessmentOptionList(AssessmentOption assessmentOption)
    {
        return assessmentOptionMapper.selectAssessmentOptionList(assessmentOption);
    }

    /**
     * 新增题目选项
     * 
     * @param assessmentOption 题目选项
     * @return 结果
     */
    @Override
    public int insertAssessmentOption(AssessmentOption assessmentOption)
    {
        assessmentOption.setCreateTime(DateUtils.getNowDate());
        return assessmentOptionMapper.insertAssessmentOption(assessmentOption);
    }

    /**
     * 修改题目选项
     * 
     * @param assessmentOption 题目选项
     * @return 结果
     */
    @Override
    public int updateAssessmentOption(AssessmentOption assessmentOption)
    {
        assessmentOption.setUpdateTime(DateUtils.getNowDate());
        return assessmentOptionMapper.updateAssessmentOption(assessmentOption);
    }

    /**
     * 批量删除题目选项
     * 
     * @param ids 需要删除的题目选项主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentOptionByIds(Long[] ids)
    {
        return assessmentOptionMapper.deleteAssessmentOptionByIds(ids);
    }

    /**
     * 删除题目选项信息
     * 
     * @param id 题目选项主键
     * @return 结果
     */
    @Override
    public int deleteAssessmentOptionById(Long id)
    {
        return assessmentOptionMapper.deleteAssessmentOptionById(id);
    }
}
