package emp_exericse;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EmpView {

	// 화면 관련 멤버변수
	JFrame f;
	JTextField tfEmpno, tfEname, tfSal, tfJob;
	JButton bInsert, bUpdate, bDelete, bSelectAll;
	JTextArea ta;
	
	//#########################
	// 모델단 멤버 변수
	
	
	// 멤버변수 객체 생성
	EmpView(){
		
		//#########################
		// 모델단 멤버변수 객체 생성
		
		
		f = new JFrame("나의 연습");
		tfEmpno = new JTextField(10);
		tfEname = new JTextField(10);
		tfSal = new JTextField(10);
		tfJob = new JTextField(10);
		bInsert = new JButton("입력");
		bUpdate = new JButton("수정");
		bDelete = new JButton("삭제");
		bSelectAll = new JButton("전체검색");
		ta = new JTextArea();
	}
	
	// 화면 구성
	void addLayout() {
		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1,2));
		
			JPanel pNorth1 = new JPanel();
			pNorth1.setLayout(new GridLayout(4,2));
			pNorth1.add(new JLabel("사번"));		pNorth1.add(tfEmpno);
			pNorth1.add(new JLabel("사원명"));		pNorth1.add(tfEname);
			pNorth1.add(new JLabel("월급"));		pNorth1.add(tfSal);
			pNorth1.add(new JLabel("업무"));		pNorth1.add(tfJob);
			
			JPanel pNorth2 = new JPanel();
			pNorth2.setLayout(new GridLayout(4,1));
			pNorth2.add(bInsert);
			pNorth2.add(bUpdate);
			pNorth2.add(bDelete);
			pNorth2.add(bSelectAll);
		
		pNorth.add(pNorth1);
		pNorth.add(pNorth2);
		
		f.add(pNorth, BorderLayout.NORTH);
		f.add(new JScrollPane(ta), BorderLayout.CENTER);

		f.setBounds(200, 200, 600, 500);
		f.setVisible(true);
	}
	
	// ******************************************************************************
	// 버튼 및 텍스트필드 이벤트 관련
	void eventProc() {
		// 입력버튼이 눌렸을 때
		bInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				
			}
		});
		
		// 사번 텍스트필드에서 사번 입력 후 엔터 쳤을 때
		
		// 사번 입력 후 삭제버튼 눌렸을 때
		
		// 수정 버튼이 눌렸을 때
		
		
	}
	
	
	public static void main(String[] args) {
		EmpView view = new EmpView();
		view.addLayout();
		view.eventProc();

	}

}
