package c_control;

public class Ex07_369게임 {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) { // 1~50사이의 정수, 1씩 증가
			int su = i; // i값 // su라는 변수에 i값 넣기 (1~50)
			boolean su369 = false; // 논리형변수

			// while 은 treu 일 경우 진행된다
			while (su != 0) { // While: 반복이고 , su(i값이)0이 아니라면
				int na = su % 10; // na라는 변수에 (1~50)나누기 10
				if (na == 3 | na == 6 | na == 9) {
					// su(1~50sk나누기10 =3일때,6일때,9일때
					System.out.print("짝"); // 짝을 출력하세요
					su369 = true; //
				}
				su = su / 10;
				
			} // end of while
			
			if (!su369)
				System.out.println(i);
			else
				System.out.println();
		} // end of for i

	}

}
