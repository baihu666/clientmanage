package com.company.dao;

import java.util.List;

import com.company.pojo.Order;

/**
 * @category 合同订单数据访问接口
 * @author zhangyang
 *
 */
public interface IOrderDao {
	/**
	 * @category 查询所有合同
	 * @return
	 */
	public List<Order> findAll();

	/**
	 * @category 根据订单信息，产品信息增加合同
	 * @param order
	 * @param produce
	 * @return
	 */
	public int insert(Order order);

	/**
	 * @category 根据订单id删除合同订单
	 * @param id
	 * @return
	 */
	public int delete(int id);

	/**
	 * @category 根据合同id更新合同
	 * @param id
	 * @return
	 */
	public int update(Order order);

	/**
	 * @category 根据合同编号查询合同
	 * @param id
	 * @param cid
	 * @return
	 */
	public Order find(int id);
	
	/**
	 * @param pid
	 * 根据pid查找合同
	 */
	public Order findByPid(int pid);

}
