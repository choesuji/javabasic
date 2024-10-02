package d_array;

import java.util.*;

public class Ex01_요일 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println("현재 날짜 확인 ");
		System.out.print( cal.get(Calendar.YEAR) + "년");
		System.out.print(cal.get(Calendar.MONTH)+ 1 +"월"); // MONTH는 0부터 세기때문에 1을 더해준다
		System.out.print(cal.get(Calendar.DATE) + "일");
		
		System.out.println();
		
		System.out.println("현재 시간 확인 ");
		System.out.print(cal.get(Calendar.HOUR) + "시");
		System.out.print(cal.get(Calendar.MINUTE)+ "분"); 
		System.out.print(cal.get(Calendar.SECOND) + "초");
		
		System.out.println();
				
		System.out.println("요일 확인 ");
		String [] yoil = {"일","월","화","수","목","금","토"};
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일");
		// SUNDAY : 1 -> FRIDAY : 6
		
		int yoilnum = cal.getLeastMaximum(Calendar.DAY_OF_WEEK)-1;
		System.out.println(yoil[yoilnum] + "요일");

	}   

}
