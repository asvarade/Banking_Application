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

@Controller
public class Depositmoney {
      int balance;
      int newBalance;
		ModelAndView mav = new ModelAndView();

	@RequestMapping("/deposit")
	public ModelAndView deposit(@RequestParam("amount")int amount, HttpSession session) {
		
		String youraccountno= (String) session.getAttribute("accountNo");
		System.out.println("accountno is "+youraccountno);
		int Amount=amount;
		
		if(Amount>0) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "abhi767", "abhi@6934");
		
           PreparedStatement ps = connection.prepareStatement("select * from money where accountno=?");
		
		ps.setString(1, youraccountno);

		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			 balance = rs.getInt(2);
		}
		 newBalance =balance+Amount;
		System.out.println("new Balance is "+balance);
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "abhi767", "abhi@6934");
		
		PreparedStatement ps1 = connection1.prepareStatement("update money set balance=? where accountno=?");
		
		ps1.setInt(1, newBalance);
		ps1.setString(2, youraccountno);
		
		ps1.execute();
		
		}catch (Exception e) {
			System.out.println(e);
		}
		 mav = new ModelAndView();
		mav.setViewName("DepositDone.jsp");
		mav.addObject("newBalance",newBalance);
		return mav;
	}else
		mav = new ModelAndView();
		mav.setViewName("Depositfail.jsp");
		return mav;
  }
}
