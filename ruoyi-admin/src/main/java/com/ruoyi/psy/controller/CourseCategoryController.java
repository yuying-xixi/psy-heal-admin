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
import com.ruoyi.psy.domain.CourseCategory;
import com.ruoyi.psy.service.ICourseCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程分类Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-21
 */
@RestController
@RequestMapping("/psy/category")
public class CourseCategoryController extends BaseController
{
    @Autowired
    private ICourseCategoryService courseCategoryService;

    /**
     * 查询课程分类列表
     */
    @PreAuthorize("@ss.hasPermi('psy:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(CourseCategory courseCategory)
    {
        startPage();
        List<CourseCategory> list = courseCategoryService.selectCourseCategoryList(courseCategory);
        return getDataTable(list);
    }

    /**
     * 导出课程分类列表
     */
    @PreAuthorize("@ss.hasPermi('psy:category:export')")
    @Log(title = "课程分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CourseCategory courseCategory)
    {
        List<CourseCategory> list = courseCategoryService.selectCourseCategoryList(courseCategory);
        ExcelUtil<CourseCategory> util = new ExcelUtil<CourseCategory>(CourseCategory.class);
        util.exportExcel(response, list, "课程分类数据");
    }

    /**
     * 获取课程分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('psy:category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(courseCategoryService.selectCourseCategoryById(id));
    }

    /**
     * 新增课程分类
     */
    @PreAuthorize("@ss.hasPermi('psy:category:add')")
    @Log(title = "课程分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CourseCategory courseCategory)
    {
        return toAjax(courseCategoryService.insertCourseCategory(courseCategory));
    }

    /**
     * 修改课程分类
     */
    @PreAuthorize("@ss.hasPermi('psy:category:edit')")
    @Log(title = "课程分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CourseCategory courseCategory)
    {
        return toAjax(courseCategoryService.updateCourseCategory(courseCategory));
    }

    /**
     * 删除课程分类
     */
    @PreAuthorize("@ss.hasPermi('psy:category:remove')")
    @Log(title = "课程分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(courseCategoryService.deleteCourseCategoryByIds(ids));
    }
}
