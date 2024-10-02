package j_inherit;


//***********상속  (엄마꺼를 내가 확장해서 사용한다 는 의미)
public class Ddal extends Umma {

	public Ddal() {  // 딸 객체생성
		System.out.println("딸 생성");
	}


	public void gene() {
		System.out.println("자식은 자식이다");
	}

	public void study() {
		System.out.println("딸은 학생이다");
	}
}