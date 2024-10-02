package E_method;

/* 
 * 함수가 끝나기 전에 끝내려고 할 때 : return
 * 
 * return 할 때 단 하나의 값을 반환가능
 * 
 */
public class Ex02_반환 {

	public static void main(String[] args) {

		int sum = add();
		System.out.println("합:" + sum);

	}

	static int add() {  // void 가 int 로 바뀜   <- static void add () {
		// 데이타
		int a = 10, b = 20;
		int sum = a + b ;
		return sum;  // 끝까지 안가고 여기서 끝냄. 딱하나의 값 동반가능.
		
	} // end
}  //end class
