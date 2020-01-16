package basicServlet;
//비즈니스로직
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
		System.out.println("비즈니스 로직");
		return result;
		
		
	}
}
