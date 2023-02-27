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
public class changepassword {

	String oldpassword;
	ModelAndView mav;
	@RequestMapping("/changepassword")
	public ModelAndView changepass(@RequestParam("oldpass")String oldpass ,@RequestParam("newpass")String newpass,
			                       @RequestParam("newpassagain")String newpassagain, HttpSession session) {
		
		String youraccountno = (String) session.getAttribute("accountNo");
		
		String oldPass=oldpass;
		String newPass=newpass;
		String newPassagain= newpassagain;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","abhi767","abhi@6934");
		
		PreparedStatement ps = connection.prepareStatement("select fpassword from User where accountno=?");
		
		ps.setString(1,youraccountno );
		
		ResultSet rs =ps.executeQuery();
		
		while(rs.next()) {
			
			oldpassword = rs.getString(1);
			System.out.println("Old PasswordPrinted"+oldpassword);
		}
		}catch(Exception e) {
			
			System.out.println(e);
		}
		try {
		if(oldPass.equals(oldpassword) & newPass.equals(newPassagain)) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","abhi767","abhi@6934");
			
			PreparedStatement prep =con.prepareStatement("update User set fpassword=? where accountno=?");
			
			prep.setString(1, newPass);
			prep.setString(2, youraccountno);
			
			prep.execute();
			
			mav = new ModelAndView();
			mav.setViewName("passwordchanged.jsp");
			mav.addObject("newPassword",newPass);
			
			return mav;
		}else 
			mav= new ModelAndView();
		mav.setViewName("passwordchangefail.jsp");
		
		     return mav;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return mav;
		}
	}

