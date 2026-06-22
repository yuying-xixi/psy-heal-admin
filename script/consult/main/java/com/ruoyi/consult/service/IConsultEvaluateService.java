package com.ruoyi.consult.service;

import java.util.List;
import com.ruoyi.consult.domain.ConsultEvaluate;

/**
 * 咨询评价Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface IConsultEvaluateService 
{
    /**
     * 查询咨询评价
     * 
     * @param id 咨询评价主键
     * @return 咨询评价
     */
    public ConsultEvaluate selectConsultEvaluateById(Long id);

    /**
     * 查询咨询评价列表
     * 
     * @param consultEvaluate 咨询评价
     * @return 咨询评价集合
     */
    public List<ConsultEvaluate> selectConsultEvaluateList(ConsultEvaluate consultEvaluate);

    /**
     * 新增咨询评价
     * 
     * @param consultEvaluate 咨询评价
     * @return 结果
     */
    public int insertConsultEvaluate(ConsultEvaluate consultEvaluate);

    /**
     * 修改咨询评价
     * 
     * @param consultEvaluate 咨询评价
     * @return 结果
     */
    public int updateConsultEvaluate(ConsultEvaluate consultEvaluate);

    /**
     * 批量删除咨询评价
     * 
     * @param ids 需要删除的咨询评价主键集合
     * @return 结果
     */
    public int deleteConsultEvaluateByIds(Long[] ids);

    /**
     * 删除咨询评价信息
     * 
     * @param id 咨询评价主键
     * @return 结果
     */
    public int deleteConsultEvaluateById(Long id);
}
