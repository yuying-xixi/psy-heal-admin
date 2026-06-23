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
import com.ruoyi.assessment.domain.AssessmentResult;
import com.ruoyi.assessment.service.IAssessmentResultService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测评结果Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/assessment/result")
public class AssessmentResultController extends BaseController
{
    @Autowired
    private IAssessmentResultService assessmentResultService;

    /**
     * 查询测评结果列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:result:list')")
    @GetMapping("/list")
    public TableDataInfo list(AssessmentResult assessmentResult)
    {
        startPage();
        List<AssessmentResult> list = assessmentResultService.selectAssessmentResultList(assessmentResult);
        return getDataTable(list);
    }

    /**
     * 导出测评结果列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:result:export')")
    @Log(title = "测评结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AssessmentResult assessmentResult)
    {
        List<AssessmentResult> list = assessmentResultService.selectAssessmentResultList(assessmentResult);
        ExcelUtil<AssessmentResult> util = new ExcelUtil<AssessmentResult>(AssessmentResult.class);
        util.exportExcel(response, list, "测评结果数据");
    }

    /**
     * 获取测评结果详细信息
     */
    @PreAuthorize("@ss.hasPermi('assessment:result:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(assessmentResultService.selectAssessmentResultById(id));
    }

    /**
     * 新增测评结果
     */
    @PreAuthorize("@ss.hasPermi('assessment:result:add')")
    @Log(title = "测评结果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AssessmentResult assessmentResult)
    {
        return toAjax(assessmentResultService.insertAssessmentResult(assessmentResult));
    }

    /**
     * 修改测评结果
     */
    @PreAuthorize("@ss.hasPermi('assessment:result:edit')")
    @Log(title = "测评结果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AssessmentResult assessmentResult)
    {
        return toAjax(assessmentResultService.updateAssessmentResult(assessmentResult));
    }

    /**
     * 删除测评结果
     */
    @PreAuthorize("@ss.hasPermi('assessment:result:remove')")
    @Log(title = "测评结果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(assessmentResultService.deleteAssessmentResultByIds(ids));
    }
}
