package b_operator;

import java.util.Scanner;

public class Ex09_삼항복습 {

	public static void main(String[] args) {


		//		// 두 수 중에서 큰 수를 출력
		//		int a = 15, b = 40;
		//		
		//		int max;
		//		if (a>b) {
		//			max = a;
		//		} else {
		//			max = b;
		//					}
		//	System.out.println("두 수 중 큰수는" + max);

		// 두 수를 입력받고 그 두 수중에서 큰 값을 출력해주세요 (삼항연산자 이용)

		Scanner acdc = new Scanner (System.in);

		System.out.println("첫번째 숫자 -> ");  
		int first = acdc.nextInt();    //콘솔창에 입력할 수 있는 기능 + 스캐너가 만들어져야 쓸수있음
		System.out.println("두번째 숫자 -> ");
		int second = acdc.nextInt();

		int max = (first>second) ? first : second;
		System.out.println("큰 수는 " + max );

	}
}
