package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.LoginUser;

public class UserMapper implements RowMapper {

	

	public LoginUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		LoginUser ob=new LoginUser();
		ob.setEmailid(rs.getString(1));
		ob.setPassword(rs.getString(2));
		
		return ob;
	}

}
