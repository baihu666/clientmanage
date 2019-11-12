package com.company.dao;

import java.util.List;

import com.company.pojo.Ostatus;

/**
 * @author 白虎
 * @category 供应商状态数据访问接口
 */
public interface IOstatusDao {
	/**
	 * 查询所有供应商状态
	 * 
	 * @return 供应商状态集合
	 */
	public List<Ostatus> findAll();

	/**
	 * 根据id查询供应商状态
	 * 
	 * @param id
	 * @return 供应商状态对象
	 */
	public Ostatus find(int id);
}
