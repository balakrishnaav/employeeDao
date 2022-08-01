package com.medplus.emploee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medplus.emploee.service.EmployeeService;
import com.medplus.emploee.service.EmployeeServiceImpl;
import com.medplus.employee.beans.Employee;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		EmployeeService service=new EmployeeServiceImpl();
		Employee employee=service.getEmployeeById(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("empl", employee);
		RequestDispatcher rd=request.getRequestDispatcher("UpdateEmployee.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int code=Integer.parseInt(request.getParameter("empNo"));
		String name=request.getParameter("empname");
		String job=request.getParameter("job");
		double salary=Double.parseDouble(request.getParameter("salary"));
		String doj= request.getParameter("doj");
		EmployeeService service=new EmployeeServiceImpl();
		service.updateEmployee(code,name,job,doj,salary);
		RequestDispatcher rd=request.getRequestDispatcher("GetEmployee");
		rd.forward(request, response);
		
	}

}
