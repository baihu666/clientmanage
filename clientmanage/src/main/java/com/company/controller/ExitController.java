package com.company.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExitController {
	@RequestMapping("/exit")
	public String exit(HttpSession session) {
		session.removeAttribute("current_user");
		return "login";
	}
}
