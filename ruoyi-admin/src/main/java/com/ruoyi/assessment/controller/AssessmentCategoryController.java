package com.ruoyi.assessment.controller;

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
import com.ruoyi.assessment.domain.AssessmentCategory;
import com.ruoyi.assessment.service.IAssessmentCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 心理测评分类Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/assessment/category")
public class AssessmentCategoryController extends BaseController
{
    @Autowired
    private IAssessmentCategoryService assessmentCategoryService;

    /**
     * 查询心理测评分类列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(AssessmentCategory assessmentCategory)
    {
        startPage();
        List<AssessmentCategory> list = assessmentCategoryService.selectAssessmentCategoryList(assessmentCategory);
        return getDataTable(list);
    }

    /**
     * 导出心理测评分类列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:category:export')")
    @Log(title = "心理测评分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AssessmentCategory assessmentCategory)
    {
        List<AssessmentCategory> list = assessmentCategoryService.selectAssessmentCategoryList(assessmentCategory);
        ExcelUtil<AssessmentCategory> util = new ExcelUtil<AssessmentCategory>(AssessmentCategory.class);
        util.exportExcel(response, list, "心理测评分类数据");
    }

    /**
     * 获取心理测评分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('assessment:category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(assessmentCategoryService.selectAssessmentCategoryById(id));
    }

    /**
     * 新增心理测评分类
     */
    @PreAuthorize("@ss.hasPermi('assessment:category:add')")
    @Log(title = "心理测评分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AssessmentCategory assessmentCategory)
    {
        return toAjax(assessmentCategoryService.insertAssessmentCategory(assessmentCategory));
    }

    /**
     * 修改心理测评分类
     */
    @PreAuthorize("@ss.hasPermi('assessment:category:edit')")
    @Log(title = "心理测评分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AssessmentCategory assessmentCategory)
    {
        return toAjax(assessmentCategoryService.updateAssessmentCategory(assessmentCategory));
    }

    /**
     * 删除心理测评分类
     */
    @PreAuthorize("@ss.hasPermi('assessment:category:remove')")
    @Log(title = "心理测评分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(assessmentCategoryService.deleteAssessmentCategoryByIds(ids));
    }
}
