package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.revature.daoImpl.UserDaoImpl;
import com.revature.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("working");
		
		String loginId = request.getParameter("loginID");
		String password = request.getParameter("password");
		
		out.println("\n" + loginId);
		out.println(password);
		boolean valid =false;
		UserDaoImpl udi = new UserDaoImpl();
		
          try {
			
			List<User> userslist = udi.getAllUsers();
			for(User user:userslist) {
				if(loginId.equalsIgnoreCase(user.getLoginId()) && password.equalsIgnoreCase(user.getPassword())) {
					valid=true;
					RequestDispatcher rd = request.getRequestDispatcher("successfulLogin.jsp");
					rd.forward(request, response);
					
				}
			}
			if(!valid) {
				out.print("Please Enter valid userid or password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				out.println("Please Enter valid userid or password");
			}
          }
			
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//out.println("111111");
		}
		
		
		
//		super.service(req, resp);
	}

}
