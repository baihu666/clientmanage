package com.company.pojo;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author 白虎
 * @category 客户实体类
 */
public class Client {
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
	/**
	 * 下次联系时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date nextdate;
	/**
	 * 客户行业id
	 */
	private int iid;
	/**
	 * 省id
	 */
	private String provinceId;
	/**
	 * 区id
	 */
	private String areaId;
	/**
	 * 市id
	 */
	private String cityId;
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

	public Client() {
		super();
	}
    
	public Client(int id, String name, int eid, Date nextdate, int iid, String provinceId, String areaId, String cityId,
			String source, int level,  int sid) {
		super();
		this.id = id;
		this.name = name;
		this.eid = eid;
		this.nextdate = nextdate;
		this.iid = iid;
		this.provinceId = provinceId;
		this.areaId = areaId;
		this.cityId = cityId;
		this.source = source;
		this.level = level;

		this.sid = sid;
	}

	public Client(String name, int eid, Date nextdate, int iid, String provinceId, String areaId, String cityId,
			String source, int level,  int sid) {
		super();
		this.name = name;
		this.eid = eid;
		this.nextdate = nextdate;
		this.iid = iid;
		this.provinceId = provinceId;
		this.areaId = areaId;
		this.cityId = cityId;
		this.source = source;
		this.level = level;
	
		this.sid = sid;
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

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
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

}
