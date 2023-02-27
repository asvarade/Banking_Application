package com.test.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.persistence.Column;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.protocol.Resultset;

@Controller
public class TestController {
	
	//String passcheck;
	//String account;
	
	@RequestMapping("/success")
	public ModelAndView success(@RequestParam ("accountNo") String accountNo, @RequestParam("password") String password, HttpSession session) {
		
		String account=accountNo;
		String pass =password;
		
		session.setAttribute("accountNo",account );
		
		ModelAndView mav = null;
		String passcheck = "abhi";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "abhi767", "abhi@6934");
		
		PreparedStatement preparedstatement = connection.prepareStatement("select * from mydb.User where accountno=?");
		
		preparedstatement.setString(1, account);
		
		ResultSet rs = preparedstatement.executeQuery();
		
		while (rs.next()) {
			
			 passcheck = rs.getString(12);
			 String setUsername   =rs.getString(1);
				String firstname  =rs.getString(2);
				String middlename =rs.getString(3);
				String lastname   =rs.getString(4);
				String mobileno   =rs.getString(5);
				String accountno  =rs.getString(6);
				String ifsccode   =rs.getString(7);
				String aadharno   =rs.getString(8);
				String panno      =rs.getString(9);
				String city       =rs.getString(10);
				String state      =rs.getString(11);
               // String fpassword ;
				//String repassword;
		}

		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(passcheck);
		System.out.println(pass);
		if (pass.equals(passcheck) & pass!=null & passcheck!=null) {
			
		 mav = new ModelAndView();
		mav.setViewName("success.jsp");
		mav.addObject("account", account);
		mav.addObject("pass", pass);
		return mav;
		}else if(!passcheck.equals(pass)) {
			mav = new ModelAndView();
		mav.setViewName("Failure.jsp");
		
		return mav;
		}else //if()
		return mav;

	}
//	

}
