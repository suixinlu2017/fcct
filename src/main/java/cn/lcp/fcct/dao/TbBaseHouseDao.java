package cn.lcp.fcct.dao;

import cn.lcp.fcct.po.TbBaseHouse;
import org.apache.ibatis.annotations.*;
import cn.lcp.fcct.service.Impl.TbBaseHouseServiceImpl;
import java.util.List;

/**
 * @description: 模板生成
 * @author: 模板生成
 * @create: Wed May 13 15:39:26 CST 2020
 **/
public interface TbBaseHouseDao {
    @Insert("insert into tb_base_house(code,name,area_code,regist_name,house_aliasname,address,limit_year,longitude,latitude,titude_type,approve_status,approve_desc,create_date,create_id,update_date,update_id,delete_flag,remark,source,source_url,comment_flag,lock_flag,boutique_flag,sorted,combined_flag,type,merge_after_id)  values(#{code},#{name},#{area_code},#{regist_name},#{house_aliasname},#{address},#{limit_year},#{longitude},#{latitude},#{titude_type},#{approve_status},#{approve_desc},#{create_date},#{create_id},#{update_date},#{update_id},#{delete_flag},#{remark},#{source},#{source_url},#{comment_flag},#{lock_flag},#{boutique_flag},#{sorted},#{combined_flag},#{type},#{mergeAfterId})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insert(TbBaseHouse tbBaseHouse) throws  Exception;


    @SelectProvider(type=TbBaseHouseServiceImpl.class,method="updateSql")
    int update(TbBaseHouse tbBaseHouse);


    @Select("select * from tb_base_house where is_status=0")
    List<TbBaseHouse> selectAll() throws Exception;


    @Select("select * from tb_base_house where id=#{id}  and is_status=0")
    TbBaseHouse getById(@Param("id") Long id) throws Exception;


    @Update("update  tb_base_house set is_status=1 where id=#{id}")
    int deleteById(@Param("id") Long id) throws Exception;

}
