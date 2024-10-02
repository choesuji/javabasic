package b_operator;

import java.util.Scanner;

public class Ex06_복습 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("문자하나를 입력하세요 ->");
		char ch = input.nextLine().charAt(0);
		// nextLine - 문자열     charAt(0) : 문자하나만 입력하시오 : 첫번째문자를 의미 
		// 문자열 세는순서는 0부터 세어감 0,1,2,3,4~~~
		System.out.println("문자:" + ch);

		// 사용자가 입력한 문자가 대문자인지 여부 출력
		if (ch >='A' && ch <='Z') {
			System.out.println("대문자");
		}

		// 그렇지 않다면 문자가 'a'보다 크거나 같고 'z'보다 작거나 같다면 '소문자'라고 출력
		else if (ch>='a' && ch<='z') {
			System.out.println("소문자");
		}
		// 그렇지 않다면
		// '기타 문자' 라고 출력

		else {
			System.out.println("기타문자");
		}

		// Ascii-code
		// 'A' = 65
		// 'B' = 66	
		// 'B' > 'A'


	}
}

/*
 *  자동 임포트 : ctrl + shift + O(대문자)
 *  전체 : 컨트롤 에이 , 정렬 : 컨트롤 아이
 */

