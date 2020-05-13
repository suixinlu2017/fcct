package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.dao.TbBaseHouseDao;
import cn.lcp.fcct.po.TbBaseHouse;
import cn.lcp.fcct.service.TbBaseHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @description: 模板生成
 * @author: 模板生成
 * @create: Wed May 13 15:39:26 CST 2020
 **/
@Service
public class TbBaseHouseServiceImpl implements TbBaseHouseService {
        @Autowired
        private TbBaseHouseDao tbBaseHouseDao;

        @Override
        public int insert(TbBaseHouse tbBaseHouse) {
            Integer sql_status = null;
            try {
                sql_status = tbBaseHouseDao.insert(tbBaseHouse);
            }catch (Exception e){
                e.printStackTrace();
            }
            return sql_status;
            
		}

        @Override
        public int update(TbBaseHouse tbBaseHouse) {
            Integer sql_status = null;
            try {
                sql_status = tbBaseHouseDao.update(tbBaseHouse);
            }catch (Exception e){
                e.printStackTrace();
            }
            return sql_status;
            
		}

        @Override
        public List<TbBaseHouse> selectAll() {
            List<TbBaseHouse> datas = null;
            try {
                datas = tbBaseHouseDao.selectAll();
            }catch (Exception e){
                e.printStackTrace();
            }
            return datas;
            
		}

        @Override
        public TbBaseHouse getById(Long id) {
            TbBaseHouse data = null;
            try {
                data = tbBaseHouseDao.getById(id);
            }catch (Exception e){
                e.printStackTrace();
            }
            return data;
            
		}

        @Override
        public int deleteById(Long id) {
            Integer sql_status = null;
            try {
                sql_status = tbBaseHouseDao.deleteById(id);
            }catch (Exception e){
                e.printStackTrace();
            }
            return sql_status;
            
		}

        @Override
        public String updateSql(TbBaseHouse tbBaseHouse) {
        StringBuilder updatesql = new StringBuilder();
        updatesql.append("update tb_base_house set ");
        if(tbBaseHouse.getCode()!=null){
            updatesql.append("code=#{code} and ");
        }
        if(tbBaseHouse.getName()!=null){
            updatesql.append("name=#{name} and ");
        }
        if(tbBaseHouse.getAreaCode()!=null){
            updatesql.append("area_code=#{areaCode} and ");
        }
        if(tbBaseHouse.getRegistName()!=null){
            updatesql.append("regist_name=#{registName} and ");
        }
        if(tbBaseHouse.getHouseAliasname()!=null){
            updatesql.append("house_aliasname=#{houseAliasname} and ");
        }
        if(tbBaseHouse.getAddress()!=null){
            updatesql.append("address=#{address} and ");
        }
        if(tbBaseHouse.getLimitYear()!=null){
            updatesql.append("limit_year=#{limitYear} and ");
        }
        if(tbBaseHouse.getLongitude()!=null){
            updatesql.append("longitude=#{longitude} and ");
        }
        if(tbBaseHouse.getLatitude()!=null){
            updatesql.append("latitude=#{latitude} and ");
        }
        if(tbBaseHouse.getTitudeType()!=null){
            updatesql.append("titude_type=#{titudeType} and ");
        }
        if(tbBaseHouse.getApproveStatus()!=null){
            updatesql.append("approve_status=#{approveStatus} and ");
        }
        if(tbBaseHouse.getApproveDesc()!=null){
            updatesql.append("approve_desc=#{approveDesc} and ");
        }
        if(tbBaseHouse.getCreateDate()!=null){
            updatesql.append("create_date=#{createDate} and ");
        }
        if(tbBaseHouse.getCreateId()!=null){
            updatesql.append("create_id=#{createId} and ");
        }
        if(tbBaseHouse.getUpdateDate()!=null){
            updatesql.append("update_date=#{updateDate} and ");
        }
        if(tbBaseHouse.getUpdateId()!=null){
            updatesql.append("update_id=#{updateId} and ");
        }
        if(tbBaseHouse.getDeleteFlag()!=null){
            updatesql.append("delete_flag=#{deleteFlag} and ");
        }
        if(tbBaseHouse.getRemark()!=null){
            updatesql.append("remark=#{remark} and ");
        }
        if(tbBaseHouse.getSource()!=null){
            updatesql.append("source=#{source} and ");
        }
        if(tbBaseHouse.getSourceUrl()!=null){
            updatesql.append("source_url=#{sourceUrl} and ");
        }
        if(tbBaseHouse.getCommentFlag()!=null){
            updatesql.append("comment_flag=#{commentFlag} and ");
        }
        if(tbBaseHouse.getLockFlag()!=null){
            updatesql.append("lock_flag=#{lockFlag} and ");
        }
        if(tbBaseHouse.getBoutiqueFlag()!=null){
            updatesql.append("boutique_flag=#{boutiqueFlag} and ");
        }
        if(tbBaseHouse.getSorted()!=null){
            updatesql.append("sorted=#{sorted} and ");
        }
        if(tbBaseHouse.getCombinedFlag()!=null){
            updatesql.append("combined_flag=#{combinedFlag} and ");
        }
        if(tbBaseHouse.getType()!=null){
            updatesql.append("type=#{type} and ");
        }
        if(tbBaseHouse.getMergeAfterId()!=null){
            updatesql.append("merge_after_id=#{mergeAfterId} and ");
        }
        updatesql.delete(updatesql.length()-5,updatesql.length());
        updatesql.append(" where id=#{id}");
        return updatesql.toString();
		}

}
