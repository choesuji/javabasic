package f_exception;

public class Ex04_throw {

	public static void main(String[] args) {
		try {
			readMessage();
		} catch (Exception ex) {  // 부정적 - 뭔가 잘못된경우!!!!!!!
			System.out.println("실패:" + ex.getMessage());
		}
		System.out.println("프로그램 종료");
	}

	static void readMessage () throws Exception {  // 메소드 뒤에선 s붙음
		String [] str = {"안녕하세요" , "올라", "하이"};
		try {
			for( int i = 0 ; i <=str.length; i++) {   
				System.out.println(str[i]);
			} 
		}catch (Exception ex) {
				throw new MyException();
			}
		}
	}

