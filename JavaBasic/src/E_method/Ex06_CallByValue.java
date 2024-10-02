package E_method;

/*
 * call by value
 * : 메소드의 인자(파라메터)가 기본형인 경우
 * 
 * => 값만복사
 */
public class Ex06_CallByValue {

	public static void main(String[] args) {

		int a = 10, b = 20;
		add(a, b);
		System.out.println("2. A="+a+",B="+b); // 나중에 출력됨  // a=10 b=20
		// 일전에 값이 사라지고 int에 있는값이 그대로 들어감	(영향안줌)
	}

	static void add(int a, int b) {
		a += b; // a=a+b;
		System.out.println("1. A="+a+",B="+b);  // 1. 먼저 출력됨  a=30 b=20
		// 계산해서 출력됨 a=30 b=20
	}
}
