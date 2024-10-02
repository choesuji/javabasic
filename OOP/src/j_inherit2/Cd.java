package j_inherit2;

public class Cd extends Item {

	private String singer;

	public Cd () {
		this ("0", "무명", "무명");
	}
	
	public Cd (String num, String title, String singer ) {
		super (num,title);
		this.singer = singer;
	}
	
	
	
	public void output () {  // 메소드는 퍼블릭
		System.out.println("책번호 : " + num);     //공통
		System.out.println("책제목 : " + title);   //공통
		System.out.println("가수 : " + singer);    // 자기꺼

	}
}
