package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.dao.IStatusDao;
import com.company.pojo.Status;
import com.company.service.IStatusService;

@Service
public class StatusServiceImpl implements IStatusService {

	@Autowired
	private IStatusDao statusDao;

	@Override
	public Status findById(int id) {
		return statusDao.findById(id);
	}

	@Override
	public List<Status> findAll() {
		return statusDao.findAll();
	}

}
