package basicServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lifeCyleTest extends HttpServlet{
	public lifeCyleTest() {
		System.out.println("서블릿객체 생성.....");
	}
	public void init() {
		System.out.println("서블릿객체의 초기화 init()...");
	}
	public void service(HttpServletRequest req, 
				HttpServletResponse res) throws
				ServletException, IOException{
		System.out.println("클라이언트의 요청 처리 service()...^^^"+req.getMethod());
		//요청방식이 Get이면 doGet호출, post면 doPost
		if(req.getMethod().equals("GET")) {
			
			doGet(req,res);
			
		}else if(req.getMethod().equals("POST")) {
			doPost(req,res);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("이거슨 doGet 메소드");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("이거슨 doPost 메소드\"");
	}
	
	public void destroy() {
		System.out.println("서블릿 객체 소멸...destroy()");
	}
	
	
	
	
	
	
	
	
	
}
