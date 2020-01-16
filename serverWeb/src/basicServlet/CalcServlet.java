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
		//���� �ѱ� ���ڵ�
		PrintWriter pw = response.getWriter();
		
		//1. ��û ���� ����
		String val1 = request.getParameter("num1");
		String val2 = request.getParameter("num2");
		
		double num1 = (double)(Integer.parseInt(val1));
		double num2 = (double)(Integer.parseInt(val2));
		
		String method = request.getParameter("method");
		
		System.out.println("���̵�: "+num1);
		System.out.println("���̵�: "+num2);
		System.out.println("����: "+method);
		System.out.println("���: "+num1+method+num2);
		
		/*if(method.equals("+")) {
			pw.print("<h3>���:"+(num1+num2)+"</h3>");
		} else if(method.equals("-")){
			pw.print("<h3>���:"+(num1-num2)+"</h3>");
		}else if(method.equals("*")){
			pw.print("<h3>���:"+(num1*num2)+"</h3>");
		}else {
			pw.print("<h3>���:"+(num1/num2)+"</h3>");
		}*/
		
		/*2. ����Ͻ�����			���� �ڹ����Ϸ� ����
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
		
		pw.print("<h1>�Է�����</h1>");
		pw.print("<h3>num1:"+num1+"</h3>");
		pw.print("<h3>num2:"+num2+"</h3>");
		pw.print("<h3>���:"+result+"</h3>");
		//���� ���� ����
	
	}

}
