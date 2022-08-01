package com.medplus.emploee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("pwd");
		if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("role", "admin");
			RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
			rd.forward(request, response);
		}
		PrintWriter out = response.getWriter();
		out.print("<font color='red'>Enter Details!!!</font>");
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.include(request, response);


	}

}
