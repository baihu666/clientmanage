package com.company.pojo.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author xll
 * @category 客户Vo
 */
public class ClientVO {
	/**
	 * 客户id
	 */
	private int id;
	/**
	 * 客户名字
	 */
	private String name;
	/**
	 * 客户负责人id
	 */
	private int eid;
	private String ename;
	/**
	 * 下次联系时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date nextdate;
	/**
	 * 客户行业id
	 */
	private int iid;
	private String iname;
	/**
	 * 省id
	 */
	private String provinceId;
	private String province;
	/**
	 * 区id
	 */
	private String areaId;
	private String areas;
	/**
	 * 市id
	 */
	private String cityId;
	private String city;
	/**
	 * 客户信息来源
	 */
	private String source;
	/**
	 * 客户等级
	 */
	private int level;

	/**
	 * 客户状态sid
	 */
	private int sid;
	private String sname;
	
	
	public ClientVO() {
		super();
	}
	
	
	public ClientVO(int id, String name, int eid, String ename, Date nextdate, int iid, String iname, String provinceId,
			String province, String areaId, String areas, String cityId, String city, String source, int level, int fid,
			 int sid, String sname) {
		super();
		this.id = id;
		this.name = name;
		this.eid = eid;
		this.ename = ename;
		this.nextdate = nextdate;
		this.iid = iid;
		this.iname = iname;
		this.provinceId = provinceId;
		this.province = province;
		this.areaId = areaId;
		this.areas = areas;
		this.cityId = cityId;
		this.city = city;
		this.source = source;
		this.level = level;

		
		this.sid = sid;
		this.sname = sname;
	}
    
	public ClientVO(int id, String name, int eid, String ename, Date nextdate, int iid, String iname, String provinceId,
			String province, String areaId, String areas, String cityId, String city, String source, int level,
			 int sid, String sname) {
		super();
		this.id = id;
		this.name = name;
		this.eid = eid;
		this.ename = ename;
		this.nextdate = nextdate;
		this.iid = iid;
		this.iname = iname;
		this.provinceId = provinceId;
		this.province = province;
		this.areaId = areaId;
		this.areas = areas;
		this.cityId = cityId;
		this.city = city;
		this.source = source;
		this.level = level;
		
		this.sid = sid;
		this.sname = sname;
	}


	public ClientVO(String name, int eid, String ename, Date nextdate, int iid, String iname, String provinceId,
			String province, String areaId, String areas, String cityId, String city, String source, int level, int fid,
			 int sid, String sname) {
		super();
		this.name = name;
		this.eid = eid;
		this.ename = ename;
		this.nextdate = nextdate;
		this.iid = iid;
		this.iname = iname;
		this.provinceId = provinceId;
		this.province = province;
		this.areaId = areaId;
		this.areas = areas;
		this.cityId = cityId;
		this.city = city;
		this.source = source;
		this.level = level;
	
		
		this.sid = sid;
		this.sname = sname;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getNextdate() {
		return nextdate;
	}
	public void setNextdate(Date nextdate) {
		this.nextdate = nextdate;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreas() {
		return areas;
	}
	public void setAreas(String areas) {
		this.areas = areas;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
