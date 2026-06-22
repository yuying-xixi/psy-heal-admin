package com.ruoyi.consult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultOrderMapper;
import com.ruoyi.consult.domain.ConsultOrder;
import com.ruoyi.consult.service.IConsultOrderService;

/**
 * 咨询订单Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultOrderServiceImpl implements IConsultOrderService 
{
    @Autowired
    private ConsultOrderMapper consultOrderMapper;

    /**
     * 查询咨询订单
     * 
     * @param id 咨询订单主键
     * @return 咨询订单
     */
    @Override
    public ConsultOrder selectConsultOrderById(Long id)
    {
        return consultOrderMapper.selectConsultOrderById(id);
    }

    /**
     * 查询咨询订单列表
     * 
     * @param consultOrder 咨询订单
     * @return 咨询订单
     */
    @Override
    public List<ConsultOrder> selectConsultOrderList(ConsultOrder consultOrder)
    {
        return consultOrderMapper.selectConsultOrderList(consultOrder);
    }

    /**
     * 新增咨询订单
     * 
     * @param consultOrder 咨询订单
     * @return 结果
     */
    @Override
    public int insertConsultOrder(ConsultOrder consultOrder)
    {
        consultOrder.setCreateTime(DateUtils.getNowDate());
        return consultOrderMapper.insertConsultOrder(consultOrder);
    }

    /**
     * 修改咨询订单
     * 
     * @param consultOrder 咨询订单
     * @return 结果
     */
    @Override
    public int updateConsultOrder(ConsultOrder consultOrder)
    {
        consultOrder.setUpdateTime(DateUtils.getNowDate());
        return consultOrderMapper.updateConsultOrder(consultOrder);
    }

    /**
     * 批量删除咨询订单
     * 
     * @param ids 需要删除的咨询订单主键
     * @return 结果
     */
    @Override
    public int deleteConsultOrderByIds(Long[] ids)
    {
        return consultOrderMapper.deleteConsultOrderByIds(ids);
    }

    /**
     * 删除咨询订单信息
     * 
     * @param id 咨询订单主键
     * @return 结果
     */
    @Override
    public int deleteConsultOrderById(Long id)
    {
        return consultOrderMapper.deleteConsultOrderById(id);
    }
}
