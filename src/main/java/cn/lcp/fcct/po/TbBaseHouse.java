package cn.lcp.fcct.po;

import java.util.Date;
/**
 * @description: 模板生成
 * @author: 模板生成
 * @create: Wed May 13 15:39:26 CST 2020
 **/
public class TbBaseHouse{
    private Long id;     //楼盘ID
    private String code;     //楼盘编码
    private String name;     //楼盘名称
    private String areaCode;     //区域编码
    private String registName;     //楼盘备案名
    private String houseAliasname;     //楼盘别名
    private String address;     //楼盘地址
    private Integer limitYear;     //产权年限
    private  longitude;     //经度
    private  latitude;     //纬度
    private Integer titudeType;     //0:百度 1：高德  2：gps
    private Integer approveStatus;     //0:待审核 1：审核通过  2：不通过
    private String approveDesc;     //审批意见
    private Date createDate;     //录入日期
    private Long createId;     //录入人
    private Date updateDate;     //修改日期
    private Long updateId;     //修改人
    private Integer deleteFlag;     //0：有效 1：无效
    private String remark;     //备注
    private String source;     //0:后台添加  1：链家  2：q房 
    private String sourceUrl;     //来源URL,或者唯一标识
    private Integer commentFlag;     //0:否  1：有评论
    private Integer lockFlag;     //0:未锁定  1：锁定
    private Integer boutiqueFlag;     //0:非精品  1：精品
    private Integer sorted;     //排序
    private Integer combinedFlag;     //合盘标识：0 成功  1失败
    private Integer type;     //0:新房 1：二手房 2：新房和二手房
    private Long mergeAfterId;     //合盘后ID


    public Long getId() {
        return id;
    }
    public TbBaseHouse setId(Long id) {
        this.id = id;
        return this;
    }
    public String getCode() {
        return code;
    }
    public TbBaseHouse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getName() {
        return name;
    }
    public TbBaseHouse setName(String name) {
        this.name = name;
        return this;
    }
    public String getAreaCode() {
        return areaCode;
    }
    public TbBaseHouse setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getRegistName() {
        return registName;
    }
    public TbBaseHouse setRegistName(String registName) {
        this.registName = registName;
        return this;
    }
    public String getHouseAliasname() {
        return houseAliasname;
    }
    public TbBaseHouse setHouseAliasname(String houseAliasname) {
        this.houseAliasname = houseAliasname;
        return this;
    }
    public String getAddress() {
        return address;
    }
    public TbBaseHouse setAddress(String address) {
        this.address = address;
        return this;
    }
    public Integer getLimitYear() {
        return limitYear;
    }
    public TbBaseHouse setLimitYear(Integer limitYear) {
        this.limitYear = limitYear;
        return this;
    }
    public  getLongitude() {
        return longitude;
    }
    public TbBaseHouse setLongitude( longitude) {
        this.longitude = longitude;
        return this;
    }
    public  getLatitude() {
        return latitude;
    }
    public TbBaseHouse setLatitude( latitude) {
        this.latitude = latitude;
        return this;
    }
    public Integer getTitudeType() {
        return titudeType;
    }
    public TbBaseHouse setTitudeType(Integer titudeType) {
        this.titudeType = titudeType;
        return this;
    }
    public Integer getApproveStatus() {
        return approveStatus;
    }
    public TbBaseHouse setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
        return this;
    }
    public String getApproveDesc() {
        return approveDesc;
    }
    public TbBaseHouse setApproveDesc(String approveDesc) {
        this.approveDesc = approveDesc;
        return this;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public TbBaseHouse setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }
    public Long getCreateId() {
        return createId;
    }
    public TbBaseHouse setCreateId(Long createId) {
        this.createId = createId;
        return this;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public TbBaseHouse setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }
    public Long getUpdateId() {
        return updateId;
    }
    public TbBaseHouse setUpdateId(Long updateId) {
        this.updateId = updateId;
        return this;
    }
    public Integer getDeleteFlag() {
        return deleteFlag;
    }
    public TbBaseHouse setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }
    public String getRemark() {
        return remark;
    }
    public TbBaseHouse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getSource() {
        return source;
    }
    public TbBaseHouse setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSourceUrl() {
        return sourceUrl;
    }
    public TbBaseHouse setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public Integer getCommentFlag() {
        return commentFlag;
    }
    public TbBaseHouse setCommentFlag(Integer commentFlag) {
        this.commentFlag = commentFlag;
        return this;
    }
    public Integer getLockFlag() {
        return lockFlag;
    }
    public TbBaseHouse setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
        return this;
    }
    public Integer getBoutiqueFlag() {
        return boutiqueFlag;
    }
    public TbBaseHouse setBoutiqueFlag(Integer boutiqueFlag) {
        this.boutiqueFlag = boutiqueFlag;
        return this;
    }
    public Integer getSorted() {
        return sorted;
    }
    public TbBaseHouse setSorted(Integer sorted) {
        this.sorted = sorted;
        return this;
    }
    public Integer getCombinedFlag() {
        return combinedFlag;
    }
    public TbBaseHouse setCombinedFlag(Integer combinedFlag) {
        this.combinedFlag = combinedFlag;
        return this;
    }
    public Integer getType() {
        return type;
    }
    public TbBaseHouse setType(Integer type) {
        this.type = type;
        return this;
    }
    public Long getMergeAfterId() {
        return mergeAfterId;
    }
    public TbBaseHouse setMergeAfterId(Long mergeAfterId) {
        this.mergeAfterId = mergeAfterId;
        return this;
    }

}
