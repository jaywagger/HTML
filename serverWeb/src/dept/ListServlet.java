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
		/*System.out.println("ListServlet 작동1");*/
		//한국말
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		System.out.println("서블릿 연결됐는지 확인");
		
		//1. 요청정보 추출: 없음
		//2. 비즈니스 메소드 호출
		DeptDAO dao = new DeptDAOImpl();
		ArrayList<DeptDTO> deptlist =dao.getDeptList();
		pw.print(deptlist);//기본 형식
		
		//아래처럼 테이블형식으로 넣어줘야 한다.
		
		pw.print("<h1>부서 전체 목록</h1>");
		pw.print("<table border='1' width='500px'>");
		pw.print("<tr>");
		pw.print("<th>부서코드</th><th>부서명</th><th>위치</th>");
		pw.print("<th>전화번호</th><th>관리자</th><th>삭제</th>");
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
			dept.getDeptNo()+"&info=test'>삭제</a></td>");
			
			pw.print("</tr>");
		}
		
		pw.print("</table>");
		
		
		
		
		/*pw.print(DTOList); //to String 형식으로 뿌려짐
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



