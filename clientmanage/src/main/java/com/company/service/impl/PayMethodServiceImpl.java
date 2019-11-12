package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IPayMethodDao;
import com.company.pojo.PayMethod;
import com.company.service.IPayMethodService;

/**
 * @category 付款方式业务逻辑接口实现
 * @author zhangyang
 *
 */
@Service
public class PayMethodServiceImpl implements IPayMethodService{
	
	@Autowired
	private IPayMethodDao payMethodDao;

	@Override
	public List<PayMethod> findAll() {
		return payMethodDao.findAll();
	}

	@Override
	public PayMethod find(int id) {
		return payMethodDao.find(id);
	}
	
	
	
}
