package com.revature.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.revature.model.User;

public  interface  UserDao {
	public static List<User> users= new ArrayList<>();
	
	public int add(User user) throws SQLException;

	public int delete(String loginId , String password) throws SQLException;

	public User getUser(String loginId , String password) throws SQLException;

	public int update(User user ,String loginId , String password) throws SQLException;
}
