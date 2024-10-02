package c_control;

import java.util.Scanner;

/* 
 *   반복문 
 *   - for 문
 *   - while 문
 *   - do~ while문
 * 
 *    for(초기치;조건문;증가치) {
 *       반복문장;
 *       }
 *       
 *    초기치;
 *    while(조건문) {
 *    반복문장;
 *    증가치;
 *    
 */

public class Ex07_While_개념 {

	public static void main(String[] args) {

		//		
		//		int su// m = 0;  // 습관적으로 해주기
		//		
		//		for (int i = 1 ; i <= 10 ; i++) {
		//			sum += i;
		//		} // end of for -i
		//		System.out.println("합:" + sum);

//		int sum = 0;  // 습관적으로 해주기
//		int i = 1;
//
//		while (  i <= 10  ) {
//			sum += i;
//			i++;
//		} // end of for -i
//		System.out.println("합:" + sum);
		
		// 단 수를 입력받아 구구단 입력
		
		Scanner input = new Scanner (System.in);
		System.out.println("단 입력->");
		int dan = input.nextInt();
		//[ex] 2 * 1 = 2
        //     2 * 9 = 18
		
		int i = 1;
		while ( i <=9 ) {
			i++;
			System.out.printf("%d * %d = %d \n"  , dan , i , dan*i);
		}  // 자동개행 : \n 
		

	} // end of main

} //end of class
