package com.ruoyi.assessment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测评结果对象 assessment_result
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public class AssessmentResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 总分 */
    @Excel(name = "总分")
    private Long score;

    /** 结论内容 */
    @Excel(name = "结论内容")
    private String resultContent;

    /** 心理测评ID */
    @Excel(name = "心理测评ID")
    private Long assessmentId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 测评时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "测评时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date assessmentTime;

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

    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }

    public void setResultContent(String resultContent) 
    {
        this.resultContent = resultContent;
    }

    public String getResultContent() 
    {
        return resultContent;
    }

    public void setAssessmentId(Long assessmentId) 
    {
        this.assessmentId = assessmentId;
    }

    public Long getAssessmentId() 
    {
        return assessmentId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setAssessmentTime(Date assessmentTime) 
    {
        this.assessmentTime = assessmentTime;
    }

    public Date getAssessmentTime() 
    {
        return assessmentTime;
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
            .append("score", getScore())
            .append("resultContent", getResultContent())
            .append("assessmentId", getAssessmentId())
            .append("userId", getUserId())
            .append("assessmentTime", getAssessmentTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
