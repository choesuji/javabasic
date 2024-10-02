package c_control;



/* 
 * 1: int
 * '1' : char
 * "1" : String
 */
public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		
		String id = "801212-3234567";    // 주민번호,폰번호 등 문자열처리 , 숫자는 0부터 세기
		char sung = id.charAt(7);        // 몇번째글자까지 
		
		String gender = "";
		// 그 문자가 1이거나 3이라면 '남자'출력
		// 그 문자가 2거나 4이거나 0이라면 '여자' 출력
		
		if (sung == '1'|| sung == '3') {
			//System.out.println("남자");
		 gender = "남자";
			} else if (sung == '2'|| sung == '4' || sung == '0'){
			//System.out.println("여자");
		 gender = "여자";
		}
		System.out.println("당신은 " + gender + "입니다 ");
		
		
	}
}
