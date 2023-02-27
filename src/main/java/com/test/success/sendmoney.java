package com.test.success;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.hibernate.User;


@Controller
public class sendmoney {

	@RequestMapping("/sendmoney")
	public ModelAndView sendmoney(HttpSession session1) {
		
		String accountNo = (String) session1.getAttribute("accountNo");

		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sendmoney.jsp");
		
	     return mav;
	}
}
