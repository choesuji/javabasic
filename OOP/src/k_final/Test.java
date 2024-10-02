package k_final;

/*
 *  final : 변경불가  // 장난치지 마세욤욤욤
 *  
 *         - class : 부모클래스 못됨
 *         - field : 값변경
 *         - method : overriding
 */ 
 class Parent {  //부모클래스에 final 붙이면 자식이 오류뜸 부모는 못붙임
	final String field = "부모님꺼";  // 변수에 final 붙이면 값변경이 안댐!!!!!!!!!!!!!!!!
	final void jib () {  // 메소드 앞에 붙이면 오버로딩 변경안댐
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent {  // 자식
	Child () {
		//
		//field = "내꺼";
		System.out.println("자식이 탕진");
	}
}


public class Test {
	public static void main(String[] args) {

		Parent p = new Child ();
		System.out.println(p.field);
		p.jib();
	}
}
