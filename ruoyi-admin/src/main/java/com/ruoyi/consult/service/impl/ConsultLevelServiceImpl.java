package com.ruoyi.consult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultLevelMapper;
import com.ruoyi.consult.domain.ConsultLevel;
import com.ruoyi.consult.service.IConsultLevelService;

/**
 * 咨询师等级Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultLevelServiceImpl implements IConsultLevelService 
{
    @Autowired
    private ConsultLevelMapper consultLevelMapper;

    /**
     * 查询咨询师等级
     * 
     * @param id 咨询师等级主键
     * @return 咨询师等级
     */
    @Override
    public ConsultLevel selectConsultLevelById(Long id)
    {
        return consultLevelMapper.selectConsultLevelById(id);
    }

    /**
     * 查询咨询师等级列表
     * 
     * @param consultLevel 咨询师等级
     * @return 咨询师等级
     */
    @Override
    public List<ConsultLevel> selectConsultLevelList(ConsultLevel consultLevel)
    {
        return consultLevelMapper.selectConsultLevelList(consultLevel);
    }

    /**
     * 新增咨询师等级
     * 
     * @param consultLevel 咨询师等级
     * @return 结果
     */
    @Override
    public int insertConsultLevel(ConsultLevel consultLevel)
    {
        consultLevel.setCreateTime(DateUtils.getNowDate());
        return consultLevelMapper.insertConsultLevel(consultLevel);
    }

    /**
     * 修改咨询师等级
     * 
     * @param consultLevel 咨询师等级
     * @return 结果
     */
    @Override
    public int updateConsultLevel(ConsultLevel consultLevel)
    {
        consultLevel.setUpdateTime(DateUtils.getNowDate());
        return consultLevelMapper.updateConsultLevel(consultLevel);
    }

    /**
     * 批量删除咨询师等级
     * 
     * @param ids 需要删除的咨询师等级主键
     * @return 结果
     */
    @Override
    public int deleteConsultLevelByIds(Long[] ids)
    {
        return consultLevelMapper.deleteConsultLevelByIds(ids);
    }

    /**
     * 删除咨询师等级信息
     * 
     * @param id 咨询师等级主键
     * @return 结果
     */
    @Override
    public int deleteConsultLevelById(Long id)
    {
        return consultLevelMapper.deleteConsultLevelById(id);
    }
}
