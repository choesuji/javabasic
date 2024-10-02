package zzz_zzz;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in); //예금주와 계좌번호, 초기잔액을 입력받아

		System.out.println("예금주: ");  //은행 계좌(Account) 클래스를 객체 생성할 때 지정
		String actname = input.next();

		System.out.println("계좌번호: ");
		String actnum = input.next();

		System.out.println("기초잔액: ");
		int balance = input.nextInt();

		Account a1 = new Account (actname, actnum, balance);  // 위에 입력받은 값들이 Account 에 당겨갈수 있도록 넣어주기
		//즉 변수선언?해주라는거 파라메타?
		// 파라메타 넣고나면 Account 창에서 볼수있도록 선언도 해줘야함 

		//최종 결과 
//		a1.withraw(5000);  //인출 후에 결과 확인을 출력한다.
		a1.deposit(500);   //입금 후에 결과 확인을 출력한다.
	}


}
