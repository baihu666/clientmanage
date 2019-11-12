package com.company.pojo;

/**
 * @author 白虎
 * @category 职位实体类
 */
public class Role {
	/**
	 * 职位id
	 */
	private int id;
	/**
	 * 职位名
	 */
	private String name;
	/**
	 * 部门id
	 */
	private int did;

	public Role() {
		super();
	}

	public Role(String name, int did) {
		super();
		this.name = name;
		this.did = did;
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

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

}
