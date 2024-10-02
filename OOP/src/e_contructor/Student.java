package e_contructor;
/*
 * [참고] 초기화
 * int a;  // 변수선언
 * a = 10; // 값지정
 * 
 * int b =20; //변수선언+값지정 =>초기화
 * 
 * array[0] = 100;
 * array[1] = 200;
 * array[2] = 300;
 * 
 * int [] arrat2 = {100, 200, 300}; => 초기화
 *                                메모리의 값을 확보하자마자 값을 세팅
 *                                
 *  [참고] 클래스 초기화하려면???  생성자함수 (Constructor)
 *  
 *  - 클래스가 인스턴스화 될 때 실행하는 함수
 *  - 생성자함수 이름은 반드시 클래스명과 동일
 *  - 리턴형이 없음(void도 없음)
 *  - overloading 가능
 *         ->메소드명이 동일하고  매개변수(인자)의 타입과
 *         
 *  - default constructor :
 *  ' 생성자 함수를 한개도 지정 않으면 
 *  ' 한개라도 지정하면 안만들어 줌       
 *  
 *  [참고] 자바 특성
 *        class Test {  //클래스명
 *            String Test;  //변수명
 *            public void Test() {}   //'일반함수'는 void 또는 리턴함수 필수
 *            public Test() { }  // 생성자
 *            }
 *            
 *   [참고] this 와 this() 함수
 *   this : 자기 객체를 지칭하는 래퍼런스
 *          멤버변수나 멤버메소드를 명확하게 지칭할 때
 *          
 *   this() : 다른 생성자함수를 호출할 때
 *            [주의]무조건 첫 라인에 기술해야 함
 *                      
 */

public class Student {  

	// member fields : 멤버변수들 (서로다른자료형)
	private String name;            
	private int kor, eng, math;    
	private int total;              
	private double avg;    

	//--------------------------
	//생성자 함수 (constructor)
	public Student() {  //이름은 클래스명과 동일하게!! (void없음)
		//이렇게 쓰면 main에 new Student()을 부르게되는거

//				name = "박길동";  //멤버변수에 this 써두되고 안써두댐
//				kor = 50;  // 초기화는 기본 셋팅값.
//				eng = 50;
//				math = 50;
		this ("홍길동", 50,50,50);  
		System.out.println("기본생성자 호출");	
		
	}
	public Student (String name, int kor, int eng, int math) {

		//main창의 Student s2 = new Student (name, kor, eng, math) ; 
		this.name = name;  // 멤버변수에다가 생성자함수를 넣는것
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자있는 생성자 호출");
	}


	// member methods : 멤버함수들
	public int calTotal() {   
		total = kor + eng + math;
		return total;
	}

	public double calAvg() {  
		avg = (double) total / 3;
		return avg;
	}
	// setter / getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}


}



