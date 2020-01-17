<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import ="deptServlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> deptInsert서블릿에서 처리했던 작업을 jsp에서 처리해보기</h1>
	<%
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		//1. 요청 정보 추출
			String deptNo = request.getParameter("deptNo");
			String deptName = request.getParameter("deptName");
			String loc = request.getParameter("loc");
			String tel = request.getParameter("tel");
			String mgr = request.getParameter("mgr");
			DeptDTO dto = new DeptDTO(deptNo,deptName, loc,tel,mgr);
			DeptDAO dao = new DeptDAOImpl();
			int result = dao.insert(dto);
	%>
	<h3>insert.jsp 성공</h3>
		
</body>
</html>