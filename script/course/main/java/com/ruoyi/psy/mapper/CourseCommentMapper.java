package com.ruoyi.psy.mapper;

import java.util.List;
import com.ruoyi.psy.domain.CourseComment;

/**
 * 课程评价Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
public interface CourseCommentMapper 
{
    /**
     * 查询课程评价
     * 
     * @param id 课程评价主键
     * @return 课程评价
     */
    public CourseComment selectCourseCommentById(Long id);

    /**
     * 查询课程评价列表
     * 
     * @param courseComment 课程评价
     * @return 课程评价集合
     */
    public List<CourseComment> selectCourseCommentList(CourseComment courseComment);

    /**
     * 新增课程评价
     * 
     * @param courseComment 课程评价
     * @return 结果
     */
    public int insertCourseComment(CourseComment courseComment);

    /**
     * 修改课程评价
     * 
     * @param courseComment 课程评价
     * @return 结果
     */
    public int updateCourseComment(CourseComment courseComment);

    /**
     * 删除课程评价
     * 
     * @param id 课程评价主键
     * @return 结果
     */
    public int deleteCourseCommentById(Long id);

    /**
     * 批量删除课程评价
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCourseCommentByIds(Long[] ids);
}
