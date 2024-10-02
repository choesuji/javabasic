package f_static;

public class NoState접근 {

	String name = "홍길동";
			
	public static void main(String[] args) {  // 메모리에 올리는방법 -> 객체를 생성하는 방법밖에 없음 : 위에 스트링을 아래 결과값에 표출하는법
		
		NoState접근 obj = new NoState접근 ();  // 객체생성이 보편적인 방법  // 어제했음 -> 스캐너생성하듯 똑같이
		
		System.out.println("고객명: " + obj.name);  // 객체변수 + 스트링변수 로 쓰기
	}

}
