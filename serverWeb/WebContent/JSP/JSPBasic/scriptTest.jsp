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
<body>	<!--�ڹ��ּ�: Ŭ���̾�Ʈ�� ���۵��� �ʴ´�  -->
		<!-- HTML �ּ��� Ŭ���̾�Ʈ�� ���޵ȴ�. ���X-->
		<!-- JSP�ּ���(Ŭ���̾�Ʈ�� ���۵��� �ʴ´�. -->
		<h2>1. ��ũ��Ʈ - �ڹ��ڵ带 ������ �� �ִ�</h2>
		<%
		/* �ڹ��ּ�: Ŭ���̾�Ʈ�� ���۵��� �ʴ´�
		�ڹ�: Ŭ���̾�Ʈ�� ���۵��� �ʴ´�
		�ּ���*/
			String str = new String("Java");
			out.print("<h3>���ڿ��� ����: "+str.length()+"</h3>");
			Random rand = null;//import="java.util.*" �߰��ؼ� ���
			ArrayList list=null;
			DeptDTO dept = null;
			
		%>
		<h1>1. JSP ��ũ��Ʈ ���</h1>
		<%	int num =100; %> <!--  !�� ���� -->
		
		
		<h1>2. ����</h1>
		<%!	int num =100000; %>
		<%!  public void test(){
			System.out.print("test");		
		}%>
		<h1>3. ǥ����</h1>
		<h2><%= 10000 %></h2>
		<h2><%= 10.5 %></h2>
		<h2><%="���ڿ��� ����"+str.length() %></h2>
		<h2><%= new Date().toString() %></h2>
		<h2><%= 100/3 %></h2>
		<h2><%= str.charAt(0) %></h2>
</body>
</html>