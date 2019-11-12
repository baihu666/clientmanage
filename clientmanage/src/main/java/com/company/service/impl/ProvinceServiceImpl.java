package com.company.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.company.dao.IProvinceDao;
import com.company.pojo.Province;
import com.company.service.IProvinceService;

@Service
public class ProvinceServiceImpl implements IProvinceService{

	@Autowired
	private IProvinceDao provinceDao;

	@Override
	public List<Province> findAll() {
		return provinceDao.findAll();
	}

	@Override
	public Province findObject(String provinceId) {
		return provinceDao.findObject(provinceId);
	}
	
	
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring.xml");
		IProvinceService iProvinceService= context.getBean(IProvinceService.class);
		System.out.println(iProvinceService.findAll().size());
		List<Province> list=iProvinceService.findAll();
		for (Province province : list) {
			System.out.println(province.getProvince());
		}
	}
}
