package com.company.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.env.IDependent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.IDepartmentDao;
import com.company.dao.ILogDao;
import com.company.dao.IRoleDao;
import com.company.dao.IStaffDao;
import com.company.pojo.Log;
import com.company.pojo.Staff;
import com.company.pojo.vo.LogVO;
import com.company.service.ILogService;

@Service
public class LogServiceImpl implements ILogService {

	@Autowired
	private ILogDao logDao;
	@Autowired
	private IStaffDao staffDao;
	@Autowired
	private IDepartmentDao departmentDao;
	@Autowired
	private IRoleDao roleDao;
	
	@Override
	public List<LogVO> findAll() {
		return change(logDao.findAll());
	}

	@Override
	public List<LogVO> findByUid(String uid) {
		if (uid != null && !uid.equals("")) {
			int uid_int = Integer.valueOf(uid);
			return change(logDao.findByUid(uid_int));
		}
		return null;

	}
	
	@Override
	public List<LogVO> findByUid(int uid) {
		return change(logDao.findByUid(uid));
	}
	
	@Override
	public LogVO findById(String id) {
		if (id != null && !id.equals("")) {
			int id_int = Integer.valueOf(id);
			Log log = logDao.findById(id_int);
			int uid = log.getUid();
			Staff staff = staffDao.findById(uid);
			String uname = staff.getName();
			int did = staff.getDepartment();
			int rid = staff.getRole();
			String dname = departmentDao.find(did).getName();
			String rname = roleDao.findById(rid).getName();
			LogVO logVO = new LogVO(1,log.getId(),uname,dname,rname,log.getDatetime(),log.getContent());
			return logVO;
		}
		return null;
	}

	@Override
	public boolean add(Log log) {
		return logDao.add(log) > 0 ? true : false;
	}
	
	@Override
	public List<LogVO> findByDid(int did) {
		return change(logDao.findByDid(did));
	}

	@Override
	public List<LogVO> findByRid(int rid) {
		return change(logDao.findByRid(rid));
	}

	@Override
	public List<LogVO> finds(int did, int rid) {
		return change(logDao.finds(did, rid));
	}
	
	private List<LogVO> change(List<Log> list){
		List<LogVO> listvo = new ArrayList<>();
		int i = 1;
		for (Log log : list) {
			int uid = log.getUid();
			Staff staff = staffDao.findById(uid);
			String uname = staff.getName();
			int did = staff.getDepartment();
			int rid = staff.getRole();
			String dname = departmentDao.find(did).getName();
			String rname = roleDao.findById(rid).getName();
			LogVO logVO = new LogVO((i++),log.getId(),uname,dname,rname,log.getDatetime(),log.getContent());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH：mm:ss");
			String dateStr = sdf.format(log.getDatetime());
			logVO.setDateStr(dateStr);
			listvo.add(logVO);
		}		
		return listvo;
	}

	


}
