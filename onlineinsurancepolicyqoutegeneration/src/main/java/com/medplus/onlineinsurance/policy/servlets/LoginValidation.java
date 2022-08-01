package com.medplus.onlineinsurance.policy.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.medplus.onlineinsurance.policy.beans.UserRole;
import com.medplus.onlineinsurance.policy.service.UserRoleService;
import com.medplus.onlineinsurance.policy.service.UserRoleServiceImpl;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("validated");
		String name=request.getParameter("username");
		String pass=request.getParameter("pwd");
		UserRoleService service=new UserRoleServiceImpl();
		UserRole user=service.getUserByUsernam(name);
		HttpSession session = request.getSession();
		if (name.equals("") || pass.equals("")) {
			out.print("<h2><center><font color=red>Enter Correct Details !!!</font></center></h2>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		} else if (user.getUserName().equals(name) && user.getPassword().equals(pass)) {
			session.setAttribute("role", user.getRole());
			RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
			rd.forward(request, response);
		} else {
			response.getWriter().print("<h2><center><font color=red>Enter Correct Details !!!</font></center></h2>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
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
