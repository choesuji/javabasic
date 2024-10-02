package d_array;

public class Ex03_이차원배열연습2 {

	public static void main(String[] args) {

		//합이 가장 큰 행과 열을 구하세용

		int a [][] = new int [][] {{3,-5, 12, 3, -21}, 
			{-2, 11, 2, -7, -11}, 
			{21, -21, -35, -93, -11}, 
			{9, 14, 39, -98, -1}};

			// 변수범위
			int hap[] = new int [a.length]; 

			// 계산위치
			for (int i = 0; i<a.length; i++) {
				for (int j= 0; j< a[i].length;j++) {
					hap[i] = hap[i] + a[i][j];
				}
				System.out.println();
			}
			// 출력
			for (int i = 0; i<hap.length; i++) {
				System.out.println(i + "번째 줄들의 합:" + hap[i]);
			}
			
			
	} // end main

} // end class
