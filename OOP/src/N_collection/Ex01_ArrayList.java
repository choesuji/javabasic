package N_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {

		List result = method();  // 메소드 하나 부를께요
		//처리
		for(int i = 0; i < result.size(); i++) {
			Object obj = result.get(i) ;
			System.out.println(obj);
		}
	}
	static List method () {  // 이걸 뭐라고 하나요
		// 데이타

		String name = "홍길자";
		Integer age = 100; // int (자바 1.5버전 이후에는 다 호환되니까 신경쓰지마소)
		Double height = 190.99;

		List list = new ArrayList () ;   //갯수모룰때, 메모리 과다사용 //vector 로 해도 상관없음 두개다 쓰임
		// Object [] obj = new Object [갯수]; -> 갯수명확할때, 메모리 효율적 
		list.add(name);   //add로 통일되어있음
		list.add(age);
		list.add(height);

		return list;     //결과 넘겨주세요 라는뜻  ->> 저기위에 method()로 전달하는거 
	}
}
