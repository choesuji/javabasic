package g_gui;

/*
 * 자바의 GUI
 *       
 *       - AWT   :1.2 이전에 사용  -> 운영체제에 따라 모양이 변함 (윈도우에따라, 리눅스에 따라 등)
 *       - Swing :1.2 이후에 사용  -> 운영체제랑 상관없음~!!!! / X누르면 창 꺼짐 개신기
 *           => J 붙이기
 */
import java. awt. *;
import javax.swing.*;

//is a 방식
// Temp2클래스가 Frame 역할을 할 예정 (부모: Frame)
public class GuiTest extends JFrame {  //J+Frame  swing 이라고

	JButton b1 = null;  //J+Button  swing 이라고
	JButton b2 = null;
	JCheckBox c1 ;  //체크박스 
	JCheckBox c2 ;  //JCheckBox c1,c2로도 가능 

	JTextField tf; //한줄입력받는
	JTextArea ta;  //여러줄 입력받는

	JLabel la; 

	JRadioButton rb_male, rb_female; // 남자, 여자 버튼생성


	GuiTest() {
		super("X누르면 닫혀요옹");  //생성자함수 이용
		//setTitle("두번째 창");  // 창에 이름 :세터사용


		//*******************************
		//메모리에 올리는거 
		b1 =new JButton("ok"); // J+Button  swing 이라고
		b2 =new JButton("cancle"); //

		c1 =new JCheckBox("잠자기",true); // J+Button  swing 이라고
		c2 =new JCheckBox("숨쉬기",true); //  true 를 추가해두면 창 뜰때 처음부터 체크되어있음 

		tf = new JTextField(20); //한줄입력받는 메모리 먼저 올리기 ,JLabel칸의 길이를 말함
		ta = new JTextArea(10, 50);  // 여러줄 입력받는 메모리 먼저 올리기 , 인수는 도움말 참고오
		//   ㄴ 10행을 의미.  50은??

		la = new JLabel("이름입력");  // 사용자에게 안내판같은 역할, 글씨만 띄워지는... 딱히 하는거 없음 
		// 멤버변수, 객체생성 안함

		rb_male = new JRadioButton ("남자");  //true 쓰면 체크되서 나옴 
		rb_female = new JRadioButton ("여자");
		ButtonGroup bGrp = new ButtonGroup(); //버튼그룹은 하나를 체크하면 하나가 풀리는 그거 말하는거임 
		bGrp.add(rb_male);
		bGrp.add(rb_female);		

		//*******************************	
		/*
		 *  레이아웃: 화면에 붙이는 스타일
		 *  1. FlowLayout : 
		 *  ' 윗줄 상단에 한 줄 붙이기
		 *  ' 폭의 크기에 따라 다음 줄에 붙음
		 *  ' 컴포넌트 크기 고정 
		 *  
		 *  2. GlridLayout 
		 *  ' 행과 열에 맞춰서 동일 크기로 붙임
		 *  ' 컴포넌트 크기 변경
		 *  
		 *  3. BorderLayout
		 *  '정해진 5영역에 붙임
		 *  '동,서,남,죽,중앙 ->5영역
		 *  '컴포넌트 크기 변경
		 */
		//버튼 나뉘는 모양
		setLayout(new FlowLayout());  //스타일은 업그레이드가 아님  
		//setLayout(new GridLayout(5,2));  // 5행 2열의 크기로 붙음!!
		//setLayout(new BorderLayout());      //5개밖에 못붙이므로 add에서 5개만 지정해서 설정해서 하기
		// ex) add(b1,BorderLayout.WEST); 이렇게 붙이면 됨 동,서,남,북,중앙 만 가능함
		
		//화면붙이기
		add(b1,BorderLayout.WEST);   // 프레임에 버튼 붙이기 -> BorderLayou에 한해서 panel을 사용함 꼭 알아두기 
		add(b2,BorderLayout.EAST);

		add(c1,BorderLayout.NORTH);
		add(c2,BorderLayout.SOUTH);

		
		JPanel p_center = new JPanel();
		p_center.setLayout(new GridLayout(2,2));  //
		p_center.add(rb_male);
		p_center.add(rb_female);
		p_center.add(new JLabel("이름입력"));
		p_center.add(tf);
		add(p_center, BorderLayout.CENTER);
		
		//add(new JLabel("이름입력"),BorderLayout.CENTER); //JLabel 생성하면서 객체를 바로 붙여버림
//		add(tf);
//		add(new JLabel("메세지입력")); //JLabel 생성하면서 객체를 바로 붙여버림
//		add(ta);
//
//		add(rb_male);
//		add(rb_female);

		//*******************************
		// 화면에 출력
		setBounds(400, 400, 1000, 400);  // 프레임의 위치와 크기 지정
		setVisible(true);               // 프레임에 화면 출력

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // JFrame을 X누르면 닫을때 나갈꺼야!~~~~~~

	}

	public static void main(String[] args) {

		new GuiTest ();

	}
}
