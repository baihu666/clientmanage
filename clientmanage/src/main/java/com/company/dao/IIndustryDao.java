package com.company.dao;

import java.util.List;

import com.company.pojo.Industry;

/**
 * @author xll
 * @category 行业数据访问接口
 */
public interface IIndustryDao {

	/**
	 * 根据行业id查找
	 * @param id
	 * @return
	 */
	public Industry findById(int id);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<Industry> findAll();
}
