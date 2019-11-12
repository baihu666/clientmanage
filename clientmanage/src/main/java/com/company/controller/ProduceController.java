package com.company.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Order;
import com.company.pojo.Produce;
import com.company.pojo.ProduceKind;
import com.company.pojo.ProduceStatus;
import com.company.pojo.Record;
import com.company.pojo.vo.ProduceVO;
import com.company.service.IOrderService;
import com.company.service.IProduceKindService;
import com.company.service.IProduceService;
import com.company.service.IProduceStatusService;
import com.company.service.IRecordService;

/**
 * @author Vimi
 * @category 产品控制器
 */
@Controller
@RequestMapping("/produce")
public class ProduceController {

	@Resource
	private IProduceService produceService;
	@Resource
	private IProduceKindService produceKindService;
	@Resource
	private IProduceStatusService produceStatusService;
	@Resource
	private IRecordService recordService;
	@Resource
	private IOrderService orderService;

	// 查找全部产品列表
	@RequestMapping("/findlist")
	public String findList(Model model) {
		List<ProduceVO> list = produceService.findList();
		List<ProduceKind> kindlist = produceKindService.findList();
		List<ProduceStatus> statuslist = produceStatusService.findList();
		model.addAttribute("list", list);
		model.addAttribute("kindlist", kindlist);
		model.addAttribute("statuslist", statuslist);
		return "producelist";
	}

	// 根据产品id查找产品对象
	@RequestMapping("/findbyid")
	public String findById(Model model, int id) {
		Produce produce = produceService.findById(id);
		model.addAttribute("produce", produce);
		return "produceinfo";
	}

	// 根据产品名称模糊查询产品
	@RequestMapping("/findbyname")
	public String findByName(Model model, String name) {
		List<ProduceVO> list = produceService.findByName(name);
		List<ProduceKind> kindlist = produceKindService.findList();
		List<ProduceStatus> statuslist = produceStatusService.findList();
		model.addAttribute("list", list);
		model.addAttribute("kindlist", kindlist);
		model.addAttribute("statuslist", statuslist);
		return "producelist";
	}

	// 根据产品类别查询产品列表
	@RequestMapping("/findlistbykind")
	public String findListByKind(Model model, int kind) {
		List<ProduceVO> list = produceService.findListByKind(kind);
		List<ProduceKind> kindlist = produceKindService.findList();
		List<ProduceStatus> statuslist = produceStatusService.findList();
		model.addAttribute("list", list);
		model.addAttribute("kindlist", kindlist);
		model.addAttribute("statuslist", statuslist);
		return "producelist";
	}

	// 根据产品状态查询产品列表
	@RequestMapping("/findlistbystatus")
	public String findListByStatus(Model model, int statusid) {
		List<ProduceVO> list = produceService.findListByStatus(statusid);
		List<ProduceKind> kindlist = produceKindService.findList();
		List<ProduceStatus> statuslist = produceStatusService.findList();
		model.addAttribute("list", list);
		model.addAttribute("kindlist", kindlist);
		model.addAttribute("statuslist", statuslist);
		model.addAttribute("statusid", statusid);
		return "producelist";
	}

	// 进入添加产品页面
	@RequestMapping("/addproduce")
	public String addProduce(Model model) {
		List<ProduceKind> kindlist = produceKindService.findList();
		model.addAttribute("kindlist", kindlist);
		return "addproduce";
	}

	// 保存添加的产品
	@RequestMapping("/saveproduce")
	public String saveProduce(@Param("name") String name, @Param("price") String price, @Param("kind") int kind,
			@Param("desc") String desc, @Param("count") int count) {
		boolean flag = produceService.addProduce(name, price, kind, desc, count);
		if (flag) {
			return "redirect:findlist.action";
		} else {
			return "addproduce";
		}
	}

	// 修改产品信息
	@RequestMapping("/updateproduce")
	public String updateproduce(Model model, int id) {
		Produce produce = produceService.findById(id);
		List<ProduceKind> kindlist = produceKindService.findList();
		model.addAttribute("produce", produce);
		model.addAttribute("kindlist", kindlist);
		return "updateproduce";
	}

	// 保存修改的信息
	@RequestMapping("/saveupdate")
	public String saveProduceUpdate(@Param("id") int id, @Param("name") String name, @Param("price") String price,
			@Param("kind") int kind, @Param("desc") String desc, @Param("count") int count) {
		boolean flag = produceService.updateProduce(id, name, price, kind, desc, count);
		if (flag) {
			return "redirect:findlist.action";
		} else {
			return "updateproduce";
		}
	}

	// 删除产品
	@RequestMapping("/deleteproduce")
	public String deleteProduce(Model model, int[] ids) {
		boolean flag = false;
		if (ids!=null) {
			System.out.println(123);
			for (int id : ids) {
				List<Record> list = recordService.selectByPid(id);
				Order order = orderService.findByPid(id);
				if (list.size() == 0 && order == null) {
					flag = produceService.deleteProduce(ids);
				} else {
					String mess = "删除失败，此产品已被占用！";
					model.addAttribute("mess", mess);
					return "producelist";
				}
			}
		}
		if (flag) {
			return "redirect:findlist.action";
		} else {
			return "redirect:findlist.action";
		}
	}

	// 修改产品状态
	@RequestMapping("/updatestatus")
	public String updateStatus(@Param("id") int id, @Param("statusid") int statusid) {
		boolean flag = produceService.upateStatus(id, statusid);
		if (flag) {
			return "redirect:findlistbystatus.action?statusid="+statusid;
		} else {
			return "redirect:findbyid.action?id=" + id;
		}
	}

}
