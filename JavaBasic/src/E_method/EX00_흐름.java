package E_method;

public class EX00_흐름 {

	

		
		static void method() {  //void ??
			System.out.println("method 실행"); // 1-1의 출력
		}
		
		public static void main(String[] args) {  // 시작 1번
		
			System.out.println("main 시작");  // 1 -1번
		method(); // 1 -1번
		method(); // 1 -1번
		method(); // 1 -1번
		System.out.println("main 끝"); //2번
	}

	}

