package basicServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuGuServlet extends HttpServlet{
	public void service(HttpServletRequest req, 
			HttpServletResponse res) throws
			ServletException, IOException{	
		
		for(int i=1;i<10;i++) {
			System.out.println("7 x"+i+" = "+7*i);
		}
		System.out.println("GuGU 서블릿: FirstServlet과 동일한 방법으로 요청");
	}
}
