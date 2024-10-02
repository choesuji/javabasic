package zzz_zzz;

public class Account {  //은행계좌 (Account)클래스를 정의하여 

	String actname;  // 예금주는 String,계좌번호 String,잔액은 int로 정의
	String actnum;
	int balance;  

	public Account (String actname,String actnum,int balance ) {  // 속성값은 풀네임으로 넣어주기
		// AccountMain 에서 넣어준 파라메타값을 불러오기위해 선언 
		this.actname = actname; //여기서 this.actname가 위에값을 의미하면서 동시에 파라메타와 동일하다는것을 의미(셋다같다는 표시)
		this.actnum = actnum;
		this.balance = balance;
		//return();  맨밑에 결과값이 출력된다 여기에!!
	}

	// 메소드로 인출 및 입금 메소드를 갖는다.
	public void withraw(int withraw) {  // 인출  int withraw -> 인출 메소드는 인자로 인출할 금액을 받고 
		if(balance < withraw) {
			System.out.println("잔액이 부족합니다");  //잔액이 부족시에는 “잔액이 부족합니다”라는 메시지
		}else 
			System.out.println(balance + "원 인출합니다"); //잔액이 충분할때는 인출한 금액을 출력
	}

	public void deposit(int deposit) {  // 입금 int deposit 인자로 입금할 금액을 받고
		balance += deposit;   //입금액을 잔액에 더하고 입금한 금액을 출력

		
		System.out.println("예금주: "+actname + " 계좌번호: "+actnum+ " 잔액: " + balance);
	}


}
