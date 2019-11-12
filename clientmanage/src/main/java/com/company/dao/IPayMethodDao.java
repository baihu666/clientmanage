package com.company.dao;

import java.util.List;

import com.company.pojo.PayMethod;

/**
 * @category 付款方式数据接口
 * @author zhangyang
 *
 */

public interface IPayMethodDao {
	/**
	 * @category 查询所有付款方式
	 * @return
	 */
	public List<PayMethod> findAll();
	
	/**
	 * @category 根据id查找付款方式
	 * @param id
	 * @return
	 */
	public PayMethod find(int id);
	
	
}
