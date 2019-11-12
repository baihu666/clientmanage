package com.company.dao;

import java.util.List;

import com.company.pojo.Role;

/**
 * @author xll
 * @category 职位数据访问层
 */
public interface IRoleDao {

	/**
	 * 根据职位id查找职位对象
	 * 
	 * @param id
	 * @return
	 */
	public Role findById(int id);

	/**
	 * 查询所有职位
	 * 
	 * @return 职位对象集合
	 */
	public List<Role> findAll();
}
