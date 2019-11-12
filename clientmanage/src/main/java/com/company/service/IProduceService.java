package com.company.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Produce;
import com.company.pojo.vo.ProduceVO;

/**
 * @author Vimi
 * @category 产品业务逻辑层
 */
public interface IProduceService {
	
	public List<ProduceVO> findList();
	
	public Produce findById(int id);
	
	public List<ProduceVO> findByName(String name);
	
	public List<ProduceVO> findListByKind(int kind);
	
	public List<ProduceVO> findListByStatus(int statusid);
	
	public boolean addProduce(@Param("name") String name,@Param("price") String price,@Param("kind") int kind,@Param("desc") String desc,@Param("count") int count);
	
	public boolean updateProduce(@Param("id") int id,@Param("name") String name,@Param("price") String price,@Param("kind") int kind,@Param("desc") String desc,@Param("count") int count);
	
	public boolean deleteProduce(int[] ids);
	
	public boolean upateStatus(@Param("id") int id,@Param("statusid") int statusid);
}
