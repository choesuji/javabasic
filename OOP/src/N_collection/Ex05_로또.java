package N_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05_로또 {

	public static void main(String[] args) {

		Set lotto = new HashSet ();

//		for (int i = 0 ; i<6 ; i++) {  //돌리면 6개 중복숫자 제외로 나오지만, 숫자가 중복될경우 4개가 나올수도 5개가 나올수도 있음
//			int num = (int) (Math.random()*45)+1;
//			lotto.add(num); 
//		}
		
		while (lotto.size() < 6) {  // 무조건 6개의 중복없는 숫자가 나온다.
//			int num = (int) (Math.random()*45)+1;
//			lotto.add(num); 
			
			lotto.add((int)(Math.random()*45)+1);
		}  // 줄임말 변수
		
		List list = new ArrayList(lotto);
	    Collections.sort(list);
		System.out.println(lotto);
	}

}
