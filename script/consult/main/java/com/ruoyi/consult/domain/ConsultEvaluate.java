package com.ruoyi.consult.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 咨询评价对象 consult_evaluate
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public class ConsultEvaluate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 订单ID */
    @Excel(name = "订单ID")
    private Long orderId;

    /** 评价内容 */
    @Excel(name = "评价内容")
    private String content;

    /** 评分 */
    @Excel(name = "评分")
    private BigDecimal score;

    /** 评价时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "评价时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date evaluateTime;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 咨询师ID */
    @Excel(name = "咨询师ID")
    private Long consultId;

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

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setScore(BigDecimal score) 
    {
        this.score = score;
    }

    public BigDecimal getScore() 
    {
        return score;
    }

    public void setEvaluateTime(Date evaluateTime) 
    {
        this.evaluateTime = evaluateTime;
    }

    public Date getEvaluateTime() 
    {
        return evaluateTime;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setConsultId(Long consultId) 
    {
        this.consultId = consultId;
    }

    public Long getConsultId() 
    {
        return consultId;
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
            .append("orderId", getOrderId())
            .append("content", getContent())
            .append("score", getScore())
            .append("evaluateTime", getEvaluateTime())
            .append("userId", getUserId())
            .append("consultId", getConsultId())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
