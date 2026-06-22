package com.ruoyi.consult.service;

import java.util.List;
import com.ruoyi.consult.domain.ConsultOrder;

/**
 * 咨询订单Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface IConsultOrderService 
{
    /**
     * 查询咨询订单
     * 
     * @param id 咨询订单主键
     * @return 咨询订单
     */
    public ConsultOrder selectConsultOrderById(Long id);

    /**
     * 查询咨询订单列表
     * 
     * @param consultOrder 咨询订单
     * @return 咨询订单集合
     */
    public List<ConsultOrder> selectConsultOrderList(ConsultOrder consultOrder);

    /**
     * 新增咨询订单
     * 
     * @param consultOrder 咨询订单
     * @return 结果
     */
    public int insertConsultOrder(ConsultOrder consultOrder);

    /**
     * 修改咨询订单
     * 
     * @param consultOrder 咨询订单
     * @return 结果
     */
    public int updateConsultOrder(ConsultOrder consultOrder);

    /**
     * 批量删除咨询订单
     * 
     * @param ids 需要删除的咨询订单主键集合
     * @return 结果
     */
    public int deleteConsultOrderByIds(Long[] ids);

    /**
     * 删除咨询订单信息
     * 
     * @param id 咨询订单主键
     * @return 结果
     */
    public int deleteConsultOrderById(Long id);
}
