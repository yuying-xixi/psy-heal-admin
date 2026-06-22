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
import com.ruoyi.consult.domain.ConsultLevel;
import com.ruoyi.consult.service.IConsultLevelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 咨询师等级Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/level")
public class ConsultLevelController extends BaseController
{
    @Autowired
    private IConsultLevelService consultLevelService;

    /**
     * 查询咨询师等级列表
     */
    @PreAuthorize("@ss.hasPermi('consult:level:list')")
    @GetMapping("/list")
    public TableDataInfo list(ConsultLevel consultLevel)
    {
        startPage();
        List<ConsultLevel> list = consultLevelService.selectConsultLevelList(consultLevel);
        return getDataTable(list);
    }

    /**
     * 导出咨询师等级列表
     */
    @PreAuthorize("@ss.hasPermi('consult:level:export')")
    @Log(title = "咨询师等级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ConsultLevel consultLevel)
    {
        List<ConsultLevel> list = consultLevelService.selectConsultLevelList(consultLevel);
        ExcelUtil<ConsultLevel> util = new ExcelUtil<ConsultLevel>(ConsultLevel.class);
        util.exportExcel(response, list, "咨询师等级数据");
    }

    /**
     * 获取咨询师等级详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:level:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultLevelService.selectConsultLevelById(id));
    }

    /**
     * 新增咨询师等级
     */
    @PreAuthorize("@ss.hasPermi('consult:level:add')")
    @Log(title = "咨询师等级", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ConsultLevel consultLevel)
    {
        return toAjax(consultLevelService.insertConsultLevel(consultLevel));
    }

    /**
     * 修改咨询师等级
     */
    @PreAuthorize("@ss.hasPermi('consult:level:edit')")
    @Log(title = "咨询师等级", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ConsultLevel consultLevel)
    {
        return toAjax(consultLevelService.updateConsultLevel(consultLevel));
    }

    /**
     * 删除咨询师等级
     */
    @PreAuthorize("@ss.hasPermi('consult:level:remove')")
    @Log(title = "咨询师等级", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultLevelService.deleteConsultLevelByIds(ids));
    }
}
