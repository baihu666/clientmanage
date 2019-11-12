package com.company.service;

import java.util.List;

import com.company.pojo.Order;

/**
 * @category 合同订单业务逻辑接口
 * @author zhangyang
 *
 */

public interface IOrderService {
	/**
	 * 查询所有合同
	 * @return
	 */
	public List<Order> findAll();
	
	/**
	 * 添加合同
	 * @param order
	 * @return
	 */
	public boolean insert(Order order);
	
	/**
	 * 删除合同
	 * @param id
	 * @return
	 */
	public boolean delete(int id);
	
	/**
	 * @category 更新合同
	 * @param order
	 * @return
	 */
	public boolean updata(Order order);
	
	/**
	 * 根据订单编号查询合同
	 * @param id
	 * @return
	 */
	public Order find(int id);
	
	/**
	 * @param pid
	 * 
	 */
	public Order findByPid(int pid);
}
