package com.company.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.LogBo;
import com.company.pojo.Staff;
import com.company.service.ILogBoService;

@Controller
@RequestMapping("/logbo")
public class LogBoAction {
	@Resource
	private ILogBoService logBoService;

	@RequestMapping("/findall")
	public String findAll(Model model,HttpSession session) {
		Object obj = session.getAttribute("current_staff");
		Staff staff = (Staff)obj;
		int did = staff.getDepartment();
		if(did==8){
			int page = 1;
			int currPage;
			int i = logBoService.findAll1().size();
			if (i % 15 != 0) {
				currPage = i / 15 + 1;
			} else {
				currPage = i / 15;
			}
			List<LogBo> list = logBoService.findAll2(page, 15);
			model.addAttribute("list", list);
			model.addAttribute("currPage", currPage);
			model.addAttribute("page", page);
			return "logBolist";
		}else {
			return "404";
		}
		
	}

	@RequestMapping("/tiao")
	public String findAll2(int page, Model model) {
		int currPage;
		int i = logBoService.findAll1().size();
		if (i % 15 != 0) {
			currPage = i / 15 + 1;
		} else {
			currPage = i / 15;
		}
		List<LogBo> list = logBoService.findAll2(page, 15);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("currPage", currPage);
		return "logBolist";
	}

	@RequestMapping("/add")
	public String findAll3(int page, Model model) {
		int currPage;
		int i = logBoService.findAll1().size();
		if (i % 15 != 0) {
			currPage = i / 15 + 1;
		} else {
			currPage = i / 15;
		}
		if (currPage > page) {
			page++;
		} else {
			page = page;
		}
		List<LogBo> list = logBoService.findAll2(page, 15);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("currPage", currPage);
		return "logBolist";
	}
	@RequestMapping("/reduce")
	public String findAll4(int page, Model model) {
		int currPage;
		int i = logBoService.findAll1().size();
		if (i % 15 != 0) {
			currPage = i / 15 + 1;
		} else {
			currPage = i / 15;
		}
		if (page > 1) {
			page--;
		} else {
			page = page;
		}
		List<LogBo> list = logBoService.findAll2(page, 15);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("currPage", currPage);
		return "logBolist";
	}
}