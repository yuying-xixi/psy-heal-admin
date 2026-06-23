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
import com.ruoyi.assessment.domain.AssessmentQuestion;
import com.ruoyi.assessment.service.IAssessmentQuestionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 题目Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/assessment/question")
public class AssessmentQuestionController extends BaseController
{
    @Autowired
    private IAssessmentQuestionService assessmentQuestionService;

    /**
     * 查询题目列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:question:list')")
    @GetMapping("/list")
    public TableDataInfo list(AssessmentQuestion assessmentQuestion)
    {
        startPage();
        List<AssessmentQuestion> list = assessmentQuestionService.selectAssessmentQuestionList(assessmentQuestion);
        return getDataTable(list);
    }

    /**
     * 导出题目列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:question:export')")
    @Log(title = "题目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AssessmentQuestion assessmentQuestion)
    {
        List<AssessmentQuestion> list = assessmentQuestionService.selectAssessmentQuestionList(assessmentQuestion);
        ExcelUtil<AssessmentQuestion> util = new ExcelUtil<AssessmentQuestion>(AssessmentQuestion.class);
        util.exportExcel(response, list, "题目数据");
    }

    /**
     * 获取题目详细信息
     */
    @PreAuthorize("@ss.hasPermi('assessment:question:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(assessmentQuestionService.selectAssessmentQuestionById(id));
    }

    /**
     * 新增题目
     */
    @PreAuthorize("@ss.hasPermi('assessment:question:add')")
    @Log(title = "题目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AssessmentQuestion assessmentQuestion)
    {
        return toAjax(assessmentQuestionService.insertAssessmentQuestion(assessmentQuestion));
    }

    /**
     * 修改题目
     */
    @PreAuthorize("@ss.hasPermi('assessment:question:edit')")
    @Log(title = "题目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AssessmentQuestion assessmentQuestion)
    {
        return toAjax(assessmentQuestionService.updateAssessmentQuestion(assessmentQuestion));
    }

    /**
     * 删除题目
     */
    @PreAuthorize("@ss.hasPermi('assessment:question:remove')")
    @Log(title = "题目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(assessmentQuestionService.deleteAssessmentQuestionByIds(ids));
    }
}
