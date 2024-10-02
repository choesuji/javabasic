package b_operator;

public class Ex10_종합 {

	public static void main(String[] args) {
		
		int z = 10 - 7 ^ 3 + 1 * 2 & 4;
	//	                     ^^^^^
	//	                      2-1번
    //          ^^^^^^   ^^^^^^^^
	//         (10-7)3 3번  (3+2) 5 -2번	
	//               ^^^^^^     ^^^^^^^	             4번 해설 4=0100
	//	               5번         4번                        5=0101
		//                                           --------------
		//                                             &       0100  => "4"
		//                                           5번 해설  4=0100
		//                                             ^      3=0011 
		//                                            --------------
		//                                                      0111 => "7"
		
//		int i = 5;
//		System.out.println(i++);
//	    System.out.println(i++);
//	    
//		
//		int a = -5;
//		if ( (a>0) & ( ++a / 3 > 0 ) ) {   // 앞이 F면 뒤를 수행하지 않음
//			a++;
//		}
//		System.out.println("A="+a);
//		
	}

}
