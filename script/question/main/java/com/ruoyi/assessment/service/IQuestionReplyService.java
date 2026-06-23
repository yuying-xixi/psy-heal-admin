package com.ruoyi.assessment.service;

import java.util.List;
import com.ruoyi.assessment.domain.QuestionReply;

/**
 * 回复Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface IQuestionReplyService 
{
    /**
     * 查询回复
     * 
     * @param id 回复主键
     * @return 回复
     */
    public QuestionReply selectQuestionReplyById(Long id);

    /**
     * 查询回复列表
     * 
     * @param questionReply 回复
     * @return 回复集合
     */
    public List<QuestionReply> selectQuestionReplyList(QuestionReply questionReply);

    /**
     * 新增回复
     * 
     * @param questionReply 回复
     * @return 结果
     */
    public int insertQuestionReply(QuestionReply questionReply);

    /**
     * 修改回复
     * 
     * @param questionReply 回复
     * @return 结果
     */
    public int updateQuestionReply(QuestionReply questionReply);

    /**
     * 批量删除回复
     * 
     * @param ids 需要删除的回复主键集合
     * @return 结果
     */
    public int deleteQuestionReplyByIds(Long[] ids);

    /**
     * 删除回复信息
     * 
     * @param id 回复主键
     * @return 结果
     */
    public int deleteQuestionReplyById(Long id);
}
