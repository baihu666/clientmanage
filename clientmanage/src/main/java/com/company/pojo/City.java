package com.company.pojo;
/**
 * @category 城市实体类
 * @author zhangyang
 *
 */

public class City {
	
	private int id;
	/**
	 * 城市编号
	 */
	private String cityId;
	/**
	 * 城市名字
	 */
	private String city;
	/**
	 * 省份编号
	 */
	private String provinceId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public City(String cityId, String city, String provinceId) {
		super();
		this.cityId = cityId;
		this.city = city;
		this.provinceId = provinceId;
	}
	public City() {
		super();
	}
	
}
