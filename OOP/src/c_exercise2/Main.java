package c_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    Product p = new Product();
		
		Scanner input = new Scanner (System. in);

		System.out.println("상품번호 입력");
		p.setProductName(input.nextLine());
		
		System.out.println("상품명 입력");
		p.setProductName(input.nextLine());
		
		System.out.println("재고량 입력");
		p.setStock(input.nextInt());
		
		
	}
}
//System.out.println("총점:"+ s[i].calTotal());
//System.out.println("평균:"+ s[i].calAvg());