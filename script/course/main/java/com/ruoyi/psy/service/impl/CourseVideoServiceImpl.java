package com.ruoyi.psy.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.psy.mapper.CourseVideoMapper;
import com.ruoyi.psy.domain.CourseVideo;
import com.ruoyi.psy.service.ICourseVideoService;

/**
 * 课程视频Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
@Service
public class CourseVideoServiceImpl implements ICourseVideoService 
{
    @Autowired
    private CourseVideoMapper courseVideoMapper;

    /**
     * 查询课程视频
     * 
     * @param id 课程视频主键
     * @return 课程视频
     */
    @Override
    public CourseVideo selectCourseVideoById(Long id)
    {
        return courseVideoMapper.selectCourseVideoById(id);
    }

    /**
     * 查询课程视频列表
     * 
     * @param courseVideo 课程视频
     * @return 课程视频
     */
    @Override
    public List<CourseVideo> selectCourseVideoList(CourseVideo courseVideo)
    {
        return courseVideoMapper.selectCourseVideoList(courseVideo);
    }

    /**
     * 新增课程视频
     * 
     * @param courseVideo 课程视频
     * @return 结果
     */
    @Override
    public int insertCourseVideo(CourseVideo courseVideo)
    {
        courseVideo.setCreateTime(DateUtils.getNowDate());
        return courseVideoMapper.insertCourseVideo(courseVideo);
    }

    /**
     * 修改课程视频
     * 
     * @param courseVideo 课程视频
     * @return 结果
     */
    @Override
    public int updateCourseVideo(CourseVideo courseVideo)
    {
        courseVideo.setUpdateTime(DateUtils.getNowDate());
        return courseVideoMapper.updateCourseVideo(courseVideo);
    }

    /**
     * 批量删除课程视频
     * 
     * @param ids 需要删除的课程视频主键
     * @return 结果
     */
    @Override
    public int deleteCourseVideoByIds(Long[] ids)
    {
        return courseVideoMapper.deleteCourseVideoByIds(ids);
    }

    /**
     * 删除课程视频信息
     * 
     * @param id 课程视频主键
     * @return 结果
     */
    @Override
    public int deleteCourseVideoById(Long id)
    {
        return courseVideoMapper.deleteCourseVideoById(id);
    }
}
