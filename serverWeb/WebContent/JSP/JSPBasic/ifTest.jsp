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
			String str = "java";
			int size = str.length();
			if(size>=4){
		%>	<h1>좋아요: <%= size %></h1>		
		<%	}else{ 
		%>
				<h1>실어요: <%= size %></h1>
		<%	}
		%>
		
</body>
</html>