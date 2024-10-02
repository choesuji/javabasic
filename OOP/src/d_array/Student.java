package d_array;

/*
 *  캡슐화 
 *      - 멤버변수 private
 *      - 멤버메소드 public 
 */
public class Student {  // 서로다른것들을 한 덩어리로 묶은것을 클래스라고 한다

	// member fields : 멤버변수들 (서로다른자료형)
	private String name;            // 메소드 앞에는 private->다른데서 보이지않아 접근불가!!!)
	private int kor, eng, math;     // 메소드 앞에는 private
	private int total;              // 메소드 앞에는 private
	private double avg;             // 메소드 앞에는 private

	// member methods : 멤버함수들
	public int calTotal() {   // 함수앞에는 퍼블릭 선언
		total = kor + eng + math;
		return total;
	}

	public double calAvg() {  // 함수앞에는 퍼블릭 선언
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
/*
 * 
 * 클래스 이름과 java 파일명이 동일
 * '대소문자 구별
 * 
 * [권장] 클래스이름은 대문자로 시작
 *
 */


