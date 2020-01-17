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
		
		//1. 요청 정보 추출
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		System.out.println("Forward 실행완료");
		
		DeptDTO dto = new DeptDTO(deptNo,deptName, loc,tel,mgr);
		DeptDAO dao = new DeptDAOImpl();
		int result = dao.insert(dto);//비즈니스 로직은 DeptDAO &DeptDAOImpl에서
		
		//3. 데이터공유: result를 jsp로 넘겨주기 위한 작업
		request.setAttribute("insertResult2", result);
		System.out.println("이것은 deptinsert 파일에서 출력된  것 이오.");
		
		//4. 응답화면으로 요청재지정
		RequestDispatcher rd = 
				request.getRequestDispatcher
				("/dept/insertResult.jsp");
		rd.forward(request, response);
		
	}

}
