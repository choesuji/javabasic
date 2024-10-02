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
 *    초기치;
 *    do {
 *         반복문장;
 *         증가치; 
 *    } while 
 *    
 */
public class Ex08_do_while_개념 {

	public static void main(String[] args) {

		//		Scanner input = new Scanner (System.in);
		//		System.out.println("단 입력->");
		//		int dan = input.nextInt();
		//		//[ex] 2 * 1 = 2
		//		//     2 * 9 = 18
		//
		//		int i = 1;
		//		do {
		//			i <=9 ; 
		//			i++;
		//		} while
		//		System.out.printf("%d * %d = %d \n"  , dan , i , dan*i);	


		Scanner input = new Scanner (System.in);
		System.out.println("단 입력->");
		int dan = input.nextInt();
		//[ex] 2 * 1 = 2
		//     2 * 9 = 18

		int i = 1;
		do {
			i++;
			System.out.printf("%d * %d = %d \n"  , dan , i , dan*i);
		} while( i <=9 );
		
	}
}

