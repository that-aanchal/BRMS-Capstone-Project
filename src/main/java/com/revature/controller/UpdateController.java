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

/**
 * Servlet implementation class UpdateController
 */

public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.print("\nworking");
		String loginId = request.getParameter("important");
		out.println("\n" + loginId);
		//String password = request.getParameter("password");
		String firstName = request.getParameter("first_name");
		String Lastname = request.getParameter("last_name");
		String AdharNo = request.getParameter("AadharNumber");
		String physicalDisability = request.getParameter("Physical_disability");
		int age = Integer.parseInt(request.getParameter("age"));
		String dateOfBirth = request.getParameter("birthday");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phone");
		
		User user=new User();
		user.setFirstName(firstName);
		user.setLastName(Lastname);
		user.setAge(age);
		user.setDateOfBirth(dateOfBirth);
		user.setEmail(email);
		user.setAddress(address);
		user.setPhone(phoneNumber);
		user.setPhysicalDisability(physicalDisability);
		user.setIdentityProof(AdharNo);
		
		UserDaoImpl udi = new UserDaoImpl();
		try {
			out.print("\nworking");
			udi.update(user, loginId);
			RequestDispatcher rd = request.getRequestDispatcher("afterSuccessfulUpdate.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch 
             out.print("///////");
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
