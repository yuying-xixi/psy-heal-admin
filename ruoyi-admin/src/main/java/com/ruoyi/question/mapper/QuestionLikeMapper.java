package com.ruoyi.question.mapper;

import java.util.List;
import com.ruoyi.question.domain.QuestionLike;

/**
 * 问题点赞Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface QuestionLikeMapper 
{
    /**
     * 查询问题点赞
     * 
     * @param id 问题点赞主键
     * @return 问题点赞
     */
    public QuestionLike selectQuestionLikeById(Long id);

    /**
     * 查询问题点赞列表
     * 
     * @param questionLike 问题点赞
     * @return 问题点赞集合
     */
    public List<QuestionLike> selectQuestionLikeList(QuestionLike questionLike);

    /**
     * 新增问题点赞
     * 
     * @param questionLike 问题点赞
     * @return 结果
     */
    public int insertQuestionLike(QuestionLike questionLike);

    /**
     * 修改问题点赞
     * 
     * @param questionLike 问题点赞
     * @return 结果
     */
    public int updateQuestionLike(QuestionLike questionLike);

    /**
     * 删除问题点赞
     * 
     * @param id 问题点赞主键
     * @return 结果
     */
    public int deleteQuestionLikeById(Long id);

    /**
     * 批量删除问题点赞
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQuestionLikeByIds(Long[] ids);
}
