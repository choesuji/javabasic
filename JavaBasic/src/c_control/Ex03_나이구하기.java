package c_control;

import java.util.Calendar;

public class Ex03_나이구하기 {

	public static void main(String[] args) {
		
		String id = "010101-4134567";
		
		String nai = id.substring(0,2);   // substring:여러숫자   "99"
		int sunai = Integer.parseInt(nai);    // 문자열 "80" -> int형 80으로 변환해주세용
		
		
		// 올해년도 구하기
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);  
//		
//		
//		
//		int age=0;   // 초기화
//		
//		char sung = id.charAt(7);
//		if(sung=='1' || sung=='2') {
//			// 성별문자가 '1'이거나 '2라면
//			age = year - (1900 + sunai ) +1;
//		} else if (sung=='3' || sung=='4') {
//			age = year - (2000 + sunai) +1;
//		}
//		System.out.println("한국나이 ="+ age);
//		
		//만나이 구하기
		
		
	}
}

/*
 * Wrapper class : 자료형 클래스
 * 
 * int    : Integer
 * long   : Long
 * double : Double
 * 
 */

