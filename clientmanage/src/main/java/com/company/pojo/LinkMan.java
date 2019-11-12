package com.company.pojo;

/**
 * @author Vimi
 * @category 联系人实体类
 */
public class LinkMan {
	
	/**
	 * 联系人编号
	 */
	private int id;
	
	/**
	 * 联系人姓名
	 */
	private String name;
	
	/**
	 * 联系人角色
	 */
	private String role;
	
	/**
	 * 联系人性别
	 */
	private String sex;
	
	/**
	 * 联系人手机
	 */
	private String phone;
	
	/**
	 * 联系人qq
	 */
	private String qq;
	
	/**
	 * 联系人邮箱
	 */
	private String email;
	
	/**
	 * 备注
	 */
	private String remark;
    
	/**
	 * 客户id
	 */
	private int cid;
	public LinkMan() {
		super();
	}
    
	public LinkMan(String name, String role, String sex, String phone, String qq, String email, String remark,
			int cid) {
		super();
		this.name = name;
		this.role = role;
		this.sex = sex;
		this.phone = phone;
		this.qq = qq;
		this.email = email;
		this.remark = remark;
		this.cid = cid;
	}

	public LinkMan(int id, String name, String role, String sex, String phone, String qq, String email, String remark,
			int cid) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sex = sex;
		this.phone = phone;
		this.qq = qq;
		this.email = email;
		this.remark = remark;
		this.cid = cid;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
