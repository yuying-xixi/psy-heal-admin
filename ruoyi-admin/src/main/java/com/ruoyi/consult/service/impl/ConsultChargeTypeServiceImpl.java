package com.ruoyi.consult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultChargeTypeMapper;
import com.ruoyi.consult.domain.ConsultChargeType;
import com.ruoyi.consult.service.IConsultChargeTypeService;

/**
 * 收费类型Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultChargeTypeServiceImpl implements IConsultChargeTypeService 
{
    @Autowired
    private ConsultChargeTypeMapper consultChargeTypeMapper;

    /**
     * 查询收费类型
     * 
     * @param id 收费类型主键
     * @return 收费类型
     */
    @Override
    public ConsultChargeType selectConsultChargeTypeById(Long id)
    {
        return consultChargeTypeMapper.selectConsultChargeTypeById(id);
    }

    /**
     * 查询收费类型列表
     * 
     * @param consultChargeType 收费类型
     * @return 收费类型
     */
    @Override
    public List<ConsultChargeType> selectConsultChargeTypeList(ConsultChargeType consultChargeType)
    {
        return consultChargeTypeMapper.selectConsultChargeTypeList(consultChargeType);
    }

    /**
     * 新增收费类型
     * 
     * @param consultChargeType 收费类型
     * @return 结果
     */
    @Override
    public int insertConsultChargeType(ConsultChargeType consultChargeType)
    {
        consultChargeType.setCreateTime(DateUtils.getNowDate());
        return consultChargeTypeMapper.insertConsultChargeType(consultChargeType);
    }

    /**
     * 修改收费类型
     * 
     * @param consultChargeType 收费类型
     * @return 结果
     */
    @Override
    public int updateConsultChargeType(ConsultChargeType consultChargeType)
    {
        consultChargeType.setUpdateTime(DateUtils.getNowDate());
        return consultChargeTypeMapper.updateConsultChargeType(consultChargeType);
    }

    /**
     * 批量删除收费类型
     * 
     * @param ids 需要删除的收费类型主键
     * @return 结果
     */
    @Override
    public int deleteConsultChargeTypeByIds(Long[] ids)
    {
        return consultChargeTypeMapper.deleteConsultChargeTypeByIds(ids);
    }

    /**
     * 删除收费类型信息
     * 
     * @param id 收费类型主键
     * @return 结果
     */
    @Override
    public int deleteConsultChargeTypeById(Long id)
    {
        return consultChargeTypeMapper.deleteConsultChargeTypeById(id);
    }
}
