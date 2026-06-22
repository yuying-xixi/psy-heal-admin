package com.ruoyi.consult.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 咨询师对象 consult
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public class Consult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 系统用户ID */
    private Long sysUserId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 等级ID */
    @Excel(name = "等级ID")
    private Long levelId;

    /** 手机号 */
    @Excel(name = "手机号")
    private String mobile;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 头像 */
    @Excel(name = "头像")
    private String avatar;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 证书图片 */
    private String certImg;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 个人简介 */
    private String intro;

    /** 职位 */
    @Excel(name = "职位")
    private Integer position;

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

    public void setSysUserId(Long sysUserId) 
    {
        this.sysUserId = sysUserId;
    }

    public Long getSysUserId() 
    {
        return sysUserId;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setLevelId(Long levelId) 
    {
        this.levelId = levelId;
    }

    public Long getLevelId() 
    {
        return levelId;
    }

    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setCertImg(String certImg) 
    {
        this.certImg = certImg;
    }

    public String getCertImg() 
    {
        return certImg;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setIntro(String intro) 
    {
        this.intro = intro;
    }

    public String getIntro() 
    {
        return intro;
    }

    public void setPosition(Integer position) 
    {
        this.position = position;
    }

    public Integer getPosition() 
    {
        return position;
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
            .append("sysUserId", getSysUserId())
            .append("name", getName())
            .append("levelId", getLevelId())
            .append("mobile", getMobile())
            .append("email", getEmail())
            .append("avatar", getAvatar())
            .append("gender", getGender())
            .append("certImg", getCertImg())
            .append("address", getAddress())
            .append("intro", getIntro())
            .append("position", getPosition())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
