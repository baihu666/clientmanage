package com.company.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.IRecordDao;
import com.company.pojo.Client;
import com.company.pojo.Department;
import com.company.pojo.Opinion;
import com.company.pojo.Produce;
import com.company.pojo.Record;
import com.company.pojo.Staff;
import com.company.pojo.vo.RecordVO;
import com.company.service.IClientService;
import com.company.service.IDepartmentService;
import com.company.service.IOpinionService;
import com.company.service.IProduceService;
import com.company.service.IRecordService;
import com.company.service.IStaffService;

@Service
public class RecordServiceImpl implements IRecordService {
	@Resource
	private IRecordDao recordDao;
	@Resource
	private IClientService clientService;
	@Resource
	private IStaffService staffService;
	@Resource
	private IOpinionService opinionService;
	@Resource
	private IProduceService produceService;
	@Resource
	private IDepartmentService departmentService;
	@Override
	public List<Record> selectAll() {
		return recordDao.selectAll();
	}
	public List<RecordVO> selectAll1(){
		List<RecordVO> list1=new ArrayList<RecordVO>();
		List<Record> list=recordDao.selectAll();
		for (Record record : list) {
			RecordVO recordVO=change(record);
			System.out.println(recordVO);
			list1.add(recordVO);
		}
		return list1;
	}
	private RecordVO change(Record record) {
		Client client=clientService.findById(record.getCid());
		Staff staff1=staffService.findById(record.getSid());
		Opinion opinion1=opinionService.find(record.getOid());
		Produce produce=produceService.findById(record.getPid());
		Department department1=departmentService.find(record.getDid());
		RecordVO recordVO=new RecordVO(record.getId(),client.getName(), client.getId(), opinion1.getName(), staff1.getName(), staff1.getId(), record.getDoopinion(), department1.getName(), record.getRecordtime(), produce.getName(), ""+produce.getId(), record.getAddress(), record.getRemark(),record.getDocument(),record.getPoint());
		return recordVO;
	}
	@Override
	public List<Record> selectByCid(int cid) {
		return recordDao.selectByCid(cid);
	}

	@Override
	public List<Record> selectBySid(int sid) {
		return recordDao.selectBySid(sid);
	}

	public List<RecordVO> selectBySid1(int sid) {
		List<RecordVO> list1=new ArrayList<RecordVO>();
		List<Record> list=recordDao.selectBySid(sid);
		for (Record record : list) {
			RecordVO recordVO=change(record);
			System.out.println(recordVO);
			list1.add(recordVO);
		}
		return list1;
	}
	@Override
	public List<RecordVO> selectByDid(int did) {
		List<RecordVO> list1=new ArrayList<RecordVO>();
		List<Record> list=recordDao.selectByDid(did);
		for (Record record : list) {
			RecordVO recordVO=change(record);
			System.out.println(recordVO);
			list1.add(recordVO);
		}
		return list1;
	}

	@Override
	public List<Record> selectByOid(int oid) {
		return recordDao.selectByOid(oid);
	}

	@Override
	public List<Record> selectByPid(int pid) {
		return recordDao.selectByPid(pid);
	}

	@Override
	public boolean insert(Record record) {
		System.out.println(record);
		Client client = clientService.findById(record.getCid());
		System.out.println(client.getEid());
		Staff staff = staffService.findById(client.getEid());
		record.setSid(staff.getId());
		System.out.println(staff.getId());
		record.setDid(staff.getDepartment());
		System.out.println(staff.getDepartment());
		record.setRecordtime(new Date(System.currentTimeMillis()));
		System.out.println(record);
		return recordDao.insert(record) > 0 ? true : false;
	}
	@Override
	public boolean update(Record record) {
		System.out.println(">>>>>>>>>>>>>>>>>>");
		System.out.println(record);
		return recordDao.update(record) > 0 ? true : false;
	}

	@Override
	public Record selectOne(int id) {
		return recordDao.selectOne(id);
	}

	@Override
	public List<RecordVO> selectByPoint(Record record) {
		List<RecordVO> list1=new ArrayList<RecordVO>();
		List<Record> list=recordDao.selectByPoint(record);
		System.out.println("<<<<<<<<<<<<");
		System.out.println(list.size());
		System.out.println("<<<<<<<<<<<<,,，，，");
		for (Record record1 : list) {
			RecordVO recordVO=change(record1);
			System.out.println(recordVO);
			list1.add(recordVO);
		}
		return list1;
		
		
		
		
	}
	@Override
	public List<RecordVO> selectByDid1(int did) {
		List<RecordVO> list1=new ArrayList<RecordVO>();
		List<Record> list=recordDao.selectByDid1(did);
		for (Record record : list) {
			RecordVO recordVO=change(record);
			System.out.println(recordVO);
			list1.add(recordVO);
		}
		return list1;
	}

}
