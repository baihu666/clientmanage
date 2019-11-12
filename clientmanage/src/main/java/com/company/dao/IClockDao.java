package com.company.dao;

import java.util.List;

import com.company.pojo.Clock;

/**
 * @author 白虎
 * @category 打开数据访问接口
 */
public interface IClockDao {
	/**
	 * 查询所有打卡状态
	 */
	public List<Clock> findAll();
	/**
	 * 根据id查询是否打卡
	 */
	public Clock findById(Integer id);
}
