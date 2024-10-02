package E_method;

public class Ex99_복습1 {

	public static void main(String[] args) {  //1번 시작 ->

		System.out.println("A");  // 2번
		test(); // 2번 
		System.out.println("B");  // 8
	}
	static void test() {  // 3번
		System.out.println("C");  // 3번
		sample(); // 3번
		imsi();  //5
		System.out.println("D");	//7		
	}	
	static void sample() {
		System.out.println("E");	// 4번
	}
	static void imsi() { // 4번
		System.out.println("F");//6
		
		
	} 
}  // end class
