package com.company.pojo;

/**
 * @author Vimi
 * @category 产品实体类
 */
public class Produce {
	
	/**
	 * 产品id
	 */
	private int id;
	
	/**
	 * 产品名称
	 */
	private String name;
	
	/**
	 * 产品价格
	 */
	private String price;
	
	/**
	 * 产品类别
	 */
	private int kind;
	
	/**
	 * 产品描述
	 */
	private String desc;
	
	/**
	 * 产品数量
	 */
	private int count;
	
	/**
	 * 产品状态
	 */
	private int statusid;

	public Produce() {
		super();
	}
	
	

	public Produce(String name, String price, int kind, String desc, int count, int statusid) {
		super();
		this.name = name;
		this.price = price;
		this.kind = kind;
		this.desc = desc;
		this.count = count;
		this.statusid = statusid;
	}

	public Produce(int id, String name, String price, int kind, String desc, int count, int statusid) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.kind = kind;
		this.desc = desc;
		this.count = count;
		this.statusid = statusid;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getStatusid() {
		return statusid;
	}

	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}
	
}
