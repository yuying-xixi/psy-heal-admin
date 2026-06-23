package com.ruoyi.question.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.question.mapper.QuestionLikeMapper;
import com.ruoyi.question.domain.QuestionLike;
import com.ruoyi.question.service.IQuestionLikeService;

/**
 * 问题点赞Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class QuestionLikeServiceImpl implements IQuestionLikeService 
{
    @Autowired
    private QuestionLikeMapper questionLikeMapper;

    /**
     * 查询问题点赞
     * 
     * @param id 问题点赞主键
     * @return 问题点赞
     */
    @Override
    public QuestionLike selectQuestionLikeById(Long id)
    {
        return questionLikeMapper.selectQuestionLikeById(id);
    }

    /**
     * 查询问题点赞列表
     * 
     * @param questionLike 问题点赞
     * @return 问题点赞
     */
    @Override
    public List<QuestionLike> selectQuestionLikeList(QuestionLike questionLike)
    {
        return questionLikeMapper.selectQuestionLikeList(questionLike);
    }

    /**
     * 新增问题点赞
     * 
     * @param questionLike 问题点赞
     * @return 结果
     */
    @Override
    public int insertQuestionLike(QuestionLike questionLike)
    {
        questionLike.setCreateTime(DateUtils.getNowDate());
        return questionLikeMapper.insertQuestionLike(questionLike);
    }

    /**
     * 修改问题点赞
     * 
     * @param questionLike 问题点赞
     * @return 结果
     */
    @Override
    public int updateQuestionLike(QuestionLike questionLike)
    {
        questionLike.setUpdateTime(DateUtils.getNowDate());
        return questionLikeMapper.updateQuestionLike(questionLike);
    }

    /**
     * 批量删除问题点赞
     * 
     * @param ids 需要删除的问题点赞主键
     * @return 结果
     */
    @Override
    public int deleteQuestionLikeByIds(Long[] ids)
    {
        return questionLikeMapper.deleteQuestionLikeByIds(ids);
    }

    /**
     * 删除问题点赞信息
     * 
     * @param id 问题点赞主键
     * @return 结果
     */
    @Override
    public int deleteQuestionLikeById(Long id)
    {
        return questionLikeMapper.deleteQuestionLikeById(id);
    }
}
