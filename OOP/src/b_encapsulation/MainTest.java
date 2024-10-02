package b_encapsulation;

public class MainTest {

	public static void main(String[] args) {
		// 클래스 변수 선언 + 객체생성
		Student s = new Student() ; 
        //객체 생성
		s = new Student();  // 무조건 new 사용
		
		// 값지정 및 처리
//		s.name = "홍길순";  // 길순이가 name에 저장됩디다아
//		s.kor = 88;
//		s.eng = 77;
//		s.math = 60;
		s.setName("홍길순");
		s.setKor(88);
		s.setEng(77);
		s.setMath(60);
		
		System.out.println(s.getName()+"님 총점:" + s.calTotal());
		
		
		//s.total = 300;
		System.out.println(s.getName()+"님 평균:" + s.calAvg());

	}

}
