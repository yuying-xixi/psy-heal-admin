package com.ruoyi.psy.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.psy.mapper.CourseCategoryMapper;
import com.ruoyi.psy.domain.CourseCategory;
import com.ruoyi.psy.service.ICourseCategoryService;

/**
 * 课程分类Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
@Service
public class CourseCategoryServiceImpl implements ICourseCategoryService 
{
    @Autowired
    private CourseCategoryMapper courseCategoryMapper;

    /**
     * 查询课程分类
     * 
     * @param id 课程分类主键
     * @return 课程分类
     */
    @Override
    public CourseCategory selectCourseCategoryById(Long id)
    {
        return courseCategoryMapper.selectCourseCategoryById(id);
    }

    /**
     * 查询课程分类列表
     * 
     * @param courseCategory 课程分类
     * @return 课程分类
     */
    @Override
    public List<CourseCategory> selectCourseCategoryList(CourseCategory courseCategory)
    {
        return courseCategoryMapper.selectCourseCategoryList(courseCategory);
    }

    /**
     * 新增课程分类
     * 
     * @param courseCategory 课程分类
     * @return 结果
     */
    @Override
    public int insertCourseCategory(CourseCategory courseCategory)
    {
        courseCategory.setCreateTime(DateUtils.getNowDate());
        return courseCategoryMapper.insertCourseCategory(courseCategory);
    }

    /**
     * 修改课程分类
     * 
     * @param courseCategory 课程分类
     * @return 结果
     */
    @Override
    public int updateCourseCategory(CourseCategory courseCategory)
    {
        courseCategory.setUpdateTime(DateUtils.getNowDate());
        return courseCategoryMapper.updateCourseCategory(courseCategory);
    }

    /**
     * 批量删除课程分类
     * 
     * @param ids 需要删除的课程分类主键
     * @return 结果
     */
    @Override
    public int deleteCourseCategoryByIds(Long[] ids)
    {
        return courseCategoryMapper.deleteCourseCategoryByIds(ids);
    }

    /**
     * 删除课程分类信息
     * 
     * @param id 课程分类主键
     * @return 结果
     */
    @Override
    public int deleteCourseCategoryById(Long id)
    {
        return courseCategoryMapper.deleteCourseCategoryById(id);
    }
}
