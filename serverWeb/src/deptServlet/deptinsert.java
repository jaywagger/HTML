package deptServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deptinsert.do")
public class deptinsert extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		//응답 한글 인코딩
		PrintWriter pw = response.getWriter();
		
		//1. 요청 정보 추출
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		
		System.out.println("부서코드: "+deptNo);
		System.out.println("부서명: "+deptName);
		System.out.println("부서위치: "+loc);
		System.out.println("전화번호: "+tel);
		System.out.println("관리자: "+mgr);
		System.out.println("이것은 deptinsert 파일에서 출력된  것 이오.");
		
		
		System.out.println("dao출력");  
		
		DeptDTO dto = new DeptDTO(deptNo,deptName, loc,tel,mgr);
		DeptDAO dao = new DeptDAOImpl();
		int result = dao.insert(dto);//비즈니스 로직은 DeptDAO &DeptDAOImpl에서
		
		/*응답 내용 생성
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>고객정보</h1>");
		pw.print("<h3>부서코드:"+deptNo+"</h3>");
		pw.print("<h3>부서명:"+deptName+"</h3>");
		pw.print("<h3>부서위치:"+loc+"</h3>");
		pw.print("<h3>부서번호:"+tel+"</h3>");
		pw.print("<h3>관리자:"+mgr+"</h3>");*/
		
		//응답 내용 재지정
		response.sendRedirect("/serverWeb/dept/insertResult.html");
		
	}

}
