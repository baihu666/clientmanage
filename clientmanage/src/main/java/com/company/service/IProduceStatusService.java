package com.company.service;

import java.util.List;

import com.company.pojo.ProduceStatus;

/**
 * @author Vimi
 * @category 产品状态业务逻辑接口
 */
public interface IProduceStatusService {
	
	public List<ProduceStatus> findList();
}
