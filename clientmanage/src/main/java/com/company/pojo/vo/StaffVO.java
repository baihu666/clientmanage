package com.company.pojo.vo;

import java.sql.Date;

/**
 * @author xll
 * @category 员工VO
 */
public class StaffVO {

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
	
	private String province;

	/**
	 * 市Id
	 */
	private String cityId;
	
	private String city;
	/**
	 * 区Id
	 */
	private String areasId;
	private String areas;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 入职时间
	 */
	private Date inputtime;
	
	
	
	public StaffVO() {
		super();
	}
	
	
	public StaffVO(int id, String name, String registername, String password, int role, String sex, int department,
			String provinceId, String province, String cityId, String city, String areasId, String areas, Date birthday,
			Date inputtime) {
		super();
		this.id = id;
		this.name = name;
		this.registername = registername;
		this.password = password;
		this.role = role;
		this.sex = sex;
		this.department = department;
		this.provinceId = provinceId;
		this.province = province;
		this.cityId = cityId;
		this.city = city;
		this.areasId = areasId;
		this.areas = areas;
		this.birthday = birthday;
		this.inputtime = inputtime;
	}
    
	

	public StaffVO(int id, String name, String registername, String password, int role, String sex, int department,
			String province, String city, String areas, Date birthday, Date inputtime) {
		super();
		this.id = id;
		this.name = name;
		this.registername = registername;
		this.password = password;
		this.role = role;
		this.sex = sex;
		this.department = department;
		this.province = province;
		this.city = city;
		this.areas = areas;
		this.birthday = birthday;
		this.inputtime = inputtime;
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
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getareasId() {
		return areasId;
	}
	public void setareasId(String areasId) {
		this.areasId = areasId;
	}
	public String getareas() {
		return areas;
	}
	public void setareas(String areas) {
		this.areas = areas;
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
	
	
	
	
	
}
