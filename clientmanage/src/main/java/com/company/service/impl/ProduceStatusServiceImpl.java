package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.IProduceStatusDao;
import com.company.pojo.ProduceStatus;
import com.company.service.IProduceStatusService;

/**
 * @author Vimi
 * @category 产品状态业务逻辑实现类
 */
@Service
public class ProduceStatusServiceImpl implements IProduceStatusService{
	
	@Resource
	private IProduceStatusDao produceStatusDao;

	@Override
	public List<ProduceStatus> findList() {
		return produceStatusDao.findList();
	}

}
