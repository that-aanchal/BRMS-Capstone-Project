package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.revature.daoImpl.UserDaoImpl;

import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.print("\nworking");
		String loginID = request.getParameter("loginId");
		UserDaoImpl udi = new UserDaoImpl();
		try {
			udi.delete(loginID);
			RequestDispatcher rd = request.getRequestDispatcher("afterDelete.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
