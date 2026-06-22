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
import com.ruoyi.consult.domain.ConsultOrder;
import com.ruoyi.consult.service.IConsultOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 咨询订单Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/order")
public class ConsultOrderController extends BaseController
{
    @Autowired
    private IConsultOrderService consultOrderService;

    /**
     * 查询咨询订单列表
     */
    @PreAuthorize("@ss.hasPermi('consult:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(ConsultOrder consultOrder)
    {
        startPage();
        List<ConsultOrder> list = consultOrderService.selectConsultOrderList(consultOrder);
        return getDataTable(list);
    }

    /**
     * 导出咨询订单列表
     */
    @PreAuthorize("@ss.hasPermi('consult:order:export')")
    @Log(title = "咨询订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ConsultOrder consultOrder)
    {
        List<ConsultOrder> list = consultOrderService.selectConsultOrderList(consultOrder);
        ExcelUtil<ConsultOrder> util = new ExcelUtil<ConsultOrder>(ConsultOrder.class);
        util.exportExcel(response, list, "咨询订单数据");
    }

    /**
     * 获取咨询订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultOrderService.selectConsultOrderById(id));
    }

    /**
     * 新增咨询订单
     */
    @PreAuthorize("@ss.hasPermi('consult:order:add')")
    @Log(title = "咨询订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ConsultOrder consultOrder)
    {
        return toAjax(consultOrderService.insertConsultOrder(consultOrder));
    }

    /**
     * 修改咨询订单
     */
    @PreAuthorize("@ss.hasPermi('consult:order:edit')")
    @Log(title = "咨询订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ConsultOrder consultOrder)
    {
        return toAjax(consultOrderService.updateConsultOrder(consultOrder));
    }

    /**
     * 删除咨询订单
     */
    @PreAuthorize("@ss.hasPermi('consult:order:remove')")
    @Log(title = "咨询订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultOrderService.deleteConsultOrderByIds(ids));
    }
}
