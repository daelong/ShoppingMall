<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	HttpSession session1 = request.getSession();
	//String id = (String)session1.getAttribute("LOGIN_ID");
	String name = (String)session1.getAttribute("LOGIN_NAME");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action=member-update method=post>
	이름:<input type=text name=NAME size=10 value=<%=name %>><br>
	<input type=submit value='수정'>
</form>
</body>
</html>