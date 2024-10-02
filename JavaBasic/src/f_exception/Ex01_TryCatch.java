package f_exception;
/*
 * 오류 
 *    - 에러 : 심각한 오류  
 *    - 예외 : 심각하지 않은 오류
 *    
 *    예외처리 : 최종적인 목적은 프로그램이 정상으로 종료
 *    
 *    [1] try~catch
 *        try {
 *           예외가 발생할 여지가 있는 구문
 *         } catch(Exception ex) {      --> 문제가 있을때만 가는 구문
 *           예외가 발생한 후에 구문
 *         } fanally {
 *           예외관련없이 무조건 실행구문
 *         }
 *    
 *     [2] 함수 뒤에 throws
 *              
 */
public class Ex01_TryCatch {

	public static void main(String[] args) {

		//String [] str = new String [] {};  // 배열초기화 의미
		String [] str = {"안녕하세요" , "올라", "하이"};

		try {
			for( int i = 0 ; i <str.length; i++) {   // 문제발생시 catch 로 빠짐
				System.out.println(str[i]);  // 예외가 발생할 여지가 있는 구문
			} 
			return;  // 수행하려면 윗 구문이 정상이여야함 돌아가지만... fanally는 수행함
		} catch (Exception ex) {  // catch로 묶음 문제가 있을때만 
			System.out.println("예외발생:" + ex.getMessage());
		}finally {  // 무조건 수행하는 구문 
			System.out.println("무조건 실행 구문");
		}                        // catch로 묶음 여기까지
		
		System.out.println("프로그램 종료");  // 리턴시 여기까지 안옴
	}  // end main


}// end class
