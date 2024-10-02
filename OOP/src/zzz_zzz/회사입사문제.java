package zzz_zzz;

import java.util.Scanner;

public class 회사입사문제 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("숫자를 입력하세요");

		int su369 = input.nextInt();  // 숫자를 입력하세요 

		for(int su = 1 ; su < su369; su++ ) { //시작은 1 
			if (su == 3 | su == 6 | su == 9) {
				System.out.print("짝!"+" ("+su+") "); //3,6,9 나오기
			} else {
				System.out.print(su+" - ");  // 3,6,9 아닌경우 나오는거 변수입력
			}

		}
	}



}




