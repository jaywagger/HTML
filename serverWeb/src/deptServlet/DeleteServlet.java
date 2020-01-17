package deptServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		System.out.println("서블릿 delete 연결됐는지 확인");
	
		//1. 요청정보 추출: deptNo
		String deptNo = request.getParameter("deptNo");
		//2. 비즈니스 메소드 호출
		DeptDAO dao = new DeptDAOImpl();
		int result = dao.delete(deptNo);
		/*String txtBox = result+"개의 행이 삭제되었습니다.";
		pw.print("<html><body>");
		pw.print(txtBox);
		pw.print("<br/><a href='/serverWeb/dept/list.do'> 되돌아가기 </a>");
		pw.print("</body></html>");*/
		
		response.sendRedirect("/serverWeb/dept/list.do");
	}
}
