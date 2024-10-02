package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_야구게임 {

	public static void main(String[] args) {

		int [] baseball = new int [3]; // 정수형 [메모리] 야구 에 새로운 공간[길이] 선언
		// 야구메모리 안에 "3개짜리" 배열을 생성
		for (int i = 0; i < baseball.length; i++) {
			baseball[i] = (int)(Math.random()*10); // 랜덤값 출력(정수값) i번만큼 숫자의범위는 10까지
			for(int j=0; j<i; j++) { // 
				if(baseball[j] == baseball[i]) {
					i--;
				} // end of if
			} // end of for j

			System.out.println(baseball[i] + "/");  
		} // end of for i

		// baseball 값 출력
		for(int i=0; i<baseball.length; i++) {
			System.out.print(baseball[i] + " ");
		} // end of for

		//			///-----------------
		// 2. 사용자 입력값 answer 에 각각의 숫자로 저장
		// [ex] 3,4,5

		int [] answer = new int [3];

		// 구문 작성

		Scanner input = new Scanner (System.in);
		String input_str = input.nextLine();
		StringTokenizer st = new StringTokenizer(input_str);  
		                       // ㄴ str에 들어온 문자를 공백으로 나눔
		for(int i = 0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(st.nextToken()); 
			          // ㄴst에 들어온 문자열을 기본형 정수로 반환

		}
		//
		// answer 값 출력
		for (int i = 0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		//			
		//			 
		// 3. 값비교

		int strike =0, ball=0;
		for(int i=0 ;i < baseball.length;i++) {
			for(int j =0; j<answer.length; j++) {
				if (baseball [i] == baseball [j]) {
					if (i==j) strike++;
					else ball++;
				} // end of if
			} // end of for j
		} // end of for i

		// 4. 출력
		System.out.println("스트라이크" + strike + "/볼" + ball);

	} // end of void main
} // end of class