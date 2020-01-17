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
		System.out.println("서블릿 연결됐는지 확인");
		
		//1. 요청정보 추출: 없음
		//2. 비즈니스 메소드 호출
		DeptDAO dao = new DeptDAOImpl();
		ArrayList<DeptDTO> deptlist =dao.getDeptList();
		//3. 데이터공유: result를 jsp로 넘겨주기 위한 작업
		request.setAttribute("listForward", deptlist); //공유
		System.out.println("이것은 list 파일에서 출력된  것 이오.");
				
		//4. 응답화면으로 요청재지정
		RequestDispatcher rd = 
			request.getRequestDispatcher
				("/dept/listForward.jsp");
				rd.forward(request, response);

		
			
		}
		
	}



