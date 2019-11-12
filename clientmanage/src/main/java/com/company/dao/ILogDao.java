package com.company.dao;

import java.util.List;

import com.company.pojo.Log;

/**
 * @author rjw
 * @category 工作日志
 *
 */
public interface ILogDao {
	/**
	 * 查询所有日志
	 * @return
	 */
	public List<Log> findAll();
	
	/**
	 * 通过Uid查询出该用户所有日志
	 * @param Uid
	 * @return
	 */
	public List<Log> findByUid(int uid);
	
	/**
	 * 查询日志
	 * @param id
	 * @return
	 */
	public Log findById(int id);
	
	/**
	 * 增加日志
	 * @param log
	 * @return
	 */
	public int add(Log log);
	/**
	 * 通过部门id查询出所有log
	 * @param did
	 * @return
	 */
	public List<Log> findByDid(int did);
	
	/**
	 * 
	 * 通过职位id查询所有log
	 * @param rid
	 * @return
	 */
	public List<Log> findByRid(int rid);
	
	/**
	 * 通过职位id和部门id查询log
	 * @param did
	 * @param rid
	 * @return
	 */
	public List<Log> finds(int did,int rid);
}
