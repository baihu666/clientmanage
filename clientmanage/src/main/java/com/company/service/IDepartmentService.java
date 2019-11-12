package com.company.service;

import java.util.List;

import com.company.pojo.Department;

/**
 * @author xll
 * @category 部门业务逻辑实现类
 */
public interface IDepartmentService {

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
