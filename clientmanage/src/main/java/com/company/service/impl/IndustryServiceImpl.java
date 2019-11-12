package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IIndustryDao;
import com.company.pojo.Industry;

import com.company.service.IIndustryService;

@Service
public class IndustryServiceImpl implements IIndustryService {

	@Autowired
	private IIndustryDao industryDao;

	@Override
	public Industry findById(int id) {
		return industryDao.findById(id);
	}

	@Override
	public List<Industry> findAll() {
		return industryDao.findAll();
	}

}
