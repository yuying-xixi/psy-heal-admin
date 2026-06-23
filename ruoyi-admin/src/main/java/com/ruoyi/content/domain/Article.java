package com.ruoyi.content.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文章对象 article
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public class Article extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 文章名称 */
    @Excel(name = "文章名称")
    private String articleName;

    /** 文章简介 */
    @Excel(name = "文章简介")
    private String articleIntro;

    /** 心理导师 */
    @Excel(name = "心理导师")
    private Long mentorId;

    /** 缩略图 */
    @Excel(name = "缩略图")
    private String thumbnail;

    /** 详情内容 */
    @Excel(name = "详情内容")
    private String content;

    /** 阅读量 */
    @Excel(name = "阅读量")
    private Long readCount;

    /** 所属分类 */
    @Excel(name = "所属分类")
    private Long categoryId;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

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

    public void setArticleName(String articleName) 
    {
        this.articleName = articleName;
    }

    public String getArticleName() 
    {
        return articleName;
    }

    public void setArticleIntro(String articleIntro) 
    {
        this.articleIntro = articleIntro;
    }

    public String getArticleIntro() 
    {
        return articleIntro;
    }

    public void setMentorId(Long mentorId) 
    {
        this.mentorId = mentorId;
    }

    public Long getMentorId() 
    {
        return mentorId;
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

    public void setReadCount(Long readCount) 
    {
        this.readCount = readCount;
    }

    public Long getReadCount() 
    {
        return readCount;
    }

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
            .append("articleName", getArticleName())
            .append("articleIntro", getArticleIntro())
            .append("mentorId", getMentorId())
            .append("thumbnail", getThumbnail())
            .append("content", getContent())
            .append("readCount", getReadCount())
            .append("categoryId", getCategoryId())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
