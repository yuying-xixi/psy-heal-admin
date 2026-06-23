package com.ruoyi.content.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 心理知识对象 psychology_knowledge
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public class PsychologyKnowledge extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 简介 */
    @Excel(name = "简介")
    private String intro;

    /** 缩略图 */
    @Excel(name = "缩略图")
    private String thumbnail;

    /** 详情内容 */
    @Excel(name = "详情内容")
    private String content;

    /** 心理导师ID */
    @Excel(name = "心理导师ID")
    private Long mentorId;

    /** 阅读量 */
    @Excel(name = "阅读量")
    private Long readCount;

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

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setIntro(String intro) 
    {
        this.intro = intro;
    }

    public String getIntro() 
    {
        return intro;
    }

    public void setThumbnail(String thumbnail) 
    {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() 
    {
        return thumbnail;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setMentorId(Long mentorId) 
    {
        this.mentorId = mentorId;
    }

    public Long getMentorId() 
    {
        return mentorId;
    }

    public void setReadCount(Long readCount) 
    {
        this.readCount = readCount;
    }

    public Long getReadCount() 
    {
        return readCount;
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
            .append("title", getTitle())
            .append("intro", getIntro())
            .append("thumbnail", getThumbnail())
            .append("content", getContent())
            .append("mentorId", getMentorId())
            .append("readCount", getReadCount())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
