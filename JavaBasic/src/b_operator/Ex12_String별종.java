package b_operator;

/*
 * 문자열처리하는 클래스
 * 
 * - String 
 * - StringBuffer  / StringBuilder    ---> 얘네 둘 차이점 확인
 * 
 */
public class Ex12_String별종 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer ("홍길동");
		sb.append("바보");
		//sb = " 바보 ";
		System.out.println(sb);
		
		
		StringBuilder sb2 = new StringBuilder ("홍길국");
		sb2.append("바보");
		System.out.println(sb2);
				
		
		//String str = new String ("홍길자");
		//[특권] new 생략가능
		//      + 연산자 가능
		
		String str = "홍길자";
		str += "바보";      // str = str+ " 바보" ;
		System.out.println(str);
		
		
	}

}
