package com.ruoyi.content.mapper;

import java.util.List;
import com.ruoyi.content.domain.PsychologyKnowledge;

/**
 * 心理知识Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface PsychologyKnowledgeMapper 
{
    /**
     * 查询心理知识
     * 
     * @param id 心理知识主键
     * @return 心理知识
     */
    public PsychologyKnowledge selectPsychologyKnowledgeById(Long id);

    /**
     * 查询心理知识列表
     * 
     * @param psychologyKnowledge 心理知识
     * @return 心理知识集合
     */
    public List<PsychologyKnowledge> selectPsychologyKnowledgeList(PsychologyKnowledge psychologyKnowledge);

    /**
     * 新增心理知识
     * 
     * @param psychologyKnowledge 心理知识
     * @return 结果
     */
    public int insertPsychologyKnowledge(PsychologyKnowledge psychologyKnowledge);

    /**
     * 修改心理知识
     * 
     * @param psychologyKnowledge 心理知识
     * @return 结果
     */
    public int updatePsychologyKnowledge(PsychologyKnowledge psychologyKnowledge);

    /**
     * 删除心理知识
     * 
     * @param id 心理知识主键
     * @return 结果
     */
    public int deletePsychologyKnowledgeById(Long id);

    /**
     * 批量删除心理知识
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePsychologyKnowledgeByIds(Long[] ids);
}
