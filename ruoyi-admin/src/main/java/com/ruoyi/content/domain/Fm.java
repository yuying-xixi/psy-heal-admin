package com.ruoyi.content.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * FM对象 fm
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public class Fm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** FM标题 */
    @Excel(name = "FM标题")
    private String title;

    /** 缩略图 */
    @Excel(name = "缩略图")
    private String thumbnail;

    /** FM分类 */
    @Excel(name = "FM分类")
    private Long fmCategoryId;

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

    public void setThumbnail(String thumbnail) 
    {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() 
    {
        return thumbnail;
    }

    public void setFmCategoryId(Long fmCategoryId) 
    {
        this.fmCategoryId = fmCategoryId;
    }

    public Long getFmCategoryId() 
    {
        return fmCategoryId;
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
            .append("thumbnail", getThumbnail())
            .append("fmCategoryId", getFmCategoryId())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
