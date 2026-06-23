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
import com.ruoyi.content.domain.PsychologyKnowledge;
import com.ruoyi.content.service.IPsychologyKnowledgeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 心理知识Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/content/knowledge")
public class PsychologyKnowledgeController extends BaseController
{
    @Autowired
    private IPsychologyKnowledgeService psychologyKnowledgeService;

    /**
     * 查询心理知识列表
     */
    @PreAuthorize("@ss.hasPermi('content:knowledge:list')")
    @GetMapping("/list")
    public TableDataInfo list(PsychologyKnowledge psychologyKnowledge)
    {
        startPage();
        List<PsychologyKnowledge> list = psychologyKnowledgeService.selectPsychologyKnowledgeList(psychologyKnowledge);
        return getDataTable(list);
    }

    /**
     * 导出心理知识列表
     */
    @PreAuthorize("@ss.hasPermi('content:knowledge:export')")
    @Log(title = "心理知识", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PsychologyKnowledge psychologyKnowledge)
    {
        List<PsychologyKnowledge> list = psychologyKnowledgeService.selectPsychologyKnowledgeList(psychologyKnowledge);
        ExcelUtil<PsychologyKnowledge> util = new ExcelUtil<PsychologyKnowledge>(PsychologyKnowledge.class);
        util.exportExcel(response, list, "心理知识数据");
    }

    /**
     * 获取心理知识详细信息
     */
    @PreAuthorize("@ss.hasPermi('content:knowledge:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(psychologyKnowledgeService.selectPsychologyKnowledgeById(id));
    }

    /**
     * 新增心理知识
     */
    @PreAuthorize("@ss.hasPermi('content:knowledge:add')")
    @Log(title = "心理知识", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PsychologyKnowledge psychologyKnowledge)
    {
        return toAjax(psychologyKnowledgeService.insertPsychologyKnowledge(psychologyKnowledge));
    }

    /**
     * 修改心理知识
     */
    @PreAuthorize("@ss.hasPermi('content:knowledge:edit')")
    @Log(title = "心理知识", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PsychologyKnowledge psychologyKnowledge)
    {
        return toAjax(psychologyKnowledgeService.updatePsychologyKnowledge(psychologyKnowledge));
    }

    /**
     * 删除心理知识
     */
    @PreAuthorize("@ss.hasPermi('content:knowledge:remove')")
    @Log(title = "心理知识", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(psychologyKnowledgeService.deletePsychologyKnowledgeByIds(ids));
    }
}
