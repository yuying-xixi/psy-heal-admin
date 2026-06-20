package com.ruoyi.psy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程视频对象 course_video
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
public class CourseVideo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 视频名称 */
    @Excel(name = "视频名称")
    private String videoName;

    /** 视频时长(秒) */
    @Excel(name = "视频时长(秒)")
    private Long duration;

    /** 视频地址 */
    private String videoUrl;

    /** 所属课程 */
    @Excel(name = "所属课程")
    private Long courseId;

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

    public void setVideoName(String videoName) 
    {
        this.videoName = videoName;
    }

    public String getVideoName() 
    {
        return videoName;
    }

    public void setDuration(Long duration) 
    {
        this.duration = duration;
    }

    public Long getDuration() 
    {
        return duration;
    }

    public void setVideoUrl(String videoUrl) 
    {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() 
    {
        return videoUrl;
    }

    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
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
            .append("videoName", getVideoName())
            .append("duration", getDuration())
            .append("videoUrl", getVideoUrl())
            .append("courseId", getCourseId())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
