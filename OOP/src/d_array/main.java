package d_array;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Student [] s = new Student [3] ;
		Scanner input = new Scanner (System.in);
		
		for(int i = 0 ; i < s.length ; i++) {   // 1차원배열은 for1개 2차원배열은 for2개
            
			//*********
			s[i] = new Student();
			System.out.println("학생명 입력->");
			s[i].setName (input.next() );
			System.out.println("국어점수->");
			s[i].setKor (input.nextInt() );
			System.out.println("영어점수->");
			
			s[i].setEng (input.nextInt() );
			System.out.println("수학점수->");
			s[i].setMath (input.nextInt() );

			System.out.println("총점:"+ s[i].calTotal());
			System.out.println("평균:"+ s[i].calAvg());
		}
	}

}
