package com.company.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.company.dao.ICityDao;
import com.company.pojo.City;
import com.company.pojo.Province;
import com.company.service.ICityService;
import com.company.service.IProvinceService;

@Service
public class CityServiceImpl implements ICityService {

	@Autowired
	private ICityDao cityDao;

	@Override
	public List<City> findCitiesByPid(String provinceId) {
		return cityDao.findCitiesByPid(provinceId);
	}

	@Override
	public City findObject(String cityId) {
		return cityDao.findObject(cityId);
	}
	
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring.xml");
		ICityService iProvinceService= context.getBean(ICityService.class);
		System.out.println(iProvinceService.findCitiesByPid("210000"));
		List<City> list1=iProvinceService.findCitiesByPid("210000");
		for (City city : list1) {
			System.out.println(city.getCity());
		}
	}
	
	
}
