package sampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookie
 */
@WebServlet("/CreateCookie")
public class CreateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie ck1=new Cookie("name","medplus");
		Cookie ck2=new Cookie("id","123145");
		PrintWriter out =response.getWriter();
		out.print("cookies created");
		response.addCookie(ck1);
		response.addCookie(ck2);
	}

}
