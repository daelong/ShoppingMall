package project2;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

public class MemberUpdateServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("UTF-8");
		HttpSession session1 = request.getSession();
		String id = (String)session1.getAttribute("LOGIN_ID");
		String name = request.getParameter("NAME");
		
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?serverTimezone=UTC", "root", "root");
			if(conn == null)
				throw new Exception("데이터베이스에 연결할 수 없습니다.");
			stmt = conn.createStatement();
			int rowNum = stmt.executeUpdate("update userinfo set name='" + name + "' where id = '" + id + "';");
			if(rowNum<1)
				throw new Exception("데이터를 DB에 입력할 수 없습니다.");
		}
		catch(Exception e) {
            throw new ServletException(e);
		}
		finally {
			try {
				stmt.close();
			}
			catch(Exception ignored) {
			}
			try {
				conn.close();
			}
			catch(Exception ignored) {
			}
			
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("MemberUpdateCheck.jsp");
        dispatcher.forward(request, response);
	}

}
