package c_control;

public class Ex05_for_개념 {

	public static void main(String[] args) {

		//		
		//		int result = 1;
		//		for ( int a = 1; a <= 10 ; a++  ) {    
		//			result = result + a;
		//		}
		//		System.out.println("결과: " + result);

		//		for(int a = 10; a > 0 ; a=a-2 ) {
		//			System.out.println(a);
		//		}

		int odd =0, even=0;
		//		
		//		for (int i =1; i <=10 ; i++) {
		//			if(i % 2 == 0) {
		//				odd += i;
		//			} else {
		//				even += i;
		//			}
		//		}
		//		System.out.println("홀수의 합:" + odd);
		//		System.out.println("짝수의 합:" + even);

		for(int i = 1; i <= 10 ; i+=2) {
			odd += i;
			even += (i + 1);
		}
		System.out.println("홀수의 합:" + odd);
		System.out.println("짝수의 합" + even);


		//		for (char ch = 'z'; ch>='a' ; ch--) {
		//			System.out.println(ch);

		//		for (char ch = 'A' ; ch<='z' ; ch++) {
		//			System.out.print(ch); // lm을 빼는것은 개행없이 보겠다
		//		}


	}
}

