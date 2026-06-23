package com.ruoyi.content.mapper;

import java.util.List;
import com.ruoyi.content.domain.Fm;

/**
 * FMMapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface FmMapper 
{
    /**
     * 查询FM
     * 
     * @param id FM主键
     * @return FM
     */
    public Fm selectFmById(Long id);

    /**
     * 查询FM列表
     * 
     * @param fm FM
     * @return FM集合
     */
    public List<Fm> selectFmList(Fm fm);

    /**
     * 新增FM
     * 
     * @param fm FM
     * @return 结果
     */
    public int insertFm(Fm fm);

    /**
     * 修改FM
     * 
     * @param fm FM
     * @return 结果
     */
    public int updateFm(Fm fm);

    /**
     * 删除FM
     * 
     * @param id FM主键
     * @return 结果
     */
    public int deleteFmById(Long id);

    /**
     * 批量删除FM
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFmByIds(Long[] ids);
}
