package com.ruoyi.content.mapper;

import java.util.List;
import com.ruoyi.content.domain.FmAudio;

/**
 * FM音频Mapper接口
 * 
 * @author yvying_xixi
 * @date 2026-06-23
 */
public interface FmAudioMapper 
{
    /**
     * 查询FM音频
     * 
     * @param id FM音频主键
     * @return FM音频
     */
    public FmAudio selectFmAudioById(Long id);

    /**
     * 查询FM音频列表
     * 
     * @param fmAudio FM音频
     * @return FM音频集合
     */
    public List<FmAudio> selectFmAudioList(FmAudio fmAudio);

    /**
     * 新增FM音频
     * 
     * @param fmAudio FM音频
     * @return 结果
     */
    public int insertFmAudio(FmAudio fmAudio);

    /**
     * 修改FM音频
     * 
     * @param fmAudio FM音频
     * @return 结果
     */
    public int updateFmAudio(FmAudio fmAudio);

    /**
     * 删除FM音频
     * 
     * @param id FM音频主键
     * @return 结果
     */
    public int deleteFmAudioById(Long id);

    /**
     * 批量删除FM音频
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFmAudioByIds(Long[] ids);
}
