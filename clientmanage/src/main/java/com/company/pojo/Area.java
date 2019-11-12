package com.company.pojo;
/**
 * @category 区县实体类
 * @author zhangyang
 *
 */

public class Area {
	
	private int id;
	/**
	 * 区县编号
	 */
	private String areaId;
	/**
	 * 区 县
	 */
	private String areas;
	/**
	 * 城市编号
	 */
	private String cityId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Area(String areaId, String areas, String cityId) {
		super();
		this.areaId = areaId;
		this.areas = areas;
		this.cityId = cityId;
	}
	public Area() {
		super();
	}

}
