<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<form action=logout method=get onSubmit="CURRENT_URL.value=window.location.href">
	�ȳ��ϼ���:${sessionScope.LOGIN_ID }��<br>
	<input type=HIDDEN name=CURRENT_URL>
	<input type=submit value='�α׾ƿ�'><br>
</form>