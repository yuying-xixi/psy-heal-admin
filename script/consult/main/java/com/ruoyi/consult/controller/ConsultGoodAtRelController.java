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
import com.ruoyi.consult.domain.ConsultGoodAtRel;
import com.ruoyi.consult.service.IConsultGoodAtRelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 咨询师擅长关联Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/excel_rel")
public class ConsultGoodAtRelController extends BaseController
{
    @Autowired
    private IConsultGoodAtRelService consultGoodAtRelService;

    /**
     * 查询咨询师擅长关联列表
     */
    @PreAuthorize("@ss.hasPermi('consult:excel_rel:list')")
    @GetMapping("/list")
    public TableDataInfo list(ConsultGoodAtRel consultGoodAtRel)
    {
        startPage();
        List<ConsultGoodAtRel> list = consultGoodAtRelService.selectConsultGoodAtRelList(consultGoodAtRel);
        return getDataTable(list);
    }

    /**
     * 导出咨询师擅长关联列表
     */
    @PreAuthorize("@ss.hasPermi('consult:excel_rel:export')")
    @Log(title = "咨询师擅长关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ConsultGoodAtRel consultGoodAtRel)
    {
        List<ConsultGoodAtRel> list = consultGoodAtRelService.selectConsultGoodAtRelList(consultGoodAtRel);
        ExcelUtil<ConsultGoodAtRel> util = new ExcelUtil<ConsultGoodAtRel>(ConsultGoodAtRel.class);
        util.exportExcel(response, list, "咨询师擅长关联数据");
    }

    /**
     * 获取咨询师擅长关联详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:excel_rel:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultGoodAtRelService.selectConsultGoodAtRelById(id));
    }

    /**
     * 新增咨询师擅长关联
     */
    @PreAuthorize("@ss.hasPermi('consult:excel_rel:add')")
    @Log(title = "咨询师擅长关联", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ConsultGoodAtRel consultGoodAtRel)
    {
        return toAjax(consultGoodAtRelService.insertConsultGoodAtRel(consultGoodAtRel));
    }

    /**
     * 修改咨询师擅长关联
     */
    @PreAuthorize("@ss.hasPermi('consult:excel_rel:edit')")
    @Log(title = "咨询师擅长关联", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ConsultGoodAtRel consultGoodAtRel)
    {
        return toAjax(consultGoodAtRelService.updateConsultGoodAtRel(consultGoodAtRel));
    }

    /**
     * 删除咨询师擅长关联
     */
    @PreAuthorize("@ss.hasPermi('consult:excel_rel:remove')")
    @Log(title = "咨询师擅长关联", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultGoodAtRelService.deleteConsultGoodAtRelByIds(ids));
    }
}
