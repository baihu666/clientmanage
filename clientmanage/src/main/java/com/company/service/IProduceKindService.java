package com.company.service;

import java.util.List;

import com.company.pojo.ProduceKind;

/**
 * @author Vimi
 * @category 产品类别业务逻辑接口
 */
public interface IProduceKindService {
	
	public List<ProduceKind> findList();
	
	public ProduceKind findById(int id);
	
	public boolean addKind(ProduceKind produceKind);
	
	public boolean updateKind(ProduceKind produceKind);
	
	public boolean deleteKind(int[] ids);
}
