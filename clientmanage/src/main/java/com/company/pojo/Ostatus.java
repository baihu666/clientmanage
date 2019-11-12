package com.company.pojo;
/**
 * @category 供应商状态
 * @author zhangyang
 *
 */

public class Ostatus {
	
	private int id;
	/**
	 * 供应商姓名
	 */
	private String name;
	
	public Ostatus() {
		super();
	}

	public Ostatus(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
}
