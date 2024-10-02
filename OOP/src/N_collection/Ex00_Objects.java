package N_collection;

public class Ex00_Objects {  //얘가 부모

	public static void main(String[] args) {

		StudentA a = new StudentA ("01234", "홍길동");
		StudentA b = new StudentA ("01235", "홍길동");


		System.out.println(a.toString());  //처음 결과돌리니 주소값이 나옴  //anwhrjs wkqksms wktlrRjrk qnffuwla
		System.out.println(b.toString());  
		
		if(a.equals(b)) {
			System.out.println("***   동일인 입니다   ***"); 
		} else {
			System.out.println("***  다른사람 입니다  ***");
		}
	}
}
class StudentA extends Object{ // class StudentA  자식, extends Object 부모																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														

	String hakbun;
	String name;

	public StudentA (String hakbun, String name) {   //함수만들기
		this.hakbun = hakbun;
		this.name = name;

	}
	
	public boolean equals (Object obj) {
		StudentA other = (StudentA)obj; // 보모자식간에는 캐스팅이 가능하다
		if (hakbun.equals(other.hakbun)) {
			return true; 
		}else  {
			return false;
			}
		}
	
	
	
	public String toString () {
		return "학번:" + hakbun + " [이름] : " + name;
	}

}



