<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 실패</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.RESULT==1 }">
		회원가입에 성공하였습니다!
		</c:when>
		<c:otherwise>
		이 아이디는 사용하실수 없습니다.
		</c:otherwise>
	</c:choose>
</body>
</html>