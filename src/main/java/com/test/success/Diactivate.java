package com.test.success;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.hibernate.User;

@Controller
public class Diactivate {

	@RequestMapping("/diactivate")
	public ModelAndView delete(HttpSession sess) {
		String youraccountno = (String) sess.getAttribute("accountNo");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "abhi767", "abhi@6934");
		    	
		   PreparedStatement ps = connection.prepareStatement("delete from User where accountno=?");
		   
		   ps.setString(1,youraccountno);
		   
		   ps.execute();
		   
		  PreparedStatement ps1 = connection.prepareStatement("delete from money where accountno=?");
		   
		   ps1.setString(1, youraccountno);
		   
		   ps1.execute();
		   
		}catch (Exception e) {
			System.out.println(e);
		}	 
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Diactivated.jsp");
		mav.addObject("youraccountno",youraccountno);
		return mav;
	}
}
