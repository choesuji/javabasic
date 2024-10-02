package E_method;
/*
 * overloading
 *  - method(함수)명이 동일한 함수들
 *  - 인자의 자료형과 갯수 다른 경우
 */
public class Ex08_Overloading {

	public static void main(String[] args) {
		String str = new String ("홍길순");
		StringBuffer sb = new StringBuffer("홍길자");
		char [] ch = new char [] {'홍', '길', '자'};
		
		System.out.println(str); 
		System.out.println(sb);
		System.out.println(ch);
		
		
	}

 
}

/* 오버로딩이 없다면
 * drawRect void  (int w, int h) {
 * 폭과 높이로 사각형 그리기
 * }
 * woid drawRect2(point p1, point p2, point p3, point p4) {
 * 점 4개의 정보로 사각형 그리기 
 * }
 * 
 * ---------------------------------------------------------
 * 
 * 오버로딩이 적용된다면???
 * drawRect void  (int w, int h) {
 * 폭과 높이로 사각형 그리기
 * }
 * woid drawRect2(point p1, point p2, point p3, point p4) {
 * 점 4개의 정보로 사각형 그리기 
 * }
*/
