package com.ruoyi.consult.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收费标准对象 consult_charge_standard
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public class ConsultChargeStandard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 收费类型ID */
    @Excel(name = "收费类型ID")
    private Long chargeTypeId;

    /** 咨询师ID */
    @Excel(name = "咨询师ID")
    private Long consultId;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

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

    public void setChargeTypeId(Long chargeTypeId) 
    {
        this.chargeTypeId = chargeTypeId;
    }

    public Long getChargeTypeId() 
    {
        return chargeTypeId;
    }

    public void setConsultId(Long consultId) 
    {
        this.consultId = consultId;
    }

    public Long getConsultId() 
    {
        return consultId;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
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
            .append("chargeTypeId", getChargeTypeId())
            .append("consultId", getConsultId())
            .append("price", getPrice())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
