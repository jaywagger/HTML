package basicServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mypost2", urlPatterns = { "/mypost2.do" })//xml �������� ������ �۾�.
public class PostFormServlet2 extends HttpServlet {
		protected void doPost(HttpServletRequest request, 
				HttpServletResponse response) throws ServletException, IOException {

			
			request.setCharacterEncoding("euc-kr");
			response.setContentType("text/html;charset=euc-kr");
			//���� �ѱ� ���ڵ�
			PrintWriter pw = response.getWriter();
			
			//1. ��û ���� ����
			String userId = request.getParameter("userId");
			String passwd = request.getParameter("passwd");
			
			System.out.println("���̵�: "+userId);
			System.out.println("�н�����: "+passwd);
			
			//���� ���� ����
			pw.print("<html>");
			pw.print("<body>");
			pw.print("<h1>������</h1>");
			pw.print("<h3>���̵�:"+userId+"</h3>");
			pw.print("<h3>��й�ȣ:"+passwd+"</h3>");
	}

}
