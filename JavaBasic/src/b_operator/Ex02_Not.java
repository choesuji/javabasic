package b_operator;

/*
 * not : 결과에 반대로 하는 연산자
 * 
 * 일반논리 - (trye/false) not : ! 
 * 이진논리 not : ~ 
 */
public class Ex02_Not {

	public static void main(String[] args) {
		
		// 일반논리 not
		boolean result = 3 > 4;
		System.out.println(result);   //false 로 나옴
		System.out.println(!result);  // true 로 나옴
		
		// 이진논리 not
		int a = 15;               //   00000000  00000000 00000000 00001111
	                              //  0: 양수 , 1: 음수
		System.out.println(a);   
		System.out.println(~a);     
		                          //  [1]1111111 11111111 11111111 11110000
		
		

	}

}
