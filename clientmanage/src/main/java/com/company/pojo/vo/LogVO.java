package com.company.pojo.vo;

import java.util.Date;

/**
 * 工作日志视图
 * @author Administrator
 *
 */
public class LogVO {
	/**
	 * 序号
	 */
	private int xh;
	/**
	 * 日志id
	 */
	private int id;
	/**
	 * 用户name
	 */
	private String uname;
	
	/**
	 * 部门
	 */
	private String dname;
	
	/**
	 * 职位
	 */
	private String rname;
	
	
	/**
	 * 日志时间
	 */
	private Date datetime;

	private String dateStr;
	
	/**
	 * 日志内容
	 */
	private String content;

	public LogVO() {
		super();
	}
	
	public LogVO(int xh, String uname, String dname, String rname, Date datetime, String content) {
		super();
		this.xh = xh;
		this.uname = uname;
		this.dname = dname;
		this.rname = rname;
		this.datetime = datetime;
		this.content = content;
	}

	public LogVO(int xh, int id, String uname, String dname, String rname, Date datetime, String content) {
		super();
		this.xh = xh;
		this.id = id;
		this.uname = uname;
		this.dname = dname;
		this.rname = rname;
		this.datetime = datetime;
		this.content = content;
	}


	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public int getXh() {
		return xh;
	}

	public void setXh(int xh) {
		this.xh = xh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
