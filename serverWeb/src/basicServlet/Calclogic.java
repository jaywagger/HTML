package basicServlet;
//����Ͻ�����
public class Calclogic {
	public double calc(double num1, double num2, String method) {
		
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
		} 
		System.out.println("����Ͻ� ����");
		return result;
		
		
	}
}
