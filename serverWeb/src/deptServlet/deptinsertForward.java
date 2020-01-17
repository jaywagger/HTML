package deptServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deptinsert2.do")
public class deptinsertForward extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		//1. ��û ���� ����
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		System.out.println("Forward ����Ϸ�");
		
		DeptDTO dto = new DeptDTO(deptNo,deptName, loc,tel,mgr);
		DeptDAO dao = new DeptDAOImpl();
		int result = dao.insert(dto);//����Ͻ� ������ DeptDAO &DeptDAOImpl����
		
		//3. �����Ͱ���: result�� jsp�� �Ѱ��ֱ� ���� �۾�
		request.setAttribute("insertResult2", result);
		System.out.println("�̰��� deptinsert ���Ͽ��� ��µ�  �� �̿�.");
		
		//4. ����ȭ������ ��û������
		RequestDispatcher rd = 
				request.getRequestDispatcher
				("/dept/insertResult.jsp");
		rd.forward(request, response);
		
	}

}
