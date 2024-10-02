package i_event;

/*
 * 이벤트 처리하기
 * 
 * 1) 이벤트 핸들러 만들기
 *   ' 이벤트 관련 클래스 
 *   ' 이벤트 관련 인터페이스 구현
 *   ' 이벤트 메소드를 오버라이딩
 * 
 * 2) 이벤트 핸들러(1번) 객체 생성
 * 
 * 3) 이벤트 밸상 컴포넌트와 2번을 연결(등록)
 * 
 * 
 * [이벤트 종류 - ActionEvent]
 *       - 버튼클릭
 *       - 메뉴아이텔 클릭
 *       - 텍스트필드 엔터쳤을때
 *       - 리스트 더블클릭
 *       
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class EventTest1  extends JFrame{

	JButton btn;


	public EventTest1 () {
		btn = new JButton ("눌러");  //일단 오류시 import 해보기 

		setLayout(new FlowLayout());
		add(btn);
		setBounds(100,100,400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	void eventproc () {
		//2) 이벤트핸들러 객체 발생
		EventHandr hndr = new EventHandr();

		//3) 
		btn.addActionListener(hndr);

	}
	//1) 이벤트핸들러
	class EventHandr implements ActionListener {//인터페이스 -> 오버라이딩 안하면 오류남

		@Override
		public void actionPerformed(ActionEvent e) {

			JOptionPane.showInputDialog(null, "이벤트발생");

		} 

	}

	public static void main(String[] args) {
		EventTest1 et = new EventTest1();
		et.eventproc();

	}

}
