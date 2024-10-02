package h_innerclass;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
	
		System.out.println("예금주 ->");
		String name = input.next();

		System.out.println("계좌번호->");
		String num = input.next();

		System.out.println("초기잔액->");
		int bal = input.nextInt();
		
		Account a1 = new Account (name, num, bal);
		
		a1.input(100);
		a1.output(1000);
//라. 예금주와 계좌번호, 초기잔액을 입력받아 은행 계좌(Account) 클래스를 객체 생성할 때 지정
	}


}



