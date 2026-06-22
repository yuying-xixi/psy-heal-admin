package com.ruoyi.consult.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 咨询订单对象 consult_order
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public class ConsultOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;

    /** 收费标准ID */
    @Excel(name = "收费标准ID")
    private Long chargeStandardId;

    /** 咨询师ID */
    @Excel(name = "咨询师ID")
    private Long consultId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderTime;

    /** 预约时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预约时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date appointTime;

    /** 支付时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /** 完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date finishTime;

    /** 实际支付金额 */
    @Excel(name = "实际支付金额")
    private BigDecimal payAmount;

    /** 问题描述 */
    @Excel(name = "问题描述")
    private String problemDesc;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private Integer orderStatus;

    /** 删除标志 */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }

    public void setChargeStandardId(Long chargeStandardId) 
    {
        this.chargeStandardId = chargeStandardId;
    }

    public Long getChargeStandardId() 
    {
        return chargeStandardId;
    }

    public void setConsultId(Long consultId) 
    {
        this.consultId = consultId;
    }

    public Long getConsultId() 
    {
        return consultId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setOrderTime(Date orderTime) 
    {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() 
    {
        return orderTime;
    }

    public void setAppointTime(Date appointTime) 
    {
        this.appointTime = appointTime;
    }

    public Date getAppointTime() 
    {
        return appointTime;
    }

    public void setPayTime(Date payTime) 
    {
        this.payTime = payTime;
    }

    public Date getPayTime() 
    {
        return payTime;
    }

    public void setFinishTime(Date finishTime) 
    {
        this.finishTime = finishTime;
    }

    public Date getFinishTime() 
    {
        return finishTime;
    }

    public void setPayAmount(BigDecimal payAmount) 
    {
        this.payAmount = payAmount;
    }

    public BigDecimal getPayAmount() 
    {
        return payAmount;
    }

    public void setProblemDesc(String problemDesc) 
    {
        this.problemDesc = problemDesc;
    }

    public String getProblemDesc() 
    {
        return problemDesc;
    }

    public void setOrderStatus(Integer orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatus() 
    {
        return orderStatus;
    }

    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("chargeStandardId", getChargeStandardId())
            .append("consultId", getConsultId())
            .append("userId", getUserId())
            .append("orderTime", getOrderTime())
            .append("appointTime", getAppointTime())
            .append("payTime", getPayTime())
            .append("finishTime", getFinishTime())
            .append("payAmount", getPayAmount())
            .append("problemDesc", getProblemDesc())
            .append("orderStatus", getOrderStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
