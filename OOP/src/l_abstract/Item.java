package l_abstract;

/*
 * abstract (추상) : 미완성된 함수라는 의미 
 *         - method : 오버라이딩에 강제성을 주고싶어서
 *         - class : 객체생성을 못함 (부모클래스 역할) <-> 상반 final
 */
public abstract class Item {  // 자동으로 Object 클래스를 상속받게 되어있고 생략되어있음

	protected String num ;   // 자식은 접근할 수 있게 해줘야지 -> protected
	protected String title;


	public Item () {
		num = "0";
		title = "";
		System.out.println("부모 기본 생성자");
	}

	public Item (String num, String title) {
		this.num = num;
		this.title = title;
		System.out.println("부모 인자 생성자");
	}
	
	public abstract void output() ; //중가로를 지우면서 구현을 안하기로함 그리고 세미콜론을 통해 종료 -> 문법상은 잘못댐		
	// abstract는 미완성된 함수라는뜻으로 퍼블릭 앞이든 뒤든 상관없음
	// 하나라도 함수가 미완성을 가지고 있으면 클래스도 미완성이기 때문에 클래스에도 미완성을 같이 붙여줘야한다. 


}
