package j_inherit2;

/*
 *  this 와 super
 *     this : 자기 객체를 지정
 *     super : 부모 객체를 지정
 *     
 *  this() 와 super()   - 함수
 *     this() : 다른 생성자를 호출
 *     super() : 부모 생성자를 호출
 */

public class Book extends Item {

	private String writer;  // 자식이 없으면 private -> 다른애들 접근못하게 막는거 
	private String publisher;

	public Book() {
		//super();
		num = "0000";
		title = "제목없음";
		publisher = "미정";
		writer = "무명";
		System.out.println("자식 기본생성자");
	}
	
	public Book (String num, String title, String publisher, String writer) {  // 생성자함수 만드세요 라는뜻 기본으로 만들어야함
		//super.num       = num       ;   //부모꺼는 super서야함
		//super.title     = title     ;   //부모꺼는 super서야함
		super(num,title);
		this.publisher = publisher ;
		this.writer    = writer    ;
		System.out.println("자식 인자 생성");
	}
	
	//
	public void output () {
		System.out.println("책번호 : " + num);
		System.out.println("책제목 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("작가 : " + writer);
       // 결과값은 세터나 생성자 함수로 넣기
		
		
		
	}
}
