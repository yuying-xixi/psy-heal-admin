package com.ruoyi.psy.mapper;

import java.util.List;
import com.ruoyi.psy.domain.CourseCollect;

/**
 * 课程收藏Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
public interface CourseCollectMapper 
{
    /**
     * 查询课程收藏
     * 
     * @param id 课程收藏主键
     * @return 课程收藏
     */
    public CourseCollect selectCourseCollectById(Long id);

    /**
     * 查询课程收藏列表
     * 
     * @param courseCollect 课程收藏
     * @return 课程收藏集合
     */
    public List<CourseCollect> selectCourseCollectList(CourseCollect courseCollect);

    /**
     * 新增课程收藏
     * 
     * @param courseCollect 课程收藏
     * @return 结果
     */
    public int insertCourseCollect(CourseCollect courseCollect);

    /**
     * 修改课程收藏
     * 
     * @param courseCollect 课程收藏
     * @return 结果
     */
    public int updateCourseCollect(CourseCollect courseCollect);

    /**
     * 删除课程收藏
     * 
     * @param id 课程收藏主键
     * @return 结果
     */
    public int deleteCourseCollectById(Long id);

    /**
     * 批量删除课程收藏
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCourseCollectByIds(Long[] ids);
}
