package f_static;

public class State접근 {


	static String name = "홍길동";  // static 이 붙은애는 static 이 붙은애만 접근이 가능합니다 (공유할것만 붙여라)
	                              // static 은 공유할것만, 그리고 먼저올라온다

	public static void main(String[] args) {  // static 이 붙은애는 static 이 붙은애만 접근이 가능합니다 (공유할것만 붙여라)


		System.out.println("고객명: " + name);

	}

}
