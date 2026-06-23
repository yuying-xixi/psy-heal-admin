package com.ruoyi.content.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.content.mapper.PublicWelfareMapper;
import com.ruoyi.content.domain.PublicWelfare;
import com.ruoyi.content.service.IPublicWelfareService;

/**
 * 公益中心Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class PublicWelfareServiceImpl implements IPublicWelfareService 
{
    @Autowired
    private PublicWelfareMapper publicWelfareMapper;

    /**
     * 查询公益中心
     * 
     * @param id 公益中心主键
     * @return 公益中心
     */
    @Override
    public PublicWelfare selectPublicWelfareById(Long id)
    {
        return publicWelfareMapper.selectPublicWelfareById(id);
    }

    /**
     * 查询公益中心列表
     * 
     * @param publicWelfare 公益中心
     * @return 公益中心
     */
    @Override
    public List<PublicWelfare> selectPublicWelfareList(PublicWelfare publicWelfare)
    {
        return publicWelfareMapper.selectPublicWelfareList(publicWelfare);
    }

    /**
     * 新增公益中心
     * 
     * @param publicWelfare 公益中心
     * @return 结果
     */
    @Override
    public int insertPublicWelfare(PublicWelfare publicWelfare)
    {
        publicWelfare.setCreateTime(DateUtils.getNowDate());
        return publicWelfareMapper.insertPublicWelfare(publicWelfare);
    }

    /**
     * 修改公益中心
     * 
     * @param publicWelfare 公益中心
     * @return 结果
     */
    @Override
    public int updatePublicWelfare(PublicWelfare publicWelfare)
    {
        publicWelfare.setUpdateTime(DateUtils.getNowDate());
        return publicWelfareMapper.updatePublicWelfare(publicWelfare);
    }

    /**
     * 批量删除公益中心
     * 
     * @param ids 需要删除的公益中心主键
     * @return 结果
     */
    @Override
    public int deletePublicWelfareByIds(Long[] ids)
    {
        return publicWelfareMapper.deletePublicWelfareByIds(ids);
    }

    /**
     * 删除公益中心信息
     * 
     * @param id 公益中心主键
     * @return 结果
     */
    @Override
    public int deletePublicWelfareById(Long id)
    {
        return publicWelfareMapper.deletePublicWelfareById(id);
    }
}
