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
import com.ruoyi.content.domain.FmAudio;
import com.ruoyi.content.service.IFmAudioService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * FM音频Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/content/audio")
public class FmAudioController extends BaseController
{
    @Autowired
    private IFmAudioService fmAudioService;

    /**
     * 查询FM音频列表
     */
    @PreAuthorize("@ss.hasPermi('content:audio:list')")
    @GetMapping("/list")
    public TableDataInfo list(FmAudio fmAudio)
    {
        startPage();
        List<FmAudio> list = fmAudioService.selectFmAudioList(fmAudio);
        return getDataTable(list);
    }

    /**
     * 导出FM音频列表
     */
    @PreAuthorize("@ss.hasPermi('content:audio:export')")
    @Log(title = "FM音频", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FmAudio fmAudio)
    {
        List<FmAudio> list = fmAudioService.selectFmAudioList(fmAudio);
        ExcelUtil<FmAudio> util = new ExcelUtil<FmAudio>(FmAudio.class);
        util.exportExcel(response, list, "FM音频数据");
    }

    /**
     * 获取FM音频详细信息
     */
    @PreAuthorize("@ss.hasPermi('content:audio:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(fmAudioService.selectFmAudioById(id));
    }

    /**
     * 新增FM音频
     */
    @PreAuthorize("@ss.hasPermi('content:audio:add')")
    @Log(title = "FM音频", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FmAudio fmAudio)
    {
        return toAjax(fmAudioService.insertFmAudio(fmAudio));
    }

    /**
     * 修改FM音频
     */
    @PreAuthorize("@ss.hasPermi('content:audio:edit')")
    @Log(title = "FM音频", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FmAudio fmAudio)
    {
        return toAjax(fmAudioService.updateFmAudio(fmAudio));
    }

    /**
     * 删除FM音频
     */
    @PreAuthorize("@ss.hasPermi('content:audio:remove')")
    @Log(title = "FM音频", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(fmAudioService.deleteFmAudioByIds(ids));
    }
}
