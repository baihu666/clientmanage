package com.company.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Order;
import com.company.service.IOrderService;

/**
 * @category 合同订单控制器
 * @author zhangyang
 *
 */
@Controller
@RequestMapping("/toorder")
public class OrderController {

	private Logger logger = Logger.getLogger(OrderController.class);

	@Autowired
	private IOrderService orderService;
	
	//查询所有合同
	@RequestMapping("/list")
	public String findAll(Model model) {
		List<Order> list = orderService.findAll();
		model.addAttribute("list", list);
		return "order";

	}
	
	
	@RequestMapping("/add")
	public String add(){
		return "add";	
	}
	

	@RequestMapping("/addSave")
	public String insert(Order order) {
		boolean flag = orderService.insert(order);
		return "redirect:list.action";
		
	}

	//根据用户查合同
	@RequestMapping("/find")
	public String find(int id, Model model) {
		Order order = orderService.find(id);
		model.addAttribute("order", order);
		return "order";
	}
}
