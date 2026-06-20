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
import com.ruoyi.psy.domain.CourseCollect;
import com.ruoyi.psy.service.ICourseCollectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程收藏Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
@RestController
@RequestMapping("/psy/collect")
public class CourseCollectController extends BaseController
{
    @Autowired
    private ICourseCollectService courseCollectService;

    /**
     * 查询课程收藏列表
     */
    @PreAuthorize("@ss.hasPermi('psy:collect:list')")
    @GetMapping("/list")
    public TableDataInfo list(CourseCollect courseCollect)
    {
        startPage();
        List<CourseCollect> list = courseCollectService.selectCourseCollectList(courseCollect);
        return getDataTable(list);
    }

    /**
     * 导出课程收藏列表
     */
    @PreAuthorize("@ss.hasPermi('psy:collect:export')")
    @Log(title = "课程收藏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CourseCollect courseCollect)
    {
        List<CourseCollect> list = courseCollectService.selectCourseCollectList(courseCollect);
        ExcelUtil<CourseCollect> util = new ExcelUtil<CourseCollect>(CourseCollect.class);
        util.exportExcel(response, list, "课程收藏数据");
    }

    /**
     * 获取课程收藏详细信息
     */
    @PreAuthorize("@ss.hasPermi('psy:collect:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(courseCollectService.selectCourseCollectById(id));
    }

    /**
     * 新增课程收藏
     */
    @PreAuthorize("@ss.hasPermi('psy:collect:add')")
    @Log(title = "课程收藏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CourseCollect courseCollect)
    {
        return toAjax(courseCollectService.insertCourseCollect(courseCollect));
    }

    /**
     * 修改课程收藏
     */
    @PreAuthorize("@ss.hasPermi('psy:collect:edit')")
    @Log(title = "课程收藏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CourseCollect courseCollect)
    {
        return toAjax(courseCollectService.updateCourseCollect(courseCollect));
    }

    /**
     * 删除课程收藏
     */
    @PreAuthorize("@ss.hasPermi('psy:collect:remove')")
    @Log(title = "课程收藏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(courseCollectService.deleteCourseCollectByIds(ids));
    }
}
