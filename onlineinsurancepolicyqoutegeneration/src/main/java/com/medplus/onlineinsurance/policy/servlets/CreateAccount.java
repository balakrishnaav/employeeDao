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

import com.medplus.onlineinsurance.policy.beans.Accounts;
import com.medplus.onlineinsurance.policy.beans.UserRole;
import com.medplus.onlineinsurance.policy.service.AccountServiceImpl;
import com.medplus.onlineinsurance.policy.service.AccountsService;
import com.medplus.onlineinsurance.policy.service.UserRoleService;
import com.medplus.onlineinsurance.policy.service.UserRoleServiceImpl;

/**
 * Servlet implementation class CreateAccount
 */
@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		AccountsService service = new AccountServiceImpl();
		int maxVal=service.getMaxCount();
		
		if (maxVal==0) {
			int accno=1000;
			String insuredName=request.getParameter("insuredname");
			String insuredStreet=request.getParameter("insuredstreet");
			String insuredCity=request.getParameter("insuredcity");
			String insuredState=request.getParameter("insuredstate");
			int insuredZip=Integer.parseInt(request.getParameter("insuredzip"));
			String busnseg=request.getParameter("businesssegment");
			String agentName=request.getParameter("agentname");
			String username=request.getParameter("username");
			Accounts acc=new Accounts();
			acc.setAccountNumber(accno);
			acc.setInsuredName(insuredName);
			acc.setInsuredStreet(insuredStreet);
			acc.setInsuredCity(insuredCity);
			acc.setInsuredState(insuredState);
			acc.setInsuredZip(insuredZip);
			acc.setBusinessSegment(busnseg);
			acc.setAgentName(agentName);
			acc.setUserName(username);
			int rows=service.addAccount(acc);
			if (rows>0) {
				out.println("account created succeesfully");
			}else {
				out.println("User already exists");
			}
			
			
		}else {
			int accno=maxVal+1;
			String insuredName=request.getParameter("insuredname");
			String insuredStreet=request.getParameter("insuredstreet");
			String insuredCity=request.getParameter("insuredcity");
			String insuredState=request.getParameter("insuredstate");
			int insuredZip=Integer.parseInt(request.getParameter("insuredzip"));
			String busnseg=request.getParameter("businesssegment");
			String agentName=request.getParameter("agentname");
			String username=request.getParameter("username");
			Accounts acc=new Accounts();
			acc.setAccountNumber(accno);
			acc.setInsuredName(insuredName);
			acc.setInsuredStreet(insuredStreet);
			acc.setInsuredCity(insuredCity);
			acc.setInsuredState(insuredState);
			acc.setInsuredZip(insuredZip);
			acc.setBusinessSegment(busnseg);
			acc.setAgentName(agentName);
			acc.setUserName(username);
			int rows=service.addAccount(acc);
			if (rows>0) {
				out.println("account created succeesfully");
			}else {
				out.println("User already exists");
			}
		}
//		String  userName = request.getParameter("username");
//		String password = request.getParameter("pwd");
//		String userRole= request.getParameter("role");
//		UserRole user = new UserRole();
//		user.setUserName(userName);
//		user.setPassword(password);
//		user.setRole(userRole);
//		HttpSession session=request.getSession();
//		int rows= service.addUser(user);
//		if(rows>0) {
//			out.println("Added Sucessfully"+rows);
//			List<UserRole> userslist=service.getUsers();
//			userslist.forEach(e->{
//				out.println(e);
//			});
//			session.setAttribute("usrlst", userslist);
//			RequestDispatcher rd = request.getRequestDispatcher("ViewUsers.jsp");
//			rd.forward(request, response);
//			
//		}
//		else {
//			out.println("User Already Exists");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
