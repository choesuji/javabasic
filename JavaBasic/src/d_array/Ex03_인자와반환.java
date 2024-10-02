package d_array;

public class Ex03_인자와반환 {

	public static void main(String[] args) {
		//데이타
		int a = 10, b = 20;
		int sum = add(a, b);  // 내가 보낼거
		//결과
		System.out.println("합=" + sum);
	}

	static int add(int a, int b) {  // 내가 받을거  
		// 데이타처리
		int sum = a+b;
		return sum;
	}

}
