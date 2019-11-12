package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IStaffDao;
import com.company.pojo.Staff;
import com.company.service.IStaffService;

@Service
public class StaffServiceImpl implements IStaffService {

	@Autowired
	private IStaffDao staffDao;

	@Override
	public boolean addStaff(Staff staff) {
		return staffDao.addStaff(staff) > 0 ? true : false;
	}

	@Override
	public Staff find1(String registername, String password) {
		return staffDao.find1(registername, password);
	}

	@Override
	public Staff findById(int id) {
		return staffDao.findById(id);
	}

	@Override
	public List<Staff> findAll() {
		return staffDao.findAll();
	}

	@Override
	public boolean update(Staff staff) {
		Staff s = staffDao.findById(staff.getId());
		s.setCid(2);
		return staffDao.update(s) > 0 ? true : false;
	}
	@Override
	public List<Staff> findBydid(int department) {
		return staffDao.findBydid(department);
	}
}
