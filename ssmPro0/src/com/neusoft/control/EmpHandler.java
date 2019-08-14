package com.neusoft.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.bean.Emp;
import com.neusoft.service.EmpService;

@Controller
public class EmpHandler {
	@Autowired
	private EmpService empService;
	
	@RequestMapping(value="test/EmpHandler_findAll.action")
	public String findAll(HttpServletRequest request) {
		System.out.println(".......EmpHandler..........findAll.........");
		List<Emp> list = empService.findAll();
		request.setAttribute("list", list);
		return "forward:/page/main.jsp";
	}
}
