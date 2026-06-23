package com.ruoyi.assessment.mapper;

import java.util.List;
import com.ruoyi.assessment.domain.Assessment;

/**
 * 心理测评Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface AssessmentMapper 
{
    /**
     * 查询心理测评
     * 
     * @param id 心理测评主键
     * @return 心理测评
     */
    public Assessment selectAssessmentById(Long id);

    /**
     * 查询心理测评列表
     * 
     * @param assessment 心理测评
     * @return 心理测评集合
     */
    public List<Assessment> selectAssessmentList(Assessment assessment);

    /**
     * 新增心理测评
     * 
     * @param assessment 心理测评
     * @return 结果
     */
    public int insertAssessment(Assessment assessment);

    /**
     * 修改心理测评
     * 
     * @param assessment 心理测评
     * @return 结果
     */
    public int updateAssessment(Assessment assessment);

    /**
     * 删除心理测评
     * 
     * @param id 心理测评主键
     * @return 结果
     */
    public int deleteAssessmentById(Long id);

    /**
     * 批量删除心理测评
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAssessmentByIds(Long[] ids);
}
