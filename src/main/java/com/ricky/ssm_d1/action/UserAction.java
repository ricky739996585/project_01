package com.ricky.ssm_d1.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAction {
	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request){
		ModelAndView mav=new ModelAndView();
		mav.addObject("username",request.getParameter("username"));
		mav.addObject("password", request.getParameter("password"));
		mav.setViewName("success");
		return mav;
	}
}
