package com.revature.util;

import java.util.function.Predicate;

import com.revature.model.User;

public class AuthenticateUser {
	public static void main(String[] args) {
		
	
	User u = new User("Aanchal","Joshi@123");
	Predicate<User> checkAuthorizedUser = u1->u1.getLoginId().equals("Aanchal") && 
			u1.getPassword().equals("Joshi@123");
	boolean result = checkAuthorizedUser.test(u);
	System.out.println(result);
	}

}
