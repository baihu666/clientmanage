package com.company.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.company.logger.OptionalLog;
import com.company.pojo.Area;
import com.company.pojo.City;
import com.company.pojo.Client;
import com.company.pojo.Province;
import com.company.pojo.Staff;
import com.company.pojo.vo.ClientVO;
import com.company.service.IAreaService;
import com.company.service.ICityService;
import com.company.service.IClientService;
import com.company.service.IProvinceService;


/**
 * @author xll
 * @category 客户控制器
 */
@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private IClientService clientService;
	
	@Autowired
	private IProvinceService provinceService;
	
	@Autowired
	private ICityService cityService;
	
	@Autowired
	private IAreaService areaService;
	
	Logger log=Logger.getLogger(ClientController.class);
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	@RequestMapping("/toadd")
	public String toAdd() {

		return "registclient";
	}

	// 添加客户控制器
	@RequestMapping("/add")
	public String add(Client client, Model model) {
		System.out.println(client);
		System.out.println("============");
		boolean flag = clientService.addClient(client);
		if (flag) {
			String mes = "添加成功";
			model.addAttribute("mes", mes);
			return "redirect:findall.action";
		} else {
			String mes = "添加失败";
			model.addAttribute("mes", mes);
			return "showClientList";
		}
	}

	// 根据客户名字模糊查找
	@OptionalLog(modules="客户",methods="根据姓名查询")
	@RequestMapping("/findbyname")
	public String findByName(String name, Model model) {
		List<Client> list = clientService.find1(name);
		model.addAttribute("list", list);
		return "findList1";
	}

	// 根据联系人编号模糊查找
	@OptionalLog(modules="客户",methods="根据客户联系人查询")
	@RequestMapping("/findbybid")
	public String findByFid(int fid, Model model) {
		List<Client> list = clientService.find2(fid);
		model.addAttribute("list", list);
		return "findlist2";
	}

	// 根据员工编号查找
	@OptionalLog(modules="客户",methods="根据员工编号查询")
	@RequestMapping("/findbyeid")
	public String findByEid(int eid, Model model) {
		List<ClientVO> list = clientService.find3(eid);
		model.addAttribute("list", list);
		return "findlist3";
	}

	// 根据数组删除
	@OptionalLog(modules="客户",methods="删除若干用户")
	@RequestMapping("/deleteclient")
	public String delete(int[] ids) {
		System.out.println(ids);
		 int[] ids1=ids;
		 for (int i : ids1) {
			System.out.println(i);
		}
		boolean flag=clientService.delete(ids);
		return "redirect:findall.action";
	}
	@RequestMapping("/toupdate")
    public String toUpdate(int id,Model model){
		
		Client client= clientService.findById(id);
		Province province= provinceService.findObject(client.getProvinceId()) ;
		City city=cityService.findObject(client.getCityId());
		Area area=areaService.findObject(client.getAreaId());
		
		model.addAttribute("client", client);
		model.addAttribute("province", province);
		model.addAttribute("city", city);
		model.addAttribute("area", area);
		return "updateclient";
	}
	
	// 更新客户信息
	@OptionalLog(modules="客户",methods="更新用户信息")
	@RequestMapping("/update")
	public String update(Client client, Model model) {
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
		boolean flag = clientService.update(client);
		if (flag) {
			String mes = "更新成功";
			model.addAttribute("mes", mes);
			return "redirect:findall.action";
		} else {
			String mes = "更新失败";
			model.addAttribute("mes", mes);
			return "redirect:findall.action";
		}
	}

	// 查询所有客户
	@OptionalLog(modules="客户",methods="查询所有用户")
	@RequestMapping("/findall")
	public String findAll(HttpSession session, Model model) {
		Object obj = session.getAttribute("current_staff");
		if (obj != null) {
			Staff staff = (Staff) obj;
			if (staff.getId() == 1) {
				List<ClientVO> list = clientService.findAll();
				model.addAttribute("list", list);
				return "showclientlist";
			} else {
				List<ClientVO> list = clientService.find3(staff.getId());
				model.addAttribute("list", list);
				return "showclientlist";
			}
		} else {
			String mes = "请登录";
			model.addAttribute("mes", mes);
			return "login";
		}

	}
}
