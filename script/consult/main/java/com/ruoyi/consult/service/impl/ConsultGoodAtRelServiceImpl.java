package com.ruoyi.consult.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultGoodAtRelMapper;
import com.ruoyi.consult.domain.ConsultGoodAtRel;
import com.ruoyi.consult.service.IConsultGoodAtRelService;

/**
 * 咨询师擅长关联Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultGoodAtRelServiceImpl implements IConsultGoodAtRelService 
{
    @Autowired
    private ConsultGoodAtRelMapper consultGoodAtRelMapper;

    /**
     * 查询咨询师擅长关联
     * 
     * @param id 咨询师擅长关联主键
     * @return 咨询师擅长关联
     */
    @Override
    public ConsultGoodAtRel selectConsultGoodAtRelById(Long id)
    {
        return consultGoodAtRelMapper.selectConsultGoodAtRelById(id);
    }

    /**
     * 查询咨询师擅长关联列表
     * 
     * @param consultGoodAtRel 咨询师擅长关联
     * @return 咨询师擅长关联
     */
    @Override
    public List<ConsultGoodAtRel> selectConsultGoodAtRelList(ConsultGoodAtRel consultGoodAtRel)
    {
        return consultGoodAtRelMapper.selectConsultGoodAtRelList(consultGoodAtRel);
    }

    /**
     * 新增咨询师擅长关联
     * 
     * @param consultGoodAtRel 咨询师擅长关联
     * @return 结果
     */
    @Override
    public int insertConsultGoodAtRel(ConsultGoodAtRel consultGoodAtRel)
    {
        return consultGoodAtRelMapper.insertConsultGoodAtRel(consultGoodAtRel);
    }

    /**
     * 修改咨询师擅长关联
     * 
     * @param consultGoodAtRel 咨询师擅长关联
     * @return 结果
     */
    @Override
    public int updateConsultGoodAtRel(ConsultGoodAtRel consultGoodAtRel)
    {
        return consultGoodAtRelMapper.updateConsultGoodAtRel(consultGoodAtRel);
    }

    /**
     * 批量删除咨询师擅长关联
     * 
     * @param ids 需要删除的咨询师擅长关联主键
     * @return 结果
     */
    @Override
    public int deleteConsultGoodAtRelByIds(Long[] ids)
    {
        return consultGoodAtRelMapper.deleteConsultGoodAtRelByIds(ids);
    }

    /**
     * 删除咨询师擅长关联信息
     * 
     * @param id 咨询师擅长关联主键
     * @return 结果
     */
    @Override
    public int deleteConsultGoodAtRelById(Long id)
    {
        return consultGoodAtRelMapper.deleteConsultGoodAtRelById(id);
    }
}
