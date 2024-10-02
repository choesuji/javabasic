package c_exercise;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
	
		CalculatorExpr cal = new CalculatorExpr();
		
		Scanner input = new Scanner (System.in);
		System.out.println("첫번째 숫자->");
		//cal.num1=input.nextInt();)
	cal.setNum1(input.nextInt());
	System.out.println("두번째 숫자->");
	cal.setNum2(input.nextInt());
	
	System.out.println("덧셈:" + cal.getAddition());
	System.out.println("뺄셈:" + cal.getSuvtraction());
	System.out.println("곱셈:" + cal.getMultiplication());
	System.out.println("나눗셈:" + cal.getDivision());
	}
	

}
