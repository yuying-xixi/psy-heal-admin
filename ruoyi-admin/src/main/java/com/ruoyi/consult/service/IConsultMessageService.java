package com.ruoyi.consult.service;

import java.util.List;
import com.ruoyi.consult.domain.ConsultMessage;

/**
 * 咨询留言Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface IConsultMessageService 
{
    /**
     * 查询咨询留言
     * 
     * @param id 咨询留言主键
     * @return 咨询留言
     */
    public ConsultMessage selectConsultMessageById(Long id);

    /**
     * 查询咨询留言列表
     * 
     * @param consultMessage 咨询留言
     * @return 咨询留言集合
     */
    public List<ConsultMessage> selectConsultMessageList(ConsultMessage consultMessage);

    /**
     * 新增咨询留言
     * 
     * @param consultMessage 咨询留言
     * @return 结果
     */
    public int insertConsultMessage(ConsultMessage consultMessage);

    /**
     * 修改咨询留言
     * 
     * @param consultMessage 咨询留言
     * @return 结果
     */
    public int updateConsultMessage(ConsultMessage consultMessage);

    /**
     * 批量删除咨询留言
     * 
     * @param ids 需要删除的咨询留言主键集合
     * @return 结果
     */
    public int deleteConsultMessageByIds(Long[] ids);

    /**
     * 删除咨询留言信息
     * 
     * @param id 咨询留言主键
     * @return 结果
     */
    public int deleteConsultMessageById(Long id);
}
