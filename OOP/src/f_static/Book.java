package f_static;
/*
 * static : 공유
 *      메모리 단 하나 설정(지정)  스태틱 없으면 객체 안에마다 생성
 *      클래스명으로 접근!!!!!!*******
 *      공유하려고 사용
 *      클래스명 접근하려고 사용 
 *      
 */
public class Book {

	  
		private static int count;   // 멤버변수
		//캡슐화가 프라이빗
		
		static {  // 딱한번 불려지고 초기화
			System.out.println("딱한번");
		}
		public Book() {  //생성자함수 void 쓰면 안댐!!!
		count++;
		System.out.println("책객체생성");
		}
		
		public static int getCount() {
			return count;
		}

	}


