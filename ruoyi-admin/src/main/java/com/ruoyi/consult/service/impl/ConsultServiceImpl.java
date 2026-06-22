package com.ruoyi.consult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultMapper;
import com.ruoyi.consult.domain.Consult;
import com.ruoyi.consult.service.IConsultService;

/**
 * 咨询师Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultServiceImpl implements IConsultService 
{
    @Autowired
    private ConsultMapper consultMapper;

    /**
     * 查询咨询师
     * 
     * @param id 咨询师主键
     * @return 咨询师
     */
    @Override
    public Consult selectConsultById(Long id)
    {
        return consultMapper.selectConsultById(id);
    }

    /**
     * 查询咨询师列表
     * 
     * @param consult 咨询师
     * @return 咨询师
     */
    @Override
    public List<Consult> selectConsultList(Consult consult)
    {
        return consultMapper.selectConsultList(consult);
    }

    /**
     * 新增咨询师
     * 
     * @param consult 咨询师
     * @return 结果
     */
    @Override
    public int insertConsult(Consult consult)
    {
        consult.setCreateTime(DateUtils.getNowDate());
        return consultMapper.insertConsult(consult);
    }

    /**
     * 修改咨询师
     * 
     * @param consult 咨询师
     * @return 结果
     */
    @Override
    public int updateConsult(Consult consult)
    {
        consult.setUpdateTime(DateUtils.getNowDate());
        return consultMapper.updateConsult(consult);
    }

    /**
     * 批量删除咨询师
     * 
     * @param ids 需要删除的咨询师主键
     * @return 结果
     */
    @Override
    public int deleteConsultByIds(Long[] ids)
    {
        return consultMapper.deleteConsultByIds(ids);
    }

    /**
     * 删除咨询师信息
     * 
     * @param id 咨询师主键
     * @return 结果
     */
    @Override
    public int deleteConsultById(Long id)
    {
        return consultMapper.deleteConsultById(id);
    }
}
