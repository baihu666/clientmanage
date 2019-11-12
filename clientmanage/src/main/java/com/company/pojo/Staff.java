package com.company.pojo;

import java.sql.Date;

/**
 * @author 白虎
 * @category 员工实体类
 */
/**
 * @author 白虎
 *
 */
public class Staff {
	/**
	 * 员工id
	 */
	private int id;
	/**
	 * 员工名字
	 */
	private String name;
	/**
	 * 账号
	 */
	private String registername;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 职位
	 */
	private int role;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 部门id
	 */
	private int department;
	/**
	 * 省Id
	 */
	private String provinceId;

	/**
	 * 市Id
	 */
	private String cityId;
	/**
	 * 区Id
	 */
	private String areaId;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 入职时间
	 */
	private Date inputtime;
	private Integer cid;

	public Staff() {
		super();
	}

	public Staff(String name, String registername, String password, int role, String sex, int department,
			String provinceId, String cityId, String areaId, Date birthday, Date inputtime, Integer cid) {
		super();
		this.name = name;
		this.registername = registername;
		this.password = password;
		this.role = role;
		this.sex = sex;
		this.department = department;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.areaId = areaId;
		this.birthday = birthday;
		this.inputtime = inputtime;
		this.cid = cid;
	}

	public Staff(Integer cid) {
		super();
		this.cid = cid;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
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

	public String getRegistername() {
		return registername;
	}

	public void setRegistername(String registername) {
		this.registername = registername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getInputtime() {
		return inputtime;
	}

	public void setInputtime(Date inputtime) {
		this.inputtime = inputtime;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", registername=" + registername + ", password=" + password
				+ ", role=" + role + ", sex=" + sex + ", department=" + department + ", provinceId=" + provinceId
				+ ", cityId=" + cityId + ", areaId=" + areaId + ", birthday=" + birthday + ", inputtime=" + inputtime
				+ ", cid=" + cid + "]";
	}

}
