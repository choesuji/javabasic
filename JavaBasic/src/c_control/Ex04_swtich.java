package c_control;

/* 
 * 분기문 switch
 *  
 *  [주의] break; 문장 확인
 *  [주의] 문자형(char) / 정수형(int/long) / 문자열(String)
 *   
 */
public class Ex04_swtich {

	public static void main(String[] args) {

		String id = "990101-2023615";
		char chul = id.charAt(8);    //8번째 숫자  "2"

		String local = "";

		switch(chul) {
		case '0' : local = "서울"; break;   //break; --> 꼭 써줘야함
		case '1' : local = "인천/부산"; break;
		case '2' : local = "경기"; break;
		default : local = "한국"; break;  // 마지막은 break; 써두되고 안써두댐
		}

		System.out.println("당신은 " + local + " 출신 입니다 ");

	}

}


/*
 * 주민번호에서 출신지 번호가
 *  0: 서울
 *  1: 인천/부산
 *  2: 경기
 *  9: 제주
 *  나머지 : 한국
 *  if (Chul == '0') {
 *  서울
 *  } else if (chul == '1') {
 *  인천/부산
 *  } else if (chul == '2') {
 *  경기
 *  } else if (chul == '9') {
 *  제주
 *  ) else {
 *  한국
 *  }
 */

