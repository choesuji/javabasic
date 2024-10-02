package a_datatype;

/* 
 *    자바에서 콘솔 입력받는 방법
 *    
 *       - java.util.Scanner 클래스 이용
 *       
 *       - 정수형입력시 : nestInt()
 *       - 실수형입력시 : nestDouble()
 *       - 문자열입력시 : next() / nextLine()   ***[숙제] 차이점??? - 
 *               
 */

// [참고]  자주사용하는 기본적인 클래스는 java.lang 패키지
// import java.lang.*;

import java.util.Scanner;


public class Ex08_Scaner {

	public static void main(String[] args) {
		int kor, eng, math;  //국어 영어 수학 정수값 
	
		Scanner input = new Scanner(System.in);	
		System.out.println("국어입력->");
		kor = input.nextInt();

// 영어점수입력받기, 수학점수입력받기, 출력

System.out.println("국어:" + kor);



System.out.println("영어입력->");
eng = input.nextInt();
System.out.println("영어:" +eng );

System.out.println("수학입력->");
math = input.nextInt();
System.out.println("수학:" +math);


    //총점구해서 출력
    //평균구해서 출력

int total;
total = kor + eng + math;
System.out.println("총점을구하세요 " + total);

double avg;
avg = total/3;
System.out.println("평균을구하세요 " + avg);



	}

}
