package com.ruoyi.psy.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.psy.mapper.CourseOrderMapper;
import com.ruoyi.psy.domain.CourseOrder;
import com.ruoyi.psy.service.ICourseOrderService;

/**
 * 课程订单Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
@Service
public class CourseOrderServiceImpl implements ICourseOrderService 
{
    @Autowired
    private CourseOrderMapper courseOrderMapper;

    /**
     * 查询课程订单
     * 
     * @param id 课程订单主键
     * @return 课程订单
     */
    @Override
    public CourseOrder selectCourseOrderById(Long id)
    {
        return courseOrderMapper.selectCourseOrderById(id);
    }

    /**
     * 查询课程订单列表
     * 
     * @param courseOrder 课程订单
     * @return 课程订单
     */
    @Override
    public List<CourseOrder> selectCourseOrderList(CourseOrder courseOrder)
    {
        return courseOrderMapper.selectCourseOrderList(courseOrder);
    }

    /**
     * 新增课程订单
     * 
     * @param courseOrder 课程订单
     * @return 结果
     */
    @Override
    public int insertCourseOrder(CourseOrder courseOrder)
    {
        courseOrder.setCreateTime(DateUtils.getNowDate());
        return courseOrderMapper.insertCourseOrder(courseOrder);
    }

    /**
     * 修改课程订单
     * 
     * @param courseOrder 课程订单
     * @return 结果
     */
    @Override
    public int updateCourseOrder(CourseOrder courseOrder)
    {
        courseOrder.setUpdateTime(DateUtils.getNowDate());
        return courseOrderMapper.updateCourseOrder(courseOrder);
    }

    /**
     * 批量删除课程订单
     * 
     * @param ids 需要删除的课程订单主键
     * @return 结果
     */
    @Override
    public int deleteCourseOrderByIds(Long[] ids)
    {
        return courseOrderMapper.deleteCourseOrderByIds(ids);
    }

    /**
     * 删除课程订单信息
     * 
     * @param id 课程订单主键
     * @return 结果
     */
    @Override
    public int deleteCourseOrderById(Long id)
    {
        return courseOrderMapper.deleteCourseOrderById(id);
    }
}
