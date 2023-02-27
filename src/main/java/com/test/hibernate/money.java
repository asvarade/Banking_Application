package com.test.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="money")
public class money {

	@Id
	@Column
	String accountno;
	@Column
	int balance;
	

	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "money [accountno=" + accountno + ", balance=" + balance + "]";
	}
	public money(String accountno, int balance) {
		super();
		this.accountno = accountno;
		this.balance = balance;
	}
	public money() {
		super();
	}
	
	
}
