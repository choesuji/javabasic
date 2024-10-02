package g_gui;

import java. awt. *;

// Temp2클래스가 Frame 역할을 할 예정 (부모: Frame)
public class Temp2 extends Frame {  //단일상속!!!

	Button b1 = null;
	Button b2 = null;
	
	Temp2() {
		super("두번째 창2");  //생성자함수 이용
		//setTitle("두번째 창");  // 창에 이름 :세터사용
		b1 =new Button("ok"); //버튼위에 글씨
		b2 =new Button("cancle"); //
		
		//화면붙이기
		setLayout(new FlowLayout());
		
		add(b1);   // 프레임에 버튼 붙이기 
		add(b2);
		
		
		// 화면에 출력
		setBounds(100, 100, 600, 400);  // 프레임의 위치와 크기 지정
		setVisible(true);               // 프레임에 화면 출력
		
	}

	public static void main(String[] args) {

		new Temp2 ();

	}
}
