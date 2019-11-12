package com.company.dao;

import java.util.List;

import com.company.pojo.Status;

/**
 * @author xll
 * @category 状态数据访问接口
 */
public interface IStatusDao {

	/**
	 * 根据id查找状态对象
	 * @param id
	 * @return
	 */
	public Status findById(int id);
	
	/**
	 * 查询所有状态
	 * @return 状态对象集合
	 */
	public List<Status> findAll();
}
