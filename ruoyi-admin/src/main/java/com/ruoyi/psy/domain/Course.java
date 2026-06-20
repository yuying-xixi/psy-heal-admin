package com.ruoyi.psy.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程对象 course
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
public class Course extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程缩略图 */
    @Excel(name = "课程缩略图")
    private String thumbnail;

    /** 课程总时长 */
    @Excel(name = "课程总时长")
    private Long totalDuration;

    /** 视频数量 */
    @Excel(name = "视频数量")
    private Long videoCount;

    /** 学习量 */
    @Excel(name = "学习量")
    private Long studyCount;

    /** 课程简介 */
    private String introduction;

    /** 适用人群 */
    private String suitablePeople;

    /** 学习收获 */
    private String learningHarvest;

    /** 订阅须知 */
    private String subscriptionNotice;

    /** 课程原价 */
    @Excel(name = "课程原价")
    private BigDecimal originalPrice;

    /** 课程折扣价 */
    @Excel(name = "课程折扣价")
    private BigDecimal discountPrice;

    /** 收费类型 */
    @Excel(name = "收费类型")
    private Integer chargeType;

    /** 课程分类ID */
    @Excel(name = "课程分类ID")
    private Long categoryId;

    /** 心理导师ID */
    @Excel(name = "心理导师ID")
    private Long mentorId;

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

    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }

    public void setThumbnail(String thumbnail) 
    {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() 
    {
        return thumbnail;
    }

    public void setTotalDuration(Long totalDuration) 
    {
        this.totalDuration = totalDuration;
    }

    public Long getTotalDuration() 
    {
        return totalDuration;
    }

    public void setVideoCount(Long videoCount) 
    {
        this.videoCount = videoCount;
    }

    public Long getVideoCount() 
    {
        return videoCount;
    }

    public void setStudyCount(Long studyCount) 
    {
        this.studyCount = studyCount;
    }

    public Long getStudyCount() 
    {
        return studyCount;
    }

    public void setIntroduction(String introduction) 
    {
        this.introduction = introduction;
    }

    public String getIntroduction() 
    {
        return introduction;
    }

    public void setSuitablePeople(String suitablePeople) 
    {
        this.suitablePeople = suitablePeople;
    }

    public String getSuitablePeople() 
    {
        return suitablePeople;
    }

    public void setLearningHarvest(String learningHarvest) 
    {
        this.learningHarvest = learningHarvest;
    }

    public String getLearningHarvest() 
    {
        return learningHarvest;
    }

    public void setSubscriptionNotice(String subscriptionNotice) 
    {
        this.subscriptionNotice = subscriptionNotice;
    }

    public String getSubscriptionNotice() 
    {
        return subscriptionNotice;
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

    public void setChargeType(Integer chargeType) 
    {
        this.chargeType = chargeType;
    }

    public Integer getChargeType() 
    {
        return chargeType;
    }

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }

    public void setMentorId(Long mentorId) 
    {
        this.mentorId = mentorId;
    }

    public Long getMentorId() 
    {
        return mentorId;
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
            .append("courseName", getCourseName())
            .append("thumbnail", getThumbnail())
            .append("totalDuration", getTotalDuration())
            .append("videoCount", getVideoCount())
            .append("studyCount", getStudyCount())
            .append("introduction", getIntroduction())
            .append("suitablePeople", getSuitablePeople())
            .append("learningHarvest", getLearningHarvest())
            .append("subscriptionNotice", getSubscriptionNotice())
            .append("originalPrice", getOriginalPrice())
            .append("discountPrice", getDiscountPrice())
            .append("chargeType", getChargeType())
            .append("categoryId", getCategoryId())
            .append("mentorId", getMentorId())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
