package com.company.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.logger.OptionalLog;
import com.company.pojo.Order;
import com.company.pojo.PayDetail;
import com.company.pojo.PayMethod;
import com.company.service.IOrderService;
import com.company.service.IPayDetailService;
import com.company.service.IPayMethodService;

/**
 * @author 张游
 * @category 付款细节控制器
 */
@Controller
@RequestMapping("/opaydetail")
public class PayDetailController {
	@Resource
	private IPayDetailService payDetailService;
	@Resource
	private IOrderService orderService;
	@Resource
	private IPayMethodService payMethodService;
	@OptionalLog(modules="支付详情",methods="查询制度进度")
	@RequestMapping("/findByOid")
	public String findByOid(int oid,Model model){
		List<PayDetail> list=payDetailService.findByOid(oid);
		model.addAttribute("list", list);
		return "paydetail";
	}
	@OptionalLog(modules="支付详情",methods="支付费用")
	@RequestMapping("/pay")
	public String pay(int id,Model model){
		PayDetail detail=payDetailService.findById(id);
		boolean flag=payDetailService.update(detail);
		List<PayDetail> list=payDetailService.findByOid(detail.getOid());
		int count=0;
		for (PayDetail payDetail : list) {
			if(payDetail.getStatus().equals("结清")){
				count+=1;
			}
		}
		Order order= orderService.find(detail.getOid());
		PayMethod payMethod=payMethodService.find(order.getPaymethod());
		System.out.println(payMethod.getNumber());
		if(count==payMethod.getNumber()){
			order.setStatus(1);
			orderService.updata(order);
		}
		System.out.println(count);
		model.addAttribute("list", list);
		return "paydetail";
	}

}
