package com.company.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Staff;

public interface IStaffService {

	/**
	 * 注册员工
	 * 
	 * @param staff
	 * @return
	 */
	public boolean addStaff(Staff staff);

	/**
	 * 登录
	 * 
	 * @param name
	 * @param pass
	 * @return
	 */
	public Staff find1(@Param("registername")String registername, @Param("password")String password);

	/**
	 * 根据员工id查找员工对象
	 * 
	 * @param id
	 * @return
	 */
	public Staff findById(int id);

	/**
	 * 查询所有员工
	 * 
	 * @return 员工对象集合
	 */
	public List<Staff> findAll();
	
	/**
	 * 打卡
	 */
	public boolean update(Staff staff);
	
	/**
	 *  根据部门id查询人员列表
	 * @param department
	 * @return
	 */
	public List<Staff> findBydid(int department);
}
