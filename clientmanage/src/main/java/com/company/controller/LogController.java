package com.company.controller;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.company.logger.OptionalLog;
import com.company.pojo.Department;
import com.company.pojo.Log;
import com.company.pojo.Role;
import com.company.pojo.Staff;
import com.company.pojo.vo.LogVO;
import com.company.service.IDepartmentService;
import com.company.service.ILogService;
import com.company.service.IRoleService;
import com.company.service.IStaffService;
import com.jspsmart.upload.Request;

@Controller
@RequestMapping("/log")
public class LogController {
	
	@Resource
	private ILogService logService;
	@Resource
	private IStaffService staffService;
	@Resource
	private IDepartmentService departmentService;
	@Resource
	private IRoleService roleService;
	
	@RequestMapping("/tologlist")
	public String tologlist(){
		return "loglist";
	}
	@RequestMapping(value="/findAll",produces = "text/html;charset=UTF-8;")
	public @ResponseBody void findAll(HttpServletResponse response,HttpSession session,Model model) throws IOException{
		List<LogVO> list = getlist(session, model);
		if (list!=null) {
			model.addAttribute("list", list);
			JSONObject json = new JSONObject();
			json.put("list", list);
			response.getWriter().print(json);
		} 
	}
	//筛选日志
	@RequestMapping(value="/setlist",produces = "text/html;charset=UTF-8;")
	
	public @ResponseBody void setlist(HttpServletRequest request ,HttpSession session,Model model,HttpServletResponse response) throws IOException{
		System.err.println("从函数进入");
		String uname = request.getParameter("uname");
		String dname = request.getParameter("dname");
		String rname = request.getParameter("rname");
		String date = request.getParameter("date");

		System.err.println("uname:"+uname);
		System.err.println("dname:"+dname);
		System.err.println("rname:"+rname);
		List<LogVO> list = getlist(session, model);
		System.out.println("63:"+list);
		List<LogVO> list1 = setlist(uname, dname, rname, date, list);
		//创建json对象
		JSONObject json = new JSONObject();
		json.put("list", list1);
		response.getWriter().print(json);
		
	}
	
	@RequestMapping("/findByUid")
	public String findByUid(String uid,Model model){
		List<LogVO> list = logService.findByUid(uid);
		model.addAttribute("list", list);
		return "rjwtest";
	}
	@OptionalLog(modules="操作日志", methods="查询操作日志")
	@RequestMapping("/findById")
	public String findById(String id,Map<String, Object> map ){
		LogVO log = logService.findById(id);
		map.put("log", log);
		return "loginfo";
	}
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "logadd";
	}
	
	@RequestMapping("/add")
	public String add(Log log,Model model){
		log.setDatetime(new Date());
		boolean flag = logService.add(log);
		if (flag) {
			return "redirect:tologlist.action";
		} else {
			return "404";
		}
		
	}
	@RequestMapping("/test")
	public String add(Date datetime,Model model){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(datetime);
		System.out.println(date);
		model.addAttribute("date", date);
		return "rjwtest";
	}
	//ajax人名列表
	@RequestMapping(value="/finduname",produces = "text/html;charset=UTF-8;")
	public @ResponseBody void findUname(HttpSession session,HttpServletResponse response) throws IOException{
		List<Staff> userlist = new ArrayList<>();
		int rid = rid(session);
		int did = did(session);
		int uid = uid(session);
		System.err.println(rid+"\t"+did+"\t"+uid);
		if (rid==3) {
			userlist = staffService.findAll();
		} else if(rid==2) {
			userlist = staffService.findBydid(did);
		}else {
			Staff staff = staffService.findById(uid);
			userlist.add(staff);
		}
		JSONObject json = new JSONObject();
		json.put("list", userlist);
		response.getWriter().print(json);
	}
	//ajax部门列表
	@RequestMapping(value="/finddname",produces = "text/html;charset=UTF-8;")
	public @ResponseBody void findDname(HttpSession session,HttpServletResponse response) throws IOException{
		List<Department> dlist = new ArrayList<>();
		int rid = rid(session);
		int did = did(session);
		System.err.println(rid+"\t"+did);
		if (rid==3) {
			dlist = departmentService.findAll();
		} else {
			Department department = departmentService.find(did);
			dlist.add(department);
		}
		JSONObject json = new JSONObject();
		json.put("list", dlist);
		response.getWriter().print(json);
	}
	//职位列表
	@RequestMapping(value="/findrname",produces = "text/html;charset=UTF-8;")
	public @ResponseBody void findRname(HttpSession session,HttpServletResponse response) throws IOException{
		List<Role> rlist = new ArrayList<>();
		int rid = rid(session);
		int did = did(session);
		System.err.println(rid+"\t"+did);
		if (rid==3) {
			rlist = roleService.findAll();
		} else {
			Role role1 = roleService.findById(1);
			Role role2 = roleService.findById(2);
			rlist.add(role1);
			rlist.add(role2);
		}
		JSONObject json = new JSONObject();
		json.put("list", rlist);
		response.getWriter().print(json);
	}
	//获得登录人名
	private int uid (HttpSession session){
		Object obj = session.getAttribute("current_staff");
		Staff staff = (Staff)obj;
		int uid = staff.getId();
		return uid;
	}
	
	//获得登录人部门id
	private int did(HttpSession session){
		Object obj = session.getAttribute("current_staff");
		Staff staff = (Staff)obj;
		int did = staff.getDepartment();
		return did;
	}
	//获得登录人职位id
	private int rid(HttpSession session){
		Object obj = session.getAttribute("current_staff");
		Staff staff = (Staff)obj;
		int rid = staff.getRole();
		return rid;
	}
	//根据权限，部门获得工作日志集合
	private List<LogVO> getlist(HttpSession session,Model model){
		Object obj = session.getAttribute("current_staff");
		List<LogVO> list = null;
		if (obj!=null) {
			Staff staff = (Staff)obj;
			int did = staff.getDepartment();//部门id
			int rid = staff.getRole();//职位id
			int uid = staff.getId();
			if (rid==3) {
				list = logService.findAll();
			} else if (rid==2) {
				list = logService.findByDid(did);
			}else {
				list = logService.findByUid(uid);
			}
		} else {
				return null;
		}
		
		return list;
	}
	
	//根据人名、部门名称、职位名称、日志时间筛选日志集合
	private List<LogVO> setlist(String uname,String dname,String rname,String datet,List<LogVO> listvo){
		List<LogVO> list1 = new ArrayList<LogVO>();
		for (LogVO logVO : listvo) {
			if (logVO.getUname().equals(uname)||logVO.getUname().equals("0")) {
				continue;
			} else {
				if (logVO.getDname().equals(dname)||logVO.getUname().equals("0")) {
					continue;
				} else {
					if (logVO.getRname().equals(rname)||logVO.getUname().equals("0")) {
						continue;
					} else {
						Date datetime = logVO.getDatetime();
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						String date = sdf.format(datetime);
						if (date.equals(datet)||logVO.getUname().equals("0")) {
							continue;
						} else {
							list1.add(logVO);
						}
					}
				}
				
			}
		}
		List<LogVO> list2 = new ArrayList<LogVO>();
		int i = list1.size();
		int j = 0;
		for (LogVO logVO : listvo) {
			int num = 0;
			j++;
			for (LogVO log1 : list1) {
				num++;
				if(logVO.getId()==log1.getId()){
					break;
				}
			}	
			if (num==i&&j!=listvo.size()) {

				list2.add(logVO);
			}
			
		}
		return list2;	
	}
}
