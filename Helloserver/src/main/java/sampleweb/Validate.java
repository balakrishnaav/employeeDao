package sampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String username=request.getParameter("user");
		String pass=request.getParameter("pwd");
		RequestDispatcher admin=request.getRequestDispatcher("/Admin");
		RequestDispatcher user=request.getRequestDispatcher("/User");
		if(username.equals("admin")&& pass.equals("admin")) {
			//admin.forward(request, response);
			//admin.include(request, response);8
			response.sendRedirect("Admin");
		}else {
			//user.forward(request, response);
			out.println("<font color=red>Invalid user.. re-login</font>");
			RequestDispatcher rd=request.getRequestDispatcher("User.html");
			rd.include(request, response);
			
		}
		out.println("<h2>success</h2>");
	}

}
