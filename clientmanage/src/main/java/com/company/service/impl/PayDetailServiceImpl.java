package com.company.service.impl;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.IOrderDao;
import com.company.dao.IPayDetailDao;
import com.company.dao.IPayMethodDao;
import com.company.pojo.Order;
import com.company.pojo.PayDetail;
import com.company.pojo.PayMethod;
import com.company.service.IPayDetailService;

/**
 * @author 张游
 * @category 付款细节业务逻辑实现类
 */
@Service
public class PayDetailServiceImpl implements IPayDetailService {
	@Resource
	private IPayDetailDao payDetailDao;
	@Resource
	private IOrderDao orderDao;
	@Resource
	private IPayMethodDao payMethodDao;

	@Override
	public boolean addPayDetail(int oid) {
		int i = 0;
		Order order = orderDao.find(oid);
		System.out.println(order);
		PayMethod payMethod = payMethodDao.find(order.getPaymethod());
		if (payMethod.getNumber() != 0) {
			int money = Integer.valueOf(order.getTotalprice()) / payMethod.getNumber();
			Calendar cal = Calendar.getInstance();
			int month = cal.get(Calendar.MONTH);
			System.out.println(month);
			for (int j = 0; j < payMethod.getNumber(); j++) {
				PayDetail detail = new PayDetail();
				detail.setOid(oid);
				detail.setMoney(money);
				if (j == 0) {
					detail.setPaytime(new Date(System.currentTimeMillis()));
					detail.setSchemetime(new Date(System.currentTimeMillis()));
					detail.setStatus("结清");
				} else {
					detail.setStatus("未结清");
					month += 1;
					cal.set(Calendar.MONTH, month);
					detail.setSchemetime(new Date(cal.getTimeInMillis()));
				}
				i = payDetailDao.addPayDetail(detail);
			}
			return i > 0 ? true : false;
		} else {
			int money = Integer.valueOf(order.getTotalprice());
			PayDetail detail = new PayDetail();
			detail.setOid(oid);
			detail.setMoney(money);
			detail.setPaytime(new Date(System.currentTimeMillis()));
			detail.setSchemetime(new Date(System.currentTimeMillis()));
			detail.setStatus("结清");
			i = payDetailDao.addPayDetail(detail);
		}
		return i > 0 ? true : false;
	}

	@Override
	public PayDetail findById(int id) {
		return payDetailDao.findById(id);
	}

	@Override
	public List<PayDetail> findByOid(int oid) {

		return payDetailDao.findByOid(oid);
	}

	@Override
	public boolean update(PayDetail detail) {
		detail.setPaytime(new Date(System.currentTimeMillis()));
		return payDetailDao.update(detail) > 0 ? true : false;
	}

}
