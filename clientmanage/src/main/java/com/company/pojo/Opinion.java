package com.company.pojo;

/**
 * @author Vimi
 * @category 意见实体类s
 */
public class Opinion {
	
	/**
	 * 意见id
	 */
	private int id;
	
	/**
	 * 意见名称
	 */
	private String name;

	public Opinion() {
		super();
	}

	public Opinion(int id, String name) {
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
