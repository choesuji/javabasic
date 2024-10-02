package h_innerclass;

public class Account {

	//가. 예금주는 String,계좌번호 String,잔액은 int로 정의
	String name;  //예금주
	String num; //계좌번호
	int bal; //잔액

	public Account(String name, String num, int bal) {// 함수명이 똑같아도 오버로딩
		// 얘들이 파라미터임 main에서 불러오기위해 수동으로 선언해줘야함 오버로딩임
		this.name = name; // this 안쓰고 돌리면 값이 다 안나옴
		this.num = num;
		this.bal = bal;
		result();  // 이렇게 하면 바로 맨밑에 public void result() 실행됨
	}

	//나. 나. 메소드로 인출 및 입금 메소드를 갖는다.
	public void output(int money) {    //출금하려는 금액
		if(bal < money) 
			System.out.println("잔액이 부족합니다");
		else 
			System.out.println(money+"원 인출합니다");
	} 

	public void input(int money) { //입금메소드  금액을받고 = 받을만한공간 =파라미터
		bal += money;  // 잔액갱신 -> 잔액에 입금액 더한다.
	}

	public void result() {  // 다.계좌정보 즉 얘금주,계좌번호,잔액을 출력하는 메소드를 정의하여라
		System.out.println("예금주: "+ name+"계좌번호: "+num+"잔액: "+bal+"원");
	}
}
