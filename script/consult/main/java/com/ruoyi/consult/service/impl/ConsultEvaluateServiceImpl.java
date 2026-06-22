package com.ruoyi.consult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultEvaluateMapper;
import com.ruoyi.consult.domain.ConsultEvaluate;
import com.ruoyi.consult.service.IConsultEvaluateService;

/**
 * 咨询评价Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultEvaluateServiceImpl implements IConsultEvaluateService 
{
    @Autowired
    private ConsultEvaluateMapper consultEvaluateMapper;

    /**
     * 查询咨询评价
     * 
     * @param id 咨询评价主键
     * @return 咨询评价
     */
    @Override
    public ConsultEvaluate selectConsultEvaluateById(Long id)
    {
        return consultEvaluateMapper.selectConsultEvaluateById(id);
    }

    /**
     * 查询咨询评价列表
     * 
     * @param consultEvaluate 咨询评价
     * @return 咨询评价
     */
    @Override
    public List<ConsultEvaluate> selectConsultEvaluateList(ConsultEvaluate consultEvaluate)
    {
        return consultEvaluateMapper.selectConsultEvaluateList(consultEvaluate);
    }

    /**
     * 新增咨询评价
     * 
     * @param consultEvaluate 咨询评价
     * @return 结果
     */
    @Override
    public int insertConsultEvaluate(ConsultEvaluate consultEvaluate)
    {
        consultEvaluate.setCreateTime(DateUtils.getNowDate());
        return consultEvaluateMapper.insertConsultEvaluate(consultEvaluate);
    }

    /**
     * 修改咨询评价
     * 
     * @param consultEvaluate 咨询评价
     * @return 结果
     */
    @Override
    public int updateConsultEvaluate(ConsultEvaluate consultEvaluate)
    {
        consultEvaluate.setUpdateTime(DateUtils.getNowDate());
        return consultEvaluateMapper.updateConsultEvaluate(consultEvaluate);
    }

    /**
     * 批量删除咨询评价
     * 
     * @param ids 需要删除的咨询评价主键
     * @return 结果
     */
    @Override
    public int deleteConsultEvaluateByIds(Long[] ids)
    {
        return consultEvaluateMapper.deleteConsultEvaluateByIds(ids);
    }

    /**
     * 删除咨询评价信息
     * 
     * @param id 咨询评价主键
     * @return 结果
     */
    @Override
    public int deleteConsultEvaluateById(Long id)
    {
        return consultEvaluateMapper.deleteConsultEvaluateById(id);
    }
}
