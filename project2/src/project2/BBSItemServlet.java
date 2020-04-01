package project2;

import mall.BBSItem;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class BBSItemServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		BBSItem item = new BBSItem();
		String itemSeqNo = request.getParameter("SEQ_NO");
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?serverTimezone=UTC", "root", "root");
			if(conn == null)
				throw new Exception("데이터베이스에 연결할 수 없습니다.");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from iteminfo where seqno = '" + itemSeqNo + "';");
			if(rs.next()) {
				item.setItemContent(rs.getString("content"));
				item.setItemName(rs.getString("name"));
				item.setItemPrice(rs.getString("price"));
				item.setItemPhoto(rs.getString("photo"));
			}
			request.setAttribute("ITEM", item);
			//request.setAttribute("NAME", item.getItemName());
			//request.setAttribute("PRICE", item.getItemPrice());
			//request.setAttribute("PHOTO", item.getItemPhoto());
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("BBSItemView.jsp?");
		dispatcher.forward(request, response);
	}
}
