package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		/*System.out.println("ListServlet �۵�1");*/
		//�ѱ���
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		System.out.println("���� ����ƴ��� Ȯ��");
		
		//1. ��û���� ����: ����
		//2. ����Ͻ� �޼ҵ� ȣ��
		DeptDAO dao = new DeptDAOImpl();
		ArrayList<DeptDTO> deptlist =dao.getDeptList();
		pw.print(deptlist);//�⺻ ����
		
		//�Ʒ�ó�� ���̺��������� �־���� �Ѵ�.
		
		pw.print("<h1>�μ� ��ü ���</h1>");
		pw.print("<table border='1' width='500px'>");
		pw.print("<tr>");
		pw.print("<th>�μ��ڵ�</th><th>�μ���</th><th>��ġ</th>");
		pw.print("<th>��ȭ��ȣ</th><th>������</th><th>����</th>");
		pw.print("</tr>");
		int size = deptlist.size();
		for (int i = 0; i < size; i++) {
			DeptDTO dept = deptlist.get(i);
			pw.print("<tr>");
			pw.print("<td>"+dept.getDeptNo()+"</td>");
			pw.print("<td>"+dept.getDeptName()+"</td>");
			pw.print("<td>"+dept.getLoc()+"</td>");
			pw.print("<td>"+dept.getTel()+"</td>");
			pw.print("<td>"+dept.getMgr()+"</td>");
			pw.print("<td><a href='/serverWeb/dept/delete.do?deptNo="+
			dept.getDeptNo()+"&info=test'>����</a></td>");
			
			pw.print("</tr>");
		}
		
		pw.print("</table>");
		
		
		
		
		/*pw.print(DTOList); //to String �������� �ѷ���
*/		/*<table>
			<tr> <th></th></tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>*/
		
//		for (DeptDTO list : DTOList) {
//			list.getDeptNo();
//			list.getDeptName();
//			list.getLoc();
//			list.getTel();
//			list.getMgr();
			
		}
		
	}



