package e_exercise;

import java.util.Scanner;

public class GradeTest {  // 여기있는거를 GradeExpr에 올려씀

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("데이타 개수 크기 ->");
		int su = input.nextInt(); // 데이터개수를 표준입력 받는다
		
		int [] arr = new int [su];// 입력된 데이터개수 크기의 원소를 갖는 int타입의 배열 생성
		
		System.out.println("정수 데이타입력");  // 표준입력으로 데이터를 받아서 
		for(int i= 0; i<arr.length;i++) {
		    arr[i] = input.nextInt();  //첫번째원소부터 마지막원소까지 저장한다 : 반복문
		    
				
		GradeExpr grade = new GradeExpr(arr);   //GradeExpr타입의 grade 변수
		// 생성할때 넘김 
		System.out.println("총점:" + grade.getTotal());
		System.out.println("평균:" + grade.getAverage());
		
		
	}


	}
}
