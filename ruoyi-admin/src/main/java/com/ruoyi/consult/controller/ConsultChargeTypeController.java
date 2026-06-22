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
import com.ruoyi.consult.domain.ConsultChargeType;
import com.ruoyi.consult.service.IConsultChargeTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收费类型Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/type")
public class ConsultChargeTypeController extends BaseController
{
    @Autowired
    private IConsultChargeTypeService consultChargeTypeService;

    /**
     * 查询收费类型列表
     */
    @PreAuthorize("@ss.hasPermi('consult:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(ConsultChargeType consultChargeType)
    {
        startPage();
        List<ConsultChargeType> list = consultChargeTypeService.selectConsultChargeTypeList(consultChargeType);
        return getDataTable(list);
    }

    /**
     * 导出收费类型列表
     */
    @PreAuthorize("@ss.hasPermi('consult:type:export')")
    @Log(title = "收费类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ConsultChargeType consultChargeType)
    {
        List<ConsultChargeType> list = consultChargeTypeService.selectConsultChargeTypeList(consultChargeType);
        ExcelUtil<ConsultChargeType> util = new ExcelUtil<ConsultChargeType>(ConsultChargeType.class);
        util.exportExcel(response, list, "收费类型数据");
    }

    /**
     * 获取收费类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:type:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultChargeTypeService.selectConsultChargeTypeById(id));
    }

    /**
     * 新增收费类型
     */
    @PreAuthorize("@ss.hasPermi('consult:type:add')")
    @Log(title = "收费类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ConsultChargeType consultChargeType)
    {
        return toAjax(consultChargeTypeService.insertConsultChargeType(consultChargeType));
    }

    /**
     * 修改收费类型
     */
    @PreAuthorize("@ss.hasPermi('consult:type:edit')")
    @Log(title = "收费类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ConsultChargeType consultChargeType)
    {
        return toAjax(consultChargeTypeService.updateConsultChargeType(consultChargeType));
    }

    /**
     * 删除收费类型
     */
    @PreAuthorize("@ss.hasPermi('consult:type:remove')")
    @Log(title = "收费类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultChargeTypeService.deleteConsultChargeTypeByIds(ids));
    }
}
