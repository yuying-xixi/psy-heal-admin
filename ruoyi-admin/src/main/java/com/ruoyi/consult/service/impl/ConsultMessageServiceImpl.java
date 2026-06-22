package com.ruoyi.consult.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.consult.mapper.ConsultMessageMapper;
import com.ruoyi.consult.domain.ConsultMessage;
import com.ruoyi.consult.service.IConsultMessageService;

/**
 * 咨询留言Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@Service
public class ConsultMessageServiceImpl implements IConsultMessageService 
{
    @Autowired
    private ConsultMessageMapper consultMessageMapper;

    /**
     * 查询咨询留言
     * 
     * @param id 咨询留言主键
     * @return 咨询留言
     */
    @Override
    public ConsultMessage selectConsultMessageById(Long id)
    {
        return consultMessageMapper.selectConsultMessageById(id);
    }

    /**
     * 查询咨询留言列表
     * 
     * @param consultMessage 咨询留言
     * @return 咨询留言
     */
    @Override
    public List<ConsultMessage> selectConsultMessageList(ConsultMessage consultMessage)
    {
        return consultMessageMapper.selectConsultMessageList(consultMessage);
    }

    /**
     * 新增咨询留言
     * 
     * @param consultMessage 咨询留言
     * @return 结果
     */
    @Override
    public int insertConsultMessage(ConsultMessage consultMessage)
    {
        consultMessage.setCreateTime(DateUtils.getNowDate());
        return consultMessageMapper.insertConsultMessage(consultMessage);
    }

    /**
     * 修改咨询留言
     * 
     * @param consultMessage 咨询留言
     * @return 结果
     */
    @Override
    public int updateConsultMessage(ConsultMessage consultMessage)
    {
        consultMessage.setUpdateTime(DateUtils.getNowDate());
        return consultMessageMapper.updateConsultMessage(consultMessage);
    }

    /**
     * 批量删除咨询留言
     * 
     * @param ids 需要删除的咨询留言主键
     * @return 结果
     */
    @Override
    public int deleteConsultMessageByIds(Long[] ids)
    {
        return consultMessageMapper.deleteConsultMessageByIds(ids);
    }

    /**
     * 删除咨询留言信息
     * 
     * @param id 咨询留言主键
     * @return 结果
     */
    @Override
    public int deleteConsultMessageById(Long id)
    {
        return consultMessageMapper.deleteConsultMessageById(id);
    }
}
