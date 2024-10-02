package E_method;

/*
 * call by reference
 * : 메소드의 인자(파라메터)의 자료형이 참조형인 경우
 * 
 * => 주소를 복사함 , "원본에 영향을 미친다"   / 값이 아님
 *  */
public class Ex06_callbyReference {

	public static void main(String[] args) {

		StringBuffer a = new StringBuffer ("안녕");
		StringBuffer b = new StringBuffer ("하이");

		add(a, b);
		System.out.println("2. A="+a+", B="+b);
	}

	static void add (StringBuffer a, StringBuffer b ) {
		a.append(b);  // 안녕 만 출력이 아니라 안녕하이가 나옴 "문자열붙이기"
		System.out.println("1. A="+a+", B="+b);  // a문자열에 b를 붙이고 b는 그대로 출력
	}

} // end class
