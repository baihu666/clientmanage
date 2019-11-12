package com.company.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.ProduceKind;
import com.company.service.IProduceKindService;

/**
 * @author Vimi
 * @category 产品类别控制器
 */
@Controller
@RequestMapping("/kind")
public class ProduceKindController {

	@Resource
	private IProduceKindService produceKindService;

	@RequestMapping("/kindlist")
	public String kindList(Model model) {
		List<ProduceKind> list = produceKindService.findList();
		model.addAttribute("list", list);
		return "kindlist";
	}

	@RequestMapping("/addkind")
	public String addKind() {
		return "addkind";
	}

	@RequestMapping("/savekind")
	public String saveKind(Model model, ProduceKind produceKind) {
		boolean flag = produceKindService.addKind(produceKind);
		if (flag) {
			return "redirect:kindlist.action";
		} else {
			return "addproduce";
		}
	}

	@RequestMapping("/updatekind")
	public String updateKind(Model model,int id) {
		ProduceKind produceKind = produceKindService.findById(id);
		model.addAttribute("produceKind",produceKind);
		return "updatekind";
	}

	@RequestMapping("/saveupdate")
	public String saveUpdate(Model model, ProduceKind produceKind) {
		boolean flag = produceKindService.updateKind(produceKind);
		if (flag) {
			return "redirect:kindlist.action";
		} else {
			return "updatekind";
		}
	}

	@RequestMapping("/deletekind")
	public String delete(int[] ids) {
		produceKindService.deleteKind(ids);
		return "redirect:kindlist.action";
	}
}
