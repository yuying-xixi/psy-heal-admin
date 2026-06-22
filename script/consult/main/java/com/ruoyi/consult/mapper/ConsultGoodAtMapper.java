package com.ruoyi.consult.mapper;

import java.util.List;
import com.ruoyi.consult.domain.ConsultGoodAt;

/**
 * 擅长领域Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface ConsultGoodAtMapper 
{
    /**
     * 查询擅长领域
     * 
     * @param id 擅长领域主键
     * @return 擅长领域
     */
    public ConsultGoodAt selectConsultGoodAtById(Long id);

    /**
     * 查询擅长领域列表
     * 
     * @param consultGoodAt 擅长领域
     * @return 擅长领域集合
     */
    public List<ConsultGoodAt> selectConsultGoodAtList(ConsultGoodAt consultGoodAt);

    /**
     * 新增擅长领域
     * 
     * @param consultGoodAt 擅长领域
     * @return 结果
     */
    public int insertConsultGoodAt(ConsultGoodAt consultGoodAt);

    /**
     * 修改擅长领域
     * 
     * @param consultGoodAt 擅长领域
     * @return 结果
     */
    public int updateConsultGoodAt(ConsultGoodAt consultGoodAt);

    /**
     * 删除擅长领域
     * 
     * @param id 擅长领域主键
     * @return 结果
     */
    public int deleteConsultGoodAtById(Long id);

    /**
     * 批量删除擅长领域
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteConsultGoodAtByIds(Long[] ids);
}
