package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.LinkMan;
import com.company.service.ILinkManService;

@Controller
@RequestMapping("/linkman")
public class LinkmanController {
    
	@Autowired
	private ILinkManService linkmanService;
	
	@RequestMapping("/toadd")
	public String toadd(){
		return "addlinkman";
	}
	@RequestMapping("/add")
	public String add(LinkMan linkMan,Model model){
		linkmanService.addLinkMan(linkMan);
		int cid1=linkMan.getCid();
		return "redirect:findbyfid.action?cid="+cid1;
	}
	
	@RequestMapping("/findbyfid")
	public String findByclient(int cid,Model model){
		List<LinkMan> list= linkmanService.findByCid(cid);
		model.addAttribute("list", list);
		model.addAttribute("cid", cid);
		return "showlinkman";
	}
	
	@RequestMapping("/delete")
	public String delete(int[] ids, int cid,Model model){
		linkmanService.delete(ids);
		return "redirect:findbyfid.action?cid="+cid;
	}
}
