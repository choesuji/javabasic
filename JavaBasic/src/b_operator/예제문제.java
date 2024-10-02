package b_operator;

import java.util.Scanner;

public class 예제문제 {

	public static void main(String[] args) {

/* 
 * 숫자 3개를 입력받아서 그 중 가운데 수를 출력
 * 아래 제시 조건을 만족하게 구현
 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("가운데 수를 출력하세요 ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
	
		
		int temp;
		
		if (num1 > num2) {
			temp = num2;
		} else {
			temp = num1;
		}
			if (num2 > num3) {			
				temp = num3;
			} else {
				temp = num2;
			}
			
			System.out.println("중간값은" + temp);
			
//			int a = 10;
//			int b = 20;
//			
//			System.out.println(++a);
//			
//			System.out.println(b++);
//			
//			System.out.println((++a%3));
//			
			
			
			
	}
}

			
	