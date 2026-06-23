package com.ruoyi.content.mapper;

import java.util.List;
import com.ruoyi.content.domain.PublicWelfare;

/**
 * 公益中心Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface PublicWelfareMapper 
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
     * 删除公益中心
     * 
     * @param id 公益中心主键
     * @return 结果
     */
    public int deletePublicWelfareById(Long id);

    /**
     * 批量删除公益中心
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePublicWelfareByIds(Long[] ids);
}
