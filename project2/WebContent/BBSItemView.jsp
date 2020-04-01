<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<H4>아이템 읽기</H4>
<table border=1>
	<tr>
		<td>게시글 작성자</td>
		<td>아이템 이름</td>
		<td>아이템 상세설명</td>
		<td>아이템 가격</td>
		<td width=512 height=384>아이템 사진</td>
	</tr>
	<tr>
		<td>${ITEM.itemId }</td><br>
		<td>${ITEM.itemName }</td><br>
		<td>${ITEM.itemContent }</td><br>
		<td>${ITEM.itemPrice }</td><br>
		<td><img src="${ITEM.itemPhoto}" width=512 height=384></td><br>
		<!--  <td width=512 height=384>${ITEM.itemPhoto }</td><br>-->
	</tr>
</table>

