package j_inherit_sample;

import java.awt. *;

//  상속  (2개이상 동시상속 불가 = 단일상속만 가능) , 다른언어는 가능,
public class Test2 extends Frame {  //

	Frame f;
		
	Test2() {
		super("나의 두번째 창");  // 부모 호출
		setBounds(100, 100, 500, 400);
		setVisible(true);
		
	}
	
	//없으면 만들어서 사용 
	
	public static void main(String[] args) {
		
		
		Test2 t = new Test2 () ;

	}

}
