package basicServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import deptServlet.DeptDTO;

@WebServlet(name = "redirect", urlPatterns = {"/redirect.do"})
public class sendRedirect extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		System.out.println("SendRedirectServlet 실행완료1");
		pw.println("<h1>sendRedirect화면</h1>");
		
		//1. 데이터 공유하기 - request공유
		DeptDTO dept = new DeptDTO("001","연구실","","","");
		request.setAttribute("mydata", dept);
		System.out.println("SendRedirectServlet 실행완료2");
		
		//2. 요청재지정 - sendRedirect
		response.sendRedirect("/serverWeb/JSP/JSPBasic/sendRedirect/subPage.jsp");
	}


}
