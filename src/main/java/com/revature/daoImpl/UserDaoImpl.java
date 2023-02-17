package com.revature.daoImpl;
//import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.model.User;


//import com.revature.util.DateTimeUtil;
import com.revature.dao.UserDao;




public class UserDaoImpl implements UserDao {
	 static Connection con = DatabaseConnection.getConnection();
	
	@Override 
	public int add(User user) throws SQLException
 {
		
		PreparedStatement cs = con.prepareStatement(Constant.INSERT_QUERY);
		
		cs.setString(1, user.getLoginId());
		cs.setString(2, user.getFirstName());
		cs.setString(3, user.getLastName());
		cs.setString(4, user.getEmail());
		cs.setString(5, user.getPhone());
		cs.setString(6, user.getPassword());
		cs.setString(7, user.getIdentityProof());
		cs.setString(8, user.getPhysicalDisability());
		cs.setString(9, user.getAddress());
		cs.setString(10, user.getDateOfBirth());
		 cs.setInt(11, user.getAge());
		return cs.executeUpdate();
 
 } 
	@Override
	public int delete(String loginId) throws SQLException{
		PreparedStatement ps = con.prepareStatement(Constant.DELETE_QUERY);
		ps.setString(1, loginId);
		//ps.setString(2, password);
		
		return ps.executeUpdate();
	}
	@Override
	public User getUser(String loginId ) throws SQLException{
		PreparedStatement ps = con.prepareStatement(Constant.SELECT_SPECIFIC_QUERY);
		ps.setString(1, loginId);
		
		User user = new User();
		user.setLoginId(loginId);
		ResultSet rs = ps.executeQuery();
		boolean found = false;
		while(rs.next()) {
			found=true;
			
			user.setFirstName(rs.getString( "fname"));
			user.setLastName(rs.getString( "lname"));
			user.setEmail(rs.getString("email"));
			user.setPhone(rs.getString("phone"));
			user.setAddress(rs.getString("address"));
			user.setAge(rs.getInt( "age"));
			user.setDateOfBirth(rs.getString("date_of_birth"));
			user.setPhysicalDisability(rs.getString("physical_disability"));
			user.setIdentityProof(rs.getString("identity_proof"));
			}
		if(found == true)
			return user;
		else
			return null;
		
	}
	@Override
	public int update(User user , String loginId  ) throws SQLException{
		PreparedStatement ps = con.prepareStatement(Constant.UPDATE_QUERY);
		ps.setString(1, user.getFirstName());
		ps.setString(2, user.getLastName());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getPhone());
		ps.setString(5, user.getAddress());
		ps.setString(6, user.getDateOfBirth());
		ps.setInt(7, user.getAge());
		ps.setString(8, user.getIdentityProof());
		ps.setString(9, user.getPhysicalDisability());
		
		
		ps.setString(10, loginId);
		
		
		
			return ps.executeUpdate();
		
		
		
	}
	@Override
	public List<User> getAllUsers() throws SQLException {
		// TODO Auto-generated method stub
		List<User> listOfAllUsers = new ArrayList<>();
		
		PreparedStatement ps = con.prepareStatement(Constant.SELECT_ALL_QUERY);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			//found=true;
			User user = new User();
			user.setLoginId(rs.getString("login_id"));
			user.setPassword(rs.getString("password"));
			user.setFirstName(rs.getString( "fname"));
			user.setLastName(rs.getString( "lname"));
			user.setEmail(rs.getString("email"));
			user.setPhone(rs.getString("phone"));
			user.setAddress(rs.getString("address"));
			user.setAge(rs.getInt( "age"));
			user.setDateOfBirth(rs.getString("date_of_birth"));
			user.setPhysicalDisability(rs.getString("physical_disability"));
			user.setIdentityProof(rs.getString("identity_proof"));
			
			listOfAllUsers.add(user);
			}
		
		return listOfAllUsers;
	}
}


