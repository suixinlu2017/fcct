package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TbBaseHouse;
import java.util.List;

/**
 * @description: 模板生成
 * @author: 模板生成
 * @create: Wed May 13 15:39:26 CST 2020
 **/
public interface TbBaseHouseService {
    int insert(TbBaseHouse tbBaseHouse);
    int update(TbBaseHouse tbBaseHouse);
    List<TbBaseHouse> selectAll();
    TbBaseHouse getById(Long id);
    int deleteById(Long id);
    String updateSql(TbBaseHouse tbBaseHouse);
}
