package basicServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import deptServlet.DeptDTO;

@WebServlet(name = "include", urlPatterns = {"/include.do"})
public class include extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		System.out.println("Include ����Ϸ�1");
		pw.println("<h1>Includeȭ��</h1>");
		
		//1. ������ �����ϱ� - request����
		DeptDTO dept = new DeptDTO("001","������","","","");
		request.setAttribute("mydata", dept);
		System.out.println("Include ����Ϸ�2");
		
		//2. ��û������ - forward: �ٷ� jsp�� �ѱ��. 
		RequestDispatcher rd = 
				request.getRequestDispatcher
				("/JSPBasic/forward/subPage.jsp");
		rd.include(request, response);
	}


}
