 package com.company.pojo;

/**
 * @author 张游
 * @category 付款方式实体类
 */
public class PayMethod {
	/**
	 * 方式id
	 */
	private int id;
	/**
	 * 付款名称
	 */
	private String name;
	/**
	 * 分期次数
	 */
	private int number;
	public PayMethod(int id, String name, int number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	public PayMethod() {
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
