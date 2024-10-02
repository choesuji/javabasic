package h_info3;

import java.awt.*;  //기본설정
import javax.swing.*;

public class InfoTest extends JFrame { // 상속받으면 super 생성X? 부모신경쓸필요 없음

	// 멤버변수 선언  "첫번째"
	JTextArea ta;
	JTextField tfName, tfId, tfTel, tfAge, tfSex, tfHome;
	JButton bAdd, bShow, bSelect, bDelete, bCancel, bExit;  // 전부다 null값 들어있음

	// 1. 객체 생성  "두번쩨"
	InfoTest() {
		ta = new JTextArea();
		tfName = new JTextField(15);  //평균적인것
		tfId = new JTextField(15);
		tfTel = new JTextField(15);
		tfAge = new JTextField(15);
		tfSex = new JTextField(15);
		tfHome = new JTextField(15);
		bAdd = new JButton("Add(alt+a)", new ImageIcon("src/h_info3/Imgs/이미지7.PNG")); // 이미지 넣는거 , 경로표시 "src안에 (/->안에표시
		bShow = new JButton("Show", new ImageIcon("src/h_info3/Imgs/이미지7.PNG"));            //ㄴ 대소문자 경로 하나라도 틀리면 못찾음 
		bSelect = new JButton("Select", new ImageIcon("src/h_info3/Imgs/이미지7.PNG"));
		bDelete = new JButton("Delete", new ImageIcon("src/h_info3/Imgs/이미지7.PNG"));
		bCancel = new JButton("Cancle", new ImageIcon("src/h_info3/Imgs/이미지7.PNG"));
		bExit = new JButton("Exit", new ImageIcon("src/h_info3/Imgs/이미지7.PNG"));

		//추가작업 - 클릭하면 이미지 변경 
		bAdd.setPressedIcon(new ImageIcon("src/h_info3/Imgs/이미지2.PNG")); // 누르면 이미지 변경
		bAdd.setRolloverIcon(new ImageIcon("src/h_info3/Imgs/이미지4.PNG")); // 커서 올리면 이미지 변경
		bAdd.setVerticalTextPosition(JButton.BOTTOM);
		bAdd.setHorizontalTextPosition(JButton.CENTER);
		bAdd.setMnemonic('a'); //단축키 추가 -> alt+a 누르면 이미지 변경됨
	}


	// 화면 붙이기 및 출력
	void addLayout() {




		//south 영역 판떄기 -> 작게나눈거
		JPanel p_south = new JPanel();
		p_south.setLayout(new GridLayout(1,6));  // 버튼이 화면행에 꽉차게 나옴
		p_south.add(bAdd);
		p_south.add(bShow);
		p_south.add(bSelect);
		p_south.add(bDelete);
		p_south.add(bCancel);
		p_south.add(bExit);

		//왼쪽(서쪽)
		JPanel p_west = new JPanel();
		p_west.setLayout(new GridLayout(6,2));		
		p_west.add(new JLabel("이름"
				,new ImageIcon("src/h_info3/Imgs/이미지7.PNG"),JLabel.LEFT));  // 1행에도 그림 넣기 그림이 왼쪽에위치 
		p_west.add(tfName);
		p_west.add(new JLabel("주민번호",new ImageIcon("src/h_info3/Imgs/이미지7.PNG"),JLabel.RIGHT));  // 그림 오른쪽위치
		p_west.add(tfId);
		p_west.add(new JLabel("전화번호",new ImageIcon("src/h_info3/Imgs/이미지7.PNG"),JLabel.CENTER));  // 그림 중앙 위치
		p_west.add(tfTel );
		p_west.add(new JLabel("나이"));
		p_west.add(tfAge);
		p_west.add(new JLabel("성별"));
		p_west.add(tfSex);
		p_west.add(new JLabel("출신지"));
		p_west.add(tfHome);			




		// 전체영역
		setLayout(new BorderLayout());
		add(p_south,BorderLayout.SOUTH);
		add(ta,BorderLayout.CENTER);
		add(p_west,BorderLayout.WEST);


		//화면출력 (사이즈/크기 말함)  "세번째"
		setBounds(100, 100, 900, 900);  // 창의 크기 사이즈 의미
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // X누르면 완전히 프로세스를 끝낸다는 의미
	}


	public static void main(String[] args) {  
		InfoTest info = new InfoTest ();
		info.addLayout();
	}
}


