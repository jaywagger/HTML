<%@page import="java.util.Date"%>
<%@page import="deptServlet.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.Random,
   java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>	<!--자바주석: 클라이언트에 전송되지 않는다  -->
		<!-- HTML 주석문 클라이언트에 전달된다. 사용X-->
		<!-- JSP주석문(클라이언트에 전송되지 않는다. -->
		<h2>1. 스크립트 - 자바코드를 정의할 수 있다</h2>
		<%
		/* 자바주석: 클라이언트에 전송되지 않는다
		자바: 클라이언트에 전송되지 않는다
		주석문*/
			String str = new String("Java");
			out.print("<h3>문자열의 길이: "+str.length()+"</h3>");
			Random rand = null;//import="java.util.*" 추가해서 사용
			ArrayList list=null;
			DeptDTO dept = null;
			
		%>
		<h1>1. JSP 스크립트 요소</h1>
		<%	int num =100; %> <!--  !가 없음 -->
		
		
		<h1>2. 선언문</h1>
		<%!	int num =100000; %>
		<%!  public void test(){
			System.out.print("test");		
		}%>
		<h1>3. 표현식</h1>
		<h2><%= 10000 %></h2>
		<h2><%= 10.5 %></h2>
		<h2><%="문자열의 길이"+str.length() %></h2>
		<h2><%= new Date().toString() %></h2>
		<h2><%= 100/3 %></h2>
		<h2><%= str.charAt(0) %></h2>
</body>
</html>