package com.company.service;

import java.util.List;

import com.company.pojo.PayDetail;

/**
 * @author 张游
 * @category 付款细节业务逻辑层
 */
public interface IPayDetailService {
	/**
	 * 根据订单添加付款细节数组
	 * @param order
	 */
	public boolean addPayDetail(int oid);
	/**
	 * 根据id查询付款详情表具体项目
	 * @param id
	 * @return 详情对象
	 */
	public PayDetail findById(int id);

	/**
	 * 根据订单id获得付款对象
	 * @param oid
	 * @return
	 */
	public List<PayDetail> findByOid(int oid);
	/**
	 * 更新付款详情
	 * @param 
	 * @return 更新结果
	 */
	public boolean update(PayDetail detail);

}
