package com.company.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSONArray;
import com.company.logger.OptionalLog;
import com.company.pojo.Client;
import com.company.pojo.Opinion;
import com.company.pojo.Record;
import com.company.pojo.vo.RecordVO;
import com.company.service.IClientService;
import com.company.service.IOpinionService;
import com.company.service.IRecordService;

/**
 * @author 张游
 *
 */
@Controller
@RequestMapping("/record")
public class RecordController {
	@Resource
	private IClientService clientService;
	@Resource
	private IRecordService recordService;
	@Resource
	private IOpinionService opinionService;
	@RequestMapping("/check")
	public @ResponseBody String check(@RequestBody String cid){
		System.out.println(cid);
		int intcid=(int)Integer.valueOf(cid);
		Client client=clientService.findById(intcid);
		System.out.println(client.getEid()+"");
		return client.getEid()+"";
	}
	// 到达添加客户跟踪记录页面
	@RequestMapping("/torecord")
	public String torecord() {
		System.out.println("jinru1111");
		return "torecord";
	}

	@RequestMapping(value = "/allOpinion", produces = { "text/html;charset=UTF-8;", "application/json;" })
	public @ResponseBody String allOpinion() {
		System.out.println(">>>>>>>>");
		List<Opinion> list = opinionService.selectAll();
		return JSONArray.toJSONString(list);
	}

	// 增加客户跟踪记录(cid:客户id,address,result,oid:意见id,doopinion,document,pid:相关产品)
	@RequestMapping("/insertrecord")
	public String insert(Record record,RedirectAttributes attr) {
		System.out.println(record);
		boolean flag = recordService.insert(record);
		System.out.println(flag);
		attr.addAttribute("sid",record.getSid());
		return "redirect:selectBySid.action";
	}
	//查询所有的跟踪记录
	
	@RequestMapping("/selectAll")
	public String selectAll(Model model) {
		System.out.println("进入查询");
		List<RecordVO> list = recordService.selectAll1();
		model.addAttribute("list", list);
		System.out.println(">>>>>>>>>>>>>>>");
		System.out.println(list.size());
		return "showrecord";
	}
	
	@RequestMapping("/selectByCid")
	public String selectByCid(int cid, Model model) {
		List<Record> list = recordService.selectByCid(cid);
		model.addAttribute("list", list);
		return "showrecord";
	}
	//根据员工id查询
	@RequestMapping("/selectBySid")
	public String selectBySid(int sid, Model model) {
		
		List<RecordVO> list = recordService.selectBySid1(sid);
		System.out.println(list.size());
		model.addAttribute("list", list);
		return "showrecord";
	}
	//领导根据部门id查询
	@RequestMapping("/selectByDid")
	public String selectByDid(int did, Model model) {
		System.out.println(">>>>>>>>>>>>>>>");
		List<RecordVO> list = recordService.selectByDid(did);
		model.addAttribute("list", list);
		System.out.println(">>>>>>>>>><<<<<<<<<<<<<<");
		return "dealrecord2";
	}
	@RequestMapping("/selectByDid1")
	public String selectByDid1(int did, Model model) {
		System.out.println(">>>>>>>>>>>>>>>");
		List<RecordVO> list = recordService.selectByDid1(did);
		model.addAttribute("list", list);
		System.out.println(">>>>>>>>>><<<<<<<<<<<<<<");
		return "dealrecord3";
	}
	
	
	//部门领导update
	@RequestMapping("/update1")
	public String update1(int rid,RedirectAttributes attr){
		Record record=recordService.selectOne(rid);
		record.setPoint(2);//节点看意见留到哪了
		record.setAddress("同意");//是否同意
		record.setDocument("2");//doucument 是审批状态
		boolean flag=recordService.update(record);
		System.out.println(flag);
		attr.addAttribute("did", record.getDid());
		return "redirect:selectByDid.action";
	}
	//部门领导update
		@RequestMapping("/update2")
		public String update2(int rid,RedirectAttributes attr){
			Record record=recordService.selectOne(rid);
			record.setPoint(3);//节点看意见留到哪了
			record.setAddress("同意");//是否同意
			record.setDocument("1");//doucument 是审批状态
			boolean flag=recordService.update(record);
			System.out.println(flag);
			attr.addAttribute("did", record.getDid());
			return "redirect:selectByDid.action";
		}
		//部门领导update
				@RequestMapping("/update3")
				public String update3(int rid,RedirectAttributes attr){
					Record record=recordService.selectOne(rid);
					record.setPoint(2);//节点看意见留到哪了
					record.setAddress("不同意");//是否同意
					record.setDocument("2");//doucument 是审批状态
					boolean flag=recordService.update(record);
					System.out.println(flag);
					attr.addAttribute("did", record.getDid());
					return "redirect:selectByDid.action";
				}
				//总经理UPdate
				@RequestMapping("/update4")
				public String update4(int rid,RedirectAttributes attr){
					Record record=recordService.selectOne(rid);
					record.setRemark("同意");//是否同意
					record.setDocument("2");//doucument 是审批状态
					System.out.println(">>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<");
					System.out.println(record);
					boolean flag=recordService.update(record);
					System.out.println(flag);
					attr.addAttribute("did", record.getDid());
					return "redirect:selectByPoint.action";
				}
				//总经理UPdate
				@RequestMapping("/update5")
				public String update5(int rid,RedirectAttributes attr){
					Record record=recordService.selectOne(rid);
					record.setRemark("不同意");//是否同意
					record.setDocument("2");//doucument 是审批状态
					System.out.println(">>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<");
					System.out.println(record);
					boolean flag=recordService.update(record);
					System.out.println(flag);
					attr.addAttribute("did", record.getDid());
					return "redirect:selectByPoint.action";
				}
	
	
	
	//总经理根据节点查询是否要审批
	@RequestMapping("/selectByPoint")
	public String selectByPoint(Model model){
		Record record=new Record();
		record.setPoint(3);
		record.setDocument("1");
		System.out.println("1");
		List<RecordVO> list = recordService.selectByPoint(record);
		model.addAttribute("list", list);
		System.out.println(list.size());
		return "dealrecord4";
	}
	//总经理查看审批过的文件

	//总经理根据节点查询是否要审批
	@RequestMapping("/selectByPoint1")
	public String selectByPoint1(Model model){
		Record record=new Record();
		record.setPoint(3);
		record.setDocument("2");
		System.out.println("1");
		List<RecordVO> list = recordService.selectByPoint(record);
		model.addAttribute("list", list);
		System.out.println(list.size());
		return "dealrecord4";
	}
	
	

	@RequestMapping("/selectByOid")
	public String selectByOid(int oid, Model model) {
		List<Record> list = recordService.selectByOid(oid);
		model.addAttribute("list", list);
		return "showrecord";
	}

	@RequestMapping("/selectByPid")
	public String selectByPid(int pid, Model model) {
		List<Record> list = recordService.selectByPid(pid);
		model.addAttribute("list", list);
		return "showrecord";
	}

	@RequestMapping("/toupdate")
	public String toupdate(int id, Model model) {
		Record record = recordService.selectOne(id);
		model.addAttribute("record", record);
		return "toupdate";
	}
	
	
	
	
	
	@OptionalLog(modules="客户跟踪记录", methods="更改进度")
	@RequestMapping("/update")
	public String update(Record record) {
		boolean flag = recordService.update(record);
		return "";
	}

}
