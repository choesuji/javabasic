package c_control;

enum Size{
	SMALL,
	MEDIUM,
	LARGE
}

public class Ex04_switch_enum {

	public static void main(String[] args) {
		
		Size size = Size.SMALL;  // 화면에서 넘어오는값 상상하기
		
		switch(size) {
		case SMALL : System.out.println("작은거"); break;
		case MEDIUM : System.out.println("중간거"); break;
		case LARGE : System.out.println("큰거"); break;
		}
		
		/*
		 * small : 1, medium : 2, large : 3 으로 프로그램 처리
		 */

//		int size = 1;  // 화면에서 넘어오는 값 상상하기
//		
//		switch(size) {
//		case 1 : System.out.println("작은거"); break;
//		case 2 : System.out.println("중간거"); break;
//		case 3 : System.out.println("큰거"); break;
//		}
	
	}

}
