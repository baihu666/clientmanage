package com.company.pojo;

/**
 * @author 白虎
 * @category 打卡实体类
 */
public class Clock {
	private Integer id;
	/**
	 * 是否打卡
	 */
	private String daka;

	public Clock() {
		super();
	}

	public Clock(String daka) {
		super();
		this.daka = daka;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDaka() {
		return daka;
	}

	public void setDaka(String daka) {
		this.daka = daka;
	}

}
