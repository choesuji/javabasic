package c_control;

public class Ex04_switch_복습 {

	public static void main(String[] args) {
		
		int kor=100, eng=100, math=100;
		int total = kor + eng + math;
		int avg = total/3;
		System.out.println("평균:" + avg);
		
		char score = '\u0000';
		switch(avg/10) {
		case 10 :
		case 9: score = 'A';  break;
		case 8: score = 'B';  break;
		case 7: score = 'C';  break;
		default: score = 'F';  
		}
		
	}
}
/*
*평균을 구해서 90이상이면 'A'학점
*90미만 80이상이면 'B'학점
*80미만 70이상이면 'c'학점
*그외에는 'F'
*/