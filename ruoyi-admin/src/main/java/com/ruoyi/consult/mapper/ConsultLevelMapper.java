package com.ruoyi.consult.mapper;

import java.util.List;
import com.ruoyi.consult.domain.ConsultLevel;

/**
 * 咨询师等级Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface ConsultLevelMapper 
{
    /**
     * 查询咨询师等级
     * 
     * @param id 咨询师等级主键
     * @return 咨询师等级
     */
    public ConsultLevel selectConsultLevelById(Long id);

    /**
     * 查询咨询师等级列表
     * 
     * @param consultLevel 咨询师等级
     * @return 咨询师等级集合
     */
    public List<ConsultLevel> selectConsultLevelList(ConsultLevel consultLevel);

    /**
     * 新增咨询师等级
     * 
     * @param consultLevel 咨询师等级
     * @return 结果
     */
    public int insertConsultLevel(ConsultLevel consultLevel);

    /**
     * 修改咨询师等级
     * 
     * @param consultLevel 咨询师等级
     * @return 结果
     */
    public int updateConsultLevel(ConsultLevel consultLevel);

    /**
     * 删除咨询师等级
     * 
     * @param id 咨询师等级主键
     * @return 结果
     */
    public int deleteConsultLevelById(Long id);

    /**
     * 批量删除咨询师等级
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteConsultLevelByIds(Long[] ids);
}
