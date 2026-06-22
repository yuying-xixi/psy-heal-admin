package com.ruoyi.consult.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 咨询留言对象 consult_message
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public class ConsultMessage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 留言内容 */
    @Excel(name = "留言内容")
    private String content;

    /** 回复内容 */
    @Excel(name = "回复内容")
    private String reply;

    /** 回复时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "回复时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date replyTime;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 咨询师ID */
    @Excel(name = "咨询师ID")
    private Long consultId;

    /** 留言时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "留言时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date messageTime;

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

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setReply(String reply) 
    {
        this.reply = reply;
    }

    public String getReply() 
    {
        return reply;
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

    public void setMessageTime(Date messageTime) 
    {
        this.messageTime = messageTime;
    }

    public Date getMessageTime() 
    {
        return messageTime;
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
            .append("content", getContent())
            .append("reply", getReply())
            .append("replyTime", getReplyTime())
            .append("userId", getUserId())
            .append("consultId", getConsultId())
            .append("messageTime", getMessageTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
