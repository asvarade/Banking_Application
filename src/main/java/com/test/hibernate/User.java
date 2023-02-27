package com.test.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	@Id
	@Column
	String setUsername;
	@Column
	String firstname ;
	@Column
	String middlename ;
	@Column
	String lastname ;
	@Column
	String mobileno ;
	@Column
	String accountno;
	@Column
	String ifsccode ;
	@Column
	String aadharno ;
	@Column
	String panno;
	@Column
	String city;
	@Column
	String state;
	@Column
	String fpassword ;
	@Column
	String repassword;
	
	public String getSetUsername() {
		return setUsername;
	}
	public void setSetUsername(String setUsername) {
		this.setUsername = setUsername;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFpassword() {
		return fpassword;
	}
	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	@Override
	public String toString() {
		return "User [setUsername=" + setUsername + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", mobileno=" + mobileno + ", accountno=" + accountno + ", ifsccode="
				+ ifsccode + ", aadharno=" + aadharno + ", panno=" + panno + ", city=" + city + ", state=" + state
				+ ", fpassword=" + fpassword + ", repassword=" + repassword + "]";
	}
	
	public User(String setUsername, String firstname, String middlename, String lastname, String mobileno,
			String accountno, String ifsccode, String aadharno, String panno, String city, String state,
			String fpassword, String repassword) {
		super();
		this.setUsername = setUsername;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.accountno = accountno;
		this.ifsccode = ifsccode;
		this.aadharno = aadharno;
		this.panno = panno;
		this.city = city;
		this.state = state;
		this.fpassword = fpassword;
		this.repassword = repassword;
	}
	
	public User() {
		super();
	}
	
	public User(String setUsername, String firstname, String middlename, String lastname, String mobileno,
			String accountno, String ifsccode, String aadharno, String panno, String city, String state,
			String fpassword) {
		super();
		this.setUsername = setUsername;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.accountno = accountno;
		this.ifsccode = ifsccode;
		this.aadharno = aadharno;
		this.panno = panno;
		this.city = city;
		this.state = state;
		this.fpassword = fpassword;
	}
		
}