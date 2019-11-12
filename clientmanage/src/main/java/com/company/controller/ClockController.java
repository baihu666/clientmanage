package com.company.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.pojo.Clock;
import com.company.pojo.Staff;
import com.company.service.IClockService;
import com.company.service.IStaffService;

/**
 * @author 白虎
 * @category 打卡控制器
 */
@Controller
public class ClockController {

	@Autowired
	private IClockService clockService;
	@Autowired
	private IStaffService staffService;

	@RequestMapping(value="/clock",produces={"text/html;charset=utf-8","application/json;"})
	public @ResponseBody String clock(HttpSession session){
		Staff staff = (Staff) session.getAttribute("current_staff");
		int cid = staff.getCid();
		staff.setCid(2);
		Clock clock = clockService.findById(cid);
		clock.setId(2);
		staffService.update(staff);
		String str = "已打卡";
		return str;
	}
}
