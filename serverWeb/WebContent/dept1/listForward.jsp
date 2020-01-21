<%@page import="deptServlet.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
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
	
		//서블릿이 공유한 데이터 꺼내기
		ArrayList<DeptDTO> deptlist = (ArrayList<DeptDTO>)request.getAttribute("listForward");
	%>
	
	<table border="1" width="500px">
		<tr>
			<th>부서코드</th><th>부서명</th><th>위치</th>
			<th>전화번호</th><th>관리자</th><th>삭제</th>
		</tr>
	<%
		int size = deptlist.size();
		for(int i=0; i< size; i++){
			DeptDTO dept = deptlist.get(i);
	%>	
			<tr>
				<td width="70px"><%=dept.getDeptNo() %></td>
				<td width="70px"><%=dept.getDeptName() %></td>
				<td width="70px"><%=dept.getLoc() %></td>
				<td width="70px"><%=dept.getTel() %></td>
				<td width="70px"><%=dept.getMgr() %></td>
				<td><a href='/serverWeb/dept/delete.do?deptNo="+
			dept.getDeptNo()+"&info=test'>삭제</a></td>
			</tr>
	<%	}
	%>
	</table>
	
</body>
</html>