package c_control;

public class Ex01_if_전화번호 {

	public static void main(String[] args) {

		String tel = "032-222-2222";
		int idx = tel.indexOf('-'); 
		//System.out.println(idx);

		String localNum = tel.substring(0, idx); // 0번째부터 idx(지정된숫자)앞에까지의 문자열,하이픈앞
		//System.out.println(localNum);

		/* 지역번호가 02라면 "서울"을 출력
		 * 그렇지 않고 지역번호가 032라면 "인천" 출력
		 * 나머지는 "한국" 출력
		 */
		//		if (localNum == "02") {
		//			System.out.println("서울");
		//		} else if (localNum == "032") {
		//			System.out.println("인천");
		//		} else {
		//			System.out.println("한국");
		//		}

		String local = "";
		if( localNum.equals("02")) {               // equals 문자열비교
			local = "서울";
		} else if (localNum.equals("032")) {
			local = "인천";
		}else {
			System.out.println("한국");
		}
		System.out.println(local + "입니다");
	}




}

/* 
 * 02-222-2222
 * 032-123-1234
 * 051-555-9876
 */

