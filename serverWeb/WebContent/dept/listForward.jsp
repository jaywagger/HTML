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
	
		//������ ������ ������ ������
		ArrayList<DeptDTO> deptlist = (ArrayList<DeptDTO>)request.getAttribute("listForward");
	%>
	
	<table border="1" width="500px">
		<tr>
			<th>�μ��ڵ�</th><th>�μ���</th><th>��ġ</th>
			<th>��ȭ��ȣ</th><th>������</th><th>����</th>
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
			dept.getDeptNo()+"&info=test'>����</a></td>
			</tr>
	<%	}
	%>
	</table>
	
</body>
</html>