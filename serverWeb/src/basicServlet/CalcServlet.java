package basicServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "calc", urlPatterns = { "/calc.do" })
public class CalcServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		
		response.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		//응답 한글 인코딩
		PrintWriter pw = response.getWriter();
		
		//1. 요청 정보 추출
		String val1 = request.getParameter("num1");
		String val2 = request.getParameter("num2");
		
		double num1 = (double)(Integer.parseInt(val1));
		double num2 = (double)(Integer.parseInt(val2));
		
		String method = request.getParameter("method");
		
		System.out.println("아이디: "+num1);
		System.out.println("아이디: "+num2);
		System.out.println("연산: "+method);
		System.out.println("결과: "+num1+method+num2);
		
		/*if(method.equals("+")) {
			pw.print("<h3>결과:"+(num1+num2)+"</h3>");
		} else if(method.equals("-")){
			pw.print("<h3>결과:"+(num1-num2)+"</h3>");
		}else if(method.equals("*")){
			pw.print("<h3>결과:"+(num1*num2)+"</h3>");
		}else {
			pw.print("<h3>결과:"+(num1/num2)+"</h3>");
		}*/
		
		/*2. 비즈니스로직			따로 자바파일로 관리
		double result = 0;
		switch(method) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		}*/
		double result =0.0;
		Calclogic logic = new Calclogic();
		result = logic.calc(num1, num2, method)	;;
		
		pw.print("<h1>입력정보</h1>");
		pw.print("<h3>num1:"+num1+"</h3>");
		pw.print("<h3>num2:"+num2+"</h3>");
		pw.print("<h3>결과:"+result+"</h3>");
		//응답 내용 생성
	
	}

}
