package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.ILinkManDao;
import com.company.pojo.LinkMan;

import com.company.service.ILinkManService;

@Service
public class LinkManServiceImpl implements ILinkManService {

	@Autowired
	private ILinkManDao iLinkDao;

	@Override
	public boolean addLinkMan(LinkMan linkMan) {
		return iLinkDao.addLinkMan(linkMan) > 0 ? true : false;
	}

	@Override
	public List<LinkMan> find1(String name) {
		return iLinkDao.find1(name);
	}

	@Override
	public List<LinkMan> find2(String phone) {
		return iLinkDao.find2(phone);
	}

	@Override
	public LinkMan find3(int id) {
		return iLinkDao.find3(id);
	}

	@Override
	public List<LinkMan> findAll() {
		return iLinkDao.findAll();
	}

	@Override
	public boolean update(LinkMan linkMan) {
		return iLinkDao.update(linkMan) > 0 ? true : false;
	}

	@Override
	public List<LinkMan> findByCid(int cid) {
		return iLinkDao.findByCid(cid);
	}

	@Override
	public boolean delete(int[] ids) {
		return iLinkDao.delete(ids)>0?true:false;
	}

}
