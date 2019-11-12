package com.company.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.pojo.Record;
import com.company.pojo.vo.RecordVO;

/**
 * @author 张游
 * @category 客户跟踪业务逻辑层接口
 */
@Service
public interface IRecordService {
	/**
	 * 查询所有客户跟踪记录
	 * @return
	 */
	public List<Record> selectAll();
	public List<RecordVO> selectAll1();
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
	public List<RecordVO> selectBySid1(int sid);
	/**
	 * 根据部门did
	 * @param did
	 * @return 返回部门的所有跟踪记录
	 */
	public List<RecordVO> selectByDid(int did);
	public List<RecordVO> selectByDid1(int did);
	/**
	 * @根据节点查询
	 * @param point
	 * @return
	 */
	public List<RecordVO> selectByPoint(Record record);
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
	public boolean insert(Record record);
	
	/**
	 * 根据传入的Record更新用户
	 * @param record
	 * @return 受影响的行数
	 */
	public boolean update(Record record);
	/**
	 * 根据客户跟踪记录查询
	 * @param id
	 * @return 一条记录
	 */
	public Record selectOne(int id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
