package com.company.service;

import java.util.List;

import com.company.pojo.LogBo;

/**
 * @author rjw
 * @category 操作日志service
 */
public interface ILogBoService {
	/**
	 * 增加操作日志
	 * @param logBo
	 * @return
	 */
	public boolean add(LogBo logBo);
	
	/**
	 * 查询所有操作日志
	 * @return
	 */
	public List<LogBo> findAll2(int currPage, int pageSize);
	public List<LogBo> findAll1();
}
