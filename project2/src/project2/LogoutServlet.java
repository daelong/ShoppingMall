package project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String currentURL = request.getParameter("CURRENT_URL");
		HttpSession session = request.getSession();
		session.removeAttribute("LOGIN_ID");
		response.sendRedirect(currentURL);
	}

}
