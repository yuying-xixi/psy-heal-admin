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
import com.ruoyi.consult.domain.ConsultGoodAt;
import com.ruoyi.consult.service.IConsultGoodAtService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 擅长领域Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/excel")
public class ConsultGoodAtController extends BaseController
{
    @Autowired
    private IConsultGoodAtService consultGoodAtService;

    /**
     * 查询擅长领域列表
     */
    @PreAuthorize("@ss.hasPermi('consult:excel:list')")
    @GetMapping("/list")
    public TableDataInfo list(ConsultGoodAt consultGoodAt)
    {
        startPage();
        List<ConsultGoodAt> list = consultGoodAtService.selectConsultGoodAtList(consultGoodAt);
        return getDataTable(list);
    }

    /**
     * 导出擅长领域列表
     */
    @PreAuthorize("@ss.hasPermi('consult:excel:export')")
    @Log(title = "擅长领域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ConsultGoodAt consultGoodAt)
    {
        List<ConsultGoodAt> list = consultGoodAtService.selectConsultGoodAtList(consultGoodAt);
        ExcelUtil<ConsultGoodAt> util = new ExcelUtil<ConsultGoodAt>(ConsultGoodAt.class);
        util.exportExcel(response, list, "擅长领域数据");
    }

    /**
     * 获取擅长领域详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:excel:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultGoodAtService.selectConsultGoodAtById(id));
    }

    /**
     * 新增擅长领域
     */
    @PreAuthorize("@ss.hasPermi('consult:excel:add')")
    @Log(title = "擅长领域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ConsultGoodAt consultGoodAt)
    {
        return toAjax(consultGoodAtService.insertConsultGoodAt(consultGoodAt));
    }

    /**
     * 修改擅长领域
     */
    @PreAuthorize("@ss.hasPermi('consult:excel:edit')")
    @Log(title = "擅长领域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ConsultGoodAt consultGoodAt)
    {
        return toAjax(consultGoodAtService.updateConsultGoodAt(consultGoodAt));
    }

    /**
     * 删除擅长领域
     */
    @PreAuthorize("@ss.hasPermi('consult:excel:remove')")
    @Log(title = "擅长领域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultGoodAtService.deleteConsultGoodAtByIds(ids));
    }
}
