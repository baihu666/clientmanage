package com.company.dao;

import java.util.List;

import com.company.pojo.PayDetail;

/**
 * @author xll
 * @category 付款细节数据访问层
 */ 
public interface IPayDetailDao {
	/**
	 * 增加付款细节
	 * @param payDetail
	 * @return
	 */
	public int addPayDetail(PayDetail payDetail);
	
	/**
	 * 根据付款id查找
	 * @param id
	 * @return
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
	public int update(PayDetail detail);
}
