package j_inherit;

public class Umma extends Object {  // 쓰지않아도 자동으로 Object에 상속받는다 (Object단군격)

	public Umma () {  // 엄마 생성
		System.out.println("엄마 생성");
	}
	
	public void gene() {
		System.out.println("부모는 부모다");

	}
	
	public void job() {
		System.out.println("엄마는 대장");
	}
}
