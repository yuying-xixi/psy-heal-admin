package com.ruoyi.assessment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 回复对象 question_reply
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public class QuestionReply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 回复内容 */
    @Excel(name = "回复内容")
    private String replyContent;

    /** 回复时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "回复时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date replyTime;

    /** 回复用户ID */
    @Excel(name = "回复用户ID")
    private Long userId;

    /** 回复咨询师ID */
    @Excel(name = "回复咨询师ID")
    private Long consultId;

    /** 所属问题ID */
    @Excel(name = "所属问题ID")
    private Long questionId;

    /** 是否为最佳答案（0否 1是） */
    @Excel(name = "是否为最佳答案", readConverterExp = "0=否,1=是")
    private Integer isBest;

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

    public void setReplyContent(String replyContent) 
    {
        this.replyContent = replyContent;
    }

    public String getReplyContent() 
    {
        return replyContent;
    }

    public void setReplyTime(Date replyTime) 
    {
        this.replyTime = replyTime;
    }

    public Date getReplyTime() 
    {
        return replyTime;
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

    public void setQuestionId(Long questionId) 
    {
        this.questionId = questionId;
    }

    public Long getQuestionId() 
    {
        return questionId;
    }

    public void setIsBest(Integer isBest) 
    {
        this.isBest = isBest;
    }

    public Integer getIsBest() 
    {
        return isBest;
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
            .append("replyContent", getReplyContent())
            .append("replyTime", getReplyTime())
            .append("userId", getUserId())
            .append("consultId", getConsultId())
            .append("questionId", getQuestionId())
            .append("isBest", getIsBest())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
