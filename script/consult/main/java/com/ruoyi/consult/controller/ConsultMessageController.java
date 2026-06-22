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
import com.ruoyi.consult.domain.ConsultMessage;
import com.ruoyi.consult.service.IConsultMessageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 咨询留言Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
@RestController
@RequestMapping("/consult/message")
public class ConsultMessageController extends BaseController
{
    @Autowired
    private IConsultMessageService consultMessageService;

    /**
     * 查询咨询留言列表
     */
    @PreAuthorize("@ss.hasPermi('consult:message:list')")
    @GetMapping("/list")
    public TableDataInfo list(ConsultMessage consultMessage)
    {
        startPage();
        List<ConsultMessage> list = consultMessageService.selectConsultMessageList(consultMessage);
        return getDataTable(list);
    }

    /**
     * 导出咨询留言列表
     */
    @PreAuthorize("@ss.hasPermi('consult:message:export')")
    @Log(title = "咨询留言", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ConsultMessage consultMessage)
    {
        List<ConsultMessage> list = consultMessageService.selectConsultMessageList(consultMessage);
        ExcelUtil<ConsultMessage> util = new ExcelUtil<ConsultMessage>(ConsultMessage.class);
        util.exportExcel(response, list, "咨询留言数据");
    }

    /**
     * 获取咨询留言详细信息
     */
    @PreAuthorize("@ss.hasPermi('consult:message:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(consultMessageService.selectConsultMessageById(id));
    }

    /**
     * 新增咨询留言
     */
    @PreAuthorize("@ss.hasPermi('consult:message:add')")
    @Log(title = "咨询留言", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ConsultMessage consultMessage)
    {
        return toAjax(consultMessageService.insertConsultMessage(consultMessage));
    }

    /**
     * 修改咨询留言
     */
    @PreAuthorize("@ss.hasPermi('consult:message:edit')")
    @Log(title = "咨询留言", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ConsultMessage consultMessage)
    {
        return toAjax(consultMessageService.updateConsultMessage(consultMessage));
    }

    /**
     * 删除咨询留言
     */
    @PreAuthorize("@ss.hasPermi('consult:message:remove')")
    @Log(title = "咨询留言", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(consultMessageService.deleteConsultMessageByIds(ids));
    }
}
