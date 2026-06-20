package com.ruoyi.psy.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.psy.mapper.CourseCommentMapper;
import com.ruoyi.psy.domain.CourseComment;
import com.ruoyi.psy.service.ICourseCommentService;

/**
 * 课程评价Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
@Service
public class CourseCommentServiceImpl implements ICourseCommentService 
{
    @Autowired
    private CourseCommentMapper courseCommentMapper;

    /**
     * 查询课程评价
     * 
     * @param id 课程评价主键
     * @return 课程评价
     */
    @Override
    public CourseComment selectCourseCommentById(Long id)
    {
        return courseCommentMapper.selectCourseCommentById(id);
    }

    /**
     * 查询课程评价列表
     * 
     * @param courseComment 课程评价
     * @return 课程评价
     */
    @Override
    public List<CourseComment> selectCourseCommentList(CourseComment courseComment)
    {
        return courseCommentMapper.selectCourseCommentList(courseComment);
    }

    /**
     * 新增课程评价
     * 
     * @param courseComment 课程评价
     * @return 结果
     */
    @Override
    public int insertCourseComment(CourseComment courseComment)
    {
        courseComment.setCreateTime(DateUtils.getNowDate());
        return courseCommentMapper.insertCourseComment(courseComment);
    }

    /**
     * 修改课程评价
     * 
     * @param courseComment 课程评价
     * @return 结果
     */
    @Override
    public int updateCourseComment(CourseComment courseComment)
    {
        courseComment.setUpdateTime(DateUtils.getNowDate());
        return courseCommentMapper.updateCourseComment(courseComment);
    }

    /**
     * 批量删除课程评价
     * 
     * @param ids 需要删除的课程评价主键
     * @return 结果
     */
    @Override
    public int deleteCourseCommentByIds(Long[] ids)
    {
        return courseCommentMapper.deleteCourseCommentByIds(ids);
    }

    /**
     * 删除课程评价信息
     * 
     * @param id 课程评价主键
     * @return 结果
     */
    @Override
    public int deleteCourseCommentById(Long id)
    {
        return courseCommentMapper.deleteCourseCommentById(id);
    }
}
