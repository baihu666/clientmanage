package com.company.service;

import java.util.List;

import com.company.pojo.PayMethod;

/**
 * @category 付款方式业务逻辑接口
 * @author zhangyang
 *
 */

public interface IPayMethodService {
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
