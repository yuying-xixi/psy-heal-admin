package com.ruoyi.content.service;

import java.util.List;
import com.ruoyi.content.domain.PublicWelfare;

/**
 * 公益中心Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface IPublicWelfareService 
{
    /**
     * 查询公益中心
     * 
     * @param id 公益中心主键
     * @return 公益中心
     */
    public PublicWelfare selectPublicWelfareById(Long id);

    /**
     * 查询公益中心列表
     * 
     * @param publicWelfare 公益中心
     * @return 公益中心集合
     */
    public List<PublicWelfare> selectPublicWelfareList(PublicWelfare publicWelfare);

    /**
     * 新增公益中心
     * 
     * @param publicWelfare 公益中心
     * @return 结果
     */
    public int insertPublicWelfare(PublicWelfare publicWelfare);

    /**
     * 修改公益中心
     * 
     * @param publicWelfare 公益中心
     * @return 结果
     */
    public int updatePublicWelfare(PublicWelfare publicWelfare);

    /**
     * 批量删除公益中心
     * 
     * @param ids 需要删除的公益中心主键集合
     * @return 结果
     */
    public int deletePublicWelfareByIds(Long[] ids);

    /**
     * 删除公益中心信息
     * 
     * @param id 公益中心主键
     * @return 结果
     */
    public int deletePublicWelfareById(Long id);
}
