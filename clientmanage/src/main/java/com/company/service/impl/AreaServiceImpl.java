package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IAreaDao;
import com.company.pojo.Area;
import com.company.service.IAreaService;

/**
 * @author Administrator
 * @category 区业务逻辑实现类
 */
@Service
public class AreaServiceImpl implements IAreaService {
	@Autowired
	private IAreaDao areaDao;

	@Override
	public Area findObject(String areaId) {
		return areaDao.findObject(areaId);
	}

	@Override
	public List<Area> findAreasByCid(String cityId) {
		return areaDao.findAreasByCid(cityId);
	}
}
