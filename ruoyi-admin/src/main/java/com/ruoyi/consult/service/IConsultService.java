package com.ruoyi.consult.service;

import java.util.List;
import com.ruoyi.consult.domain.Consult;

/**
 * 咨询师Service接口
 * 
 * @author yvying_xixi
 * @date 2026-06-22
 */
public interface IConsultService 
{
    /**
     * 查询咨询师
     * 
     * @param id 咨询师主键
     * @return 咨询师
     */
    public Consult selectConsultById(Long id);

    /**
     * 查询咨询师列表
     * 
     * @param consult 咨询师
     * @return 咨询师集合
     */
    public List<Consult> selectConsultList(Consult consult);

    /**
     * 新增咨询师
     * 
     * @param consult 咨询师
     * @return 结果
     */
    public int insertConsult(Consult consult);

    /**
     * 修改咨询师
     * 
     * @param consult 咨询师
     * @return 结果
     */
    public int updateConsult(Consult consult);

    /**
     * 批量删除咨询师
     * 
     * @param ids 需要删除的咨询师主键集合
     * @return 结果
     */
    public int deleteConsultByIds(Long[] ids);

    /**
     * 删除咨询师信息
     * 
     * @param id 咨询师主键
     * @return 结果
     */
    public int deleteConsultById(Long id);
}
