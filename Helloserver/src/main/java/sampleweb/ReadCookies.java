package sampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReadCookies
 */
@WebServlet("/ReadCookies")
public class ReadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Cookie[] cks=request.getCookies();
		for(Cookie ck : cks) {
			out.println("Cookie name = "+ck.getName()+" "+" cookie value = "+ck.getValue());
		}
		HttpSession session=request.getSession();
		out.println("session = "+session.getAttribute("mobile")+session.getAttribute("mailId"));
	   session.invalidate();
	   out.println("session invalidated");
	}

}
