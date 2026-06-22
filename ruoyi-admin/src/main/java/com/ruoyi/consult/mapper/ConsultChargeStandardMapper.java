package com.ruoyi.consult.mapper;

import java.util.List;
import com.ruoyi.consult.domain.ConsultChargeStandard;

/**
 * 收费标准Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface ConsultChargeStandardMapper 
{
    /**
     * 查询收费标准
     * 
     * @param id 收费标准主键
     * @return 收费标准
     */
    public ConsultChargeStandard selectConsultChargeStandardById(Long id);

    /**
     * 查询收费标准列表
     * 
     * @param consultChargeStandard 收费标准
     * @return 收费标准集合
     */
    public List<ConsultChargeStandard> selectConsultChargeStandardList(ConsultChargeStandard consultChargeStandard);

    /**
     * 新增收费标准
     * 
     * @param consultChargeStandard 收费标准
     * @return 结果
     */
    public int insertConsultChargeStandard(ConsultChargeStandard consultChargeStandard);

    /**
     * 修改收费标准
     * 
     * @param consultChargeStandard 收费标准
     * @return 结果
     */
    public int updateConsultChargeStandard(ConsultChargeStandard consultChargeStandard);

    /**
     * 删除收费标准
     * 
     * @param id 收费标准主键
     * @return 结果
     */
    public int deleteConsultChargeStandardById(Long id);

    /**
     * 批量删除收费标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteConsultChargeStandardByIds(Long[] ids);
}
