package com.revature.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class DatabaseConnection {
	private static   Connection conn = null;
	
	
	//private static void usingResourceBundle()
	static 
	{
		ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
		String dburl = resourceBundle.getString("url");
		String driver = resourceBundle.getString("driver");
		String username = resourceBundle.getString("username");
		String password = resourceBundle.getString("password");
		try {
			Class.forName(driver);
			conn= DriverManager.getConnection(dburl,username,password);
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		/*System.out.println("dburl :" + dburl);
		System.out.println("driver :" + driver);
		System.out.println("username :" + username);
		System.out.println("password :" + password);*/
		
	}
	/*public static void main(String[] args) {
		usingResourceBundle();
		//usingPropertiesClassStatic();
		
	}*/
	public static Connection getConnection() {
		return conn;
	}
}


