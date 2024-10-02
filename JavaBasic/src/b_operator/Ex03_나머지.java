package b_operator;

import java.util.Scanner;

public class Ex03_나머지 {

	public static void main(String[] args) {
		
		// 나머지 연산자 활용 : 홀/짝수 구할 때
		int a = 114;
		
		if( a % 2 == 0) {
			System.out.println("짝수");
		} else {System.out.println("홀수");
		}
		
		//--------------------------------
		//숫자 하나는 입력받아 해당하는 숫자가 3의 배수인지 여부 출력
		
		int b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자하나받아요");
		b = input.nextInt();
		
		if(b % 3 == 0) {
			System.out.println("배수");
		} else {System.out.println("아님");
		
		}
			
	}

}
