package j_inherit2;

public class Item {  // 자동으로 Object 클래스를 상속받게 되어있고 생략되어있음

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
	
	public void output() {
		
	}


}
