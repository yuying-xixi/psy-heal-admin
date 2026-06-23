package com.ruoyi.content.controller;

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
import com.ruoyi.content.domain.FmCategory;
import com.ruoyi.content.service.IFmCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * FM分类Controller
 * 
 * @author ruoyi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/content/fm_category")
public class FmCategoryController extends BaseController
{
    @Autowired
    private IFmCategoryService fmCategoryService;

    /**
     * 查询FM分类列表
     */
    @PreAuthorize("@ss.hasPermi('content:fm_category:list')")
    @GetMapping("/list")
    public TableDataInfo list(FmCategory fmCategory)
    {
        startPage();
        List<FmCategory> list = fmCategoryService.selectFmCategoryList(fmCategory);
        return getDataTable(list);
    }

    /**
     * 导出FM分类列表
     */
    @PreAuthorize("@ss.hasPermi('content:fm_category:export')")
    @Log(title = "FM分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FmCategory fmCategory)
    {
        List<FmCategory> list = fmCategoryService.selectFmCategoryList(fmCategory);
        ExcelUtil<FmCategory> util = new ExcelUtil<FmCategory>(FmCategory.class);
        util.exportExcel(response, list, "FM分类数据");
    }

    /**
     * 获取FM分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('content:fm_category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(fmCategoryService.selectFmCategoryById(id));
    }

    /**
     * 新增FM分类
     */
    @PreAuthorize("@ss.hasPermi('content:fm_category:add')")
    @Log(title = "FM分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FmCategory fmCategory)
    {
        return toAjax(fmCategoryService.insertFmCategory(fmCategory));
    }

    /**
     * 修改FM分类
     */
    @PreAuthorize("@ss.hasPermi('content:fm_category:edit')")
    @Log(title = "FM分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FmCategory fmCategory)
    {
        return toAjax(fmCategoryService.updateFmCategory(fmCategory));
    }

    /**
     * 删除FM分类
     */
    @PreAuthorize("@ss.hasPermi('content:fm_category:remove')")
    @Log(title = "FM分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(fmCategoryService.deleteFmCategoryByIds(ids));
    }
}
