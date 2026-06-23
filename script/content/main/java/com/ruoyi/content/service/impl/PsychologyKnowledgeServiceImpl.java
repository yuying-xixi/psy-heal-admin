package com.ruoyi.content.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.content.mapper.PsychologyKnowledgeMapper;
import com.ruoyi.content.domain.PsychologyKnowledge;
import com.ruoyi.content.service.IPsychologyKnowledgeService;

/**
 * 心理知识Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class PsychologyKnowledgeServiceImpl implements IPsychologyKnowledgeService 
{
    @Autowired
    private PsychologyKnowledgeMapper psychologyKnowledgeMapper;

    /**
     * 查询心理知识
     * 
     * @param id 心理知识主键
     * @return 心理知识
     */
    @Override
    public PsychologyKnowledge selectPsychologyKnowledgeById(Long id)
    {
        return psychologyKnowledgeMapper.selectPsychologyKnowledgeById(id);
    }

    /**
     * 查询心理知识列表
     * 
     * @param psychologyKnowledge 心理知识
     * @return 心理知识
     */
    @Override
    public List<PsychologyKnowledge> selectPsychologyKnowledgeList(PsychologyKnowledge psychologyKnowledge)
    {
        return psychologyKnowledgeMapper.selectPsychologyKnowledgeList(psychologyKnowledge);
    }

    /**
     * 新增心理知识
     * 
     * @param psychologyKnowledge 心理知识
     * @return 结果
     */
    @Override
    public int insertPsychologyKnowledge(PsychologyKnowledge psychologyKnowledge)
    {
        psychologyKnowledge.setCreateTime(DateUtils.getNowDate());
        return psychologyKnowledgeMapper.insertPsychologyKnowledge(psychologyKnowledge);
    }

    /**
     * 修改心理知识
     * 
     * @param psychologyKnowledge 心理知识
     * @return 结果
     */
    @Override
    public int updatePsychologyKnowledge(PsychologyKnowledge psychologyKnowledge)
    {
        psychologyKnowledge.setUpdateTime(DateUtils.getNowDate());
        return psychologyKnowledgeMapper.updatePsychologyKnowledge(psychologyKnowledge);
    }

    /**
     * 批量删除心理知识
     * 
     * @param ids 需要删除的心理知识主键
     * @return 结果
     */
    @Override
    public int deletePsychologyKnowledgeByIds(Long[] ids)
    {
        return psychologyKnowledgeMapper.deletePsychologyKnowledgeByIds(ids);
    }

    /**
     * 删除心理知识信息
     * 
     * @param id 心理知识主键
     * @return 结果
     */
    @Override
    public int deletePsychologyKnowledgeById(Long id)
    {
        return psychologyKnowledgeMapper.deletePsychologyKnowledgeById(id);
    }
}
