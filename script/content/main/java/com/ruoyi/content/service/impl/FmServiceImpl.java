package com.ruoyi.content.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.content.mapper.FmMapper;
import com.ruoyi.content.domain.Fm;
import com.ruoyi.content.service.IFmService;

/**
 * FMService业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class FmServiceImpl implements IFmService 
{
    @Autowired
    private FmMapper fmMapper;

    /**
     * 查询FM
     * 
     * @param id FM主键
     * @return FM
     */
    @Override
    public Fm selectFmById(Long id)
    {
        return fmMapper.selectFmById(id);
    }

    /**
     * 查询FM列表
     * 
     * @param fm FM
     * @return FM
     */
    @Override
    public List<Fm> selectFmList(Fm fm)
    {
        return fmMapper.selectFmList(fm);
    }

    /**
     * 新增FM
     * 
     * @param fm FM
     * @return 结果
     */
    @Override
    public int insertFm(Fm fm)
    {
        fm.setCreateTime(DateUtils.getNowDate());
        return fmMapper.insertFm(fm);
    }

    /**
     * 修改FM
     * 
     * @param fm FM
     * @return 结果
     */
    @Override
    public int updateFm(Fm fm)
    {
        fm.setUpdateTime(DateUtils.getNowDate());
        return fmMapper.updateFm(fm);
    }

    /**
     * 批量删除FM
     * 
     * @param ids 需要删除的FM主键
     * @return 结果
     */
    @Override
    public int deleteFmByIds(Long[] ids)
    {
        return fmMapper.deleteFmByIds(ids);
    }

    /**
     * 删除FM信息
     * 
     * @param id FM主键
     * @return 结果
     */
    @Override
    public int deleteFmById(Long id)
    {
        return fmMapper.deleteFmById(id);
    }
}
