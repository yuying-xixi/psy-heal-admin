package com.ruoyi.assessment.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.assessment.mapper.QuestionReplyMapper;
import com.ruoyi.assessment.domain.QuestionReply;
import com.ruoyi.assessment.service.IQuestionReplyService;

/**
 * 回复Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class QuestionReplyServiceImpl implements IQuestionReplyService 
{
    @Autowired
    private QuestionReplyMapper questionReplyMapper;

    /**
     * 查询回复
     * 
     * @param id 回复主键
     * @return 回复
     */
    @Override
    public QuestionReply selectQuestionReplyById(Long id)
    {
        return questionReplyMapper.selectQuestionReplyById(id);
    }

    /**
     * 查询回复列表
     * 
     * @param questionReply 回复
     * @return 回复
     */
    @Override
    public List<QuestionReply> selectQuestionReplyList(QuestionReply questionReply)
    {
        return questionReplyMapper.selectQuestionReplyList(questionReply);
    }

    /**
     * 新增回复
     * 
     * @param questionReply 回复
     * @return 结果
     */
    @Override
    public int insertQuestionReply(QuestionReply questionReply)
    {
        questionReply.setCreateTime(DateUtils.getNowDate());
        return questionReplyMapper.insertQuestionReply(questionReply);
    }

    /**
     * 修改回复
     * 
     * @param questionReply 回复
     * @return 结果
     */
    @Override
    public int updateQuestionReply(QuestionReply questionReply)
    {
        questionReply.setUpdateTime(DateUtils.getNowDate());
        return questionReplyMapper.updateQuestionReply(questionReply);
    }

    /**
     * 批量删除回复
     * 
     * @param ids 需要删除的回复主键
     * @return 结果
     */
    @Override
    public int deleteQuestionReplyByIds(Long[] ids)
    {
        return questionReplyMapper.deleteQuestionReplyByIds(ids);
    }

    /**
     * 删除回复信息
     * 
     * @param id 回复主键
     * @return 结果
     */
    @Override
    public int deleteQuestionReplyById(Long id)
    {
        return questionReplyMapper.deleteQuestionReplyById(id);
    }
}
