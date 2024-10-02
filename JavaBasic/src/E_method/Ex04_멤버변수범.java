package E_method;

public class Ex04_멤버변수범 {


	static int a =10, b=20;
	static int sum = 0;  // 자동초기화 되는거지만 구분어려우니 그냥 시키기. 

	public static void main(String[] args) {


		add();
		
		System.out.println("합:" + sum);
	}

	static void add() {
		sum = a + b;

	}
}
