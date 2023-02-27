package com.test.success;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.controller.TestController;

@Controller
public class balance {
	
	String balance;
	@RequestMapping("/balance")
	public ModelAndView balance(HttpSession session) {
		
		String accountNo = (String) session.getAttribute("accountNo");
			String name =  (String) session.getAttribute("name");
		System.out.println(accountNo);
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost: 3306/mydb", "abhi767", "abhi@6934");
		
		PreparedStatement ps = connection.prepareStatement("select balance from money where accountno=?");
		
		ps.setString(1, accountNo);

		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			balance = rs.getString(1);
		}
		}catch (Exception e) {
			
			System.out.println(e);
		}
		
           ModelAndView mav = new ModelAndView();
		
		mav.setViewName("balance.jsp");
		mav.addObject("accountNo", accountNo);
		mav.addObject("balance",balance);
		mav.addObject("name", name);
		return mav;
	}

}
