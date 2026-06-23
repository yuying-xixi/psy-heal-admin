package com.ruoyi.assessment.mapper;

import java.util.List;
import com.ruoyi.assessment.domain.AssessmentResult;

/**
 * 测评结果Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface AssessmentResultMapper 
{
    /**
     * 查询测评结果
     * 
     * @param id 测评结果主键
     * @return 测评结果
     */
    public AssessmentResult selectAssessmentResultById(Long id);

    /**
     * 查询测评结果列表
     * 
     * @param assessmentResult 测评结果
     * @return 测评结果集合
     */
    public List<AssessmentResult> selectAssessmentResultList(AssessmentResult assessmentResult);

    /**
     * 新增测评结果
     * 
     * @param assessmentResult 测评结果
     * @return 结果
     */
    public int insertAssessmentResult(AssessmentResult assessmentResult);

    /**
     * 修改测评结果
     * 
     * @param assessmentResult 测评结果
     * @return 结果
     */
    public int updateAssessmentResult(AssessmentResult assessmentResult);

    /**
     * 删除测评结果
     * 
     * @param id 测评结果主键
     * @return 结果
     */
    public int deleteAssessmentResultById(Long id);

    /**
     * 批量删除测评结果
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAssessmentResultByIds(Long[] ids);
}
