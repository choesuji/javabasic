package E_method;

public class Ex05_복습 {

	public static void main(String[] args) {
		int  data1 = 1000;
		double  data2 = 1.99;

		String result = method(data1, data2);  // 메소드 호출할때 보내기 
		// msg의 값을 출력

	}

	static String method(int a, double b) { // 먼저넘어오는것 순서대로 쓰기
		// data1와 data2의 값을 여기서 출력
		System.out.println(a);
		System.out.println(b);

		String msg = "안녕하세요";
		return msg;  // 리턴의 String -> void 자리 후에 위에 메소드 앞에 

	} // end
}  // end class
