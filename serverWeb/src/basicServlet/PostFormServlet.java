package basicServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, 
			HttpServletResponse res) throws
			ServletException, IOException{
		System.out.println("asds");
		
		req.setCharacterEncoding("EUC-KR");
		//1. 요청 정보 추출
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String passwd = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String item = req.getParameter("item");
		
		System.out.println("아이디: "+userId);
		System.out.println("성명: "+userName);
		System.out.println("패스워드: "+passwd);
		System.out.println("성별: "+gender);
		System.out.println("직업: "+job);
		System.out.println("관심사: "+item);
	}
}
