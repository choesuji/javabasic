package c_control;

import java.util.Scanner;

public class Ex06_for중첩_알파벳 {

	public static void main(String[] args) {


		//[연습] for 중첩 - 알파벳
		// 문1) 
//				for (int i = 0 ; i < 26  ; i++) {  //줄반복을 의미
//		
//					for (char ch = 'A'; ch<='A'+i; ch++) {  // 알파벳출력
//						// 시작점
//						System.out.print(ch);
//					}
//					System.out.println();
//
//				}

		//
		//		// 문2)
		//				for(int i = 0 ; i < 26 ; i++) {
		//					for (char ch = 'A'; ch<='Z'-i ; ch++ ) {    //ABCD~~출력해라~
		//						System.out.print(ch);
		//					}
		//					System.out.println();
		//				}
		//

		// 문3) 필수
		//		for (int i = 0 ; i < 26 ;  i++) {
		//			for ( char ch = 'Z'; ch>='Z'-i ; ch--) {  //Z보다 1작은값은, 2작은값은~~ 
		//				//Z부터 A까지 나타내라 -> char ch = 'Z' ; ch>='A' ; ch--
		//				System.out.print(ch);
		//			} 
		//			System.out.println();
		//		}

		
		//		// 문4) 선택
		//		for (int i = 0 ; i < 26 ; i++) {
		//			for(char ch = (char)('A'+i) ; ch <='Z' ; ch++) {
		//				//char res = (char) 
		//				System.out.print(ch);
		//			}
		//			System.out.println();
		//		}

		// 문4) 재풀이 - 내버전
				
				for (int i = 0 ; i < 26 ; i++) {
				for (char ch = (char)('A'+i); ch<= 'Z' ; ch++ ) {  //ch++ A 다음 B로 진행한다는 뜻
					                 // A+i 는 A 다음 B로 진행한다는 뜻
					System.out.print(ch);
				}
				System.out.println();
			}
				

		// for 중첩 - 숫자사각형
		//		 문1) 숫자사각형 (해답지) 
		//				Scanner input = new Scanner (System.in);
		//				
		//				int num=0;  // 초기화
		//		
		//				int h = input.nextInt();  높이값
		//				int n = input.nextInt();  너비값
		//				
		//				for(int i = 0; i < h; i++) {  
		//					for(int j = 0; j < n; j++ ) {
		//						num++;
		//						System.out.print(num + " ");
		//					}
		//					System.out.println();
		//				}

		// 문3) 숫자사각형3   -> 물어보기
		//
		//		Scanner input = new Scanner (System.in);
		//		System.out.println("정사각형 한변의 길이 ");
		//		int mm = input.nextInt();
		//
		//		int a =0;
		//
		//		for (int i = 1; i <= 100 ; i++) {
		//			System.out.print(i + " ");
		//			if (i % mm == 0 ) {
		//				System.out.println();
		//			}
		//			System.out.println();
		//		}


		//		// 선택문제) 
		//		
		//		Scanner input = new Scanner (System.in);
		//		
		//						
		//		System.out.println("삼각형의 크기");
		//		int n = input.nextInt();
		//		System.out.println("삼각형의 종류");
		//		int sel = input.nextInt();
		//		
		//		if (n > 100 || n < 1) {
		//			System.out.println("INPUT ERROR");
		//		} 
		//		if (sel == 1) {
		//			for (int i = 0 ; i < n ; i++) {
		//				for (int j = 0; j <= i ; j++)
		//				System.out.print("*");
		//			} System.out.println();
		//		} 

		//		for(int j=0; j<5; j++) {   // 5줄까지만 의미
		//			
		//			for (int i = 0 ; i < (j+1) ; i++ ) {  // 5칸 의미
		//				System.out.print("*");     // printf 하면 가로로 나옴
		//			}
		//			System.out.println();




		//[교재105페이지] 예제문제
		//		char ch = 65;
		//
		//		for(int i = 0; i<3; i++) {  // 0,1,2 까지 총 3번 돌림
		//			for( int j = 0 ; j <5 ; j++) {  //먼저수행 (0~4)까지 A~E단위로 잘라서~ 1번
		//				System.out.println(ch++ + " ");
		//			}
		//			System.out.println();
		//		}






	}	
}