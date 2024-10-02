package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//           ㄴ input/ouput 약자

public class Ex02_TryCatch {  // "예외잡으세요"

	public static void main(String[] args) {
		FileInputStream fis = null;  // 변수는 밖에 선언함 
		try {  //문제가 발생할 여지가 있는부분
			fis = new FileInputStream ("abc.txt");
			fis.read();

			System.out.println("파일처리");
		} catch(FileNotFoundException ex) {  // Exception 모든문제 발생했을때 다잡아내는것
			System.out.println("파일이 존재하지 않는 예외발생:" + ex.getMessage());
			//ex.printStackTrace();

		} catch(Exception ex) {  // Exception 모든문제 발생했을때 다잡아내는것
			System.out.println("그 외 예외발생:" + ex.getMessage());
		} finally {
			try {
			fis.close();  // 반드시 닫아줘야댐 
		} catch (Exception ex) {}
	} 
}  // end main
}  // end class