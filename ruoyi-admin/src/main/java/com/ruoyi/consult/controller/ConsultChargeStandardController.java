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
import com.ruoyi.consult.domain.ConsultChargeStandard;
import com.ruoyi.consult.service.IConsultChargeStandardService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收费标准Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/standard")
public class ConsultChargeStandardController extends BaseController
{
    @Autowired
    private IConsultChargeStandardService consultChargeStandardService;

    /**
     * 查询收费标准列表
     */
    @PreAuthorize("@ss.hasPermi('consult:standard:list')")
    @GetMapping("/list")
    public TableDataInfo list(ConsultChargeStandard consultChargeStandard)
    {
        startPage();
        List<ConsultChargeStandard> list = consultChargeStandardService.selectConsultChargeStandardList(consultChargeStandard);
        return getDataTable(list);
    }

    /**
     * 导出收费标准列表
     */
    @PreAuthorize("@ss.hasPermi('consult:standard:export')")
    @Log(title = "收费标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ConsultChargeStandard consultChargeStandard)
    {
        List<ConsultChargeStandard> list = consultChargeStandardService.selectConsultChargeStandardList(consultChargeStandard);
        ExcelUtil<ConsultChargeStandard> util = new ExcelUtil<ConsultChargeStandard>(ConsultChargeStandard.class);
        util.exportExcel(response, list, "收费标准数据");
    }

    /**
     * 获取收费标准详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:standard:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultChargeStandardService.selectConsultChargeStandardById(id));
    }

    /**
     * 新增收费标准
     */
    @PreAuthorize("@ss.hasPermi('consult:standard:add')")
    @Log(title = "收费标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ConsultChargeStandard consultChargeStandard)
    {
        return toAjax(consultChargeStandardService.insertConsultChargeStandard(consultChargeStandard));
    }

    /**
     * 修改收费标准
     */
    @PreAuthorize("@ss.hasPermi('consult:standard:edit')")
    @Log(title = "收费标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ConsultChargeStandard consultChargeStandard)
    {
        return toAjax(consultChargeStandardService.updateConsultChargeStandard(consultChargeStandard));
    }

    /**
     * 删除收费标准
     */
    @PreAuthorize("@ss.hasPermi('consult:standard:remove')")
    @Log(title = "收费标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultChargeStandardService.deleteConsultChargeStandardByIds(ids));
    }
}
