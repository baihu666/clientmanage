package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IOrderDao;
import com.company.pojo.Order;
import com.company.service.IOrderService;

/**
 * @category 合同业务逻辑接口实现
 * @author zhangyang
 *
 */
@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderDao orderDao;

	@Override
	public List<Order> findAll() {
		return orderDao.findAll();
	}

	@Override
	public boolean insert(Order order) {
		return orderDao.insert(order) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return orderDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean updata(Order order) {
		return orderDao.update(order) > 0 ? true : false;
	}

	@Override
	public Order find(int id) {
		return orderDao.find(id);
	}

	@Override
	public Order findByPid(int pid) {
		return orderDao.findByPid(pid);
	}

}
