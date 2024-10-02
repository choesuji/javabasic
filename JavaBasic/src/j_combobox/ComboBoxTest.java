package j_combobox;

// *의 모든것은 클래스의 모든것을 참조하는것이고 하위폴더는 통용되지 않는다.
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxTest extends JFrame {  // J는 다 improt swing 이다
	//[1] 멤버변수
	JComboBox cbYear, cbMonth, cbDate;
	JButton btn;
	JLabel laDay;  //요일




	//[2]객체생성 
	public ComboBoxTest() {  // 콤보막스의 년 안에 실제 년도 넣을라면 여따가 걸기

		Integer [] strY = new Integer [11];  // '연도' 배열처리
		for(int i = 0, y = 2020; i <11 ; i++) { // ;기준으로 앞,뒷부분은 초기치 부분이기때문에 추가해줘두댐
			strY[i] = y++;
		}

		Integer [] strM = new Integer [12];  // '월' 배열처리
		for(int i = 0 ; i < 12; i++ ) {
			strM[i] = i+1;
		}

		Integer [] strD = new Integer [31];  // '요일' 배열처리
		for(int i = 0 ; i < 31 ; i++) {
			strD[i] = i+1;
		}

		cbYear   = new JComboBox(strY);  
		cbMonth  = new JComboBox(strM);
		cbDate   = new JComboBox(strD);
		btn      = new JButton("▶");  // ㅁ+한자 로 넣음
		laDay    = new JLabel("요일");  //일단 요일 넣고 값지정 나중에

	}


	//[3]화면구성(보이기)
	public void addLayout() {
		setLayout(new FlowLayout());
		//붙이기
		add(cbYear);            // 콤보박스 버튼만
		add(new JLabel("년"));	//콤보박스 옆에 '년' 글씨넣는거	
		add(cbMonth);
		add(new JLabel("월"));  
		add(cbDate);
		add(new JLabel("일"));
		add(btn);

		add(laDay);


		//창 만들고 띄우고는 부분	
		setBounds(100,100,500,200); // 창의 크기=사이즈
		setVisible(true); // 창 띄우는거
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // x누름 닫힘


	}


	//[4]이벤트처리
	public void eventProc() {


		// 버튼눌렸을 때
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputDay();
			}
		});

		// 연 콤보박스 눌렸을때 
		cbYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDay();


			}
		});

		// 월 콤보박스 눌렸을 때
		cbMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDay();


			}
		});
	} // end of eventPro ()
	/*
	 * 선택한 년과 월에 따라서 일수를 변경 ex) 2월 선택시 28일 또는 29일로 변경
	 */

	void setDay() {

		Integer [] lastDays = {31, 28, 31, 30, 31, 30, 31,31,30,31,30,31} ;
		
		//윤년구해서 2월은 4년에한번 29일로 
		Integer y = (Integer)cbYear.getSelectedItem();
		if  (y%4==0 & y%100 != 0 | y%400==0) {
			lastDays [1] = 29;   //1번째값 즉 2월 을 29일로 하고 
		} else {
			lastDays [1] = 28;   //1번째값 즉 2월 을 28일로 한다
		}
		
		Integer m = (Integer)cbMonth.getSelectedItem();
		// Integer 에 4 넣으면 4월을 의미
		
		cbDate.removeAllItems();  // 모두 지워줄껴
		for(int i = 1; i<=lastDays[m-1]; i++) {
			cbDate.addItem(i);
		}
	}

	/*
	 * 년,월,일 값을 얻어서 요일 구하고 출력
	 */

	void outputDay() {
		Integer y = (Integer) cbYear.getSelectedItem();  // 연도 받아옴
		//System.out.println(y+ "년도");  -> 확인용 찍어보기
		Integer m = (Integer) cbMonth.getSelectedItem(); // 월 받아옴
		Integer d = (Integer) cbDate.getSelectedItem();  // 일 받아옴
		//System.out.println(y+"/"+m+"/+d");

		Calendar cal = Calendar.getInstance(); // 지금현재의 연월일 시분초로 셋팅됨 여기까지만 하면,,,,
		cal.set(y,  m-1, d);
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		String [] yoil = {"일","월","화","수","목","금","토"} ;
		// 0    1   2    3   4    5   6
		String msg = yoil[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일";
		laDay.setText(msg);;



	} // end of outputDay ()

	/*
	 * 화면에 출력될 때 처음부터 오늘날짜 지정하기 (뜨자마자 오늘날짜로 셋팅되서 뜨게끔)
	 */
	
	void initial() {
//		Calendar cal = Calendar.getInstance();
//		LocalDate date = LocalDate.now();
		
		
		
	}
	
	public static void main(String[] args) {
		ComboBoxTest cb = new ComboBoxTest();
		cb.addLayout();
		cb.initial();  // 창 뜨자마자 오늘날짜로 셋팅되어 있게
		cb.eventProc();

	}

}
