package com.ruoyi.question.controller;

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
import com.ruoyi.question.domain.QuestionLike;
import com.ruoyi.question.service.IQuestionLikeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 问题点赞Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/question/like")
public class QuestionLikeController extends BaseController
{
    @Autowired
    private IQuestionLikeService questionLikeService;

    /**
     * 查询问题点赞列表
     */
    @PreAuthorize("@ss.hasPermi('question:like:list')")
    @GetMapping("/list")
    public TableDataInfo list(QuestionLike questionLike)
    {
        startPage();
        List<QuestionLike> list = questionLikeService.selectQuestionLikeList(questionLike);
        return getDataTable(list);
    }

    /**
     * 导出问题点赞列表
     */
    @PreAuthorize("@ss.hasPermi('question:like:export')")
    @Log(title = "问题点赞", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QuestionLike questionLike)
    {
        List<QuestionLike> list = questionLikeService.selectQuestionLikeList(questionLike);
        ExcelUtil<QuestionLike> util = new ExcelUtil<QuestionLike>(QuestionLike.class);
        util.exportExcel(response, list, "问题点赞数据");
    }

    /**
     * 获取问题点赞详细信息
     */
    @PreAuthorize("@ss.hasPermi('question:like:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(questionLikeService.selectQuestionLikeById(id));
    }

    /**
     * 新增问题点赞
     */
    @PreAuthorize("@ss.hasPermi('question:like:add')")
    @Log(title = "问题点赞", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QuestionLike questionLike)
    {
        return toAjax(questionLikeService.insertQuestionLike(questionLike));
    }

    /**
     * 修改问题点赞
     */
    @PreAuthorize("@ss.hasPermi('question:like:edit')")
    @Log(title = "问题点赞", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QuestionLike questionLike)
    {
        return toAjax(questionLikeService.updateQuestionLike(questionLike));
    }

    /**
     * 删除问题点赞
     */
    @PreAuthorize("@ss.hasPermi('question:like:remove')")
    @Log(title = "问题点赞", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(questionLikeService.deleteQuestionLikeByIds(ids));
    }
}
