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
import com.ruoyi.content.domain.PublicWelfare;
import com.ruoyi.content.service.IPublicWelfareService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公益中心Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/content/welfare")
public class PublicWelfareController extends BaseController
{
    @Autowired
    private IPublicWelfareService publicWelfareService;

    /**
     * 查询公益中心列表
     */
    @PreAuthorize("@ss.hasPermi('content:welfare:list')")
    @GetMapping("/list")
    public TableDataInfo list(PublicWelfare publicWelfare)
    {
        startPage();
        List<PublicWelfare> list = publicWelfareService.selectPublicWelfareList(publicWelfare);
        return getDataTable(list);
    }

    /**
     * 导出公益中心列表
     */
    @PreAuthorize("@ss.hasPermi('content:welfare:export')")
    @Log(title = "公益中心", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PublicWelfare publicWelfare)
    {
        List<PublicWelfare> list = publicWelfareService.selectPublicWelfareList(publicWelfare);
        ExcelUtil<PublicWelfare> util = new ExcelUtil<PublicWelfare>(PublicWelfare.class);
        util.exportExcel(response, list, "公益中心数据");
    }

    /**
     * 获取公益中心详细信息
     */
    @PreAuthorize("@ss.hasPermi('content:welfare:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(publicWelfareService.selectPublicWelfareById(id));
    }

    /**
     * 新增公益中心
     */
    @PreAuthorize("@ss.hasPermi('content:welfare:add')")
    @Log(title = "公益中心", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PublicWelfare publicWelfare)
    {
        return toAjax(publicWelfareService.insertPublicWelfare(publicWelfare));
    }

    /**
     * 修改公益中心
     */
    @PreAuthorize("@ss.hasPermi('content:welfare:edit')")
    @Log(title = "公益中心", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PublicWelfare publicWelfare)
    {
        return toAjax(publicWelfareService.updatePublicWelfare(publicWelfare));
    }

    /**
     * 删除公益中心
     */
    @PreAuthorize("@ss.hasPermi('content:welfare:remove')")
    @Log(title = "公益中心", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(publicWelfareService.deletePublicWelfareByIds(ids));
    }
}
