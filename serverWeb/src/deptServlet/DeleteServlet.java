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
		System.out.println("���� delete ����ƴ��� Ȯ��");
	
		//1. ��û���� ����: deptNo
		String deptNo = request.getParameter("deptNo");
		//2. ����Ͻ� �޼ҵ� ȣ��
		DeptDAO dao = new DeptDAOImpl();
		int result = dao.delete(deptNo);
		/*String txtBox = result+"���� ���� �����Ǿ����ϴ�.";
		pw.print("<html><body>");
		pw.print(txtBox);
		pw.print("<br/><a href='/serverWeb/dept/list.do'> �ǵ��ư��� </a>");
		pw.print("</body></html>");*/
		
		response.sendRedirect("/serverWeb/dept/list.do");
	}
}
