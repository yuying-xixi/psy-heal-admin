package com.ruoyi.psy.mapper;

import java.util.List;
import com.ruoyi.psy.domain.CourseCategory;

/**
 * 课程分类Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
public interface CourseCategoryMapper 
{
    /**
     * 查询课程分类
     * 
     * @param id 课程分类主键
     * @return 课程分类
     */
    public CourseCategory selectCourseCategoryById(Long id);

    /**
     * 查询课程分类列表
     * 
     * @param courseCategory 课程分类
     * @return 课程分类集合
     */
    public List<CourseCategory> selectCourseCategoryList(CourseCategory courseCategory);

    /**
     * 新增课程分类
     * 
     * @param courseCategory 课程分类
     * @return 结果
     */
    public int insertCourseCategory(CourseCategory courseCategory);

    /**
     * 修改课程分类
     * 
     * @param courseCategory 课程分类
     * @return 结果
     */
    public int updateCourseCategory(CourseCategory courseCategory);

    /**
     * 删除课程分类
     * 
     * @param id 课程分类主键
     * @return 结果
     */
    public int deleteCourseCategoryById(Long id);

    /**
     * 批量删除课程分类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCourseCategoryByIds(Long[] ids);
}
