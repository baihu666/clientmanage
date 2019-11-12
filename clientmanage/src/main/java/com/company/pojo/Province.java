package com.company.pojo;
/**
 * @category 省实体类
 * @author zhnagyang
 *
 */

public class Province {
	private int id;
	/**
	 * 省编号
	 */
	private String provinceId;
	/**
	 * 省名字
	 */
	private String province;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Province(String provinceId, String province) {
		super();
		this.provinceId = provinceId;
		this.province = province;
	}
	public Province() {
		super();
	}
	

	
}
