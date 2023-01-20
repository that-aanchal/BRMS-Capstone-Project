/**
 * 
 */
package com.revature.app;

import com.revature.constants.Constant;

import java.sql.SQLException;
import java.util.Scanner;
import com.revature.daoImpl.UserDaoImpl;
import com.revature.model.User;
import org.apache.log4j.Logger;

public class MenuDrivenApplication {
	
	
	 static Scanner sc = new Scanner(System.in);
	 static UserDaoImpl udi = new UserDaoImpl();
	 static int n=0;
	 
	 static Logger logger = Logger.getLogger(MenuDrivenApplication.class.getName());
	 
	 

	//public static void main(String[] args) throws SQLException{
	 public void menu() throws SQLException{
		
	  
      logger.info(Constant.Menu_Msg);
      byte loop;
      do {
    	  
    	  logger.info(Constant.Choice_Msg);
          char choice = sc.next().charAt(0);
    	  switch(choice) {
    	 /* case '1':
    		  
    		  logger.info("User Registration or Sign up");
    		  //udi.add();
    		  userRegistration();
    		  break;*/
    	  case '1':
    		  logger.info("User Update");
    		  UpdateUserDetails();
    		  break;
    	  case '2':
    		  logger.info("User Display");
    		  logger.info("Please enter the login id");
    		  String loginId = sc.next();
    		  
    		  logger.info("Please Enter password");
    		  String pwd = sc.next();
    		  User user = new User();
    		  user = udi.getUser(loginId, pwd);
    		  logger.info(user);
    		  break;
    	  case '3':
    		  logger.info("User delete");
    		  deleteUser();
    		  break;
    	  case '4':
    		  logger.info("Exit");
    		  
    	  }
    	  logger.info("************--Do you want to continue User Operations ? if yes press 1--*************");
    	  //sc.nextLine();
    	  loop= sc.nextByte();
      }while(loop == 1);
    	  
    	  //logger.info("Thank you");
    	  
    	  }
	
	private static void deleteUser() {  //  Delete User
		
		logger.info("Please enter LoginId : ");
		String loginId= sc.next();
		
		logger.info("Please Enter password : ");
		String pwd = sc.next();
		
		try {
			n = udi.delete(loginId, pwd);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		logger.info("Deletion Successful");
		
	}

	private static void UpdateUserDetails() { // Update User Details
		
		User user = new User();
		 logger.info("Enter actual login id ");
			String loginId= sc.next(); 
			
			logger.info("Enter recent  password ");
			String recentPassword= sc.next(); 
	//1		
			logger.info("Enter  new password ");
			String passwordUpdate= sc.next();
			user.setPassword(passwordUpdate); 
	//2	
			logger.info("Enter first name ");
			String firstName= sc.next();
			user.setFirstName(firstName);
	//3	
			logger.info("Enter last name ");
			String lastName= sc.next();
			user.setLastName(lastName);
	//4		
			logger.info("Enter phone number ");
			String phone= sc.next();
			user.setPhone(phone);
	//5	
				logger.info("Enter email ");
			String email= sc.next();
			user.setEmail(email);
	//6		
			logger.info("Enter address : ");
			String address= sc.next();
			user.setAddress(address);
			
	
			//7     
			logger.info("Enter date of birth");
			String dateOfBirth= sc.next();
			user.setDateOfBirth( dateOfBirth);
	//8		
			logger.info("Enter age: ");
			byte  age= sc.nextByte();
			user.setAge(age);
			
		
		try {
			logger.info("Updation Successful :" + udi.update(user, loginId, recentPassword));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}
	

	public static void userRegistration()  {
	
	
	
	 User user = new User();
	 logger.info("Enter login id ");
		String loginId= sc.next();
	    user.setLoginId(loginId);
//2	    
	    logger.info("Enter password ");
		String password= sc.next();
		user.setPassword(password);
//3		
		logger.info("Enter first name ");
		String firstName= sc.next();
		user.setFirstName(firstName);
//4		
		logger.info("Enter last name ");
		String lastName= sc.next();
		user.setLastName(lastName);
//5		
		
		logger.info("Enter age: ");
		byte  age= sc.nextByte();
		user.setAge(age);
//6		
		sc.nextLine();
		logger.info("Enter phone number ");
		String phone= sc.next();
		user.setPhone(phone);
//7		
		logger.info("Enter email ");
		String email= sc.next();
		user.setEmail(email);
//8		
		logger.info("Enter identity proof ");
		String identityProof= sc.next();
		user.setIdentityProof(identityProof);
//9		
		logger.info("Enter address : ");
		String address= sc.next();
		user.setAddress(address);
//10		
		logger.info("Enter physical Disability : ");
		String physicalDisability= sc.next();
		user.setPhysicalDisability(physicalDisability);
//11		
		logger.info("Enter date of birth");
		String dateOfBirth= sc.next();
		user.setDateOfBirth( dateOfBirth);
		logger.info(user);
		try {
			 n = udi.add(user);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		logger.info("Registration Successful "+ n);
		
	}
	 
	
      
}


