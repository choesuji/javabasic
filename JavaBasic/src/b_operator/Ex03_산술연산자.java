package b_operator;

import java.util.Scanner;

/*
 * 산술연산자 : + - * / %
 
 */
public class Ex03_산술연산자 {

	public static void main(String[] args) {
		
		int a, b ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째숫자->");  // 1
		a=input.nextInt();
		
		System.out.println("두번째숫자->");  // 3
		b=input.nextInt();
		
	    int total;
	    total = a+b;
	   System.out.println(total);  // 4
	   
	   int sub;
	   sub = a-b;
	   System.out.println(sub);    // -2
	   
	    int mul;
	    mul = a*b;
	    System.out.println(mul);   //  3
	    	    
	    int div;
	    div = a/b;
	    System.out.println(div);   //  0
	    	    
	    int rem;
	    rem = a%b;
	    System.out.println(rem);   //  1
	    
	    
		
	}

}

 /* [콘솔창에서]
 
 첫번째숫자입력-> 1 (ex)
 두번째숫자입력-> 3 (ex)
 더하기 : 35
 빼기 : 5
 곱하기 : 300
 나누기 : 1
 나머지 : 5
 */
/* 
 *    자바에서 콘솔 입력받는 방법
 *    
 *       - java.util.Scanner 클래스 이용
 *       
 *       - 정수형입력시 : nextInt()
 *       - 실수형입력시 : nextDouble()
 *       - 문자열입력시 : next() / nextLine()   ***[숙제] 차이점??? - 
 *               
 */