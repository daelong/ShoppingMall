package project2;

import mall.BBSList;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class BBSListServlet extends HttpServlet {
      public void doGet(HttpServletRequest request, HttpServletResponse response)
                                                                          throws IOException, ServletException {
          request.setCharacterEncoding("UTF-8");  
    	  String strUpperSeqNo = request.getParameter("LAST_SEQ_NO");
            int upperSeqNo;
            if (strUpperSeqNo == null)
                  upperSeqNo = Integer.MAX_VALUE;
            else
                  upperSeqNo = Integer.parseInt(strUpperSeqNo);
            BBSList list = readDB(upperSeqNo);
            request.setAttribute("BBS_LIST", list);
            RequestDispatcher dispatcher = request.getRequestDispatcher("BBSListView.jsp");
            dispatcher.forward(request, response);
      }
      
      private BBSList readDB(int upperSeqNo) throws ServletException {
            BBSList list = new BBSList();
            Connection conn = null;
            Statement stmt = null;
            try {
            	Class.forName("com.mysql.jdbc.Driver");
    			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?serverTimezone=UTC", "root", "root");
    			if(conn == null)
    				throw new Exception("�����ͺ��̽��� ������ �� �����ϴ�.");
                  stmt = conn.createStatement();
                  ResultSet rs = stmt.executeQuery("select * from iteminfo where seqNo < " +
                                                                         upperSeqNo + " order by seqno desc;");
                  for (int cnt = 0; cnt < 10; cnt++) {
                      if (!rs.next())
                            break;
                      list.setSeqNo(cnt, rs.getInt("seqNo"));
                      list.setName(cnt, rs.getString("name"));
                      list.setContent(cnt, rs.getString("content"));
                      list.setPrice(cnt, rs.getString("price"));
                      list.setPhoto(cnt, rs.getString("photo"));
               }
               if (!rs.next())
                      list.setLastPage(true);
         }
         catch (Exception e) {
               throw new ServletException(e);
         }
         finally {
               try {
                     stmt.close();
               }
              catch (Exception ignored) {
               }
               try {
                     conn.close();
               }
              catch (Exception ignored) {
               }
         }
         return list;
   }
}