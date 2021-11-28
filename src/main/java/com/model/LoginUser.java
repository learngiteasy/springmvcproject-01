package com.model;

public class LoginUser {

	 private String emailid;
	 private String password;
	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginUser(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}
	
}
