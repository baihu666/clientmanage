package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.ILogBoDao;
import com.company.pojo.LogBo;
import com.company.service.ILogBoService;

@Service
public class LogBoServiceImpl implements ILogBoService {

	@Autowired
	private ILogBoDao logBoDao;

	@Override
	public boolean add(LogBo logBo) {
		return logBoDao.add(logBo) > 0 ? true : false;
	}

	@Override
	public List<LogBo> findAll2(int currPage, int pageSize) {
		int lastIndex;
		List<LogBo> list = logBoDao.findAll();
		int firstIndex = (currPage - 1) * pageSize;
		if ((currPage * pageSize) > (list.size())) {
			lastIndex = list.size();
		} else {
			lastIndex = currPage * pageSize;
		}
		return list.subList(firstIndex, lastIndex);
	}

	public List<LogBo> findAll1() {
		List<LogBo> list = logBoDao.findAll();
		return list;
	}
}
