package i_access2;

import i_access2.sub.Access;

// Access 클래스와 MainTest 클래스가 다른 패키지(=폴더 =디렉토리) 안에 있는 상황

public class MainTest {

	public static void main(String[] args) {
		
		Access acc = new Access ();  //객체생성하면 Access의 프라,퍼브,프로데이타 올라옴
//		acc.a = "프라이빗 변경";  // 얘는 접근이 불가하여 변경이 안되고 기존거로 출력됨
		// 프라이빗은 오리지날이 출력된다고 보면댐
		acc.b = "퍼블릭 변경";  //모든곳에서 접근가능
//		acc.c = "프로텍티드 변경"; //
//		acc.d = "디폴트 변경"; /
		
		acc.output();
	}

}
