package basicServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mypost2", urlPatterns = { "/mypost2.do" })//xml 설정값과 동일한 작업.
public class PostFormServlet2 extends HttpServlet {
		protected void doPost(HttpServletRequest request, 
				HttpServletResponse response) throws ServletException, IOException {

			
			request.setCharacterEncoding("euc-kr");
			response.setContentType("text/html;charset=euc-kr");
			//응답 한글 인코딩
			PrintWriter pw = response.getWriter();
			
			//1. 요청 정보 추출
			String userId = request.getParameter("userId");
			String passwd = request.getParameter("passwd");
			
			System.out.println("아이디: "+userId);
			System.out.println("패스워드: "+passwd);
			
			//응답 내용 생성
			pw.print("<html>");
			pw.print("<body>");
			pw.print("<h1>고객정보</h1>");
			pw.print("<h3>아이디:"+userId+"</h3>");
			pw.print("<h3>비밀번호:"+passwd+"</h3>");
	}

}
