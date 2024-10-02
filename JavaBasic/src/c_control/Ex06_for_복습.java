package c_control;

import java.util.Scanner;

public class Ex06_for_복습 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.println("숫자를 입력하세요");
		int su = input.nextInt();


		for (int i = 0; i< su; i++) {  //행 row
			// 공백을 추가
			for(int j = 0 ;j<su-i-1 ; j++ ) {
				System.out.println(' ');
			} // end of for j
			
			for (int j = 1; j <= i+1; j++ ) {  // 문자(열:column)
				System.out.print('j');
			} // end of for j
			
			System.out.println();
		
		} // end of for i

	}
} 
