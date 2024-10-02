package b_operator;

/*
 *    비교연산자
 * 
 *       >   >=   <   <=   ==   !=
 *       
 */
public class Ex05_비교연산자 {

	public static void main(String[] args) {
		
		int kor =89, eng=87, math=77;  
		
        int total = kor + eng + math ;
        System.out.println("총점을 구하시오 " + total);
        
        double avg = (double)total / 3;
        System.out.println("평균을 구하시오 " + avg);
        
/* [학점구하기
 * 
 * 평균이 90점 이상이면 A학점             
 * 평균이 80점 이상이면 90점미만이면 B학점
 * 평균이 70점이상 80점미만이면 C학점
 */
   if( avg >= 90) {                          // 만약에 avg값이 90 이상이라면
	   System.out.println("A학점");           // 그렇다면 'A'학점 출력
   } else if ( avg >= 80) {                  // 그렇지않다면 만약에 avg값이 80 이상이라면
	   System.out.println("B학점");           // 그렇다면 'B'학점 출력
   } else if ( avg >= 70) {                  // 그렇지않다면 만약에 avg값이 70 이상이라면
	   System.out.println("C학점");           // 그렇다면 'C'학점 출력
   }
	}
}

//   /* 
//    * if( avg >= 70) {                          // 만약에 avg값이 70 이상이라면
//	   System.out.println("C학점");           // 그렇다면 'C'학점 출력
//   } else if ( avg >= 80) {                  // 그렇지않다면 만약에 avg값이 80 이상이라면
//	   System.out.println("B학점");           // 그렇다면 'B'학점 출력
//   } else if ( avg >= 90) {                  // 그렇지않다면 만약에 avg값이 90 이상이라면
//	   System.out.println("A학점");           // 그렇다면 'A'학점 출력
//   }
//    */
   
   
	   
	   

