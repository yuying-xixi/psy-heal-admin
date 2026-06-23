package com.ruoyi.question.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 问题对象 question
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public class Question extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 问题标题 */
    @Excel(name = "问题标题")
    private String questionTitle;

    /** 问题内容 */
    @Excel(name = "问题内容")
    private String questionContent;

    /** 提问用户 */
    @Excel(name = "提问用户")
    private Long userId;

    /** 浏览量 */
    @Excel(name = "浏览量")
    private Long viewCount;

    /** 回复数 */
    @Excel(name = "回复数")
    private Long replyCount;

    /** 是否解决 */
    @Excel(name = "是否解决")
    private Integer isResolved;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishTime;

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

    public void setQuestionTitle(String questionTitle) 
    {
        this.questionTitle = questionTitle;
    }

    public String getQuestionTitle() 
    {
        return questionTitle;
    }

    public void setQuestionContent(String questionContent) 
    {
        this.questionContent = questionContent;
    }

    public String getQuestionContent() 
    {
        return questionContent;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setViewCount(Long viewCount) 
    {
        this.viewCount = viewCount;
    }

    public Long getViewCount() 
    {
        return viewCount;
    }

    public void setReplyCount(Long replyCount) 
    {
        this.replyCount = replyCount;
    }

    public Long getReplyCount() 
    {
        return replyCount;
    }

    public void setIsResolved(Integer isResolved) 
    {
        this.isResolved = isResolved;
    }

    public Integer getIsResolved() 
    {
        return isResolved;
    }

    public void setPublishTime(Date publishTime) 
    {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() 
    {
        return publishTime;
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
            .append("questionTitle", getQuestionTitle())
            .append("questionContent", getQuestionContent())
            .append("userId", getUserId())
            .append("viewCount", getViewCount())
            .append("replyCount", getReplyCount())
            .append("isResolved", getIsResolved())
            .append("publishTime", getPublishTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
