package com.company.dao;

import java.util.List;

import com.company.pojo.Department;

/**
 * @author 白虎
 * @category 部门数据访问接口
 */
public interface IDepartmentDao {
	/**
	 * 查询所有部门
	 * @return 部门集合
	 */
	public List<Department> findAll();
	/**
	 * 根据部门id查询部门 
	 * @param id
	 * @return 部门名称
	 */
	public Department find(int id);
}
