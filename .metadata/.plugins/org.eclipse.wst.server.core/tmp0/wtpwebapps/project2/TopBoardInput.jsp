<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action=top-board-input enctype="multipart/form-data" method=post>
	제목:<input type=text name=NAME><br>
	상세설명:<input type=text name=CONTENT><br>
	가격:<input type=text name=PRICE><br>
	사진:<input type=file name=PHOTO size=40><br>
	<input type=submit value='등록'><br>
</form>
</body>
</html>