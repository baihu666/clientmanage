package com.company.pojo;

/**
 * @author 白虎
 * @category 部门实体类
 */
public class Department {
	/**
	 * 部门id
	 */
	private int id;
	/**
	 * 部门名称
	 */
	private String name;

	public Department() {
		super();
	}

	public Department(String name) {
		super();
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
