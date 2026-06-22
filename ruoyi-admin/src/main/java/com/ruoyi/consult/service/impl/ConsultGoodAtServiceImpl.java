package com.ruoyi.consult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultGoodAtMapper;
import com.ruoyi.consult.domain.ConsultGoodAt;
import com.ruoyi.consult.service.IConsultGoodAtService;

/**
 * 擅长领域Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultGoodAtServiceImpl implements IConsultGoodAtService 
{
    @Autowired
    private ConsultGoodAtMapper consultGoodAtMapper;

    /**
     * 查询擅长领域
     * 
     * @param id 擅长领域主键
     * @return 擅长领域
     */
    @Override
    public ConsultGoodAt selectConsultGoodAtById(Long id)
    {
        return consultGoodAtMapper.selectConsultGoodAtById(id);
    }

    /**
     * 查询擅长领域列表
     * 
     * @param consultGoodAt 擅长领域
     * @return 擅长领域
     */
    @Override
    public List<ConsultGoodAt> selectConsultGoodAtList(ConsultGoodAt consultGoodAt)
    {
        return consultGoodAtMapper.selectConsultGoodAtList(consultGoodAt);
    }

    /**
     * 新增擅长领域
     * 
     * @param consultGoodAt 擅长领域
     * @return 结果
     */
    @Override
    public int insertConsultGoodAt(ConsultGoodAt consultGoodAt)
    {
        consultGoodAt.setCreateTime(DateUtils.getNowDate());
        return consultGoodAtMapper.insertConsultGoodAt(consultGoodAt);
    }

    /**
     * 修改擅长领域
     * 
     * @param consultGoodAt 擅长领域
     * @return 结果
     */
    @Override
    public int updateConsultGoodAt(ConsultGoodAt consultGoodAt)
    {
        consultGoodAt.setUpdateTime(DateUtils.getNowDate());
        return consultGoodAtMapper.updateConsultGoodAt(consultGoodAt);
    }

    /**
     * 批量删除擅长领域
     * 
     * @param ids 需要删除的擅长领域主键
     * @return 结果
     */
    @Override
    public int deleteConsultGoodAtByIds(Long[] ids)
    {
        return consultGoodAtMapper.deleteConsultGoodAtByIds(ids);
    }

    /**
     * 删除擅长领域信息
     * 
     * @param id 擅长领域主键
     * @return 结果
     */
    @Override
    public int deleteConsultGoodAtById(Long id)
    {
        return consultGoodAtMapper.deleteConsultGoodAtById(id);
    }
}
