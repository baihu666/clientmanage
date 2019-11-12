package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IClockDao;
import com.company.pojo.Clock;
import com.company.service.IClockService;

/**
 * @author 白虎
 * @category 打卡业务逻辑实现
 */
@Service
public class ClockService implements IClockService {

	@Autowired
	private IClockDao clockDao;

	@Override
	public List<Clock> findAll() {
		List<Clock> list = clockDao.findAll();
		return list;
	}

	@Override
	public Clock findById(Integer id) {
		Clock clock = clockDao.findById(id);
		return clock;
	}
	
	
}
