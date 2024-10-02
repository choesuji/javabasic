package b_operator;

public class Ex09_삼항 {

	public static void main(String[] args) {

		// 점수가 80보다 크면 '합격' 아니면 '불합격' 처리

		int jumsu = 80;
		String result;
		
		if (jumsu > 80) {
			result = "합격";
		} else { 
			result = "불합격";		
		}
	System.out.println("당신은 " + result +" 이에요");
	
	String result2 =   (jumsu>80)?"합격":"불합격";
	System.out.println("당신은 " + result2);
	
		
	
	
	
	}
	
	
}
