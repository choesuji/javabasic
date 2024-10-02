package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 5명의 국어점수를 입력하세요 (입력예시 : 10/10/10/10/10)->55/66/75/69/72
 * 총점은 0000이고 평균은 0000입니다
 */

public class Ex02_성적2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하세요 (입력예시 : 10/10/10/10/10) ->");
		String score_str = input.nextLine();

		StringTokenizer st = new StringTokenizer(score_str, "/");

		int score[] = new int[st.countTokens()];
		System.out.println(score.length);

		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}

		// 총점구하기

		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		} 
		
		System.out.println();

	}
}
