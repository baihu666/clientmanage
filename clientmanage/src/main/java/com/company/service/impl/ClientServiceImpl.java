package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.dao.IAreaDao;
import com.company.dao.ICityDao;
import com.company.dao.IClientDao;
import com.company.dao.IIndustryDao;
import com.company.dao.IProvinceDao;
import com.company.dao.IStaffDao;
import com.company.dao.IStatusDao;
import com.company.pojo.Area;
import com.company.pojo.City;
import com.company.pojo.Client;
import com.company.pojo.Industry;
import com.company.pojo.Province;
import com.company.pojo.Staff;
import com.company.pojo.Status;
import com.company.pojo.vo.ClientVO;
import com.company.service.IClientService;

/**
 * @author xll
 * @category 客户业务逻辑实现类
 */
@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientDao iclientDao;
	
	@Autowired 
	private IStaffDao staffDao;
	
	@Autowired
	private IIndustryDao industryDao;
	
	@Autowired
	private IProvinceDao provinceDao;
	
	@Autowired
	private ICityDao cityDao;
	
	@Autowired 
	private IAreaDao areaDao;
	
	@Autowired
	private IStatusDao statusDao;
	
	
	@Override
	public boolean addClient(Client client) {

		return iclientDao.addClient(client) > 0 ? true : false;
	}

	@Override
	public List<Client> find1(String name) {
		return iclientDao.find1(name);
	}

	@Override
	public List<Client> find2(int fid) {
		return iclientDao.find2(fid);
	}

	@Override
	public boolean delete(int[] ids) {
		return iclientDao.delete(ids) > 0 ? true : false;
	}

	@Override
	public boolean update(Client client) {

		return iclientDao.update(client) > 0 ? true : false;
	}

	@Override
	public List<ClientVO> findAll() {
		List<ClientVO> list=new ArrayList<ClientVO>();
		List<Client> list1= iclientDao.findAll();;
		for (Client client : list1) {
			ClientVO clientVO=change(client);
			list.add(clientVO);
		}
		return list;
	}
	

	@Override
	public List<ClientVO> find3(int eid) {
		List<ClientVO> list=new ArrayList<ClientVO>();
		List<Client> list1= iclientDao.find3(eid);
		for (Client client : list1) {
			ClientVO clientVO=change(client);
			list.add(clientVO);
		}
		return list;
	}

	@Override
	public Client findById(int id) {
		return iclientDao.findById(id);
	}
    
	private ClientVO change(Client client){
		Staff staff= staffDao.findById(client.getEid());
		Industry industry=industryDao.findById(client.getIid());
		Province province=provinceDao.findObject(client.getProvinceId());
		City city=cityDao.findObject(client.getCityId());
		Area area=areaDao.findObject(client.getAreaId());
		
	    Status status=statusDao.findById(client.getSid());
	    ClientVO clientVO=new ClientVO(client.getId(), client.getName(), client.getEid(), staff.getName(), client.getNextdate(), client.getIid(), industry.getName(), client.getProvinceId(), province.getProvince(), client.getAreaId(), area.getAreas(), client.getCityId(), city.getCity(), client.getSource(), client.getLevel(),  client.getSid(), status.getName());
		return clientVO;
	}
}
