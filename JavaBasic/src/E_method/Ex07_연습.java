package E_method;

import java.util.Scanner;

public class Ex07_연습 {

	public static void main(String[] args) {
		int [] score = input();  //6  넘어오는 타입으로 그대로 바꿔주기
		double avg = calculate(score); //8
		output (avg); //10
	}  ///-> 12 종료

	// 국,영,수 점수를 입력받기 ㄱ
	static int [] input () { //7  -> int [] 로 맞춰주기
		Scanner input = new Scanner (System.in);

		int [] score = new int[3];  // 한번에 처리하기 위해 배열처리

		System.out.println("국어점수->");
		score[0] = input.nextInt();
		System.out.println("영어점수->");
		score[1] = input.nextInt();
		System.out.println("수학점수->");
		score[2] = input.nextInt();

		return score;  //리턴값은 무조건 하나!!!!!!!!!
	} // end input

	// 입력받은 점수들로 총점/평균 구해서 출력
	static double calculate(int[] score) { //9  avg의 자료형으로 변경 (더블)

		int total = 0;
		double avg = 0.0;

		for(int i=0 ; i<score.length; i++) {
			total += score[i];
		}
		avg = total / (double)3;  // 소수점을 살리는 방법   

		System.out.println("총점:" + total + ",평균:" + avg);

		return avg;	
	} // end cal


	//평균값을 받아서 학점을 구하여 출력
	static void output (double avg) {  //11
		switch((int)avg/10) {
		case 10: 
		case 9 : System.out.println("A학점"); break;
		case 8 : System.out.println("B학점"); break;
		default : System.out.println("F학점"); 
		}
	} // end out
}
