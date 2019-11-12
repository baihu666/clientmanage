package com.company.pojo;

/**
 * @author 张游
 * @category 订单合同表
 */
public class Order {
	/**
	 * 订单号
	 */
	private int id;
	/**
	 * 客户id
	 */
	private int cid;
	/**
	 * 商品id
	 */
	private int pid;
	/**
	 * 商品总价
	 */
	private String totalprice;
	/**
	 * 订单状态id
	 */
	private int status;
	/**
	 * 员工id
	 */
	private int sid; 
	/**
	 * 付款方式id
	 */
	private int paymethod;

	public Order(int cid, int pid, String totalprice, int status, int sid, int paymethod) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.totalprice = totalprice;
		this.status = status;
		this.sid = sid;
		this.paymethod = paymethod;
	}
	public Order() {
		super();
	}
	
	public Order(int id, int cid, int pid, String totalprice, int status, int sid, int paymethod) {
		super();
		this.id = id;
		this.cid = cid;
		this.pid = pid;
		this.totalprice = totalprice;
		this.status = status;
		this.sid = sid;
		this.paymethod = paymethod;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(int paymethod) {
		this.paymethod = paymethod;
	}

}
