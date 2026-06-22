package com.ruoyi.consult.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 咨询师擅长关联对象 consult_good_at_rel
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public class ConsultGoodAtRel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 咨询师ID */
    @Excel(name = "咨询师ID")
    private Long consultId;

    /** 领域ID */
    @Excel(name = "领域ID")
    private Long fieldId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setConsultId(Long consultId) 
    {
        this.consultId = consultId;
    }

    public Long getConsultId() 
    {
        return consultId;
    }

    public void setFieldId(Long fieldId) 
    {
        this.fieldId = fieldId;
    }

    public Long getFieldId() 
    {
        return fieldId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("consultId", getConsultId())
            .append("fieldId", getFieldId())
            .toString();
    }
}
