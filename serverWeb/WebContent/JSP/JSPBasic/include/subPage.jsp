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
		//서블릿이 공유한 데이터 꺼내오기
		DeptDTO dept = (DeptDTO)request.getAttribute("mydata");
		System.out.println("클라이언트에서 subPage 들어오나요?");

	
	%>

	<!-- 최초 요청페이지에서 재지정된 페이지 -->
	<h1>요청재지정으로 실행될 페이지 연습</h1>
	<hr/>
	<h2>공유데이터: <%= dept.getDeptName() %></h2>
	<h3>null뜨면 : 서블릿 들어갔다가 나오면 dept 지워짐</h2>
	<h3>null 안 뜨면 : 공유데이터로 출력</h2>
	
</body>
</html>