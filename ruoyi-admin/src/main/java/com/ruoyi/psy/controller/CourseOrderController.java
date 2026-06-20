package com.ruoyi.psy.controller;

import java.util.List;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.psy.domain.CourseOrder;
import com.ruoyi.psy.service.ICourseOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程订单Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
@RestController
@RequestMapping("/psy/order")
public class CourseOrderController extends BaseController
{
    @Autowired
    private ICourseOrderService courseOrderService;

    /**
     * 查询课程订单列表
     */
    @PreAuthorize("@ss.hasPermi('psy:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(CourseOrder courseOrder)
    {
        startPage();
        List<CourseOrder> list = courseOrderService.selectCourseOrderList(courseOrder);
        return getDataTable(list);
    }

    /**
     * 导出课程订单列表
     */
    @PreAuthorize("@ss.hasPermi('psy:order:export')")
    @Log(title = "课程订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CourseOrder courseOrder)
    {
        List<CourseOrder> list = courseOrderService.selectCourseOrderList(courseOrder);
        ExcelUtil<CourseOrder> util = new ExcelUtil<CourseOrder>(CourseOrder.class);
        util.exportExcel(response, list, "课程订单数据");
    }

    /**
     * 获取课程订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('psy:order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(courseOrderService.selectCourseOrderById(id));
    }

    /**
     * 新增课程订单
     */
    @PreAuthorize("@ss.hasPermi('psy:order:add')")
    @Log(title = "课程订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CourseOrder courseOrder)
    {
        return toAjax(courseOrderService.insertCourseOrder(courseOrder));
    }

    /**
     * 修改课程订单
     */
    @PreAuthorize("@ss.hasPermi('psy:order:edit')")
    @Log(title = "课程订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CourseOrder courseOrder)
    {
        return toAjax(courseOrderService.updateCourseOrder(courseOrder));
    }

    /**
     * 删除课程订单
     */
    @PreAuthorize("@ss.hasPermi('psy:order:remove')")
    @Log(title = "课程订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(courseOrderService.deleteCourseOrderByIds(ids));
    }
}
