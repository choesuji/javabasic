package c_control;

/*
 * break : 블럭을 벗어나는 문장
 * continue : 블럭의 끝으로 이동하는 문장
 */

public class Ex10_BreakkContinue {

	public static void main(String[] args) {

		//		END:
		//		for (int i =0; i<2 ; i++) {
		//			
		//			for(int j=0; j<3 ; j++) {
		//				if (j==1) break END;  // 1인경우 1은 continue에서 점프해서 출력이 안됨  //break;
		//				System.out.printf("< %d,%d > \n" ,i, j);
		//			}
		//			System.out.println("데이타");
		//		}


		//----------[정리문제]

		int i = 0, j = 0, k = 0;

		OUTER : for( i=0; i < 10 ; i++ )

			MIDDLE : for ( j=0; j < 3; j++ )

				INNER : for ( k=0; k < 4; k++ ) {

					if( i==4 && j ==2 ) break OUTER;

				}

		System.out.println( i );

		System.out.println( j );

		System.out.println(k );

} // end 

} // end
