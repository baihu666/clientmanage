package com.company.service;

import java.util.List;

import com.company.pojo.Industry;

public interface IIndustryService {
	/**
	 * 根据行业id查找
	 * 
	 * @param id
	 * @return
	 */
	public Industry findById(int id);

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Industry> findAll();
}
