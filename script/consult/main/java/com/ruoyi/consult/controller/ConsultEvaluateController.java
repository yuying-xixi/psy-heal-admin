package com.ruoyi.consult.controller;

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
import com.ruoyi.consult.domain.ConsultEvaluate;
import com.ruoyi.consult.service.IConsultEvaluateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 咨询评价Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/evaluate")
public class ConsultEvaluateController extends BaseController
{
    @Autowired
    private IConsultEvaluateService consultEvaluateService;

    /**
     * 查询咨询评价列表
     */
    @PreAuthorize("@ss.hasPermi('consult:evaluate:list')")
    @GetMapping("/list")
    public TableDataInfo list(ConsultEvaluate consultEvaluate)
    {
        startPage();
        List<ConsultEvaluate> list = consultEvaluateService.selectConsultEvaluateList(consultEvaluate);
        return getDataTable(list);
    }

    /**
     * 导出咨询评价列表
     */
    @PreAuthorize("@ss.hasPermi('consult:evaluate:export')")
    @Log(title = "咨询评价", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ConsultEvaluate consultEvaluate)
    {
        List<ConsultEvaluate> list = consultEvaluateService.selectConsultEvaluateList(consultEvaluate);
        ExcelUtil<ConsultEvaluate> util = new ExcelUtil<ConsultEvaluate>(ConsultEvaluate.class);
        util.exportExcel(response, list, "咨询评价数据");
    }

    /**
     * 获取咨询评价详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:evaluate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultEvaluateService.selectConsultEvaluateById(id));
    }

    /**
     * 新增咨询评价
     */
    @PreAuthorize("@ss.hasPermi('consult:evaluate:add')")
    @Log(title = "咨询评价", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ConsultEvaluate consultEvaluate)
    {
        return toAjax(consultEvaluateService.insertConsultEvaluate(consultEvaluate));
    }

    /**
     * 修改咨询评价
     */
    @PreAuthorize("@ss.hasPermi('consult:evaluate:edit')")
    @Log(title = "咨询评价", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ConsultEvaluate consultEvaluate)
    {
        return toAjax(consultEvaluateService.updateConsultEvaluate(consultEvaluate));
    }

    /**
     * 删除咨询评价
     */
    @PreAuthorize("@ss.hasPermi('consult:evaluate:remove')")
    @Log(title = "咨询评价", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultEvaluateService.deleteConsultEvaluateByIds(ids));
    }
}
