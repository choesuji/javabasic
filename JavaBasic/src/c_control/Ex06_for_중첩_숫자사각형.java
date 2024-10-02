package c_control;

import java.util.Scanner;

public class Ex06_for_중첩_숫자사각형 {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);
		System.out.println("숫자 두개를 입력 -> ");

		int row = input.nextInt();
		int col = input.nextInt();

		int su = 1;
		//    
		//    for(int i = 0 ; i < row ; i++ ) { // 0부터 3번째 전까지 구동하겠다
		//    	for (int j = 0 ;j<col;j++ ) {
		//    		System.out.print(su + " ");
		//    		su++;
		//    	}
		//    	System.out.println();
		//    }
		//    

		//    for(int i = 0,su=1 ; i < row ; i++ ) { // 0부터 3번째 전까지 구동하겠다
		//    	for (int j = 0 ;j<col;j++ su++) {
		//    		System.out.print(su + " ");
		//    	}
		//    	System.out.println();
		//    

		for(int i=1 ; i<=row ; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}

}
///
// */
//* 1 2 3 4 5
//* 6 7 8 9 10
//* 11 12 13 14 15


//for (int i= 1 ; i <=15 ; i++) {
//		System.out.print(i + " ");
//		if ( i % 5 == 0) {
//			System.out.println();
//		}


