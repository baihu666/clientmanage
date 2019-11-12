package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Role;
import com.company.service.IRoleService;

/**
 * @author hzm
 * @category 职位
 */
@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private IRoleService roleService;

	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<Role> list = roleService.findAll();
		model.addAttribute("list", list);
		return "Role";

	}

	@RequestMapping("/findById")
	public String findById(int id, Model model) {
		Role role = roleService.findById(id);
		model.addAttribute("role", role);
		return "Role";

	}

}
