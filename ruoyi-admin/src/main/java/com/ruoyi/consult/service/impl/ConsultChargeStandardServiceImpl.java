package com.ruoyi.consult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultChargeStandardMapper;
import com.ruoyi.consult.domain.ConsultChargeStandard;
import com.ruoyi.consult.service.IConsultChargeStandardService;

/**
 * 收费标准Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultChargeStandardServiceImpl implements IConsultChargeStandardService 
{
    @Autowired
    private ConsultChargeStandardMapper consultChargeStandardMapper;

    /**
     * 查询收费标准
     * 
     * @param id 收费标准主键
     * @return 收费标准
     */
    @Override
    public ConsultChargeStandard selectConsultChargeStandardById(Long id)
    {
        return consultChargeStandardMapper.selectConsultChargeStandardById(id);
    }

    /**
     * 查询收费标准列表
     * 
     * @param consultChargeStandard 收费标准
     * @return 收费标准
     */
    @Override
    public List<ConsultChargeStandard> selectConsultChargeStandardList(ConsultChargeStandard consultChargeStandard)
    {
        return consultChargeStandardMapper.selectConsultChargeStandardList(consultChargeStandard);
    }

    /**
     * 新增收费标准
     * 
     * @param consultChargeStandard 收费标准
     * @return 结果
     */
    @Override
    public int insertConsultChargeStandard(ConsultChargeStandard consultChargeStandard)
    {
        consultChargeStandard.setCreateTime(DateUtils.getNowDate());
        return consultChargeStandardMapper.insertConsultChargeStandard(consultChargeStandard);
    }

    /**
     * 修改收费标准
     * 
     * @param consultChargeStandard 收费标准
     * @return 结果
     */
    @Override
    public int updateConsultChargeStandard(ConsultChargeStandard consultChargeStandard)
    {
        consultChargeStandard.setUpdateTime(DateUtils.getNowDate());
        return consultChargeStandardMapper.updateConsultChargeStandard(consultChargeStandard);
    }

    /**
     * 批量删除收费标准
     * 
     * @param ids 需要删除的收费标准主键
     * @return 结果
     */
    @Override
    public int deleteConsultChargeStandardByIds(Long[] ids)
    {
        return consultChargeStandardMapper.deleteConsultChargeStandardByIds(ids);
    }

    /**
     * 删除收费标准信息
     * 
     * @param id 收费标准主键
     * @return 结果
     */
    @Override
    public int deleteConsultChargeStandardById(Long id)
    {
        return consultChargeStandardMapper.deleteConsultChargeStandardById(id);
    }
}
