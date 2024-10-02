package i_access2.sub;

/* 접근지정자
 * 
 *   - private : 다른클래스에서 접근 못함 (해당클래스 안에서만 가능/외부접근차단)
 *   - public : 모든곳에서 접근이 가능함 (클래스가 같아도, 달라도)
 *   - protected :
 *   - default (아무것도 지정하지 않음) : 동일한 패키지에서만 접근가능
 * 
 */
public class Access {

	private     String a = "프라이빗 데이타";
	public      String b = "퍼블릭 데이타";
	protected   String c = "프로텍티드 데이타";
	            String d = "디폴트 데이타";
 
	public void output() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
