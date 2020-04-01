<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
      <HEAD><TITLE>게시판</TITLE></HEAD>
      <BODY>
            <H4>게시판 목록 보기</H4>
            <TABLE border=1>
                 <TR>
                    <TD width=40>순번</TD>
                    <TD width=300>제목</TD>
                    <TD width=80>작성자</TD>
                    <TD width=90>가격</TD>
                    <TD width=70 height=50>사진</TD>
                </TR>
                <c:forEach var="cnt" begin="0" end="${BBS_LIST.listSize -1}">
                    <TR>
                            <TD>${BBS_LIST.seqNo[cnt]}</TD>
                            <TD>${BBS_LIST.name[cnt]}</TD>
                            <TD>${BBS_LIST.content[cnt]}</TD>
                            <TD>${BBS_LIST.price[cnt]}</TD>
                            <TD><img src="${BBS_LIST.photo[cnt]}" width=70 height=50></TD><br>
                    </TR>
                </c:forEach>
          </TABLE>
          <c:if test="${!BBS_LIST.lastPage}">
                 <A href='bbs-list?LAST_SEQ_NO=${BBS_LIST.seqNo[BBS_LIST.listSize - 1]}'>다음 페이지</A>
          </c:if>
      </BODY>
</HTML>
