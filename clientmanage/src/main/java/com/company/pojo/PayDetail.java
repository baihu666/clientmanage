package com.company.pojo;

import java.util.Date;

/**
 * @author 张游
 * @category 分期付款细节实体类
 */
public class PayDetail {
	/**
	 * 付款详情表id
	 */
	private int id;
	/**
	 * 订单id
	 */
	private int oid;
	/**
	 * 单次应付款
	 */
	private int money;
	/**
	 * 付款情况
	 */
	private String status;
	/**
	 * 真实付款时间
	 */
	private Date paytime;
	/**
	 * 规定付款时间
	 */
	private Date schemetime;
	public PayDetail(int id, int oid, int money, String status, Date paytime, Date schemetime) {
		super();
		this.id = id;
		this.oid = oid;
		this.money = money;
		this.status = status;
		this.paytime = paytime;
		this.schemetime = schemetime;
	}
	public PayDetail() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getPaytime() {
		return paytime;
	}
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	public Date getSchemetime() {
		return schemetime;
	}
	public void setSchemetime(Date schemetime) {
		this.schemetime = schemetime;
	}
	public PayDetail(int oid, int money, String status, Date paytime, Date schemetime) {
		super();
		this.oid = oid;
		this.money = money;
		this.status = status;
		this.paytime = paytime;
		this.schemetime = schemetime;
	}
	public PayDetail(int oid, int money, String status, Date schemetime) {
		super();
		this.oid = oid;
		this.money = money;
		this.status = status;
		this.schemetime = schemetime;
	}
	

}
