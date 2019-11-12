package com.company.dao;

import java.util.List;

import com.company.pojo.ProduceStatus;

/**
 * @author Vimi
 * @category 产品状态数据访问接口
 */
public interface IProduceStatusDao {
	
	/**
	 * 查询产品状态列表
	 */
	public List<ProduceStatus> findList();
}
