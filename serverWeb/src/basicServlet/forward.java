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

@WebServlet(name = "forward", urlPatterns = {"/forward.do"})
public class forward extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		System.out.println("Forward ����Ϸ�1");
		
		//1. ������ �����ϱ� - request����
		DeptDTO dept = new DeptDTO("001","������","","","");
		request.setAttribute("mydata", dept);
		System.out.println("Forward ����Ϸ�2");
		
		//2. ��û������ - forward: �ٷ� jsp�� �ѱ��. 
		RequestDispatcher rd = 
				request.getRequestDispatcher
				("/JSPBasic/forward/subPage.jsp");
		rd.forward(request, response);
	}


}
