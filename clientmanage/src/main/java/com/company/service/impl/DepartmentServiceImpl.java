package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IDepartmentDao;
import com.company.pojo.Department;
import com.company.service.IDepartmentService;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	private IDepartmentDao departmentDao;

	@Override
	public List<Department> findAll() {
		return departmentDao.findAll();
	}

	@Override
	public Department find(int id) {
		return departmentDao.find(id);
	}

}
