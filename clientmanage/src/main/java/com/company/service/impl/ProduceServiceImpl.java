package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IProduceDao;
import com.company.dao.IProduceKindDao;
import com.company.pojo.Produce;
import com.company.pojo.ProduceKind;
import com.company.pojo.vo.ProduceVO;
import com.company.service.IProduceService;

/**
 * @author Vimi
 * @category 产品业务逻辑实现类
 */
@Service
public class ProduceServiceImpl implements IProduceService {
	
	@Autowired
	private IProduceDao produceDao;
	@Autowired
	private IProduceKindDao produceKindDao;

	public void change(List<Produce> list,List<ProduceVO> volist){
		for (Produce produce : list) {
			ProduceKind produceKind = produceKindDao.findById(produce.getKind());
			String kindname = produceKind.getName();
			ProduceVO vo = new ProduceVO(produce.getId(),produce.getName(),produce.getPrice(),produce.getKind(),kindname,produce.getDesc(),produce.getCount(),produce.getStatusid());
			volist.add(vo);
		}
		
	}
	
	@Override
	public List<ProduceVO> findList() {
		List<ProduceVO> volist = new ArrayList<ProduceVO>();
		List<Produce> list = produceDao.findList();
		change(list,volist);
		
		return volist;
	}

	@Override
	public Produce findById(int id) {
		return produceDao.findById(id);
	}
	
	@Override
	public List<ProduceVO> findByName(String name){
		List<ProduceVO> volist = new ArrayList<ProduceVO>();
		List<Produce> list = produceDao.findByName(name);
		change(list,volist);
		
		return volist;
	}

	@Override
	public List<ProduceVO> findListByKind(int kind) {
		List<ProduceVO> volist = new ArrayList<ProduceVO>();
		List<Produce> list = produceDao.findListByKind(kind);
		change(list,volist);
		
		return volist;
	}
	
	@Override
	public List<ProduceVO> findListByStatus(int statusid){
		List<ProduceVO> volist = new ArrayList<ProduceVO>();
		List<Produce> list = produceDao.findListByStatus(statusid);
		change(list,volist);
		
		return volist;
	}

	@Override
	public boolean addProduce(String name,String price,int kind,String desc,int count) {
		return produceDao.addProduce(name,price,kind,desc,count)>0?true:false;
	}

	@Override
	public boolean updateProduce(int id,String name,String price,int kind,String desc,int count) {
		return produceDao.updateProduce(id,name,price,kind,desc,count)>0?true:false;
	}

	@Override
	public boolean deleteProduce(int[] ids) {
		boolean flag = false;
		if(ids!=null&&!ids.equals("")){
			int i = produceDao.deleteProduce(ids);
			if(i>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public boolean upateStatus(int id, int statusid) {
		return produceDao.updateStatus(id, statusid)>0?true:false;
	}

}
