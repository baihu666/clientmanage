package com.company.service;

import java.util.List;

import com.company.pojo.Client;
import com.company.pojo.vo.ClientVO;

public interface IClientService {
	/**
	 * 添加客户
	 * @return 客户
	 */
	public boolean addClient(Client client);
	
	/**
	 * 根据id查找
	 * @param id
	 * @return
	 */
	public Client findById(int id);
	
	/**
	 * 根据名字查找
	 * @param name
	 * @return
	 */
	public List<Client> find1(String name);
	
	/**
	 * 根据联系人fid查找
	 * @param name
	 * @return
	 */
	public List<Client> find2(int fid);
	
	/**
	 * 根据员工编号查找
	 * @param eid
	 * @return
	 */
	public List<ClientVO> find3(int eid);
	
	/**
	 * 根据数组删除
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);
	
	/**
	 * 更新客户信息
	 * @param client
	 * @return
	 */
	public boolean update(Client client);
	
	/**
	 * 查询所有客户
	 * @return
	 */
	public List<ClientVO> findAll();
	
}
