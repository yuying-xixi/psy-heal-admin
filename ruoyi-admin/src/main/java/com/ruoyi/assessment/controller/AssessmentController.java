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
import com.ruoyi.assessment.domain.Assessment;
import com.ruoyi.assessment.service.IAssessmentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 心理测评Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/assessment/assessment")
public class AssessmentController extends BaseController
{
    @Autowired
    private IAssessmentService assessmentService;

    /**
     * 查询心理测评列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:assessment:list')")
    @GetMapping("/list")
    public TableDataInfo list(Assessment assessment)
    {
        startPage();
        List<Assessment> list = assessmentService.selectAssessmentList(assessment);
        return getDataTable(list);
    }

    /**
     * 导出心理测评列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:assessment:export')")
    @Log(title = "心理测评", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Assessment assessment)
    {
        List<Assessment> list = assessmentService.selectAssessmentList(assessment);
        ExcelUtil<Assessment> util = new ExcelUtil<Assessment>(Assessment.class);
        util.exportExcel(response, list, "心理测评数据");
    }

    /**
     * 获取心理测评详细信息
     */
    @PreAuthorize("@ss.hasPermi('assessment:assessment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(assessmentService.selectAssessmentById(id));
    }

    /**
     * 新增心理测评
     */
    @PreAuthorize("@ss.hasPermi('assessment:assessment:add')")
    @Log(title = "心理测评", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Assessment assessment)
    {
        return toAjax(assessmentService.insertAssessment(assessment));
    }

    /**
     * 修改心理测评
     */
    @PreAuthorize("@ss.hasPermi('assessment:assessment:edit')")
    @Log(title = "心理测评", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Assessment assessment)
    {
        return toAjax(assessmentService.updateAssessment(assessment));
    }

    /**
     * 删除心理测评
     */
    @PreAuthorize("@ss.hasPermi('assessment:assessment:remove')")
    @Log(title = "心理测评", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(assessmentService.deleteAssessmentByIds(ids));
    }
}
