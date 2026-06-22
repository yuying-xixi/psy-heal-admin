package com.ruoyi.consult.mapper;

import java.util.List;
import com.ruoyi.consult.domain.ConsultMessage;

/**
 * 咨询留言Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface ConsultMessageMapper 
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
     * 删除咨询留言
     * 
     * @param id 咨询留言主键
     * @return 结果
     */
    public int deleteConsultMessageById(Long id);

    /**
     * 批量删除咨询留言
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteConsultMessageByIds(Long[] ids);
}
