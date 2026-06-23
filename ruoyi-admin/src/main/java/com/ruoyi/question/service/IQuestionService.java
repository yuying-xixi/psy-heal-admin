package com.ruoyi.question.service;

import java.util.List;
import com.ruoyi.question.domain.Question;

/**
 * 问题Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface IQuestionService 
{
    /**
     * 查询问题
     * 
     * @param id 问题主键
     * @return 问题
     */
    public Question selectQuestionById(Long id);

    /**
     * 查询问题列表
     * 
     * @param question 问题
     * @return 问题集合
     */
    public List<Question> selectQuestionList(Question question);

    /**
     * 新增问题
     * 
     * @param question 问题
     * @return 结果
     */
    public int insertQuestion(Question question);

    /**
     * 修改问题
     * 
     * @param question 问题
     * @return 结果
     */
    public int updateQuestion(Question question);

    /**
     * 批量删除问题
     * 
     * @param ids 需要删除的问题主键集合
     * @return 结果
     */
    public int deleteQuestionByIds(Long[] ids);

    /**
     * 删除问题信息
     * 
     * @param id 问题主键
     * @return 结果
     */
    public int deleteQuestionById(Long id);
}
