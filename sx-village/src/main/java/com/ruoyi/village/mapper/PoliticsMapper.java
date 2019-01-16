package com.ruoyi.village.mapper;

import com.ruoyi.village.domain.Politics;

import java.util.List;
/**
 * @Description: 政策Mapper$
 * @Param: dyq_RongSys$
 * @return: $
 * @Author: Mr.DYQ
 * @Date: $
 */
public interface PoliticsMapper {
    /**
     * 查询投诉咨询记录列表
     *
     * @return
     */
    List<Politics> selectPoliticsList(Politics politics);

    /**
     * 根据fbid删除数据
     * @param id
     */
    int deletePoliticsByids(String[] id);

    /**
     * 根据类型或者内容进行模糊查询
     * @param other
     * @return
     */
    //List<Politics> selectPoliticsListBy_other(String other);

    /**
     * 获取数据
     * @return
     */
    List<Politics> selectPoliticsList_first();
}
