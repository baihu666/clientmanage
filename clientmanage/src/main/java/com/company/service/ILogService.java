package com.company.service;

import java.util.List;

import com.company.pojo.Log;
import com.company.pojo.vo.LogVO;

/**
 * @author rjw
 * 
 * @category 工作日志逻辑层接口
 */
public interface ILogService {
	
	
	/**
	 * 查询所有log
	 * @return
	 */
	public List<LogVO> findAll();
	
	
	/**
	 * 查询uid下的所有日志
	 * @param uid
	 * @return
	 */
	public List<LogVO> findByUid(String uid);
	public List<LogVO> findByUid(int uid);
	
	/**
	 * 查询某条log
	 * @param id
	 * @return
	 */
	public LogVO findById(String id);
	
	
	/**
	 * 增加log
	 * @param log
	 * @return
	 */
	public boolean add(Log log);
	
	/**
	 * 根据部门id查询log
	 * @param did
	 * @return
	 */
	public List<LogVO> findByDid(int did);
	
	/**
	 * 根据职位id
	 * @param rid
	 * @return
	 */
	public List<LogVO> findByRid(int rid);
	
	/**
	 * 根据部门id和职位id查询log
	 * @param did
	 * @param rid
	 * @return
	 */
	public List<LogVO> finds(int did,int rid);
	
}
