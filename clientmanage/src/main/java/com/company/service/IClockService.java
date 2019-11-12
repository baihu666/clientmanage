package com.company.service;

import java.util.List;

import com.company.pojo.Clock;

/**
 * @author 白虎
 * @category 打卡业务逻辑接口
 */
public interface IClockService {
	public List<Clock> findAll();

	public Clock findById(Integer id);
}
