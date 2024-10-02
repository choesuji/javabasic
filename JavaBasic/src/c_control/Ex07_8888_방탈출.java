package c_control;

public class Ex07_8888_방탈출 {

	public static void main(String[] args) {

		//		int no = 0;
		//		for(int i = 1 ; i <= 10000 ; i++) {  // i는 숫자범위 1부터 10000까지
		//			int su = i;   // 변수 su 에 i값(1~10000) 입력
		//
		//			while(su!=0) {    // i값이 0이 아니면 true로 실행한다
		//				int na= su % 10;  //변수 na에 su(변수)를 넣어 10으로 나눈 수 를 넣음
		//				if(na == 8) {     // 변수 나누기 10에서 나머지가 8이 나온다면 1씩 증가 
		//					no++;
		//				}
		//				su = su / 10;
		//			} //while 반복문 끝
		//		} //for 반복문 끝
		//		
		//		System.out.println(no + "개");

		//-------[방탈출]

		for(int i=1; i <=10000; i++) {  //변수 1의 범위는 1부터 10000까지이고 1씩 증가한다
			int su = i;

			while (su != 0){
				int a = su % 10;
				if (a == 8)
					a++;
			}
		} //end for
		
	System.out.println (a + "개 입니다");

	} // end main
} // end  class





