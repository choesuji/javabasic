package d_array;

public class Ex00_반복문복습 {

	public static void main(String[] args) {
		
		// for 문
		for (int i = 0; i < 6; i++) {   // 6번 반복해달라는 말 ** 여기서는 중복된수는 못잡음ㅜㅜ
		int temp =(int) (Math.random() * 45) + 1 ; //  double 로 하면 돌릴때마다 0.**로 새로운값
		System.out.print(temp + "/");     //  ㄴ> 1~ x 사이의 숫자범위 지정해줌 (랜덤숫자범위)
		} 
		
		System.out.println();
		
		//while 문
		 int j = 0;
		while ( j < 6 ) {   // 6번 반복해달라는 말 ** 여기서는 중복된수는 못잡음ㅜㅜ
			int temp =(int) (Math.random() * 45) + 1 ; //  double 로 하면 돌릴때마다 0.**로 새로운값
			System.out.print(temp + "/");
			j++;                     //  ㄴ> 1~ x 사이의 숫자범위 지정해줌 (랜덤숫자범위)
			} 
		System.out.println();
		
		
		
		//do while 문
		 int k = 0;
		do {		  
			int temp =(int) (Math.random() * 45) + 1 ; //  double 로 하면 돌릴때마다 0.**로 새로운값
			System.out.print(temp + "/");
			k++;                     //  ㄴ> 1~ x 사이의 숫자범위 지정해줌 (랜덤숫자범위)
			} while ( k < 6 ) ; 
		System.out.println();
		
		
	}
	
}
