package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.IProduceKindDao;
import com.company.pojo.ProduceKind;
import com.company.service.IProduceKindService;

/**
 * @author Vimi
 * @category 产品类别业务逻辑实现类
 */
@Service
public class ProduceKindServiceImpl implements IProduceKindService{
	
	@Resource
	private IProduceKindDao produceKindDao;

	@Override
	public List<ProduceKind> findList() {
		return produceKindDao.findList();
	}

	@Override
	public ProduceKind findById(int id) {
		return produceKindDao.findById(id);
	}

	@Override
	public boolean addKind(ProduceKind produceKind) {
		return produceKindDao.addKind(produceKind)>0?true:false;
	}

	@Override
	public boolean updateKind(ProduceKind produceKind) {
		return produceKindDao.updateKind(produceKind)>0?true:false;
	}

	@Override
	public boolean deleteKind(int[] ids) {
		boolean flag = false;
		if(ids!=null&&!ids.equals("")){
			int i = produceKindDao.deleteKind(ids);
			if(i>0){
				flag = true;
			}
		}
		return flag;
	}
}
