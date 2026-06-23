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
import com.ruoyi.assessment.domain.AssessmentOption;
import com.ruoyi.assessment.service.IAssessmentOptionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 题目选项Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/assessment/option")
public class AssessmentOptionController extends BaseController
{
    @Autowired
    private IAssessmentOptionService assessmentOptionService;

    /**
     * 查询题目选项列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:option:list')")
    @GetMapping("/list")
    public TableDataInfo list(AssessmentOption assessmentOption)
    {
        startPage();
        List<AssessmentOption> list = assessmentOptionService.selectAssessmentOptionList(assessmentOption);
        return getDataTable(list);
    }

    /**
     * 导出题目选项列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:option:export')")
    @Log(title = "题目选项", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AssessmentOption assessmentOption)
    {
        List<AssessmentOption> list = assessmentOptionService.selectAssessmentOptionList(assessmentOption);
        ExcelUtil<AssessmentOption> util = new ExcelUtil<AssessmentOption>(AssessmentOption.class);
        util.exportExcel(response, list, "题目选项数据");
    }

    /**
     * 获取题目选项详细信息
     */
    @PreAuthorize("@ss.hasPermi('assessment:option:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(assessmentOptionService.selectAssessmentOptionById(id));
    }

    /**
     * 新增题目选项
     */
    @PreAuthorize("@ss.hasPermi('assessment:option:add')")
    @Log(title = "题目选项", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AssessmentOption assessmentOption)
    {
        return toAjax(assessmentOptionService.insertAssessmentOption(assessmentOption));
    }

    /**
     * 修改题目选项
     */
    @PreAuthorize("@ss.hasPermi('assessment:option:edit')")
    @Log(title = "题目选项", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AssessmentOption assessmentOption)
    {
        return toAjax(assessmentOptionService.updateAssessmentOption(assessmentOption));
    }

    /**
     * 删除题目选项
     */
    @PreAuthorize("@ss.hasPermi('assessment:option:remove')")
    @Log(title = "题目选项", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(assessmentOptionService.deleteAssessmentOptionByIds(ids));
    }
}
