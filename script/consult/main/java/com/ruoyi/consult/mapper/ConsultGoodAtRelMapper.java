package com.ruoyi.consult.mapper;

import java.util.List;
import com.ruoyi.consult.domain.ConsultGoodAtRel;

/**
 * 咨询师擅长关联Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface ConsultGoodAtRelMapper 
{
    /**
     * 查询咨询师擅长关联
     * 
     * @param id 咨询师擅长关联主键
     * @return 咨询师擅长关联
     */
    public ConsultGoodAtRel selectConsultGoodAtRelById(Long id);

    /**
     * 查询咨询师擅长关联列表
     * 
     * @param consultGoodAtRel 咨询师擅长关联
     * @return 咨询师擅长关联集合
     */
    public List<ConsultGoodAtRel> selectConsultGoodAtRelList(ConsultGoodAtRel consultGoodAtRel);

    /**
     * 新增咨询师擅长关联
     * 
     * @param consultGoodAtRel 咨询师擅长关联
     * @return 结果
     */
    public int insertConsultGoodAtRel(ConsultGoodAtRel consultGoodAtRel);

    /**
     * 修改咨询师擅长关联
     * 
     * @param consultGoodAtRel 咨询师擅长关联
     * @return 结果
     */
    public int updateConsultGoodAtRel(ConsultGoodAtRel consultGoodAtRel);

    /**
     * 删除咨询师擅长关联
     * 
     * @param id 咨询师擅长关联主键
     * @return 结果
     */
    public int deleteConsultGoodAtRelById(Long id);

    /**
     * 批量删除咨询师擅长关联
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteConsultGoodAtRelByIds(Long[] ids);
}
