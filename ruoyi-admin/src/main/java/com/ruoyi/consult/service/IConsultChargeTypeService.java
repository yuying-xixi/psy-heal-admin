package com.ruoyi.consult.service;

import java.util.List;
import com.ruoyi.consult.domain.ConsultChargeType;

/**
 * 收费类型Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface IConsultChargeTypeService 
{
    /**
     * 查询收费类型
     * 
     * @param id 收费类型主键
     * @return 收费类型
     */
    public ConsultChargeType selectConsultChargeTypeById(Long id);

    /**
     * 查询收费类型列表
     * 
     * @param consultChargeType 收费类型
     * @return 收费类型集合
     */
    public List<ConsultChargeType> selectConsultChargeTypeList(ConsultChargeType consultChargeType);

    /**
     * 新增收费类型
     * 
     * @param consultChargeType 收费类型
     * @return 结果
     */
    public int insertConsultChargeType(ConsultChargeType consultChargeType);

    /**
     * 修改收费类型
     * 
     * @param consultChargeType 收费类型
     * @return 结果
     */
    public int updateConsultChargeType(ConsultChargeType consultChargeType);

    /**
     * 批量删除收费类型
     * 
     * @param ids 需要删除的收费类型主键集合
     * @return 结果
     */
    public int deleteConsultChargeTypeByIds(Long[] ids);

    /**
     * 删除收费类型信息
     * 
     * @param id 收费类型主键
     * @return 结果
     */
    public int deleteConsultChargeTypeById(Long id);
}
