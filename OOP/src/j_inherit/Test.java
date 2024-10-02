package j_inherit;

public class Test {

	public static void main(String[] args) {

		//		Umma u = new Umma ();  //엄마객체 생성  = 메모리 올려라
		//		u.gene();  // 엄마클래스안의 것을 호출하는것
		//		u.job();


		//		
		//		Ddal d = new Ddal ();  // 먼저 부모가 올라온다 , 부모자식간에 상속맺으면..
		//		d.gene();  //딸클래스
		//		d.study(); //딸클래스
		//		d.job();  // 부모꺼 호출가능
		//		



		//***********************
		//변수는 부모 클래스이고 객체 자식 클래스 
		//		Umma dal = new Ddal();  //변수는 엄마인데 객체는 딸
		//		dal.job();
		//		//dal.study();
		//		dal.gene();  //* 오버라이딩된 함수를 자식꺼 부름


		//		Casting
		//		참조형에서 부모자식간에 캐스팅
		//
		//		**--아래경우는 아님--**
		//		*String a = new String() ;
		//		StringBuffer b  = (StringBuffer)a ;


		//Umma a = new Umma();
		//Ddal d = (Ddal)a;

		//		Ddal d = new Ddal();   //항상 부모가 먼저 메모리에 올라오고 자식이 올라옴 Umma 후에 Ddal
		//		Umma a = (Umma)d;      //d는 엄마부터 딸까지 다 참조가 가능함. a는 umma만 참조하겠다는 말
		//		// ㄴ up casting
		//		Ddal d2 = (Ddal)a;  //  down casting
		//		

		// 연산자 : instanceof
		Ddal d = new Ddal ();
		if(d instanceof Ddal) {    // d 는 Ddal의 객체가 맞니? 
			System.out.println("Ddal 클래스 객체");
		}
		if (d instanceof Umma) { // d 는 Umma의 객체가 맞니? 
			System.out.println("Umma 클래스 객체");
		}

	}

}
