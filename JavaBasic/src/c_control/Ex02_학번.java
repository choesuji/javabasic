package c_control;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex02_학번 {

	public static void main(String[] args) {


		String id = "2017111001";      //숫자열로 되어있지만 문자열로 처리
		int sid = id.indexOf(4);

		//맨 앞의 4자리는 입학년도

		String into = id.substring(0,4); // 2~1앞에까지의 숫자 
		
		// 단과 구하기
		char dan = id.charAt(4);
		
		
		// 학과
		String hak = id.substring(5,7);  //5부터 시작해서 7까지 읽는다

		String college = "";
		String temp ="";
		String temp3 = "";

		if (dan == '1') {
			college = " 공대";
			

			// 11 = 컴퓨터학과; 12 = 소프트웨어; 13 = 모바일; 22 = 자바과; 33 서버과;
			if (hak.equals("11")) {
				temp = "컴퓨터학과";
			} else if (hak.equals("12")) {
				temp = "소프트웨어";
			} else if (hak.equals("13")) {
				temp = "모바일";
			} else if (hak.equals("22")) {
				temp = "자바";
			} else  {
				temp = "서버과";
			}

			// 11-사회학과 12 경영학과 13 경제학과

		} else if(dan == '2') {
			college = "사회대";
			if (hak.equals("11")) {
				temp3 = "사회학과";
			} else if (hak.equals("12")) {
				temp3 = "경영학과";
			} else {
				temp3 = "경제학과";
			}
			// 결과출력
			String result = id + "는" + into + "년도에 입학한 " + college + temp + "학생입니다"; 
			System.out.println(result);

		}
	}
}






