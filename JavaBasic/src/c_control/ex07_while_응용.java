package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

/* 
 * for문 : 반복횟수가 정해져 있는 경우 주로 사용
 * while문 : 반복횟수를 모를 때 주로 사용
 */

public class ex07_while_응용 {

	public static void main(String[] args) {

		// 예 : 국어/영어/수학 -> 90,88,77
		Scanner input = new Scanner (System.in);

		System.out.println("예 : 국어/영어/수학 (90 88 77)->");
		String str = input.nextLine();
		//System.out.println(str);
		StringTokenizer st = new StringTokenizer (str); // 구분자 기본값 : 공백 (str, /)입력시 /로 숫자구분
		// StringTokenizer -> 문자열을 분리시킴 (공백을 중심으로)
		// 	Token -> 문자열들


		//반복횟수 알 수 있다면
		int cnt = st.countTokens();
		for(int i = 0 ; i<cnt;i++) {
			String token = st.nextToken();
			System.out.println("점수:" + token);
		}


		//		while(st.hasMoreTokens()) {
		//			String token = st.nextToken();
		//			System.out.println("점수:"+token);
		//		}
	}

}
