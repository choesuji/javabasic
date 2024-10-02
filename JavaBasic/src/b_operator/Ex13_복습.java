package b_operator;

public class Ex13_복습 {

	public static void main(String[] args) {
		
		int kor = 45;
		int eng = 67;
		int math = 77;
		
		int total = kor + eng + math;
		System.out.println("총점 " + total);
		
		// 총점이 150보다 크고 250보다 작으면 '보통반' 입니다 출력
		if (total > 150 && total < 250) { 
			System.out.println("보통반 입니다");
		}
//		if (150 > total < 250)  -> 불가함
		
		
		
	}

}
