package deptServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deptinsert.do")
public class deptinsert extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		//���� �ѱ� ���ڵ�
		PrintWriter pw = response.getWriter();
		
		//1. ��û ���� ����
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		
		System.out.println("�μ��ڵ�: "+deptNo);
		System.out.println("�μ���: "+deptName);
		System.out.println("�μ���ġ: "+loc);
		System.out.println("��ȭ��ȣ: "+tel);
		System.out.println("������: "+mgr);
		System.out.println("�̰��� deptinsert ���Ͽ��� ��µ�  �� �̿�.");
		
		
		System.out.println("dao���");  
		
		DeptDTO dto = new DeptDTO(deptNo,deptName, loc,tel,mgr);
		DeptDAO dao = new DeptDAOImpl();
		int result = dao.insert(dto);//����Ͻ� ������ DeptDAO &DeptDAOImpl����
		
		/*���� ���� ����
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>������</h1>");
		pw.print("<h3>�μ��ڵ�:"+deptNo+"</h3>");
		pw.print("<h3>�μ���:"+deptName+"</h3>");
		pw.print("<h3>�μ���ġ:"+loc+"</h3>");
		pw.print("<h3>�μ���ȣ:"+tel+"</h3>");
		pw.print("<h3>������:"+mgr+"</h3>");*/
		
		//���� ���� ������
		response.sendRedirect("/serverWeb/dept/insertResult.html");
		
	}

}
