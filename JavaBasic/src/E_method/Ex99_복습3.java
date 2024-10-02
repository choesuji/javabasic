package E_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_복습3 {

	public static void main(String[] args) {

		input();
		output();

	}
	// 문자 배열에 저장된 문자들을 화면에 출력한다
		static output() {
	
	

	// 두 정수와 알파벳 문자 하나를 입력 받는다 
	// [예] 3 4 F
	static void input() {
		Scanner input = new Scanner (System.in);
		System.out.println("첫번째 정수");
		int a = input.nextInt();
		System.out.println("두번째 정수");
		int b = input.nextInt();
		System.out.println("알파벳 문자하나");
		String str = input.nextLine();
		makeSquare(a, b, str);
		return ;

	} // end input


/* 
 * 입력받은 첫번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어 
 * 입력받은 문자를 시작으로 저장한다
 *  F G H I
 *  J K L M
 *  N O P Q
 */

static void makeSquare (int a, int b, String str) {
	char[][] ch = new char [a][b];
	for(int i = 0; i <a ; i++) {
		for (int j = 0; j <b ; j++) {
			System.out.print(ch);
		}
	}


} // end make

} // end class

