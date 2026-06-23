package com.ruoyi.content.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.content.mapper.FmAudioMapper;
import com.ruoyi.content.domain.FmAudio;
import com.ruoyi.content.service.IFmAudioService;

/**
 * FM音频Service业务层处理
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
@Service
public class FmAudioServiceImpl implements IFmAudioService 
{
    @Autowired
    private FmAudioMapper fmAudioMapper;

    /**
     * 查询FM音频
     * 
     * @param id FM音频主键
     * @return FM音频
     */
    @Override
    public FmAudio selectFmAudioById(Long id)
    {
        return fmAudioMapper.selectFmAudioById(id);
    }

    /**
     * 查询FM音频列表
     * 
     * @param fmAudio FM音频
     * @return FM音频
     */
    @Override
    public List<FmAudio> selectFmAudioList(FmAudio fmAudio)
    {
        return fmAudioMapper.selectFmAudioList(fmAudio);
    }

    /**
     * 新增FM音频
     * 
     * @param fmAudio FM音频
     * @return 结果
     */
    @Override
    public int insertFmAudio(FmAudio fmAudio)
    {
        fmAudio.setCreateTime(DateUtils.getNowDate());
        return fmAudioMapper.insertFmAudio(fmAudio);
    }

    /**
     * 修改FM音频
     * 
     * @param fmAudio FM音频
     * @return 结果
     */
    @Override
    public int updateFmAudio(FmAudio fmAudio)
    {
        fmAudio.setUpdateTime(DateUtils.getNowDate());
        return fmAudioMapper.updateFmAudio(fmAudio);
    }

    /**
     * 批量删除FM音频
     * 
     * @param ids 需要删除的FM音频主键
     * @return 结果
     */
    @Override
    public int deleteFmAudioByIds(Long[] ids)
    {
        return fmAudioMapper.deleteFmAudioByIds(ids);
    }

    /**
     * 删除FM音频信息
     * 
     * @param id FM音频主键
     * @return 结果
     */
    @Override
    public int deleteFmAudioById(Long id)
    {
        return fmAudioMapper.deleteFmAudioById(id);
    }
}
