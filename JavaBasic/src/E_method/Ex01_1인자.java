package E_method;

public class Ex01_1인자 {

	/*
	 * 인자 : argument
	 * 매개변수 - parameter
	 * 
	 * 인자 : = 매개변수 
	 */
	public static void main(String[] args) {
		//데이타 
		int a = 10, b = 20;  

		
		add(a , b);  // 인자 : argument -> 함수호출할때 데려가는애 넘어가는애  함수선언
	}

	static void add(int a,int b) { // 매개변수 :parameter  넘어온애
		// 데이타에 대한 처리
		
		int sum = a + b;
		System.out.println("합:" +sum);
	
	} // end add 
} //end class
