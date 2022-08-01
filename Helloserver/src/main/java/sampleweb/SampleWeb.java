package sampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleWeb
 */
@WebServlet("/SampleWeb")
public class SampleWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count=0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void init() throws ServletException{
		System.out.println("*** init method execited");
	}
	@Override
	public void destroy() {
		System.out.println("** destroy method executed **");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		count++;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>Count ="+count+"</h2>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
