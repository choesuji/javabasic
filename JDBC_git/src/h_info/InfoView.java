package h_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.mysql.cj.protocol.a.StringValueEncoder;

public class InfoView extends JFrame {

	// 0. 멤버변수 선언
	TextArea ta;
	TextField tfName,  tfId, tfTel, tfSex, tfAge, tfHome;
	JButton bAdd, bShow, bSelect, bDelete, bCancel, bExit ;

	// 모델단 변수
	infoModel model;

	// 1. 객체 생성
	InfoView(){
		ta      = new TextArea();
		tfName  = new TextField(20);   // 20자 
		tfId    = new TextField(20);
		tfTel   = new TextField(20);
		tfSex   = new TextField(20);
		tfAge   = new TextField(20);
		tfHome  = new TextField(20);
		bAdd    = new JButton("추가");  	//추가 버튼
		bShow   = new JButton("보기");	//쇼 버튼
		bSelect = new JButton("수정하기");
		bDelete = new JButton("삭제");
		bCancel = new JButton("취소");
		bExit   = new JButton("나가기");	//나가기 버튼
		
		try {							// 트라이 캐치, 뜨로우 차이점 알기
			model	= new InfoModelImpl();
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}	// 변수 선언 후 객체 생성 후 트라이 캐치
		

	}

	// 2. 화면 붙이기 및 출력
	void addLayout() {

		// South 영역
		JPanel p_south = new JPanel();
		p_south.setLayout(new GridLayout(1,6));
		
		p_south.add(bAdd);
		p_south.add(bShow);
		p_south.add(bSelect);
		p_south.add(bDelete);
		p_south.add(bCancel);
		p_south.add(bExit);
		
		// 왼쪽(서쪽)
		JPanel p_west = new JPanel();
        p_west.setLayout(new GridLayout(6,2));
		p_west.add(new JLabel("이름"));
		p_west.add(tfName);
		p_west.add(new JLabel("주민번호"));
		p_west.add(tfId);
		p_west.add(new JLabel("전화번호"));
		p_west.add(tfTel);
		p_west.add(new JLabel("성별"));
		p_west.add(tfSex);
		p_west.add(new JLabel("나이"));
		p_west.add(tfAge);
		p_west.add(new JLabel("집"));
		p_west.add(tfHome);
		
		
		
		
		// 전체영역
		setLayout(new BorderLayout());
		add(p_south, BorderLayout.SOUTH);
		add(ta,      BorderLayout.CENTER);
		add(p_west,  BorderLayout.WEST);
		
		
		
		//화면 출력
		setBounds(100, 100, 800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
		// 3. 이벤트 처리
	void eventProc() {
		//'Add' 버튼이 눌렸을때
		bAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInfo();	
				showInfo();
			}
		});
	
		// 'Exit'버튼이 눌렸을 때
		bExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
	        }
		});
		
		// '수정하기'버튼이 눌렸을 때
		bSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifyInfo();
	        }
		});
		
		
		
		// '삭제'버튼이 눌렸을 떄
		bDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteInfo();  // 딜리트 인포 함수 호출
				showInfo();
	        }
		});
		
		// 'Cancel' 버튼이 눌렸을 때
		bCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearText();
	        }
		});
		
		// show 버튼이 눌렸을 때
		bShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showInfo();
	        }
		});
		
		// 전화번호 텍스트필드에서 엔터쳤을 때
		tfTel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 getInfo(); // getInfo 함수 호출
			} 
		});
		
		// 주민번호 텍스트필드에서 엔터쳤을 때
		tfId.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				
				// 성별 출력하기
				String id = tfId.getText();
				// System.out.println("사용자 입력 주민번호:"+ id);
				char sung = id.charAt(7);
				if(sung == '1' | sung == '3') {
					tfSex.setText("남성");
				}else {
					tfSex.setText("여성");
				}
				
				// 출신지 출력하기
				char city = id.charAt(8);
				 
				String local ="";
				switch(city) {
				  case'0' : local = "서울";  break;
				  case'1' : local = "인천";  break;
				  case'2' : local = "경기";  break;
				  case'3' : local = "부산";  break;
				  case'4' : local = "광주";  break;
				  default : local = "한국";
				}
				
				tfHome.setText(local);
				
				
				 // 나이 출력하기
			    String nai = id.substring(0, 2);		    
			    int sunai = Integer.parseInt(nai);
			    
			    //----올해년도 구하기---
			    Calendar cal = Calendar.getInstance();
			    int year = cal.get(Calendar.YEAR);
			    
			    int age = 0;
			    
			    // char sung = id.charAt(7);
			    if(sung == '1' || sung == '2') {			    	
			    age = 2024 - (1900+sunai) +1;			        // 2000년생 이전 나이 계산
			    } else if (sung == '3' || sung == '4') {		 // 2000년생 이후 나이 계산	    
			    age = 2024 - (2000+sunai) + 1;			    
			    }
			    
			    String suage = Integer.toString(age); //int를 String으로 형 변환
			    tfAge.setText(suage);
			    
			} // end of 116행
		
		});

		
	} // end of eventProc()
	
	

	// 화면의 각각의 값으로 해당 레코드의 정보를 수정
	void modifyInfo() {
		// 사용자 입력값을 받아오기
		String name = tfName.getText();
		String id 	= tfId.getText();
		String tel 	= tfTel.getText();
		String sex	= tfSex.getText();
		int	   age  = Integer.parseInt(tfAge.getText()); // 입력받아오는 건 모두다 스트링이다. 때문에 스트링으로 숫자 입력 받은후 형변화를 시켜줘야 하는데 
		String home = tfHome.getText();				// 스트링은 자료형, 인트는 기본형이므로 인티저.파스 함수를 사용해야한다.
		
		InfoVO vo = new InfoVO();
		vo.setName(name);				// InfoVo의 vo라는 변수명으로 입력 받은 값들을 한덩어리로 저장함 왜냐면 200행의 괄호에 한번에 넣어주기 위해
		vo.setId(id);					// 이렇게 하지 않으면 일일히 순서와 변수명을 맞춰서 괄호 안에 다 넣어줘야함
		vo.setTel(tel);
		vo.setAge(age);
		vo.setSex(sex);
		vo.setHome(home);
													// VO : value of
		try {											// DTO : data transfer object
			model.modifyInfo(vo);
			ta.setText("입력한 정보로 수정되었습니다."); // 이 문구가 뜨면 입력에 성공 했다는 뜻
			clearText(); 							// 입력에 성공해서 입력된 텍스트를 다 지워냄
		}catch(Exception ex) {
			ta.setText("수정 실패 :" + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	// 디비에서 전체목록을 검색해서 텍스트에어리어에 출력
	void showInfo() {	
		try {
			ArrayList<InfoVO> list = model.selectInfoAll();   //<> 제너릭스 썼으면 꼭써줘야함

//			for(int i=0; i< list.size(); i++) {  // 제너릭스 안썼으면 이거로 사용
//			InfoVO vo = list.get(i);
//		}			
			ta.setText("================전체검색============\n\n");
			for(InfoVO vo : list) {
				ta.append(vo.toString());
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    // model클래스에 있는 selectInfoAll을 호출한다
	}
	
	
	
	
	// 전화번호를 얻어서 해당 고객정보를 지우기 (삭제버튼이 눌렸을 때 호출되는 함수)
	void deleteInfo() {
		String tel = tfTel.getText();
		try {
			model.deleteInfo(tel); //  tel 넘겨주기
			clearText(); // 성공하면 보이는 내용 지워주기
			showInfo();
		}catch(Exception ex){
			ta.setText("고객정보 삭제 실패:" + ex.getMessage());
			ex.printStackTrace();  // 어떤부분에서 오류가 났는지 출력해줌
			
		} // end of catch
	} // end of deleteInfo
	
	
	
	// 입력한 전화번호를 얻어와서 해당 전화번호에 고객정보를 출력
	void getInfo() {
		String tel = tfTel.getText();

		try {
			InfoVO vo = model.selectINfoByTel(tel);	// 인자가 tel 받는 게 infovo
			
			tfName.setText(vo.getName());
			tfHome.setText(vo.getHome());
			tfId.setText(vo.getId());
			tfSex.setText(vo.getSex());
			tfTel.setText(vo.getTel());
			tfAge.setText(String.valueOf(vo.getAge()));
		
		} catch(Exception ex) {
			ta.setText("전화번호검색실패:" + ex.getMessage());
			ex.printStackTrace();
		}
	}

		// 'Add' 버튼이 눌렸을 때 사용자 입력값을 받아서 DB에 저장하기
	void addInfo() {
		// 사용자 입력값을 받아오기
		String name = tfName.getText();
		String id 	= tfId.getText();
		String tel 	= tfTel.getText();
		String sex	= tfSex.getText();
		int	   age  = Integer.parseInt(tfAge.getText()); // 입력받아오는 건 모두다 스트링이다. 때문에 스트링으로 숫자 입력 받은후 형변화를 시켜줘야 하는데 
		String home = tfHome.getText();				// 스트링은 자료형, 인트는 기본형이므로 인티저.파스 함수를 사용해야한다.
		
		InfoVO vo = new InfoVO();
		vo.setName(name);				// InfoVo의 vo라는 변수명으로 입력 받은 값들을 한덩어리로 저장함 왜냐면 200행의 괄호에 한번에 넣어주기 위해
		vo.setId(id);					// 이렇게 하지 않으면 일일히 순서와 변수명을 맞춰서 괄호 안에 다 넣어줘야함
		vo.setTel(tel);
		vo.setAge(age);
		vo.setSex(sex);
		vo.setHome(home);
													// VO : value of
		try {											// DTO : data transfer object
			model.insertInfo(vo);
			ta.setText("입력한 정보가 저장되었습니다."); // 이 문구가 뜨면 입력에 성공 했다는 뜻
			clearText(); 							// 입력에 성공해서 입력된 텍스트를 다 지워냄
		}catch(Exception ex) {
			ta.setText("입력 실패 :" + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	// 화면 초기화 (입력 받은 후 하나씩 지우기 힘들어서 한번에 없애주기, 순서는 상관 없음)
	void clearText() {
		tfName.setText("");   //tfName.setText("")
		tfAge.setText("");
		tfHome.setText("");
		tfId.setText("");
		tfSex.setText("");
		tfTel.setText("");
	}
	
	public static void main(String[] args) {
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();
		
	}

}
