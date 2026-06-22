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
import com.ruoyi.consult.domain.Consult;
import com.ruoyi.consult.service.IConsultService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 咨询师Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/consult")
public class ConsultController extends BaseController
{
    @Autowired
    private IConsultService consultService;

    /**
     * 查询咨询师列表
     */
    @PreAuthorize("@ss.hasPermi('consult:consult:list')")
    @GetMapping("/list")
    public TableDataInfo list(Consult consult)
    {
        startPage();
        List<Consult> list = consultService.selectConsultList(consult);
        return getDataTable(list);
    }

    /**
     * 导出咨询师列表
     */
    @PreAuthorize("@ss.hasPermi('consult:consult:export')")
    @Log(title = "咨询师", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Consult consult)
    {
        List<Consult> list = consultService.selectConsultList(consult);
        ExcelUtil<Consult> util = new ExcelUtil<Consult>(Consult.class);
        util.exportExcel(response, list, "咨询师数据");
    }

    /**
     * 获取咨询师详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:consult:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultService.selectConsultById(id));
    }

    /**
     * 新增咨询师
     */
    @PreAuthorize("@ss.hasPermi('consult:consult:add')")
    @Log(title = "咨询师", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Consult consult)
    {
        return toAjax(consultService.insertConsult(consult));
    }

    /**
     * 修改咨询师
     */
    @PreAuthorize("@ss.hasPermi('consult:consult:edit')")
    @Log(title = "咨询师", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Consult consult)
    {
        return toAjax(consultService.updateConsult(consult));
    }

    /**
     * 删除咨询师
     */
    @PreAuthorize("@ss.hasPermi('consult:consult:remove')")
    @Log(title = "咨询师", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultService.deleteConsultByIds(ids));
    }
}
