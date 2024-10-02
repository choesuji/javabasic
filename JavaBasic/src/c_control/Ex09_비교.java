package c_control;

import java.util.Scanner;

public class Ex09_비교 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//
		//		System.out.println("구구단 출력 몇 번 할까요?");
		//		int su = input.nextInt();
		//
		//		System.out.println("단 입력 ->");
		//		int dan = input.nextInt();
		//		for(int a =0 ; a<su; a++ ) {			
		//			for(int i=1; i<=9; i++ ) {
		//				System.out.printf(" %d * %d = %d \n", dan, i, dan*i);
		//			}
		//		}
		//		
		// ------------[2] while 이용

		//		while(true) {
		//			System.out.println("단 입력 ->");
		//			int dan = input.nextInt();
		//			for(int i = 1 ; i <= 9; i++) {
		//				System.out.printf("%d * %d = %d \n", dan, i, dan*i );
		//			}
		//			System.out.println("종료할까요? (Y/N)");
		//			String answer = input.next ();
		//			if (answer.equals("Y") | answer.equals("y")) break;
		//		}

		// ---------------[3] 
		String answer = "";
		do {
			System.out.println("단 입력 ->");
			int dan = input.nextInt();
			for(int i = 1 ; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n", dan, i, dan*i );
			}
			System.out.println("다시할까요? (Y/N)");
			answer = input.next ();
		} while (answer.equals("Y") | answer.equals("y")) ;

	}
}