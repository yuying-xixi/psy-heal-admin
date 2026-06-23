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
import com.ruoyi.content.domain.ArticleCategory;
import com.ruoyi.content.service.IArticleCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文章分类Controller
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@RestController
@RequestMapping("/content/article_category")
public class ArticleCategoryController extends BaseController
{
    @Autowired
    private IArticleCategoryService articleCategoryService;

    /**
     * 查询文章分类列表
     */
    @PreAuthorize("@ss.hasPermi('content:article_category:list')")
    @GetMapping("/list")
    public TableDataInfo list(ArticleCategory articleCategory)
    {
        startPage();
        List<ArticleCategory> list = articleCategoryService.selectArticleCategoryList(articleCategory);
        return getDataTable(list);
    }

    /**
     * 导出文章分类列表
     */
    @PreAuthorize("@ss.hasPermi('content:article_category:export')")
    @Log(title = "文章分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ArticleCategory articleCategory)
    {
        List<ArticleCategory> list = articleCategoryService.selectArticleCategoryList(articleCategory);
        ExcelUtil<ArticleCategory> util = new ExcelUtil<ArticleCategory>(ArticleCategory.class);
        util.exportExcel(response, list, "文章分类数据");
    }

    /**
     * 获取文章分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('content:article_category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(articleCategoryService.selectArticleCategoryById(id));
    }

    /**
     * 新增文章分类
     */
    @PreAuthorize("@ss.hasPermi('content:article_category:add')")
    @Log(title = "文章分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ArticleCategory articleCategory)
    {
        return toAjax(articleCategoryService.insertArticleCategory(articleCategory));
    }

    /**
     * 修改文章分类
     */
    @PreAuthorize("@ss.hasPermi('content:article_category:edit')")
    @Log(title = "文章分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ArticleCategory articleCategory)
    {
        return toAjax(articleCategoryService.updateArticleCategory(articleCategory));
    }

    /**
     * 删除文章分类
     */
    @PreAuthorize("@ss.hasPermi('content:article_category:remove')")
    @Log(title = "文章分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(articleCategoryService.deleteArticleCategoryByIds(ids));
    }
}
