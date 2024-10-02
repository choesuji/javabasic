package d_array;

public class Ex00_배열문법 {

	public static void main(String[] args) {

		//배열변수 선언
		//		int [] kor = null;  // int 여러개 들어가는 변수 선언할껴 , 값 초기화
		// ㄴ아직은 값이없다 는 의미 -> 초기화!!!
		//		// 배열객체 생성
		//		kor = new int [3];  // 변수 몇개잡을건지 알려줌
		//		// 들어갈 값 지정
		//		kor[0] = 100;
		//		kor[1] = 200;
		//		kor[2] = 300;
		//		
		//		//총점구하기
		//		int total = 0;   // 초기화!!!!!!!
		//		for(int i = 0 ; i < kor.length ; i++) {  // 범위내에서 반복해서 수행
		//			total += kor [i] ;          // i<4로 할경우 범위를 벗어나서 수행X 
		//		}                               // kor.length 
		//		System.out.println("총점"+total);

		// 변수선언 +배열객체 생성
		int [] kor = new int [3];  // 변수 몇개잡을건지 알려줌 //안되는이유 확인
		// 들어갈 값 지정
		kor[0] = 100;
		kor[1] = 200;
		kor[2] = 300;
		//총점구하기
		int total = 0;   // 초기화!!!!!!!
		for(int i = 0 ; i < kor.length ; i++) {  // 범위내에서 반복해서 수행
			total += kor [i] ;          // i<4로 할경우 범위를 벗어나서 수행X 
		}                               // kor.length 
		System.out.println("총점"+total);






		// 초기화
		//		// 배열변수 선언 + 객체생성 + 값지정
		//		int [] kor = {100,200,300};  // 변수 몇개잡을건지 알려줌
		//						
		//		//총점구하기
		//		int total = 0;   // 초기화!!!!!!!
		//		for(int i = 0 ; i < kor.length ; i++) {  // 범위내에서 반복해서 수행
		//			total += kor [i] ;          // i<4로 할경우 범위를 벗어나서 수행X 
		//		}                               // kor.length 
		//		System.out.println("총점:"+total);


	}
}
