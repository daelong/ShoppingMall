<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이대현의 쇼핑몰</title>
</head>
<body>
            <H4>상의</H4>
            <TABLE border=1>
                 <TR>
                    <TD width=40>순번</TD>
                    <TD width=70>작성자</TD>
                    <TD width=300>제목</TD>
                    <TD width=80>상세설명</TD>
                    <TD width=90>가격</TD>
                    <TD width=70 height=50>사진</TD>
                </TR>
                <c:forEach var="cnt" begin="0" end="${BBS_LIST.listSize -1}">
                    <TR>
                            <TD>${BBS_LIST.seqNo[cnt]}</TD>
                            <TD>${BBS_LIST.id[cnt]}</TD>
                            <TD><a href='Home.jsp?BODY_PATH=bbs-item?SEQ_NO=${BBS_LIST.seqNo[cnt]}'>${BBS_LIST.name[cnt]}</a></TD>
                            <TD>${BBS_LIST.content[cnt]}</TD>
                            <TD>${BBS_LIST.price[cnt]}</TD>
                            <!--<TD>${BBS_LIST.photo[cnt]}</TD> -->
                            <td><img src="${BBS_LIST.photo[cnt]}" width=70 height=50></TD><br>
                    </TR>
                </c:forEach>
          </TABLE>
          <c:if test="${!BBS_LIST.lastPage}">
                 <A href='bbs-item?LAST_SEQ_NO=${BBS_LIST.seqNo[BBS_ITEM.listSize - 1]}'>다음 페이지</A>
          </c:if>
          <button onclick="location='TopBoardInput.jsp'">게시글 작성</button> 
      </BODY>
</HTML>
