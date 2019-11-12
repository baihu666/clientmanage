package com.company.pojo;

/**
 * @author Vimi
 * @category 产品状态实体类
 */
public class ProduceStatus {
	
	/**
	 * 产品状态id
	 */
	private int id;
	
	/**
	 * 产品状态名称
	 */
	private String name;

	public ProduceStatus() {
		super();
	}

	public ProduceStatus(int id, String name) {
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
