package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.IOstatusDao;
import com.company.pojo.Ostatus;
import com.company.service.IOstatusService;

@Service
public class OstatusServiceImpl implements IOstatusService {
	@Resource
	private IOstatusDao ostatusDao;

	@Override
	public Ostatus find(int id) {
		return ostatusDao.find(id);
	}

	@Override
	public List<Ostatus> findAll() {
		return ostatusDao.findAll();
	}

}
