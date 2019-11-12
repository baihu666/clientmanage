package com.company.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.PayMethod;
import com.company.service.IPayMethodService;

@Controller
@RequestMapping("/pay")
public class PayMethodController {
	private Logger logger = Logger.getLogger(PayMethodController.class);
	
	@Autowired
	private IPayMethodService payMethodService;
	
	@RequestMapping("/findAll")
	public String findAll(Model model){
		List<PayMethod> list = payMethodService.findAll();
		model.addAttribute("list", list);
		return "PayMethod";
	}
	
	@RequestMapping("/find")
	public String find(int id,Model model){
		PayMethod payMethod = payMethodService.find(id);
		model.addAttribute("payMethod", payMethod);
		return "PayMethod";
		
	}
}
