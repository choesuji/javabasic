package e_contructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student () ;  //얘가 Student의 54줄  this ("홍길동", 50,50,50); 갓더니 밑에 this.name등 호출
		// 쭉쭉읽고 아래 ("인자있는 생성자 호출"); 하고 올라와서 ("기본생성자 호출");	
		// 

		System.out.println(s1.getName() + "님의 총점: " + s1.calTotal());
		System.out.println(s1.getName() + "님의 평균: " + s1.calAvg());


		Scanner input = new Scanner (System.in);		
		System.out.println("학생이름->");
		String name = input.next();
		
		System.out.println("국어점수->");
		int kor = input.nextInt();
		
		System.out.println("영어점수->");
		int eng = input.nextInt();
		
		System.out.println("수학점수->");
		int math = input.nextInt();



		Student s2 = new Student (name, kor, eng, math) ; 
		System.out.println(s2.getName() + "님의 총점: " + s2.calTotal());
		System.out.println(s2.getName() + "님의 평균: " + s2.calAvg());



	}

}
