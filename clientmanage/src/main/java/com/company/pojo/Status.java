package com.company.pojo;

/**
 * @author 张游
 * @category 客户状态表
 */
public class Status {
	/**
	 * 状态id
	 */
	private int id;
	/**
	 * 客户状态名称
	 */
	private String name;

	public Status(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Status() {
		super();
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
