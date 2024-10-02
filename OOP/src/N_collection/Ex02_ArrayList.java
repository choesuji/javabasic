package N_collection;  //왼쪽에 노란딱지는 경고정도임 받을것을 명확하게 지정하라는,,,

import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String> () ; // 4개 선언했지만 5개를 입력해도 출력됨 
		          // ㄴ 제네리스트? 노란딱지 떼는, 받을것을 명확하게 지정
		list.add("rabbit");  //내부적으로 2배씩 메모리를 동적으로 늘림 4 , 8, 16 등등 2백씩 증가 
		list.add("cat");
		list.add("dog");
		list.add("fox");
		list.add("ant");
	
		System.out.println(list);  // [rabbit, cat, dog, fox, ant]
		
		list.set(3, "lion");   //3번째애로 엎어버림
		System.out.println(list);  //[rabbit, cat, dog, lion, ant]
		
		list.add("tiger");
		System.out.println(list); //[rabbit, cat, dog, lion, ant, tiger] / tiger 추가됨
		
		list.remove(3);
		System.out.println(list);  //[rabbit, cat, dog, ant, tiger] - 3번쩨꺼 삭제됨 fox
		
		Collections.sort(list);
		System.out.println(list);  // [ant, cat, dog, rabbit, tiger] - 오름차순
		
		
		
//		for(String temp :list) {  //바뀐 향상된 for문
//			System.out.println(temp);
//		}
//		
//		for(int i=0 ; i<list.size(); i++) {  
//			String obj = (String)list.get(i);   //부모자식간에는 형변환이 된다더라~~
//			System.out.println(obj);
//		}

	}

}
