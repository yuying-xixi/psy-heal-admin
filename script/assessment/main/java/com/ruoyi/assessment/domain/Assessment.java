package com.ruoyi.assessment.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 心理测评对象 assessment
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public class Assessment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 测评名称 */
    @Excel(name = "测评名称")
    private String assessmentName;

    /** 测评简介 */
    @Excel(name = "测评简介")
    private String assessmentIntro;

    /** 缩略图 */
    @Excel(name = "缩略图")
    private String thumbnail;

    /** 关于测评 */
    private String aboutAssessment;

    /** 用户收获 */
    @Excel(name = "用户收获")
    private String whatYouGet;

    /** 适合谁测 */
    private String suitableFor;

    /** 参考文献 */
    private String reference;

    /** 原价 */
    @Excel(name = "原价")
    private BigDecimal originalPrice;

    /** 折扣价 */
    @Excel(name = "折扣价")
    private BigDecimal discountPrice;

    /** 所属分类 */
    @Excel(name = "所属分类")
    private Long categoryId;

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

    public void setAssessmentName(String assessmentName) 
    {
        this.assessmentName = assessmentName;
    }

    public String getAssessmentName() 
    {
        return assessmentName;
    }

    public void setAssessmentIntro(String assessmentIntro) 
    {
        this.assessmentIntro = assessmentIntro;
    }

    public String getAssessmentIntro() 
    {
        return assessmentIntro;
    }

    public void setThumbnail(String thumbnail) 
    {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() 
    {
        return thumbnail;
    }

    public void setAboutAssessment(String aboutAssessment) 
    {
        this.aboutAssessment = aboutAssessment;
    }

    public String getAboutAssessment() 
    {
        return aboutAssessment;
    }

    public void setWhatYouGet(String whatYouGet) 
    {
        this.whatYouGet = whatYouGet;
    }

    public String getWhatYouGet() 
    {
        return whatYouGet;
    }

    public void setSuitableFor(String suitableFor) 
    {
        this.suitableFor = suitableFor;
    }

    public String getSuitableFor() 
    {
        return suitableFor;
    }

    public void setReference(String reference) 
    {
        this.reference = reference;
    }

    public String getReference() 
    {
        return reference;
    }

    public void setOriginalPrice(BigDecimal originalPrice) 
    {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getOriginalPrice() 
    {
        return originalPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) 
    {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getDiscountPrice() 
    {
        return discountPrice;
    }

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
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
            .append("assessmentName", getAssessmentName())
            .append("assessmentIntro", getAssessmentIntro())
            .append("thumbnail", getThumbnail())
            .append("aboutAssessment", getAboutAssessment())
            .append("whatYouGet", getWhatYouGet())
            .append("suitableFor", getSuitableFor())
            .append("reference", getReference())
            .append("originalPrice", getOriginalPrice())
            .append("discountPrice", getDiscountPrice())
            .append("categoryId", getCategoryId())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
