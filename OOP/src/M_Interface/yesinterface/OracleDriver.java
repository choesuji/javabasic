package M_Interface.yesinterface;

// 1. DBDriver 인터페이스 구현 선언
// 2. 메소드 오버라이딩

public class OracleDriver {

	public OracleDriver() {  // 오버라이딩때는 public 기술해주기
		System.out.println("오라클 드라이버");
	}
	
	public void connect() {
		System.out.println("오라클 디비에 연결");
	}
	
	public void insert() {
		System.out.println("오라클에 데이타 입력 작업");
	}
}
