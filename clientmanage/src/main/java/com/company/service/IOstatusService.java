package com.company.service;

import java.util.List;

import com.company.pojo.Ostatus;

/**
 * @author 张游
 * @category 订单状态业务层
 */
public interface IOstatusService {
	/**
	 * 根据id查询商品是否付完款状态
	 * 
	 * @param id
	 * @return 状态对象
	 */
	public Ostatus find(int id);
	/**
	 * 查询所有商品状态
	 * 
	 * @return 商品状态集合
	 */
	public List<Ostatus> findAll();
}
