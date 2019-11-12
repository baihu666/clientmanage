package com.company.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Opinion;
import com.company.pojo.Order;
import com.company.service.IOpinionService;

@Controller
@RequestMapping("/")
public class OpinionController {

	private Logger logger = Logger.getLogger(OpinionController.class);

	@Autowired
	private IOpinionService opinionService;

	@RequestMapping("/addOpinion")
	public String addOpinion(Opinion opinion) {
		boolean flag = opinionService.addOpinion(opinion);
		if (flag) {
			return "Opinionlist";
		}
		return "Opinion";
	}

	@RequestMapping("/selectAll")
	public String selectAll(Model model) {
		List<Opinion> list = opinionService.selectAll();
		model.addAttribute("list", list);
		return "Opinionlist";
	}

	@RequestMapping("/find")
	public String find(int id, Model model) {
		Opinion opinion = opinionService.find(id);
		model.addAttribute("Opinion", opinion);
		return "Opinionlist";
	}
}
