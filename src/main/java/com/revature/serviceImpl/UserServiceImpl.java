package com.revature.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.service.UserService;

public class UserServiceImpl extends UserService {
	static Connection con = DatabaseConnection.getConnection();
	Scanner sc = new Scanner(System.in);

	@Override
	public boolean UserAuthentication() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter login Id for verification");
	    String loginId= sc.next();
	    
	    System.out.println("Enter password for verification ");
	    String pwd = sc.next();
	    PreparedStatement ps = con.prepareStatement(Constant.SELECT_ALL_QUERY);
	    ps.setString(1,loginId);
	    ps.setString(2, pwd);
	    
	   
	    ResultSet rs = ps.executeQuery();
	    if(rs.next()) {
	    	
	    		return true;
	    		
	    	}
	    	
		return false;
	    
		
		
		
	}

}
