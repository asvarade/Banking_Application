package com.test.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class TransactionController {
	@Id
	@Column
	private String accountNo;
	@Column
	private String ifsc;
    @Column
	private int amount;
    @Column
    private String form;
    
	public String getForm() {
		return form;
	}
	public void setForm(String from) {
		this.form = from;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TransactionController [accountNo=" + accountNo + ", ifsc=" + ifsc + ", amount=" + amount + ", from="
				+ form + "]";
	}
	public TransactionController(String accountNo, String ifsc, int amount, String form) {
		super();
		this.accountNo = accountNo;
		this.ifsc = ifsc;
		this.amount = amount;
		this.form = form;
	}
	public TransactionController() {
		super();
	}
	 
}