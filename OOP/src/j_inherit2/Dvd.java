package j_inherit2;

public class Dvd extends Item  {

	private String actor;
	private String pro;

	
	public Dvd () {
		this ("0","제목없음", "유명한", "유명");
	}
	
	public Dvd (String num, String title, String actor, String pro) { 
		super (num,title);
		this.actor = actor;
		this.pro = pro;
	}
	public void output () {
		System.out.println("책번호 : " + num);
		System.out.println("책제목 : " + title);
		System.out.println("출판사 : " + actor);
		System.out.println("작가 : " + pro);

	}
}
