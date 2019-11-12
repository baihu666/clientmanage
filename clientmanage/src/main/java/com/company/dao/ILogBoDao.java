package com.company.dao;

import java.util.List;

import com.company.pojo.LogBo;

/**
 * @author rjw
 * @category 操作日志
 *
 */
public interface ILogBoDao {
	/**
	 * 增加一个日志
	 * @param logger
	 * @return
	 */
	public int add(LogBo logBo);
	/**
	 * 查询所有日志
	 * @return
	 */
	public List<LogBo> findAll();
}
