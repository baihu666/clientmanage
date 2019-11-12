package com.company.pojo;

/**
 * @author Vimi
 * @category 行业实体类
 */
public class Industry {
	
	/**
	 * 行业id
	 */
	private int id;
	
	/**
	 * 行业名称
	 */
	private String name;
	
	/**
	 * 行业介绍
	 */
	private String introduce;

	public Industry() {
		super();
	}

	public Industry(int id, String name, String introduce) {
		super();
		this.id = id;
		this.name = name;
		this.introduce = introduce;
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

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
}
