package h_innerclass;

/*
 * inner class : 클래스 안에 클래스 (멤버취급)  / 스태틱은 멤버끼리 공유하고 싶을때 
 */

class Outer{  // 하나의 패키지안에 클래스 2개
	static class Inner {
		static void najabara() {
			System.out.println("잡아봅시다");
		}
	}
}

public class MainTest {  // 클래스명과 같은곳에만 퍼블릭 붙일수 있음

	public static void main(String[] args) {
		//	Outer o = new Outer ();
		//	Outer.Inner in = o.new Inner ();
		//	in.najabara();
		//	Outer.Inner in = new Outer.Inner();
		//	in.najabara();
		Outer.Inner.najabara ();
	}

}
