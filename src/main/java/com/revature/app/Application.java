package com.revature.app;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.service.UserService;
import  com.revature.serviceImpl.UserServiceImpl;
import com.revature.app.MenuDrivenApplication;
import com.revature.constants.Constant;
import com.revature.dao.UserDao;
import com.revature.daoImpl.UserDaoImpl;

public class Application {
	static UserService userservice = new UserServiceImpl();
	static MenuDrivenApplication mda = new MenuDrivenApplication();
	static Logger logger = Logger.getLogger(MenuDrivenApplication.class.getName());
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws SQLException {
//		logger.info(Constant.Menu_Msg);
//		byte choice=0;
//		
//		
//		
//		do {
//			logger.info(Constant.Main_Menu1);
//			logger.info(Constant.Choice_Msg);
//			char loop = sc.next().charAt(0);
//			switch(loop) {
//			case '1':
//				logger.info("User Registration");
//				MenuDrivenApplication.userRegistration();
//				break;
//				
//			case '2':
//				logger.info("User Login options");
//				logger.info(Constant.Main_Menu2);
//				boolean flag = userservice.UserAuthentication();
//				logger.info(flag);
//				if(flag)
//					mda.menu();
//				break;
//				//logger.info("User Login options");
//				
//				
//			case '3':
//				logger.info("Please Enter valid choice");
//				
//			}
//			logger.info("************--Do you want to continue ? if yes press 1--*************");
//	    	choice = sc.nextByte();
//			
//			
//		}while(choice==1);
//		
//		
//		
//		logger.info("----------Thank You , Visit Again---------------");
		
		
		UserDao userdao =new UserDaoImpl();
		
		System.out.println(userdao.getAllUsers());
		
		
		
	}

		
		
		
		
		
	

}
