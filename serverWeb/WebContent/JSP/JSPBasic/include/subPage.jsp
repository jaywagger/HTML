<%@page import="deptServlet.DeptDTO"%>
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
		//������ ������ ������ ��������
		DeptDTO dept = (DeptDTO)request.getAttribute("mydata");
		System.out.println("Ŭ���̾�Ʈ���� subPage ��������?");

	
	%>

	<!-- ���� ��û���������� �������� ������ -->
	<h1>��û���������� ����� ������ ����</h1>
	<hr/>
	<h2>����������: <%= dept.getDeptName() %></h2>
	<h3>null�߸� : ���� ���ٰ� ������ dept ������</h2>
	<h3>null �� �߸� : ���������ͷ� ���</h2>
	
</body>
</html>