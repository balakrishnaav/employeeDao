package com.medplus.onlineinsurance.policy.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
 * Servlet implementation class ViewUserRoles
 */
@WebServlet("/ViewUserRoles")
public class ViewUserRoles extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		UserRoleService service = new UserRoleServiceImpl();
		UserRole user = new UserRole();
		
		HttpSession session=request.getSession();
		
			 
		List<UserRole> userslist=service.getUsers();
			
		session.setAttribute("usrlst", userslist);
		RequestDispatcher rd = request.getRequestDispatcher("ViewUsers.jsp");
		rd.forward(request, response);
			
		
			 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
