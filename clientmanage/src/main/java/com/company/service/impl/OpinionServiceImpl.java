package com.company.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IOpinionDao;
import com.company.pojo.Opinion;
import com.company.service.IOpinionService;

@Service
public class OpinionServiceImpl implements IOpinionService {
	
	@Autowired
	private IOpinionDao opinionDao;

	@Override
	public boolean addOpinion(Opinion opinion) {
		return opinionDao.addOpinion(opinion)>0?true:false;
	}

	@Override
	public List<Opinion> selectAll() {
		return opinionDao.selectAll();
	}

	@Override
	public Opinion find(int id) {
		return opinionDao.find(id);
		
	}

	
	
	

}
