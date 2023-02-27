package com.test.success;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.hibernate.TransactionController;
import com.test.hibernate.User;
import com.test.hibernate.money;

@Controller
public class moneysent {

	int balance;
	
	@RequestMapping("/moneysent")
	public ModelAndView moneysent(@RequestParam("accountNo") String accountno, @RequestParam("ifsc") String ifsc,
			                      @RequestParam("amount") int amount, HttpSession session) {
		
		ModelAndView mav;
		
		String youraccountNo = (String) session.getAttribute("accountNo");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost: 3306/mydb", "abhi767", "abhi@6934");
			
			PreparedStatement ps = connection.prepareStatement("select balance from money where accountno=?");
			
			ps.setString(1, youraccountNo);

			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				balance = rs.getInt(1);
				System.out.println("this is balance "+balance);
			}
			}catch (Exception e) {
				
				System.out.println(e);
			}
		
		String accountNo = accountno;
		String Ifsc= ifsc;
		int Amount = amount;
		
	   if(balance>=Amount) {
		   
		   balance = balance - amount;
		   Configuration con = new Configuration();
			
			Configuration confi  = con.configure("money.cfg.xml");
			SessionFactory sessionfactory = confi.buildSessionFactory();
			
			Session session0   = sessionfactory.openSession();
			System.out.println("This is session");
			Transaction transaction = session0.beginTransaction();
			//User user = new User();
			money mony = (money) session0.get(money.class, youraccountNo);
			mony.setBalance(Amount);
			session0.update(mony);
            
			transaction.commit();
			session0.close();
			sessionfactory.close();
			
            Configuration con1 = new Configuration();
            con1.configure("transaction.cfg.xml");
            SessionFactory sessionfactory1 = con1.buildSessionFactory();
			Session session1 = sessionfactory1.openSession();
			Transaction transaction1 = session1.beginTransaction();
			TransactionController tc = new TransactionController();
			
			tc.setAccountNo(accountNo);
            tc.setIfsc(Ifsc);
            tc.setAmount(Amount);
            tc.setForm(youraccountNo);
            
            session1.save(tc);
            
            transaction1.commit();
            session1.close();
            sessionfactory1.close();
            
			mav = new ModelAndView();
			mav.addObject("reducedMoney", amount);
			mav.addObject("availabelbalance",balance );
			mav.setViewName("transactiondone.jsp");
			return mav;
			
	   }else 
		   
		   mav= new ModelAndView();
		   mav.setViewName("invalidbalance.jsp");
	       mav.addObject("balance",balance);
		
		return mav;
	}
}
