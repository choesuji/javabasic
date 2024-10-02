package g_gui;
//AWT : JDK 1.2 이전에 UI 
import java.awt.*;

public class Temp {

	Frame f = null; // null 은 기본셋팅값
	Button b1 = null;
	Button b2 = null;

	Temp() {  // 생성자함수는 클래스명과 똑같이 생성자함수는 아래서 부른다. 아직 불러지지 않은거  3.
		//객체 생성과정
		// have a 방식 
		f = new Frame("첫번째 창"); // 새로운 창을 만들었다는 뜻 , "창의 이름"
		b1 =new Button("ok"); //버튼위에 글씨
		b2 =new Button("cancle"); // 결과론적으로 보면 마지막에 cancle이 ok를 덮어서 cancle만 출력된다(일반적)

		
		//레이아웃 :컴포넌트를 붙이는 스타일 
		f.setLayout(new FlowLayout());  // 아래꺼 줄임버전이 이거
				
		//		FlowLayout f1 = new FlowLayout();  
//		f.setLayout(f1); //ok 버튼과 cancle버튼이 같이 올라감 / 이게 없으면 걍 cancle 만 올라감 왜냐면 ok를 덮어서
		
		// 화면에 붙이기 
		f.add(b1);   // 프레임에 버튼 붙이기 
		f.add(b2);   
		
		
		// 화면에 출력
		f.setBounds(100, 100, 600, 400);  // 프레임의 위치와 크기 지정
		f.setVisible(true);               // 프레임에 화면 출력
	}  //4. 종료

	public static void main(String[] args) {  // 1. 시작

		Temp t = new Temp (); // 생성자함수 호출  2. 

	}

}
