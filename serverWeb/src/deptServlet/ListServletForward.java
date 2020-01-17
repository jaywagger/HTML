package deptServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list2", urlPatterns = { "/dept/list2.do" })
public class ListServletForward extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		System.out.println("���� ����ƴ��� Ȯ��");
		
		//1. ��û���� ����: ����
		//2. ����Ͻ� �޼ҵ� ȣ��
		DeptDAO dao = new DeptDAOImpl();
		ArrayList<DeptDTO> deptlist =dao.getDeptList();
		//3. �����Ͱ���: result�� jsp�� �Ѱ��ֱ� ���� �۾�
		request.setAttribute("listForward", deptlist); //����
		System.out.println("�̰��� list ���Ͽ��� ��µ�  �� �̿�.");
				
		//4. ����ȭ������ ��û������
		RequestDispatcher rd = 
			request.getRequestDispatcher
				("/dept/listForward.jsp");
				rd.forward(request, response);

		
			
		}
		
	}



