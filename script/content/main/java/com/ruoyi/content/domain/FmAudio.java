package com.ruoyi.content.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * FM音频对象 fm_audio
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public class FmAudio extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 所属FM ID */
    @Excel(name = "所属FM ID")
    private Long fmId;

    /** 音频名称 */
    @Excel(name = "音频名称")
    private String audioName;

    /** 音频文件 */
    @Excel(name = "音频文件")
    private String audioUrl;

    /** 音频时长 */
    @Excel(name = "音频时长")
    private Long audioDuration;

    /** 音频大小 */
    @Excel(name = "音频大小")
    private Long audioSize;

    /** 排序 */
    @Excel(name = "排序")
    private Long sortOrder;

    /** 播放量 */
    @Excel(name = "播放量")
    private Long playCount;

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

    public void setFmId(Long fmId) 
    {
        this.fmId = fmId;
    }

    public Long getFmId() 
    {
        return fmId;
    }

    public void setAudioName(String audioName) 
    {
        this.audioName = audioName;
    }

    public String getAudioName() 
    {
        return audioName;
    }

    public void setAudioUrl(String audioUrl) 
    {
        this.audioUrl = audioUrl;
    }

    public String getAudioUrl() 
    {
        return audioUrl;
    }

    public void setAudioDuration(Long audioDuration) 
    {
        this.audioDuration = audioDuration;
    }

    public Long getAudioDuration() 
    {
        return audioDuration;
    }

    public void setAudioSize(Long audioSize) 
    {
        this.audioSize = audioSize;
    }

    public Long getAudioSize() 
    {
        return audioSize;
    }

    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }

    public void setPlayCount(Long playCount) 
    {
        this.playCount = playCount;
    }

    public Long getPlayCount() 
    {
        return playCount;
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
            .append("fmId", getFmId())
            .append("audioName", getAudioName())
            .append("audioUrl", getAudioUrl())
            .append("audioDuration", getAudioDuration())
            .append("audioSize", getAudioSize())
            .append("sortOrder", getSortOrder())
            .append("playCount", getPlayCount())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
