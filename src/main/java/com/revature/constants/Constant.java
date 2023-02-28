package com.revature.constants;

public class Constant {
	
	public static final String Menu_Msg= "----------Welcome to User Operations-----------";
	public static final String Main_Menu2 =   "1. User Update \n" + 
	                 "2. User Display \n" + "3. User delete \n" +"4. Exit";
	public static final String Main_Menu1 = "1. User Registration \n" + "2. User Login";
	public static final String Choice_Msg ="Please Enter Your Choice";
	public static final String SELECT_ALL_QUERY = "SELECT * From user ";
	public static final String SELECT_SPECIFIC_QUERY = "SELECT login_id,fname,lname,email,phone,date_of_birth,age,address,physical_disability,identity_proof FROM USER WHERE login_id=?  ";
	public static final String INSERT_QUERY="INSERT INTO User VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	public static final String DELETE_QUERY="DELETE FROM User  WHERE LOGIN_ID=?;   ";
	public static final String UPDATE_QUERY= "UPDATE  user SET Fname=? , lname=? , email=? , phone=?, address =?, date_of_birth=? , age= ?, identity_proof =? , physical_disability= ? WHERE login_id=? ;";
    //public static final String S
	//public static final String ADD_USER = " USER_INPUT(?,?,?,?,?,?,?,?,?,?,?)";
	//public static final String UPDATE_USER ="USER_UPDATE(?,?,?,?,?,?,?,?,?,?)";
	//public static final String REMOVE_USER ="USER_DATA_DELETE(?,?)";
}
