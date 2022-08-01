package com.medplus.emploee.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medplus.emploee.service.DepartmentService;
import com.medplus.emploee.service.DepartmentServiceImpl;
import com.medplus.emploee.service.EmployeeService;
import com.medplus.emploee.service.EmployeeServiceImpl;
import com.medplus.employee.beans.Department;
import com.medplus.employee.beans.Employee;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DepartmentService service=new DepartmentServiceImpl();
		List<Department> deptNames=service.getDepartmentById();
		request.setAttribute("deptNames", deptNames);
		RequestDispatcher rd=request.getRequestDispatcher("AddEmployee.jsp");
		rd.forward(request, response);
		
//		PrintWriter out=response.getWriter();
//out.println(deptNames);
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int code=Integer.parseInt(request.getParameter("empcode"));
		String name=request.getParameter("empname");
		String job=request.getParameter("job");
		String doj=request.getParameter("doj");
		double salary=Double.parseDouble(request.getParameter("salary"));
		int deptName=Integer.parseInt(request.getParameter("deptname"));
//		PrintWriter out=response.getWriter();
//		out.println(request.getParameter("deptName"));
//		out.println(request.getParameter("deptname"));
//		out.println(request.getParameter("deptn"));
		Employee emp=new Employee(code,name,job,doj,salary,deptName);
		EmployeeService service=new EmployeeServiceImpl();
		int rows =service.addEmployee(emp);
		RequestDispatcher rd=request.getRequestDispatcher("GetEmployee");
		rd.forward(request,response);
	}

}
