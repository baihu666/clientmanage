package com.company.pojo.vo;

/**
 * @author Vimi
 * @category 产品VO
 */
public class ProduceVO {

	private int id;

	private String name;

	private String price;

	private int kind;

	private String kindname;

	private String desc;

	private int count;

	private int statusid;

	public ProduceVO() {
		super();
	}

	public ProduceVO(String name, String price, int kind, String kindname, String desc, int count, int statusid) {
		super();
		this.name = name;
		this.price = price;
		this.kind = kind;
		this.kindname = kindname;
		this.desc = desc;
		this.count = count;
		this.statusid = statusid;
	}

	public ProduceVO(int id, String name, String price, int kind, String kindname, String desc, int count,
			int statusid) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.kind = kind;
		this.kindname = kindname;
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

	public String getKindname() {
		return kindname;
	}

	public void setKindname(String kindname) {
		this.kindname = kindname;
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
