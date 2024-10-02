package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {

	public static void main(String[] args) {

		//		Scanner input = new Scanner (System.in);
		//		System.out.println("숫자 입력 (1 2 3 4) -> ");
		//		String str = input.nextLine(); // 사용자가 입력한것을 문자열로 받으세요
		//
		//		StringTokenizer st = new StringTokenizer(str);  //나누세요
		//
		
		//큰수구하기
		//		int max = 0;
		//		//int max = st.nextToken();
		//		while(st.hasMoreTokens()) {
		//			String token = st.nextToken();
		//			//System.out.println(token);
		//			int su = Integer.parseInt(token);
		//			if(max < su) max = su;
		//		}
		//		System.out.println("큰 수:" +max);	

		Scanner input = new Scanner (System.in);
		System.out.println("숫자입력 (1 2 3 4) -> ");
		String str = input.nextLine();

		StringTokenizer st = new StringTokenizer(str);

		int odd = 0; even = 0;

		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int su = Integer.parseInt(token);
			if(su%2 == 0) even++;
			else odd++;
			//System.out.println(token);
		}
		System.out.println("짝수" + even + "개");
		System.out.println("홀수"+ odd + "개");
	}
}