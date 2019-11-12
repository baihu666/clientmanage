package com.company.service;

import java.util.List;

import com.company.pojo.Opinion;

/**
 * @author Administrator
 * @category 意见service
 */
public interface IOpinionService {
	/**
	 * 增加意见选项
	 * @return
	 */
	public boolean addOpinion(Opinion opinion);
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
