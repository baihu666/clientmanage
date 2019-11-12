package com.company.dao;

import java.util.List;

import com.company.pojo.LinkMan;

/**
 * @author xll
 * @category 联系人数据访问接口
 */
public interface ILinkManDao {

	/**
	 * 添加联系人
	 * @param linkMan
	 * @return
	 */
	public int addLinkMan(LinkMan linkMan);
	
	/**
	 * 根据联系人姓名查找对象
	 * @param name
	 * @return
	 */
	public List<LinkMan> find1(String name);
	
	/**
	 * 根据联系人电话查找对象
	 * @param phone
	 * @return
	 */
	public List<LinkMan> find2(String phone);
	
	/**
	 * 根据id查找
	 * @param id
	 * @return
	 */
	public LinkMan find3(int id);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<LinkMan> findAll();
	
	/**
	 * 更新
	 * @param linkMan
	 * @return
	 */
	public int update(LinkMan linkMan);
	
	public List<LinkMan> findByCid(int cid);
	
	public int delete(int[] ids);
}
