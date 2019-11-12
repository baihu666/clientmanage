package com.company.dao;

import java.util.List;

import com.company.pojo.Opinion;

/**
 * @author 张游
 * @category 意见种类实体访问层dao
 */
public interface IOpinionDao {
	/**
	 * 增加意见选项
	 * @return
	 */
	public int addOpinion(Opinion opinion);
	/**
	 * 查询所有意见选项
	 * @return
	 */
	public List<Opinion> selectAll();
	
	/**
	 * 根据id查询意见
	 * @param id
	 * @return
	 */
	public Opinion find(int id);
}
