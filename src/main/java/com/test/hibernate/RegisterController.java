package com.test.hibernate;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	@RequestMapping("/register")
	public ModelAndView register(@RequestParam ("fname")String fname ,@RequestParam ("mname")String mname, @RequestParam ("lname") String lname,
			       @RequestParam("mobileNo") String mobileNo, @RequestParam("accountNo") String accountNo,@RequestParam("ifsc")String ifsc,
			       @RequestParam("addhar") String aadhar, @RequestParam("pan") String pan,@RequestParam("city") String city,
			       @RequestParam("state")String state,@RequestParam("setusername")String setusername,
			       @RequestParam("password") String password, @RequestParam ("password1")String password1, HttpSession session1) {
		
		String firstname = fname;
		String middlename = mname;
		String lastname =lname;
		String mobileno =mobileNo;
		String accountno=accountNo;
		String ifsccode = ifsc;
		String aadharno =aadhar;
		String panno= pan;
		String City =city;
		String State=state;
		String setUsername =setusername;
		String fpassword = password;
		String repassword=password1;
		
		session1.setAttribute("name", firstname);
		System.out.println(firstname);
		System.out.println(middlename);
		System.out.println(lastname);
		System.out.println(mobileno);
		System.out.println(accountno);
		System.out.println(ifsccode);
		System.out.println(aadharno);
		System.out.println(panno);
		System.out.println(City);
		System.out.println(State);
		System.out.println(setUsername);
		System.out.println(fpassword);
		System.out.println(repassword);
		
		ModelAndView mav;
		
		 if(fpassword.equals(repassword)) {
			 
         Configuration configuration = new Configuration();
		
		 Configuration configuration2 = configuration.configure("User.cfg.xml");
		
	     SessionFactory sessionfactory = configuration2.buildSessionFactory();
	
		 Session session = sessionfactory.openSession();
		
		 Transaction transaction = session.beginTransaction();
	
	       User user = new User();
	       
	       user.setFirstname(firstname);
	       user.setMiddlename(middlename);
	       user.setLastname(lastname);
	       user.setMobileno(mobileno);
		   user.setAccountno(accountno);
		   user.setIfsccode(ifsccode);
		   user.setAadharno(aadharno);
		   user.setPanno(panno);
		   user.setCity(City);
		   user.setState(State);
		   user.setSetUsername(setUsername);
		   user.setFpassword(fpassword);
		   
		   session.save(user);
		   transaction.commit();
		   session.close();
		   sessionfactory.close();
		   
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost: 3306/mydb", "abhi767", "abhi@6934");
				
				PreparedStatement ps = connection.prepareStatement("insert into mydb.money value(?,?);");
				
				ps.setString(1, accountno);
				ps.setInt(2, 0);
				ps.execute();
				
		   }catch (Exception e) {
			   
			System.out.println(e);
		}
		   
		    mav = new ModelAndView();
		   mav.setViewName("RegistrationSuccess.jsp");
		   mav.addObject("name", firstname);
			return mav;

		}else 
			
			mav = new ModelAndView();
			mav.setViewName("RegistrationFail.jsp");
			
		return mav;
	}
}
