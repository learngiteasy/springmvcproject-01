package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.LoginUser;

public class LoginDAOImpl implements LoginDAO{
private JdbcTemplate jdbctemplate;
	public JdbcTemplate getJdbctemplate() {
	return jdbctemplate;
}
public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}
	public int getUser(String emailid,String pass) {
		
		String s="select * from user where emailid=? and password1=?";
		
		List<LoginUser> ob=this.jdbctemplate.query(s, new UserMapper(),emailid,pass);
	
		
		return ob.size();
	}

}
