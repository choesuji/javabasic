package d_array;

import java.util.Scanner;

/* 
 * 학생수를 입력하세요 ->
 * 0번학생 국어점수 88
 * 1번학생 국어 78
 * 
 */
public class Ex02_성적1 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("학생수를 입력하세요 ->");
		int su = input.nextInt();
		
		int [] kor = new int [su];
		
				for (int i = 0; i < kor.length; i++) {
			System.out.println(i + "번 학생의 국어점수를 입력하세요 ->");
			kor[i] =input.nextInt();
		}
		
		// 총점구하기
		int total = 0;
		for (int i = 0 ; i < kor.length ; i++) {
			 total+= kor[i];	
		} System.out.println("총점 : " + total);

		// 평균구하기
		int avg = 0;
		for ( int i = 0 ; i < kor.length ; i++); {
		} System.out.println("평균 :" + total/kor.length);
		
	}
}
