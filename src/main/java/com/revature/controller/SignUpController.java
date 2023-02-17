package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.revature.daoImpl.UserDaoImpl;
import com.revature.model.User;

import jakarta.servlet.RequestDispatcher;


public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    
    public SignUpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.print("\nworking");
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");
		String firstName = request.getParameter("first_name");
		String Lastname = request.getParameter("last_name");
		String AdharNo = request.getParameter("AadharNumber");
		String physicalDisability = request.getParameter("Physical_disability");
		int age = Integer.parseInt(request.getParameter("age"));
		String dateOfBirth = request.getParameter("birthday");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phone");
		
		UserDaoImpl udi = new UserDaoImpl();
		User user1 = new User(loginId,password,email,phoneNumber,address,age,physicalDisability,firstName,Lastname,AdharNo,dateOfBirth);
		try {
			out.println("\n inside servlet");
			udi.add(user1);
			RequestDispatcher rd = request.getRequestDispatcher("successfulLogin.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println("\n 1111111");
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
