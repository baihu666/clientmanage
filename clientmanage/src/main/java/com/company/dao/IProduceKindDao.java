package com.company.dao;

import java.util.List;

import com.company.pojo.ProduceKind;

/**
 * @author Vimi
 * @category 产品类别数据访问接口
 */
public interface IProduceKindDao {
	
	/**
	 * 查找产品类别列表
	 */
	public List<ProduceKind> findList();
	
	/**
	 * @param id
	 * 根据id返回产品类别对象
	 */
	public ProduceKind findById(int id);
	
	/**
	 * @param produceKind
	 * 添加产品类别
	 */
	public int addKind(ProduceKind produceKind);
	
	/**
	 * @param produceKind
	 * 修改产品类别
	 */
	public int updateKind(ProduceKind produceKind);
	
	/**
	 * @param ids
	 * 删除产品类别
	 */
	public int deleteKind(int[] ids);
}
