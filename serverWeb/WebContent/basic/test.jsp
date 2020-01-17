<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> 서블릿에서 처리했던 작업을 jsp에서 처리해보기</h1>
	<hr/>
	<%
		//요청정보 추출
		request.setCharacterEncoding("euk-kr");
		String id = request.getParameter("id");
		
	
	
	
	%>
</body>
</html>