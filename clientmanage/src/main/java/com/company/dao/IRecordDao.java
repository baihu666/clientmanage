package com.company.dao;

import java.util.List;

import com.company.pojo.Record;

/**
 * @author 张游
 * @category 客户跟踪数据访问dao
 */
public interface IRecordDao {
	/**
	 * 查询所有客户跟踪记录
	 * @return
	 */
	public List<Record> selectAll();
	/**
	 * 根据客户cid查询该客户的所有跟踪记录
	 * @return
	 */
	public List<Record> selectByCid(int cid);
	/**
	 * 根据员工sid
	 * @param sid
	 * @return 返回该员工的所有跟踪记录
	 */
	public List<Record> selectBySid(int sid);
	/**
	 * 根据部门did
	 * @param did
	 * @return 返回部门的所有跟踪记录
	 */
	public List<Record> selectByDid(int did);
	public List<Record> selectByDid1(int did);
	/**
	 * @根据节点查询
	 * @param point
	 * @return
	 */
	public List<Record> selectByPoint(Record record);
	/**
	 * 根据意见种类oid
	 * @return 返回该种类意见的所有跟踪记录
	 */
	public List<Record> selectByOid(int oid);
	/**
	 * 跟据商品pid
	 * @param pid
	 * @return 查询关于所有关于该商品的跟踪记录
	 */
	public List<Record> selectByPid(int pid);
	/**
	 * 根据传入的record，完成添加客户跟踪记录的功能
	 * @param record
	 * @return 影响的行数
	 */
	public int insert(Record record);
	/**
	 * 根据传入的Record更新用户
	 * @param record
	 * @return 受影响的行数
	 */
	public int update(Record record);
	/**
	 * 根据客户跟踪记录查询
	 * @param id
	 * @return 一条记录
	 */
	public Record selectOne(int id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
