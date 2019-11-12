package com.company.dao;


import java.util.List;

import com.company.pojo.Client;

/**
 * @author xll
 * @category 客户数据访问接口
 */
public interface IClientDao {
	

	/**
	 * 添加客户
	 * @return 客户
	 */
	public int addClient(Client client);
	
	/**
	 * 根据id查找
	 * @param id
	 * @return
	 */
	public Client findById(int id);
	
	/**
	 * 根据名字模糊查找
	 * @param name
	 * @return
	 */
	public List<Client> find1(String name);
	
	/**
	 * 根据联系人fid模糊查找
	 * @param name
	 * @return
	 */
	public List<Client> find2(int fid);
	
	/**
	 * 根据员工编号查找
	 * @param eid
	 * @return
	 */
	public List<Client> find3(int eid);
	
	/**
	 * 根据数组删除
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);
	
	/**
	 * 更新客户信息
	 * @param client
	 * @return
	 */
	public int update(Client client);
	
	/**
	 * 查询所有客户
	 * @return
	 */
	public List<Client> findAll();
	
}
