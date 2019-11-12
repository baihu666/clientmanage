package com.company.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.company.service.IAreaService;
import com.company.service.ICityService;
import com.company.service.IProvinceService;

@Controller
public class ProCityAreaController {

	@Autowired
	private IProvinceService provinceService;

	@Autowired
	private ICityService cityService;

	@Autowired
	private IAreaService areaService;

	@RequestMapping(value = "/pca", produces = "text/html;charset=UTF-8;")
	public @ResponseBody String pca(HttpServletRequest request, HttpServletResponse response)
			throws JSONException, IOException {
		List list = null;
		String type = request.getParameter("type");
		if (type.equals("1")) {
			System.out.println("1");
			list = provinceService.findAll();
		} else if (type.equals("2")) {
			String provinceId = request.getParameter("provinceId");
			list = cityService.findCitiesByPid(provinceId);
		} else {
			String cityId = request.getParameter("cityId");
			list = areaService.findAreasByCid(cityId);
		}
		String json = JSON.toJSONString(list);
		
		return json;
	}
}
