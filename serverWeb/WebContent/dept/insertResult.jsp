<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//������ ������ ������ ������
		int result = (int)request.getAttribute("insertResult2");
	%>
	<h1>����ȭ�� �и�</h1>
	<hr/>
	<h2><%=result %>�� ���Լ���!!! sjp</h2>
	
</body>
</html>