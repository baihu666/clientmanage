package com.company.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.logger.OptionalLog;
import com.company.pojo.Clock;
import com.company.pojo.Department;
import com.company.pojo.Role;
import com.company.pojo.Staff;
import com.company.service.IClockService;
import com.company.service.IDepartmentService;
import com.company.service.IRoleService;
import com.company.service.IStaffService;

/**
 * @author xll
 * @category 员工控制器
 */
@Controller
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private IStaffService staffService;
	
	@Autowired
	private IRoleService roleService;
	
	@Autowired
	private IDepartmentService departmentService;
	
	@Autowired
	private IClockService clockService;

	@RequestMapping("/toregist")
	public String toRegist(Model model) {
		List<Role> list1=roleService.findAll();
		model.addAttribute("list1", list1);
		
		List<Department> list2=departmentService.findAll();
		model.addAttribute("list2", list2);
		return "regist";
	}

	/* 注册控制器 */
	@RequestMapping("/regist")
	public String regist(Staff staff, Model model) {
		boolean flag = staffService.addStaff(staff);
		if (flag) {
			return "login";
		} else {
			String mes = "注册失败";
			model.addAttribute("mes", mes);
			return "regist";
		}
	}
	
	@RequestMapping("/tologin")
	public String toLogin() {

		return "login";
	}

	// 登录控制器
	@OptionalLog(modules="员工", methods="登录")
	@RequestMapping("/login")
	public String login(String registername, String password, HttpSession session, Model model) {
		Staff staff = staffService.find1(registername, password);
		if (staff != null) {
			session.setAttribute("current_staff", staff);
			Clock clock =  clockService.findById(staff.getCid());
			model.addAttribute("clock", clock);
			System.out.println("登录成功");
			return "index";
		} else {
			String mes = "登录失败";
			model.addAttribute("mes", mes);
			System.out.println("登录失败");
			return "404";
		}

	}

	// 查找控制器（id）
	@RequestMapping("/findById")
	public String findById(Integer id, Model model) {
		Staff staff = staffService.findById(id);
		model.addAttribute("staff", staff);
		return "findbyid";
	}

	// 查找控制器（all）
	@OptionalLog(modules="员工", methods="查询所有员工信息")
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<Staff> list = staffService.findAll();
		model.addAttribute("list", list);
		return "findall";
	}

}
