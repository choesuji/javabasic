package M_Interface.yesinterface;

public class MainTest {     //함수가 100개다 = 메소드가 100개다

	public static void main(String[] args) {
		
		// 1. 오라클 디비에 연결하고 사용한다면?
		//DBDriver driver = new OracleDriver ();
		DBDriver driver = new MariadbDriver ();
		
		driver.connect ();
		driver.insert ();
		
		// 2. 오라클 디비에서 마리아 디비로 변경한다면?

	}

}
