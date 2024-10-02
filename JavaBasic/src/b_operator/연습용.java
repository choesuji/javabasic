package b_operator;

import java.util.Scanner;

public class 연습용 {

	public static void main(String[] args) {

//     char c = 'A';
//     System.out.println(c);
//     System.out.println('A');
     
//    Scanner input = new Scanner(System.in);
//    
//    System.out.println("연도를 입력하세요 ==> " );
//    String input = Scanner.nextLine();
//    
//    
//      ------------2단계-------------------
		// 숫자 3개를 입력받아서 그 중 제일 큰 수를 출력하기 , if문 가능하고 삼항도 가능

		Scanner input = new Scanner (System.in);
		
		System.out.println("가장 큰 수를 찾으시오 ");
		int num1 = input.nextInt();    // 콘솔창에 29
		int num2 = input.nextInt();    // 콘솔창에 96
		int num3 = input.nextInt();    // 콘솔창에 100
		
		int max = num1;                // 제일 큰 수가 num1 (29) 라면
		if (num2 > max)                // num2(96)가 max(29)보다 크면 
			max = num2;                // 제일 큰 수는 num2가 된다
		if (num3 > max)                // num3(100)이 max(29)보다 크면
			max = num3;                // 제일 큰 수는 num3가 된다
		
		System.out.println("가장 큰 수는: " + max);
		
			
		
		
		
		
		
		
		
		

	}

}
