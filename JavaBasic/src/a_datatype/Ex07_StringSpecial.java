package a_datatype;

/* 
 * @@@@@@@@@@@@@@@@@@@@@@@@@
 * 
 * String : 클래스임 (참조형)
 * 
 *       -> 참조형은 무조건 new 연산자로 메모리 확보해야함
 *       
 *       => 단, 하나 String 특권으로 new 생략해도 됨
 *        
 *      
 */
public class Ex07_StringSpecial {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String name2 = "홍길동";
		
		if (name == name2) {
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");	
		}
		
		// 문자열값을 비교한다면???
		if (name.equals(name2)) {
					System.out.println("이름이 같다");
				}
		else {
					System.out.println("이름이 다르다");
				}
		

	}

}
