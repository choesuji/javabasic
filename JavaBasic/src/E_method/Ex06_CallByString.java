package E_method;

public class Ex06_CallByString {

	public static void main(String[] args) {
		String a = "안녕";
		String b = "하이";

		add (a,b);
		
		System.out.println("2. A="+a+", B="+b);
	}

	static void add (String a, String b) {
		a += b;  // a = a+b;
		System.out.println("1. A="+a+", B="+b);  // a에 a+b 즉 안녕하이 들어감 
	}
}
