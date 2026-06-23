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
import com.ruoyi.assessment.domain.QuestionReply;
import com.ruoyi.assessment.service.IQuestionReplyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 回复Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/assessment/reply")
public class QuestionReplyController extends BaseController
{
    @Autowired
    private IQuestionReplyService questionReplyService;

    /**
     * 查询回复列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:reply:list')")
    @GetMapping("/list")
    public TableDataInfo list(QuestionReply questionReply)
    {
        startPage();
        List<QuestionReply> list = questionReplyService.selectQuestionReplyList(questionReply);
        return getDataTable(list);
    }

    /**
     * 导出回复列表
     */
    @PreAuthorize("@ss.hasPermi('assessment:reply:export')")
    @Log(title = "回复", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QuestionReply questionReply)
    {
        List<QuestionReply> list = questionReplyService.selectQuestionReplyList(questionReply);
        ExcelUtil<QuestionReply> util = new ExcelUtil<QuestionReply>(QuestionReply.class);
        util.exportExcel(response, list, "回复数据");
    }

    /**
     * 获取回复详细信息
     */
    @PreAuthorize("@ss.hasPermi('assessment:reply:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(questionReplyService.selectQuestionReplyById(id));
    }

    /**
     * 新增回复
     */
    @PreAuthorize("@ss.hasPermi('assessment:reply:add')")
    @Log(title = "回复", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QuestionReply questionReply)
    {
        return toAjax(questionReplyService.insertQuestionReply(questionReply));
    }

    /**
     * 修改回复
     */
    @PreAuthorize("@ss.hasPermi('assessment:reply:edit')")
    @Log(title = "回复", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QuestionReply questionReply)
    {
        return toAjax(questionReplyService.updateQuestionReply(questionReply));
    }

    /**
     * 删除回复
     */
    @PreAuthorize("@ss.hasPermi('assessment:reply:remove')")
    @Log(title = "回复", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(questionReplyService.deleteQuestionReplyByIds(ids));
    }
}
