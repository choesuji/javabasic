package d_array;

public class Ex99_정렬 {

	public static void main(String[] args) {

		int [] lotto = { 45, 2, 15, 27, 10, 42};

		//버블정렬 
		for(int i = lotto.length -1; i>0; i--) {
			for(int j = 0; j < i; j++) {
				if( lotto[j] > lotto[j+1]) {
					int temp = lotto [j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				 } //end if
			} // end for j
		} //end for i

		//출력
		for(int a = 0; a<lotto.length; a++) {
			System.out.print(lotto[a]+" ");
		} //end for a
       
	} // end main

} // end class


/*
 * [예시] bubble sort
 * 
 * [원리] insert sort
 *       select sort
//두 변수의 값 맞바꾸기   -> 반드시 임시변수 만들기
		/* int a = 5, b = 6;
 * int temp = a;
 * a = b; a자리에 b값으로 바꿈
 * b = temp;   
 */ 