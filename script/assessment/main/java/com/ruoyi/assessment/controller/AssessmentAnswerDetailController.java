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
import com.ruoyi.assessment.domain.AssessmentAnswerDetail;
import com.ruoyi.assessment.service.IAssessmentAnswerDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户答题详情Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/assessment/detail")
public class AssessmentAnswerDetailController extends BaseController
{
    @Autowired
    private IAssessmentAnswerDetailService assessmentAnswerDetailService;

    /**
     * 查询用户答题详情列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(AssessmentAnswerDetail assessmentAnswerDetail)
    {
        startPage();
        List<AssessmentAnswerDetail> list = assessmentAnswerDetailService.selectAssessmentAnswerDetailList(assessmentAnswerDetail);
        return getDataTable(list);
    }

    /**
     * 导出用户答题详情列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:detail:export')")
    @Log(title = "用户答题详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AssessmentAnswerDetail assessmentAnswerDetail)
    {
        List<AssessmentAnswerDetail> list = assessmentAnswerDetailService.selectAssessmentAnswerDetailList(assessmentAnswerDetail);
        ExcelUtil<AssessmentAnswerDetail> util = new ExcelUtil<AssessmentAnswerDetail>(AssessmentAnswerDetail.class);
        util.exportExcel(response, list, "用户答题详情数据");
    }

    /**
     * 获取用户答题详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('assessment:detail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(assessmentAnswerDetailService.selectAssessmentAnswerDetailById(id));
    }

    /**
     * 新增用户答题详情
     */
    @PreAuthorize("@ss.hasPermi('assessment:detail:add')")
    @Log(title = "用户答题详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AssessmentAnswerDetail assessmentAnswerDetail)
    {
        return toAjax(assessmentAnswerDetailService.insertAssessmentAnswerDetail(assessmentAnswerDetail));
    }

    /**
     * 修改用户答题详情
     */
    @PreAuthorize("@ss.hasPermi('assessment:detail:edit')")
    @Log(title = "用户答题详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AssessmentAnswerDetail assessmentAnswerDetail)
    {
        return toAjax(assessmentAnswerDetailService.updateAssessmentAnswerDetail(assessmentAnswerDetail));
    }

    /**
     * 删除用户答题详情
     */
    @PreAuthorize("@ss.hasPermi('assessment:detail:remove')")
    @Log(title = "用户答题详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(assessmentAnswerDetailService.deleteAssessmentAnswerDetailByIds(ids));
    }
}
