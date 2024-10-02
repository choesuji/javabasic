package j_inherit2;

import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {
		
		Item i = null;
		// 아이템이 몇개인지 미정
		
		Scanner input = new Scanner (System.in);
		System.out.println("원하는 상품 선택 (1.책  2.DVD 3. CD)->");
		int sel = input.nextInt();
		
		switch(sel) {
		case 1 : i = new Book ("001", "아바타2", "AI", "카메론"); break;
		case 2 : i = new Dvd ("002", "아바타2", "AI", "카메론"); break;
		case 3 : i = new Cd (); break;
		
		}
		
		i.output();  // 상황에따라 다양하게 불려짐 훨씬짧고 다형성
		 // 다형성 : Polymorphism
		}

	}

