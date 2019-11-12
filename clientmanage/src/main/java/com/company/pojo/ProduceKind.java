package com.company.pojo;

/**
 * @author Vimi
 * @category 产品类别实体类
 */
public class ProduceKind {
	
	/**
	 * 产品类别id
	 */
	private int id;
	
	/**
	 * 产品名称
	 */
	private String name;

	public ProduceKind() {
		super();
	}
	
	

	public ProduceKind(String name) {
		super();
		this.name = name;
	}



	public ProduceKind(int id, String name) {
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
