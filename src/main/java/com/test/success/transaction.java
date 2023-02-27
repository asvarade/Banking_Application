 package com.test.success;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.hibernate.TransactionController;

@Controller
public class transaction {

	String accountNo;
	String ifsc;
	int amount;
	
	@RequestMapping("/transaction")
	public ModelAndView transaction(HttpSession session) {
		
		String youraccountno = (String) session.getAttribute("accountNo");
		
		//String accountno=Accountnumber;
		//System.out.println(accountno);
		ModelAndView mav = new ModelAndView();
		
	   try {	   
		Class.forName("com.mysql.cj.jdbc.Driver");
		   
	   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "abhi767", "abhi@6934");
	    	
	   PreparedStatement ps = connection.prepareStatement("select * from transaction where form=?");
	    	 
	   ps.setString(1, youraccountno);
	   
	   ResultSet rs = ps.executeQuery();
	   
	   while(rs.next()) {
		    
		   accountNo = rs.getString(1);
		  System.out.println(accountNo);
		    ifsc =rs.getString(2);
		   System.out.println(ifsc);
		    amount = rs.getInt(3);
		   System.out.println(amount);
		   mav.addObject("accountNo", accountNo);
			mav.addObject("ifsc", ifsc);
			mav.addObject("amount",amount);
	   }

		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	   
		mav.setViewName("Transaction.jsp");
		mav.addObject("acc", youraccountno);
//		mav.addObject("accountNo", accountNo);
//		mav.addObject("ifsc", ifsc);
//		mav.addObject("amount",amount);
				
		
		return mav;
	}
}