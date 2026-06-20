package com.ruoyi.psy.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.psy.mapper.CourseCollectMapper;
import com.ruoyi.psy.domain.CourseCollect;
import com.ruoyi.psy.service.ICourseCollectService;

/**
 * 课程收藏Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
@Service
public class CourseCollectServiceImpl implements ICourseCollectService 
{
    @Autowired
    private CourseCollectMapper courseCollectMapper;

    /**
     * 查询课程收藏
     * 
     * @param id 课程收藏主键
     * @return 课程收藏
     */
    @Override
    public CourseCollect selectCourseCollectById(Long id)
    {
        return courseCollectMapper.selectCourseCollectById(id);
    }

    /**
     * 查询课程收藏列表
     * 
     * @param courseCollect 课程收藏
     * @return 课程收藏
     */
    @Override
    public List<CourseCollect> selectCourseCollectList(CourseCollect courseCollect)
    {
        return courseCollectMapper.selectCourseCollectList(courseCollect);
    }

    /**
     * 新增课程收藏
     * 
     * @param courseCollect 课程收藏
     * @return 结果
     */
    @Override
    public int insertCourseCollect(CourseCollect courseCollect)
    {
        courseCollect.setCreateTime(DateUtils.getNowDate());
        return courseCollectMapper.insertCourseCollect(courseCollect);
    }

    /**
     * 修改课程收藏
     * 
     * @param courseCollect 课程收藏
     * @return 结果
     */
    @Override
    public int updateCourseCollect(CourseCollect courseCollect)
    {
        return courseCollectMapper.updateCourseCollect(courseCollect);
    }

    /**
     * 批量删除课程收藏
     * 
     * @param ids 需要删除的课程收藏主键
     * @return 结果
     */
    @Override
    public int deleteCourseCollectByIds(Long[] ids)
    {
        return courseCollectMapper.deleteCourseCollectByIds(ids);
    }

    /**
     * 删除课程收藏信息
     * 
     * @param id 课程收藏主键
     * @return 结果
     */
    @Override
    public int deleteCourseCollectById(Long id)
    {
        return courseCollectMapper.deleteCourseCollectById(id);
    }
}
