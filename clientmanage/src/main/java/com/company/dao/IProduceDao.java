package com.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Produce;

/**
 * @author Vimi
 * @category 产品数据访问接口
 */
public interface IProduceDao {
	
	/**
	 * 查询所有产品
	 * @return 产品列表集合
	 */
	public List<Produce> findList();
	
	/**
	 * @param id
	 * 根据产品id查找产品对象
	 */
	public Produce findById(int id);
	
	/**
	 * @param name
	 * 根据产品名称模糊查询
	 */
	public List<Produce> findByName(String name);
	
	/**
	 * @param kind
	 * 根据产品类别查询产品列表
	 */
	public List<Produce> findListByKind(int kind);
	
	/**
	 * @param statusid
	 * 根据产品状态查询产品列表
	 */
	public List<Produce> findListByStatus(int statusid);
	
	/**
	 * @param produce
	 * 添加产品
	 */
	public int addProduce(@Param("name") String name,@Param("price") String price,@Param("kind") int kind,@Param("desc") String desc,@Param("count") int count);
	
	/**
	 * @param produce
	 * 修改产品
	 */
	public int updateProduce(@Param("id") int id,@Param("name") String name,@Param("price") String price,@Param("kind") int kind,@Param("desc") String desc,@Param("count") int count);
	
	/**
	 * @param ids
	 * 删除产品
	 */
	public int deleteProduce(int[] ids);
	
	/**
	 * @param id
	 * @param statusid
	 * 根据产品id修改产品的状态
	 */
	public int updateStatus(@Param("id") int id,@Param("statusid") int statusid);
	
	
}
