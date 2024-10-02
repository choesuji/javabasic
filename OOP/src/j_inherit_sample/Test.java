package j_inherit_sample;

import java.awt.*;


public class Test {

	Frame f;
		
	Test() {  //생성자 함수임 

		f = new Frame ("나의 첫 화면");  // 팝업창 띄워지는데 그 창 이름이 "나의 첫 화면"임
		
		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
				
	}

	public static void main(String[] args) {  // 얘가 시작점을 알리는 것임
 
		Test t = new Test ();  //제일먼저 객체 생성하면서 생성자함수가 불려짐
	}
}


